package com.dongyang.mypackage_week_6;

import java.util.Scanner;
public class ArrayAccess_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int least = 1;
		System.out.println("��� 5���� �Է��ϼ��� : ");
		for (int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();
			least = intArray[i];
			if (intArray[i] < least)
				least = intArray[i];
		}
		System.out.println("���� ���� ���� " + least + " �Դϴ�.");
		
		scanner.close();
	}

}

