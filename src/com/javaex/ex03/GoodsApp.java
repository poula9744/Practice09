package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		// ArrayList 사용
		ArrayList<Goods> gList = new ArrayList<Goods>();

		String p;

		// 상품 입력
		System.out.println("상품을 입력해주세요(종료 q)");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < gList.size(); i++) {
			p = sc.nextLine();
			
			if (p.equals("q")) { // q입력 --> 종료
				System.out.println("[입력완료]");
				break;
			}

		}
	}

}
