package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

class AnagramTest {

    Anagram anagram;

    @BeforeEach
    public void setUp() {
        anagram = new Anagram();
    }

    @Test
    public void whenNull_mustReturnEmptyString() {
        final String zero = null;
        final String emptyString = "";

        String actual = anagram.makeAnagram(zero);
        assertEquals(emptyString, actual);
    }

    @Test
    public void whenEmptyString_mustReturnEmptyString() {
        final String emptyString = "";

        String actual = anagram.makeAnagram(emptyString);
        assertEquals(emptyString, actual);
    }

    @Test
    public void whenDigitals_mustReturnDigitalsAtSamePlaces() {
        String actual = anagram.makeAnagram("123456");
        assertEquals("123456", actual);
    }

    @Test
    public void whenLeters_mustReturnReversLetters() {
        final String leters = "abcdefg";
        final String reversLeters = "gfedcba";

        String actual = anagram.makeAnagram(leters);
        assertEquals(reversLeters, actual);
    }

    @Test
    public void whenBigLeters_mustReturnReversBigLetters() {
        final String bigLeters = "ABCD";
        final String reversBigLeters = "DCBA";

        String actual = anagram.makeAnagram(bigLeters);
        assertEquals(reversBigLeters, actual);
    }

    @Test
    public void whenSpecialSings_mustReturnSpecialSingsAtSamePlaces() {
        final String specialSings = "€₣¥£₽¢¤";

        String actual = anagram.makeAnagram(specialSings);
        assertEquals(specialSings, actual);
    }

    @Test
    public void whenLetersDigitals_mustReturnReversLetersAtSamePlacesDigitals() {
        final String letersDigitals = "a1b2c3";
        final String reversLetersDigitals = "c1b2a3";

        String actual = anagram.makeAnagram(letersDigitals);
        assertEquals(reversLetersDigitals, actual);
    }

    @Test
    public void whenBigLetersDigitals_mustReturnReversBigLetersAtRamePlacesDigitals() {
        final String bigLetersDigitals = "A123BC4";
        final String reversBigLetersDigitals = "C123BA4";

        String actual = anagram.makeAnagram(bigLetersDigitals);
        assertEquals(reversBigLetersDigitals, actual);
    }

    @Test
    public void whenLetersSpecialSings_mustReturnReversLetersAtSamePlacesSpecialSings() {
        final String letersSpecialSings = "a€b₣c";
        final String reversLetersSpecialSings = "c€b₣a";

        String actual = anagram.makeAnagram(letersSpecialSings);
        assertEquals(reversLetersSpecialSings, actual);
    }

    @Test
    public void whenDdigitalsSpecialSings_mustReturnRdigitalsSpecialSingsAtSamePlaces() {
        final String digitalsSpecialSings = "1€2₣3¥";

        String actual = anagram.makeAnagram(digitalsSpecialSings);
        assertEquals(digitalsSpecialSings, actual);
    }

    @Test
    public void whensLetersDigitalsSpecialSings_mustReturnReversLetersDigitalsSpecialSingsAtSamePlaces() {
        final String digitalsLetersSpecialSings = "a1b2c3€₣¥";
        final String reversDigitalsLetersSpecialSings = "c1b2a3€₣¥";

        String actual = anagram.makeAnagram(digitalsLetersSpecialSings);
        assertEquals(reversDigitalsLetersSpecialSings, actual);
    }

    @Test
    public void whenSingleSpaceAtBigSmallLetersDigitals_mustReturnReversBigSmallLetersDigitalsSingleSpaceAtSamePlaces() {
        final String singleSpace = "ABC23 bak2";
        final String reversSingleSpace = "CBA23 kab2";

        String actual = anagram.makeAnagram(singleSpace);
        assertEquals(reversSingleSpace, actual);
    }

    @Test
    public void whenMultipleSpaceAtBigSmallLetersDigitals_mustReturnReversBigSmallLetersDigitalsMultiSpaceAtSamePlaces() {
        final String multipleSpace = "aBc23      Kb2";
        final String reversMultipleSpace = "cBa23      bK2";

        String actual = anagram.makeAnagram(multipleSpace);
        assertEquals(reversMultipleSpace, actual);
    }
}
