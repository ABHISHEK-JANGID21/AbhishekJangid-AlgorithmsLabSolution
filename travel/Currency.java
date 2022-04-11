package com.greatlearning.travel;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		Integer note[] = new Integer[size];
		int noteCounter[] = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			note[i] = sc.nextInt();
		}
		Arrays.sort(note, Collections.reverseOrder());

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		if (amount > 0) {
			for (int i = 0; i < size; i++) {
				noteCounter[i] = amount / note[i];
				amount = amount - noteCounter[i] * note[i];
				if (amount == 0) {
					break;
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount can't be given with highest denominated note ");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < size; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(note[i] + " : " + noteCounter[i]);
					}
				}
			}

		} else {
			System.out.println("enter a vaild amount");
		}
	}
}