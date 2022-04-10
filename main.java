package com.GL.main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int tasize, totalTarget, target;
		System.out.println("Enter the size of transaction array: ");
		tasize = in.nextInt();
		int[] arr = new int[tasize];

		System.out.println("Enter the values of array: ");

		for (int arr_i = 0; arr_i < tasize; arr_i++) {

			arr[arr_i] = in.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		totalTarget = in.nextInt();

		while (totalTarget-- != 0) {
			int flag = 0;
			System.out.println("Enter the value of target\r\n");
			target = in.nextInt();
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}

		}

	}

}
