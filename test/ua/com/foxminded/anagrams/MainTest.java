package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.*;

class MainTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        
       System.setOut(new PrintStream(outContent));
    }

    @Test
    public void whenSentences_mustReturnTrue() {
        
        String sentences = "a1bcd efg!h";
        // System.setIn(InputStream in): Reallocate the "standard" input stream.
        System.setIn(new ByteArrayInputStream(sentences.getBytes()));
        Main.main(null);
        assertEquals("d1cba hgf!e", outContent.toString().trim());
    }
}
