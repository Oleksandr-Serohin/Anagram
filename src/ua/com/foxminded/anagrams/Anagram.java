package ua.com.foxminded.anagrams;

import java.util.*;

/**
 * Date: Jan 07-2021 Class reverses all the words of input sentence and all
 * non-letter symbols stay on the same places then sends this sentence back.
 * 
 * @author Aleksandr Serogin
 * @version 1.0001
 */

public class Anagram {

    /**
     * String value reversed sentence
     */
    private StringBuilder anagrams = new StringBuilder(); // fo anagrams

    /**
     * function reverses sentence with given parameters
     * 
     * @param sentence String scan sentence
     * @return String anagrams processed reverse sentence
     */
    public String makeAnagram(String sentence) {
       if (sentence != null) { // if sentence not null
            boolean hasAlfa = false;  //Has sentence letters 
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.isLetter(sentence.charAt(i))) { // check letters  
                    hasAlfa = true; //find letters
                }
            }
            if (hasAlfa) { //if find letters 
                List<Integer> indexDelimiters = new ArrayList<>(); // declare an array where we put the index of
                                                                          // delimiters
                StringBuilder delimiters = new StringBuilder(); // declare StringBuilder delimiters

                for (int i = 0; i < sentence.length(); i++) {
                    if (Character.isWhitespace(sentence.charAt(i))) { // if sign is delimiter
                        indexDelimiters.add(i); // put index delimiter in massive
                        delimiters.append(sentence.charAt(i)); // put delimiter in StringBuilder
                    }
                }
                String[] word = sentence.split("\\s+"); // split the string into words if there is a whitespace and put
                                                        // it in the word array
                for (int i = 0; i < word.length; i++) {
                    boolean singsRemoved = false; // are all non-letters removed
                    List<Integer> digitals = new ArrayList<>(); // declare an array where we put the index of
                                                                       // non-letters
                    StringBuilder conclude = new StringBuilder(word[i]); // We put the word in StringBuffer according to
                                                                         // the
                    // counter number
                    StringBuilder source = new StringBuilder(word[i]); // We put the word in StringBuffer according to
                                                                       // the
                    // counter number
                    for (int b = 0; b < source.length(); b++) { // find out the index of non-letters and put it into an
                                                                // array.
                        if (Character.isLetter(conclude.charAt(b)) == false) {
                            digitals.add(b);
                        }
                    }
                    conclude.reverse(); // inverted word
                    while (singsRemoved == false) { // until all letters are removed
                        for (int c = 0; c < conclude.length(); c++) {
                            if (Character.isLetter(conclude.charAt(c)) == false) { // if not a letter then
                                conclude.deleteCharAt(c); // delete by counter number
                                singsRemoved = false; // set Dell Digital = false to re-initialize the cycle
                                break; // start the cycle again

                            } else {
                                singsRemoved = true; // cycle over all non-letters deleted
                            }
                        }
                    }
                    for (int d = 0; d < digitals.size(); d++) {
                        String digital = Character.toString(source.charAt(digitals.get(d))); // we find in the line
                                                                                             // Source not letters
                        conclude.insert(digitals.get(d), digital); // put not letters according to the index of the
                                                                   // original word in the inverted
                    }
                    anagrams.append(conclude); // write the final word to string
                }
                for (int i = 0; i < indexDelimiters.size(); i++) {
                    anagrams.insert(indexDelimiters.get(i), Character.toString(delimiters.charAt(i))); // put delimiter
                    // in anagrams according index
                }
            } else { // if not find letters
                anagrams.append(sentence); // return sentence
            }
        }
        return anagrams.toString();// convert StringBuilder to string
    }
}