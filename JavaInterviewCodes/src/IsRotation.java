
public class IsRotation {
	
	public static boolean isRotation(String str1, String str2) {
		
		String str3 = str1+str1;
		
		if(str3.contains(str2)) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {

		String str1 = "ABCD";
		String str2 = "CDAB";
		
		System.out.println(isRotation(str1, str2));

	}

}
