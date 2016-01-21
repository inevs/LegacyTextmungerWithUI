package de.itagile.uiAndLegacyCode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TextMungerTest {

	private TextMunger textMunger;

	@Before
	public void setUp() throws Exception {
		textMunger = new TextMunger();
	}

	@Test
	public void leaves_words_with_three_and_less_characters() throws Exception {
		assertThat(textMunger.reverseText("abc"), equalTo("abc"));
	}

	@Test
	public void reverses_middle_of_words_with_four_letters_and_more() throws Exception {
		assertThat(textMunger.reverseText("abcd"), equalTo("acbd"));
	}

	@Test
	public void leaves_multiple_words_with_three_letters() throws Exception {
		assertThat(textMunger.reverseText("abc abc"), equalTo("abc abc"));
	}

	@Test
	public void reverses_multiple_words() throws Exception {
		assertThat(textMunger.reverseText("abcd efgh"), equalTo("acbd egfh"));
	}



}
