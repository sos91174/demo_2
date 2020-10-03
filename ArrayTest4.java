package demo_2;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array反轉
		String [] arr = new String[] {"jj","dd","aa","vv","ss","BB"};
		
		for(int i = arr.length-1 ;i >= 0 ;i--) {
			
			System.out.println(arr[i]);
			
		}
		
				//搜尋：
				String dest = "ss";
//				dest = "aa";
				
				boolean isFlag = true;
				
				for(int i = 0;i < arr.length;i++){
					//equals用來比對值
					if(dest.equals(arr[i])){
						System.out.println("找到了指定的值，位置在：" + i);
						isFlag = false;
						break;
					}
					
				}
				if(isFlag){
					System.out.println("沒有找到指定的值");
					
				}
					
	}

}
