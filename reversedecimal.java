import java.math.BigDecimal;
import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		System.out.println("Input a decimal number > ");
		try(Scanner scanner = new Scanner(System.in)){
			BigDecimal num = scanner.nextBigDecimal();
			int integerPart = num.intValue();
			BigDecimal dp = num.remainder(BigDecimal.ONE);
		    System.out.println(dp.floatValue());
			while(dp.remainder(BigDecimal.ONE).floatValue() > 0){
				dp = dp.movePointRight(1);
			}
			int decimalPart = dp.intValue();
			int remainder;
			while((remainder = decimalPart % 10) != 0){
				System.out.print(remainder);
				decimalPart = decimalPart/10;
			}
			System.out.print(".");
			while((remainder = integerPart % 10) != 0){
				System.out.print(remainder);
				integerPart = integerPart/10;
			}
		}
	}
}