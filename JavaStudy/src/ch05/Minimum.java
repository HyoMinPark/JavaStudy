package ch05;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = {3, 6, 2, 5, 76,2335,1};
		
		//int temp = 2000000000;
		  int temp = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length; i++) {
			if(temp > nums[i]) {
			temp = nums[i];
			}
		}
		System.out.println("ÃÖ¼Ò°ª:" + temp);
	}
}
