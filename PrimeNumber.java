package demo_2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start_time = System.currentTimeMillis();//獲取當前時間 時間預設為1970-01-01 00:00:00
		
		boolean prime =true ;//先定義prime為布林
		
		for(int i = 1;i <= 10000;i++) {
			
			for(int j = 2;j < i;j++) {
				
				if(i % j == 0) {  //如果i能被j整除就不是質數
					prime = false;//不是質數就不列出來
					break;
				}
				
			}
			
			if(prime == true) {
				System.out.println(i);//是質數就印出來
			}
			
			prime = true;//把不是質數的數字 改為true 數字才會持續+1
			
		}
		
		long end_time = System.currentTimeMillis();
		System.out.println("所花的時間為:" + (end_time - start_time) + "毫秒");

	}

}
