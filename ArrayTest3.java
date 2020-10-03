package demo_2;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//先隨機取10個數字放到array
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random() * 100);
		}
		
		//印出來
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//array中的最大值
		int max = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("最大值為：" + max);
		
		//array的最小值
		int min = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("最小值為：" + min);
		//array內的總和
		int sum = 0;
		for(int i = 0;i < arr.length;i++){
			sum += arr[i];
		}
		System.out.println("總和為：" + sum);
		//array平均
		int avg = sum / arr.length;
		System.out.println("平均為：" + avg);
	}
}

