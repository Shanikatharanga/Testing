// Reverse String
public class RiverseString {

	public static String riverseString(String str) {
		String riverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			riverseString += str.charAt(i);
		}

		return riverseString;
	}

	public static String riverseStringUsingBuffer(String str) {

		StringBuffer strBuffer = new StringBuffer(str);

		return strBuffer.reverse().toString();

	}

	public static String riverseStringRecusive(String str, StringBuffer riverseString) {
		riverseString.append(str.charAt(str.length() - 1));
		if ((str.length() == 1)) {
			return riverseString.toString();
		} else {
			riverseStringRecusive(str.substring(0, str.length() - 1),riverseString);
		}
		return riverseString.toString();
	}

	public static void main(String[] args) {

		String str = "Shanika";
		
		StringBuffer riverseString = new StringBuffer();

		System.out.println(riverseString(str));
		System.out.println(riverseStringUsingBuffer(str));
		System.out.println(riverseStringRecusive(str,riverseString));
	}

}
