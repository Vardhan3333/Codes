package problem;

import java.util.Arrays;

public class problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1=3521;
		int input2=2452;
		int input3=1352;
		String s1= String.valueOf(input1);
		String s2= String.valueOf(input2);
		String s3= String.valueOf(input3);
		char [] ch1= s1.toCharArray();
		char [] ch2= s2.toCharArray();
		char [] ch3= s3.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		Arrays.sort(ch3);
		int sum1=0;
		int sum2=0;
		sum1=Character.getNumericValue(ch1[ch1.length-1])+Character.getNumericValue(ch2[ch1.length-1])+Character.getNumericValue(ch3[ch1.length-1]);
		sum2=Character.getNumericValue(ch1[ch1.length-2])+Character.getNumericValue(ch2[ch1.length-2])+Character.getNumericValue(ch3[ch1.length-2]);
		System.out.println(sum1+sum2);
		
		
		

	}

}
