/**
 * Lesson: String Manipulation
 * Author: Mikah Ho
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here

		Scanner input = new Scanner(System.in);

		String sentence;

		System.out.print("Input a sentence: ");
		sentence = input.nextLine();

		System.out.println(sentence.contains("on"));

	}

	public static void q2() {
		//Write question 2 code here

		Scanner input = new Scanner(System.in);

		String word;

		System.out.print("Input the word mango: ");
		word = input.nextLine();

		System.out.println((word.toLowerCase()).compareTo("mango") == 0);
		
	}

	public static void q3() {
		//Write question 3 code here

		Scanner input = new Scanner(System.in);

		String word;
		String letter;

		System.out.print("Input a word: ");
		word = input.nextLine();

		System.out.print("Input a letter: ");
		letter = input.nextLine();

		System.out.println(word.indexOf(letter) + "\n" + word.lastIndexOf(letter));

	}

	public static void q4() {
		//Write question 4 code here

		Scanner input = new Scanner(System.in);

		String sentence;

		System.out.print("Input a sentence: ");
		sentence = input.nextLine();

		System.out.println("Your sentence is " + sentence.length() + " characters long");

	}

	public static void q5() {
		//Write question 5 code here

		Scanner input = new Scanner(System.in);

		String sentence;
		String word;
		String wordNew;

		System.out.print("Input a sentence: ");
		sentence = input.nextLine();

		System.out.print("Input a word to replace: ");
		word = input.nextLine();

		System.out.print("What word would you like to replace it with: ");
		wordNew = input.nextLine();

		System.out.println(sentence.replaceAll(word, wordNew));

	}

	public static void q6() {
		//Write question 6 code here

		Scanner input = new Scanner(System.in);

		String sentence;

		System.out.print("Input a sentence: ");
		sentence = input.nextLine();

		System.out.println(sentence.trim().toUpperCase() + "\n" + sentence.trim().toLowerCase());
		
	}

	public static void q7() {
		//Write question 7 code here

		Scanner input = new Scanner(System.in);

		String word;

		System.out.print("Input a word: ");
		word = input.nextLine();

		System.out.println(word.substring(0,4) + "\n" + word.substring((word.length() - 4)));

	}

}
