package com.greatlearning.paymentApp;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size = sc.nextInt();
		float arr[] = new float[size];
		System.out.println("Enter the values in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextFloat();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = sc.nextInt();
		float target_value[] = new float[noOfTargets];
		for (int i = 0; i < noOfTargets; i++) {
			float sum = 0;
			boolean flag = false;

			System.out.println("Enter the value of target");
			target_value[i] = sc.nextFloat();
			for (int j = 0; j < size; j++) {
				sum += arr[j];
				if (sum >= target_value[i]) {
					flag = true;
					System.out.println("Target achieved after " + (j + 1) + " transactions");
					break;
				}
			}
			if (flag == false) {
				System.out.println("Given target is not achieved");
			}

		}

	}
}
