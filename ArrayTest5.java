package demo_2;

import java.util.Arrays;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Array常用
		
				//1.boolean equals(int[] a,int[] b)判斷2個陣列是否相同。
				int[] arr1 = new int[]{1,2,3,4};
				int[] arr2 = new int[]{1,3,2,4};
				boolean isEquals = Arrays.equals(arr1, arr2);
				System.out.println(isEquals);
				
				//2.String toString(int[] a):印出陣列 就不用再寫for loop。
				System.out.println(Arrays.toString(arr1));
				
					
				//3.void fill(int[] a,int val):把陣列的值改成指定的值
				Arrays.fill(arr1,10);
				System.out.println(Arrays.toString(arr1));
				

				//4.void sort(int[] a):對陣列進行排序。
				Arrays.sort(arr2);
				System.out.println(Arrays.toString(arr2));
				
				//5.int binarySearch(int[] a,int key)二分搜尋
				int[] arr3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
				int index = Arrays.binarySearch(arr3, 210);
				if(index >= 0){
					System.out.println(index);
				}else{
					System.out.println("沒有找到");
				}
				
				
			}
		}
