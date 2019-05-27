class ReturnSubstring {
	public String subString(String data, int startIndex) {

		return data.substring(startIndex).trim();
	}
}

public class SubStringExample {

	public static void main(String[] args) {

		ReturnSubstring str = new ReturnSubstring();
		System.out.println(str.subString("Hello Sachin", 2));
	}

}
