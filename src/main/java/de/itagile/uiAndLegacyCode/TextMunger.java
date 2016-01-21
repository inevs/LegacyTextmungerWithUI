package de.itagile.uiAndLegacyCode;

public class TextMunger {
	public String reverseText(String inputText) {
		String text = "";
		String[] words = inputText.split(" ");
		for (String word : words) {
			String reversedWord = reverseWord(word);
			text = text + reversedWord + " ";
		}
		return text.trim();
	}

	private String reverseWord(String word) {
		String reversedWord;
		if (word.length() >= 4) {
			reversedWord = word.charAt(0) +
					new StringBuffer(word.substring(1, word.length() - 1)).reverse().toString() +
					word.charAt(word.length() - 1);
		} else {
			reversedWord = word;
		}
		return reversedWord;
	}
}
