package model;

import java.text.NumberFormat;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calc", eager = true)
@ApplicationScoped
public class Calculator {

	private double a;
	private double b;
	private String current;
	private String disp;
	private char sign;
	private boolean percent;

	public Calculator() {
		reset();
	}

	public void reset() {
		a = 0;
		b = 0;
		current = "0";
		disp = "0";
		sign = ' ';
		percent = false;
	}

	public void click(String str) {
		char c = str.charAt(0);
		if (c >= 48 && c <= 57) {
			if ((current.startsWith("0") || current.startsWith("-0")) && !current.contains(".") && c == 48) {
			} else {
				if ((current.startsWith("0") || current.startsWith("-0")) && !current.contains(".") && c > 48) {
					current = "";
				}
				current += c;
				disp = current;
			}
			disp = current;
		} else if (c == '.') {
			if (!current.contains(".")) {
				current += c;
				disp = current;
			}
		} else if (c == '+' || c == '-' || c == '*' || c == '/') {
			calculate();
			sign = c;
		} else if (c == 'n') {
			if (sign == '=') {
				current = disp;
				a = a * (-1);
			}
			if (!current.contains("-")) {
				current = "-" + current;
			} else {
				current = current.replaceAll("-", "");
			}
			disp = current;
		} else if (c == 's') {
			calculate();
			sign = c;
			a = Math.sqrt(a);
			toDisplay();
			current = "0";
		} else if (c == '%') { // dodac elementy typu *30% +30% itp
			if (sign == '=') {
				percent = !percent;
				calculate();
			} else {
				current = "" + (a * Double.parseDouble(current) / 100);
				disp = current;
			}
		} else if (c == '=') {
			calculate();
			double tempA = a;
			String tempDisp = disp;
			reset();
			a = tempA;
			sign = c;
			disp = tempDisp;
		}
	}

	private void calculate() {
		b = Double.parseDouble(current);
		switch (sign) {
		case ' ':
			a = b;
			break;
		case '+':
			a = a + b;
			break;
		case '-':
			a = a - b;
			break;
		case '*':
			a = a * b;
			break;
		case '/':
			a = a / b;
			break;
		}
		toDisplay();
		current = "0";
	}

	private void toDisplay() {
		if (a % 1 == 0) {
			long iA = (long) a;
			if (percent) {
				iA = iA * 100;
			}
			disp = "" + iA;
		} else {
			if (percent) {
				a = a * 100;
			}
			disp = "" + a;
		}
		if (percent) {
			disp += "%";
		}
	}

	public String getDisplay() {
		String result = this.disp;
		if (result.equalsIgnoreCase("infinity") || result.equalsIgnoreCase("NAN")) {
			result = "ERROR";
		} else {
			if (!result.contains(".") && result.length() > 13) {
				result = "ERROR";
			} else if (result.contains(".")) {
				double resD = Double.parseDouble(result);
				String num = String.format("%f", resD);
				int dotIndex = num.indexOf(',');
				if (dotIndex < num.length() - 1) {
					NumberFormat nf = NumberFormat.getInstance();
					nf.setGroupingUsed(false);
					nf.setMaximumFractionDigits(12-dotIndex);
					String[] strings = nf.format(resD).split(",");
					if (strings[0].length() > 12) {
						result = "ERROR";
					} else {
						result = strings[0] + "." + strings[1]; // here is the bug, string[1]
					}
				}
			}
		}
		return result;
	}

}
