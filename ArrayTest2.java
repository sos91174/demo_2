package demo_2;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
//				//二維陣列範例
//				int[] arr1[] = new int[][]{{1,2,3},{4,5,9,10},{55,67,82}};
//				//這種寫法也可以
//				int[] arr2[] = {{1,2,3},{4,5},{6,7,8}};
//				//二維陣列長度
//				System.out.println(arr1.length);//3
//				System.out.println(arr1[0].length);//3
//				System.out.println(arr1[1].length);//4
//				
//				//印出二維陣列
//				for(int i = 0;i < arr1.length;i++){
//					
//					for(int j = 0;j < arr1[i].length;j++){
//						System.out.print(arr1[i][j] + "  ");
//					}
//					System.out.println();
//				}
				
				
			
					int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
					
					int sum = 0;//用來記錄總和
					
					for(int i = 0;i < arr.length;i++){
						for(int j = 0;j < arr[i].length;j++){
							sum += arr[i][j];
						}
					}
					
					System.out.println("總和為：" + sum);
				}
				
			}
		
