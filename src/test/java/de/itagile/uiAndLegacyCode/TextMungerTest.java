package de.itagile.uiAndLegacyCode;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TextMungerTest {

	private Ui ui;

	@Before
	public void setUp() throws Exception {
		ui = new Ui();
	}

	@Test
	public void leaves_words_with_three_and_less_characters() throws Exception {
		assertThat(ui.reverseText("abc"), equalTo("abc"));
	}

	@Test
	public void reverses_middle_of_words_with_four_letters_and_more() throws Exception {
		assertThat(ui.reverseText("abcd"), equalTo("acbd"));
	}

	@Test
	public void leaves_multiple_words_with_three_letters() throws Exception {
		assertThat(ui.reverseText("abc abc"), equalTo("abc abc"));
	}

	@Test
	public void reverses_multiple_words() throws Exception {
		assertThat(ui.reverseText("abcd efgh"), equalTo("acbd egfh"));
	}



}
