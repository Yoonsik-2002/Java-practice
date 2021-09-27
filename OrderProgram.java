package com.dongyang.mypackage_week_4;

import java.util.Scanner;
public class OrderProgram {
	public static void main(String[] args) {
		int count = 0, sum = 0;
		do {
			System.out.println("제품 리스트");
			System.out.println("Menu : 신라면 (1) [1200]");
			System.out.println("Menu : 삼각김밥 (2) [1000]");
			System.out.println("Menu : 프링글스 (3) [2300]");
			System.out.println("Menu : 콜라 (4) [1600]");
			System.out.println("Menu : 하이네켄 (5) [2800]");
			System.out.println("종료 (0) [0]");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("주문하실 메뉴의 번호와 가격을 입력하세요 (주문 완료시, '종료' 입력) : ");
			int menu = scanner.nextInt();
			int price = scanner.nextInt();
			
			sum += price;
			count++;
	
				if (menu == 5)
				{
					System.out.print("태어난 년도를 입력하세요 : ");
					int year = scanner.nextInt();
					
					if (year > 2002) {
						System.out.print("미성년자에게는 판매할 수 없습니다");
						break;
					}
					else if (year < 2002) {
						System.out.print("네 고객님께서는 구매 가능 하십니다");
					}
				}
				else if (menu == 0) {
					System.out.print("주문하신 가격은 총 " + sum + " 원 입니다!");
					break;
				}
					
					
		}while(count < 100);
	}
}
