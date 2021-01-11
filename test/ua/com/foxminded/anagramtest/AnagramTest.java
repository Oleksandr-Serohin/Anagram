package ua.com.foxminded.anagramtest;

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
    public void whenAddNull_wustReturnEmptyString() {
       conclude = anagramSolver.makeAnagram(zero);
        assertEquals(empty, conclude);
    }
    
   @Test
    public void whenAddEmptyString_mustReturnEmptyString() {
        conclude = anagramSolver.makeAnagram(empty);
        assertEquals(empty, conclude);
    }
   
   @Test
    public void whenAddDigitals_mustReturnDigitalsAtSamePlaces() {
        conclude = anagramSolver.makeAnagram("123456");
        assertEquals("123456", conclude);
    }

    @Test
    public void whenAddLeters_mustReturnReversLetters() {
        conclude = anagramSolver.makeAnagram(leters);
        assertEquals(reversLeters, conclude);
    }

    @Test
    public void whenAddBigLeters_mustReturnReversBigLetters() {
        conclude = anagramSolver.makeAnagram(bigLeters);
        assertEquals(reversBigLeters, conclude);
    }

    @Test
    public void WhenAddSpecialSings_mustReturnSpecialSingsAtSamePlaces() {
        conclude = anagramSolver.makeAnagram(specialSings);
        assertEquals(specialSings, conclude);
    }

    @Test
    public void whenAddLetersDigitals_mustReturnReversLeters_atSamePlacesDigitals() {
        conclude = anagramSolver.makeAnagram(letersDigitals);
        assertEquals(reversLetersDigitals, conclude);
    }

    @Test
    public void whenAddBigLetersDigitals_mustReturnReversBigLeters_atSamePlacesDigitals() {
        Anagram anagramSolver = new Anagram();
        conclude = anagramSolver.makeAnagram(bigLetersDigitals);
        assertEquals(reversBigLetersDigitals, conclude);
    }

    @Test
    public void whenAddLetersSpecialSings_mustReturnReversLeters_atSamePlacesSpecialSings() {
        conclude = anagramSolver.makeAnagram(letersSpecialSings);
        assertEquals(reversLetersSpecialSings, conclude);
    }

    @Test
    public void whenAddDdigitalsSpecialSings_mustReturnDdigitalsSpecialSingsAtSamePlaces() {
        conclude = anagramSolver.makeAnagram(digitalsSpecialSings);
        assertEquals(digitalsSpecialSings, conclude);
    }

    @Test
    public void whenAddsLetersDigitalsSpecialSings_mustReturnReversLeters_digitalsSpecialSingsAtSamePlaces() {
        conclude = anagramSolver.makeAnagram(digitalsLetersSpecialSings);
        assertEquals(reversDigitalsLetersSpecialSings, conclude);
    }

    @Test
    public void whenAddSingleSpaceAtBigSmallLetersDigitals_mustReturnReversBigSmallLeters_digitalsSingleSpaceAtSamePlaces() {
        conclude = anagramSolver.makeAnagram(singleSpace);
        assertEquals(reversSingleSpace, conclude);
    }

    @Test
    public void whenAddMultipleSpaceAtBigSmallLetersDigitals_mustReturnReversBigSmallLeters_digitalsMultiSpaceAtSamePlaces() {
        conclude = anagramSolver.makeAnagram(multipleSpace);
        assertEquals(reversMultipleSpace, conclude);
    }
}
