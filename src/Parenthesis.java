

public class Parenthesis {
	public static void main(String[] args) {
		boolean teste = parenthesis("()(");
		System.out.println(teste);
	}

	public static boolean parenthesis(String word) {
		Character[] letters = new Character[word.length()];

		for(int c = 0; c < word.length(); c++) {
			letters[c] = word.charAt(c);
		}
		
		if(!letters[0].equals('('))
			return false;
		
		int count = 0;
		
		for(int c = 0; c < letters.length; c++) {
			if(letters[c] == '(')
				++count;
			if(letters[c] == ')')
				--count;
			
			if(count < 0)
				return false;
		}
		if(count != 0)
			return false;
		else
			return true;
		
	}
}
