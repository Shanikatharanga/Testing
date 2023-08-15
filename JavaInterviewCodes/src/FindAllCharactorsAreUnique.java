import java.util.HashSet;

public class FindAllCharactorsAreUnique {

	public static boolean allCharactorsAreUnique(String str) {

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i))) {
				return false;
			}
			set.add(str.charAt(i));
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "Shanik";

		System.out.println(allCharactorsAreUnique(str));

	}

}
