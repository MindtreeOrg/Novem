package abc;

ok hi bye

import java.util.Scanner;

public class MenuDriven {
	public static String[] bubbleSort(String[] input) {
		String temp;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].compareTo(input[j]) > 0) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}

	private static String[] insertionSort(String[] input) {
		int j;
		String temp;
		for (int i = 1; i < input.length; i++) {
			j = i - 1;
			while (j >= 0 && (input[i].compareTo(input[j])) > 0) {
				temp = input[j + 1];
				input[j + 1] = input[j];
				input[j] = temp;
				j = j - 1;
			}

		}
		return input;
	}

	public static String[] evenPlaceElementsSort(String[] input) {
		String[] temp = new String[10];
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				temp[index] = input[i];
				index++;
			}
		}
		String[] temp2 = bubbleSort(temp);
		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				input[i] = temp2[index];
				index++;
			}
		}

		return input;

	}

	public static int BinarySearch(String[] inputArray, String key) {
		int min = 0, mid, max = inputArray.length;

		for (int i = 0; i < inputArray.length; i++) {
			mid = (min + max) / 2;
			if ((inputArray[mid].compareTo(key)) == 0) {
				return mid;
			} else if ((inputArray[mid].compareTo(key)) > 0) {
				max = max - 1;
			} else {
				min = min + 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Strings");
		int n = sc.nextInt();
		sc.nextLine();
		String[] inputArray = new String[n];
		System.out.println("enter the strings");
		for (int i = 0; i < n; i++) {
			inputArray[i] = sc.nextLine();
		}
		// hi im yuvan
		int option;
		String[] sortArray;
		do {
			System.out.println("1.Sort array in ascending order using Bubble sort");
			System.out.println("2.Sort array in descending order using insertion sort");
			System.out.println("3.Sort even array elements in descending order");
			System.out.println("4.Perform Binary search");
			System.out.println("Enter your option");
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				sortArray = bubbleSort(inputArray);
				for (int i = 0; i < sortArray.length; i++) {
					System.out.println(sortArray[i]);
				}
				break;
			case 2:
				sortArray = insertionSort(inputArray);
				for (int i = 0; i < sortArray.length; i++) {
					System.out.println(sortArray[i]);
				}
				break;
			case 3:
				sortArray = evenPlaceElementsSort(inputArray);
				for (int i = 0; i < sortArray.length; i++) {
					System.out.println(sortArray[i]);
				}
				break;
			case 4:
				System.out.println("Enter the String to be searched");
				String key = sc.nextLine();
				int index = BinarySearch(inputArray, key);
				System.out.println("Found at index " + index);
				break;
			case 5:
				System.out.println("Task completed");
				System.exit(0);
				break;
			default:
				System.out.println("enter valid option");
				break;
			}
		} while (option != 5);

	}
}
