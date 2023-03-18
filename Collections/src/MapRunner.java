import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String characters = "This is an awesome occasion. This has never happened before";
		char[] chars = characters.toCharArray();
		Map<Character, Integer> hashmap = new HashMap<>();
		for (char ch : chars) {
			if (hashmap.get(ch) != null && hashmap.get(ch) != ' ') {
				hashmap.put(ch, hashmap.get(ch) + 1);
			} else {
				hashmap.put(ch, 1);
			}
		}
		System.out.println(hashmap);

		Map<String, Integer> hashmap2 = new HashMap<>();
		String[] words = characters.split(" ");
		for (String word : words) {
			if (hashmap2.get(word) != null && hashmap2.get(word) != ' ') {
				hashmap2.put(word, hashmap2.get(word) + 1);
			} else {
				hashmap2.put(word, 1);
			}
		}
		System.out.println(hashmap2);
	}

}
