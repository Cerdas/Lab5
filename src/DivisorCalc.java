
public class DivisorCalc {

	// Returning greatest common divisor
	public static int gcd(int num1, int num2) {
		if(num2 <= num1 && num2 % num1 == 0) {
			return num1;
		}if(num1 < num2) {
			return gcd(num2, num1);
		}
		return gcd(num2, num1%num2);
	}

}
