
public class FetchSubstringFromAString {

	public static void main(String[] args) {

		String fileName = "Hello_004_World_";

		String num = fileName.substring(fileName.indexOf("_") + 1, fileName.indexOf("_")  + 4);

		System.out.println(num);

	}

}
