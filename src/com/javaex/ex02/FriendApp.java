package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	//ArrayList 사용
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	//친구 등록
    	System.out.println("친구를 3명 등록해 주세요");
    	Scanner sc = new Scanner(System.in);
    	String f01 = sc.nextLine();
    	String f02 = sc.nextLine();
    	String f03 = sc.nextLine();
    	
    	//띄어쓰기를 기준으로 나누기 == 배열 써도 되나..?
    	String[] fArray1 = f01.split(" ");
    	String[] fArray2 = f02.split(" ");
    	String[] fArray3 = f03.split(" ");
    	
    	Friend ff1 = new Friend(fArray1[0], fArray1[1], fArray1[2]);
    	Friend ff2 = new Friend(fArray2[0], fArray2[1], fArray2[2]);
    	Friend ff3 = new Friend(fArray3[0], fArray3[1], fArray3[2]);
    	
    	fList.add(ff1);
    	fList.add(ff2);
    	fList.add(ff3);
    	
    	for(int i=0; i<fList.size(); i++) {
			fList.get(i).draw();
		}
   
    }

}
