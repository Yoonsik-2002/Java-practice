package com.dongyang.mypackage_week_4;

import java.util.Scanner;
public class OrderProgram {
	public static void main(String[] args) {
		int count = 0, sum = 0;
		do {
			System.out.println("��ǰ ����Ʈ");
			System.out.println("Menu : �Ŷ�� (1) [1200]");
			System.out.println("Menu : �ﰢ��� (2) [1000]");
			System.out.println("Menu : �����۽� (3) [2300]");
			System.out.println("Menu : �ݶ� (4) [1600]");
			System.out.println("Menu : ���̳��� (5) [2800]");
			System.out.println("���� (0) [0]");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("�ֹ��Ͻ� �޴��� ��ȣ�� ������ �Է��ϼ��� (�ֹ� �Ϸ��, '����' �Է�) : ");
			int menu = scanner.nextInt();
			int price = scanner.nextInt();
			
			sum += price;
			count++;
	
				if (menu == 5)
				{
					System.out.print("�¾ �⵵�� �Է��ϼ��� : ");
					int year = scanner.nextInt();
					
					if (year > 2002) {
						System.out.print("�̼����ڿ��Դ� �Ǹ��� �� �����ϴ�");
						break;
					}
					else if (year < 2002) {
						System.out.print("�� ���Բ����� ���� ���� �Ͻʴϴ�");
					}
				}
				else if (menu == 0) {
					System.out.print("�ֹ��Ͻ� ������ �� " + sum + " �� �Դϴ�!");
					break;
				}
					
					
		}while(count < 100);
	}
}
