package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		// ArrayList 사용
		ArrayList<Goods> gList = new ArrayList<Goods>();

		String p;
		int sum = 0;
		int price;
		int count = 0;

		// 상품 입력
		System.out.println("상품을 입력해주세요(종료 q)");
		Scanner sc = new Scanner(System.in);

		while(true) {
			p = sc.nextLine();

			if (p.equals("q")) { // q입력 --> 종료
				System.out.println("[입력완료]");
				break;
			}
			
			String[] gArray = p.split(",");
			String name = gArray[0];
			price = Integer.parseInt(gArray[1]);
			count = Integer.parseInt(gArray[2]);
			
			Goods goods = new Goods(name, price, count);
			gList.add(goods);
		}
		
		System.out.println("=============================");
		
		for(int i = 0; i<gList.size(); i++) {
			gList.get(i).showInfo();
		}
		
		for(int i=1; i<gList.size(); i++) {
			sum += count;
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
		
		
		sc.close();
	}

}
