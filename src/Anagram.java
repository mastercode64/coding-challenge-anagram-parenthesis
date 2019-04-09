

public class Anagram {

	public static void main(String[] args) {
		boolean teste = isAnagram("AUTOR\r\nOUTRA");
		System.out.println(teste);
	}

	public static boolean isAnagram(String word) {
		String[] words = word.split("\\r?\\n");
		String word1 = words[0];
		String word2 = words[1];
		
		if(word1.length() != word2.length())
			return false;
		
		Character[] letters1 = new Character[word1.length()];
		Character[] letters2 = new Character[word2.length()];
		
		
		
		for(int c = 0; c < word1.length(); c++) {
			letters1[c] = word1.charAt(c);
		}
		
		for(int c = 0; c < word2.length(); c++) {
			letters2[c] = word2.charAt(c);
		}
		
		
		for(int c = 0; c < letters1.length; c++) {
			
			
			for(int d = 0; d < letters2.length; d++) {
				if(letters1[c] == letters2[d]) {
					letters2[d] = null;
					break;
				}
				else {
					if(d == letters2.length -1)
						return false;
				}
				
			}
			
		}
		
		return true;
	}

}
