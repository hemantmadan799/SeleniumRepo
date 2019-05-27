
public class RightAndLeftPad {

	public static void main(String[] args) {

		String str = "3919.00";

		double prem = Double.parseDouble(str) * 100;
		
		int wPrem = (int)(prem);
		
		System.out.println(String.format("%-11s",wPrem).replace(' ', '0')+"+");
	}

}
