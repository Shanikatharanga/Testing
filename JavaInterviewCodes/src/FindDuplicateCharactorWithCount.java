import java.util.HashMap;

public class FindDuplicateCharactorWithCount {
	
	public static void duplicateCharacterCount(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		System.out.println(map);
		
	}

	public static void main(String[] args) {

		String str = "I am a java developer and I am proud of it";
		
		duplicateCharacterCount(str.replace(" ", ""));

	}

}
