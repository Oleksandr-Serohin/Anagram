package ua.com.foxminded.anagrams;

import java.util.Scanner;

/**
 * Date: Jan 07-2021 
 * Class read at console sentence, give them on processed,
 * take processed sentence and print them.
 * @author Aleksandr Serogin
 * @version 1.0001
 */
public class Main {

    /**
     * The main method off this application.
     * 
     * @param args array of string arguments.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); // create scanner
        Anagram anagramSolver = new Anagram(); // create object class Anagrams
        System.out.println(anagramSolver.makeAnagram(scan.nextLine())); // send anagramSolver scan sentence, takes
                                                                        // sentence beck and print them
    }
}
