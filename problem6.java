package problem;

import java.util.Arrays;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,1,7,9,3};
		int d=0;
		//int a =arr.length;
		int [] arr1 = new int[arr.length];
		for(int i =0;i<arr.length-1;i++) {
			arr1[i]=arr[i+1]-arr[i];
			//++;
		}
		arr1[arr1.length-1]=arr[arr.length-1];
		String s =Arrays.toString(arr1);
		System.out.println(s);
	}

}
