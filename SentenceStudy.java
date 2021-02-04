package scanner;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SentenceStudy {

	public static void main(String[] args) {
		
		//User input and defining variables 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence of any length:");
		String sentence = input.nextLine();
		System.out.println( sentence);
		input.close(); //be sure to close the scanner
		int stringLength = sentence.length();
		int indexNumber = 0;
		int vowel = 0;
//--------------------------------------------------------------------------------------------------------------------//
		//counting vowels in a sentence
		if (stringLength > 1) {
			while (stringLength > 0) {
				if (sentence.toLowerCase().charAt(indexNumber) == 'a') {
					vowel++;
				}
				if (sentence.toLowerCase().charAt(indexNumber) == 'e') {
					vowel++;
				}
				if (sentence.toLowerCase().charAt(indexNumber) == 'i') {
					vowel++;
				}
				if (sentence.toLowerCase().charAt(indexNumber) == 'o') {
					vowel++;
				}
				if (sentence.toLowerCase().charAt(indexNumber) == 'u') {
					vowel++;
				}
				stringLength = stringLength - 1;
				indexNumber = indexNumber + 1;
			}
		}
//--------------------------------------------------------------------------------------------------------------------//
		//calculating the percentage of vowels in a sentence
		double a = vowel;
		double b = sentence.length();
		double percent = (a/b)*100;
		
		ArrayList<String> array = new ArrayList<String>();
		String word = null;		
		int length = sentence.length();
//--------------------------------------------------------------------------------------------------------------------//
		//counting the number of words in a sentence
		if (sentence.contains(" ")) {
			while(length > 0 && sentence.contains(" ")) {
				word = sentence.substring(0, sentence.indexOf(" "));
				sentence = sentence.substring(sentence.indexOf(" ")+1);
				array.add(word);
				length = length - word.length();
			}

			word = sentence.substring(0);
			sentence = sentence.substring(0);
			array.add(word);
		}

		else {
			word = sentence.substring(0);
			sentence = sentence.substring(0);
			array.add(word);
		}		
//--------------------------------------------------------------------------------------------------------------------//
		//outputting words in a sentence
		System.out.println("Array size " + array.size());
		System.out.print("Array contains: | ");
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " | ");
		}
//--------------------------------------------------------------------------------------------------------------------//				
		//outputting vowel count and vowel percentage
		System.out.println("\n");
		System.out.println(vowel + " vowels");
		System.out.println(new DecimalFormat("#.##").format(percent) + "% of characters are vowels");
	}
}