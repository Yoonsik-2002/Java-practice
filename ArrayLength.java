package com.dongyang.mypackage_week_6;

import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(intArray.length + " ���� ������ �Է��ϼ���. ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		System.out.println("��� : " + sum/intArray.length);
		
		scanner.close();
	}

}
