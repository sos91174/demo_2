package demo_2;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入學生人數:");
		int people = scan.nextInt();
		
		//建一個array儲存學生成績
		int[] scores = new int[people];
		int max = 0;
		System.out.println("請輸入學生成績:");
		for(int i = 0;i < scores.length;i++) {
			scores[i] = scan.nextInt();//分別輸入5位學生的成績
			
		}
		
		//取學生成績最高分的分數
//		int max = 0;
//		for(int i = 0;i <scores.length;i++) {
//			if(max < scores[i]) {
//				max = scores[i];
//			}
//		}
		
		
	

	}

}
