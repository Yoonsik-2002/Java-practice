package com.dongyang.mypackage_week_6;

import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; // �迭 ����
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ��� : ");
		for (int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt(); // �Է¹��� ������ �迭�� ����
			if (max < intArray[i])
				max = intArray[i];
		}
		System.out.print("���� ū ���� " + max + " �Դϴ�.");
		
		scanner.close();
	}

}
