
public class FindIsAnagram {
	
	public static boolean isAnagram(String str1, String str2) {
		
		String strCheck = "";
		
		if(str1.length()!=str2.length())
			return false;
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0; j< str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					strCheck = strCheck + str1.charAt(i);
				}
			}
		}
		if(strCheck.equalsIgnoreCase(str1)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "dabc";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		System.out.println(isAnagram(str1, str2));

	}

}
