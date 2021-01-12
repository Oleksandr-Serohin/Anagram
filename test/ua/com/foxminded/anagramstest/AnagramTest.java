package ua.com.foxminded.anagramstest;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

import ua.com.foxminded.anagrams.Anagram;

class AnagramTest {

    private final String zero = null;
    private final String empty = "";
    private final String leters = "abcdefg";
    private final String bigLeters = "ABCD";
    private final String specialSings = "€₣¥£₽¢¤";
    private final String letersDigitals = "a1b2c3";
    private final String bigLetersDigitals = "A123BC4";
    private final String letersSpecialSings = "a€b₣c";
    private final String digitalsSpecialSings = "1€2₣3¥";
    private final String digitalsLetersSpecialSings = "a1b2c3€₣¥";
    private final String singleSpace = "ABC23 bak2";
    private final String multipleSpace = "aBc23      Kb2";

    private final String reversLeters = "gfedcba";
    private final String reversBigLeters = "DCBA";
    private final String reversLetersDigitals = "c1b2a3";
    private final String reversBigLetersDigitals = "C123BA4";
    private final String reversLetersSpecialSings = "c€b₣a";
    private final String reversDigitalsLetersSpecialSings = "c1b2a3€₣¥";
    private final String reversSingleSpace = "CBA23 kab2";
    private final String reversMultipleSpace = "cBa23      bK2";
    private String conclude;

    private Anagram anagramSolver;

    @BeforeEach
    public void setUp() {
        anagramSolver = new Anagram();
    }

    @Test
    public void whenNull_must_return_emptyString() {
       conclude = anagramSolver.makeAnagram(zero);
        assertEquals(empty, conclude);
    }
    
   @Test
    public void whenEmptyString_must_return_emptyString() {
        conclude = anagramSolver.makeAnagram(empty);
        assertEquals(empty, conclude);
    }
   
   @Test
    public void whenDigitals_must_return_digitalsAtSamePlaces() {
        conclude = anagramSolver.makeAnagram("123456");
        assertEquals("123456", conclude);
    }

    @Test
    public void whenLeters_must_return_reversLetters() {
        conclude = anagramSolver.makeAnagram(leters);
        assertEquals(reversLeters, conclude);
    }

    @Test
    public void whenBigLeters_must_return_reversBigLetters() {
        conclude = anagramSolver.makeAnagram(bigLeters);
        assertEquals(reversBigLeters, conclude);
    }

    @Test
    public void WhenSpecialSings_must_return_specialSingsAtSamePlaces() {
        conclude = anagramSolver.makeAnagram(specialSings);
        assertEquals(specialSings, conclude);
    }

    @Test
    public void whenLetersDigitals_must_return_ReversLetersAtSamePlacesDigitals() {
        conclude = anagramSolver.makeAnagram(letersDigitals);
        assertEquals(reversLetersDigitals, conclude);
    }

    @Test
    public void whenBigLetersDigitals_must_Return_ReversBigLeters_et_SamePlacesDigitals() {
        Anagram anagramSolver = new Anagram();
        conclude = anagramSolver.makeAnagram(bigLetersDigitals);
        assertEquals(reversBigLetersDigitals, conclude);
    }

    @Test
    public void whenLetersSpecialSings_must_return_reversLeters_at_samePlacesSpecialSings() {
        conclude = anagramSolver.makeAnagram(letersSpecialSings);
        assertEquals(reversLetersSpecialSings, conclude);
    }

    @Test
    public void whenDdigitalsSpecialSings_must_return_rdigitalsSpecialSings_at_SamePlaces() {
        conclude = anagramSolver.makeAnagram(digitalsSpecialSings);
        assertEquals(digitalsSpecialSings, conclude);
    }

    @Test
    public void whensLetersDigitalsSpecialSings_must_return_reversLeters_digitalsSpecialSings_at_samePlaces() {
        conclude = anagramSolver.makeAnagram(digitalsLetersSpecialSings);
        assertEquals(reversDigitalsLetersSpecialSings, conclude);
    }

    @Test
    public void whenSingleSpaceAtBigSmallLetersDigitals_must_return_reversBigSmallLeters_digitalsSingleSpace_at_samePlaces() {
        conclude = anagramSolver.makeAnagram(singleSpace);
        assertEquals(reversSingleSpace, conclude);
    }

    @Test
    public void whenMultipleSpaceAtBigSmallLetersDigitals_must_return_reversBigSmallLeters_digitalsMultiSpace_at_samePlaces() {
        conclude = anagramSolver.makeAnagram(multipleSpace);
        assertEquals(reversMultipleSpace, conclude);
    }
}
