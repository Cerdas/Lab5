
public class StringReversal {
	
	// Method for returning string in reverse
	public static String reverseString (String words) {
		
		if(words.isEmpty()) {
			return words;
		}else {
			return reverseString(words.substring(1)) + words.charAt(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "My name is Alexander Cerdas";
		System.out.println(sentence);
		System.out.println(reverseString(sentence));

	}

}
