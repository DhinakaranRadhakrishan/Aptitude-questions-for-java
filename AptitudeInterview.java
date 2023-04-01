package com.myProject;

import java.util.Arrays;

/*
 * @author Dhinakaran
 */


public class AptitudeInterview {

	public static void main(String[] args) {

		// 1.checkAnagram
		String firsWord = "anagr am";
		String secondName = "marga na";

		System.out.println("checkAnagram : ");
		System.out.print(checkAnagram(firsWord, secondName)+"\n\n");

		// 2.checkPlindrom
		String pali = "abba";
		System.out.println("checkPlindrom : ");
		System.out.print(checkPlindrom(pali)+"\n\n");

		// 3.factorial
		int value = 5;
		System.out.println("factorial : ");
		System.out.print(factorial(value)+"\n\n");

		// 4.fibonacci
		System.out.println("fibonacci : ");
		System.out.print(Arrays.toString(fibonacci(value))+"\n\n");

		// 5.Perfect number
		System.out.println("Perfect number : ");
		System.out.print(perfectNumber(28)+"\n\n");

		// 6.Amstrong number
		System.out.println("Amstrong number : ");
		System.out.print(amstrong(153)+"\n\n");

		// 7.Prime Number
		System.out.println("Prime Number : ");
		System.out.print(primeNumber(5)+"\n\n");

		// 8.You give the number return by foctor
		System.out.println("foctor : ");
		System.out.print(factor(8)+"\n\n");

		// 9. You have get Asci values by small letters
		System.out.println("small letters : ");
		System.out.print(smallLetterAsciValue()+"\n\n");

		// 10. You have get Asci values by caps letters
		System.out.println("caps letters : ");
		System.out.print(capsLetterAsciValue()+"\n\n");

		// 11. You have get Asci values by number letters
		System.out.println("number letters : ");
		System.out.print(numberAsciValue()+"\n\n");
	}

	// 1.checkAnagram
	public static String checkAnagram(String firsWord, String secondName) {

		char[] firstArray = firsWord.replaceAll("\\s", " ").toLowerCase().toCharArray();
		char[] secondArray = secondName.replaceAll("\\s", " ").toLowerCase().toCharArray();

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		boolean check = false;
		int count = 0;

		if (firstArray.length != secondArray.length) {
			System.out.println("This is not a anagram");
		} else {
			outerLoop: for (int i = 0; i < firstArray.length; i++) {
				for (int j = 0; j < secondArray.length; j++) {
					if (firstArray[i] == secondArray[count++]) {
						break;
					} else {
						check = true;
						if (check == true) {
							break outerLoop;
						}
					}
				}
			}

		}
		if (check == true) {
			return "This is not a anagram";
		} else {
			return "This is anagram";
		}
	}

	// 2.checkPlindrom
	public static boolean checkPlindrom(String word) {
		char[] value = word.toCharArray();
		if (value.length % 2 != 0) {
			return false;
		}
		int count = value.length - 1;
		boolean check = true;
		for (int i = 0; i < value.length; i++) {
			while (value.length - 1 > 0) {
				if (value[i] == value[count--]) {
					break;
				} else {
					check = false;
				}
			}
		}
		return check;
	}

	// 3.This is factorial recursion
	public static int factorial(int value) {
		if (value == 1)
			return value;
		else
			return value * factorial(value - 1);
	}

	// 4.fibonacci series
	public static int[] fibonacci(int value) {
		int a = 0, b = 1, c = -1;
		int array[] = new int[value];
		for (int i = 0; i < value; i++) {
			a = b + c;
			array[i] = a;
			c = b;
			b = a;
		}
		return array;
	}

	// 5.You give a number this methode return by Perfect number or not
	public static boolean perfectNumber(int value) {
		int countOfValue = 0;
		for (int i = 1; i < value; i++) {
			if (value % i == 0) {
				countOfValue += i;
			}
		}
		return value == countOfValue ? true : false;
	}

	// 5.You Give the number that number amstrong or not.So, this methode return
	// amostrong or not , you can pass only
	// three digits . It simple for more your have expand this. i pass 153 return
	// boolean value
	public static boolean amstrong(int value) {
		int fristNumber, secondNumber, thirdNumber, testValue = value;

		fristNumber = testValue % 10; // 3
		testValue /= 10;// 15

		secondNumber = testValue % 10; // 5
		testValue /= 10;// 1

		thirdNumber = testValue % 10; // 1

		int amstrong = (int) (Math.pow(fristNumber, 3) + Math.pow(secondNumber, 3) + Math.pow(thirdNumber, 3));

		return amstrong == value;
	}

	/*
	 * 7. Check prime number
	 */
	public static boolean primeNumber(int value) {
		int count = 0;
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				count++;
			}
		}

		return count == 2;
	}

	/*
	 * 8. Return factor numbers
	 */
	public static String factor(int value) {
		String array = "";
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				array += "" + i + " ";
			}
		}
		return array;
	}

	// 9.How to get asci values for small letters
	public static String smallLetterAsciValue() {
		int asciNumber = 0;
		String asci = "";
		while (asciNumber <= 127) {
			if ('a' == asciNumber) {
				asci += asciNumber + " to ";
			} else if ('z' == asciNumber) {
				asci += asciNumber;
			}
			asciNumber++;
		}
		return asci;
	}

	// 10.How to get asci values for caps letters
	public static String capsLetterAsciValue() {
		int asciNumber = 0;
		String asci = "";
		while (asciNumber <= 127) {
			if ('A' == asciNumber) {
				asci += asciNumber + " to ";
			} else if ('Z' == asciNumber) {
				asci += asciNumber;
			}
			asciNumber++;
		}
		return asci;
	}

	// 11.How to get asci values for number 0 to 9
	public static String numberAsciValue() {
		int asciNumber = 0;
		String asci = "";
		while (asciNumber <= 127) {
			if ('0' == asciNumber) {
				asci += asciNumber + " to ";
			} else if ('9' == asciNumber) {
				asci += asciNumber;
			}
			asciNumber++;
		}
		return asci;
	}

}
