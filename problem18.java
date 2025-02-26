package problem;

import java.util.Arrays;

public class problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input1 = {"cnhul","estl","rakeb","ahev"};
		String [] input2 = {"lets","have","lunch","break"};
		int input3=4;
		String input="";
		int d=0;
		String ans="";
		while(d<input3) {
			input = input1[d];
			char[] arr = input.toCharArray();
			Arrays.sort(arr);
//			String r="";
			for(int i=0;i<input3;i++) {
				int flag=0;
				int count=0;
//				r+=String.valueOf(i);
				char[] arr2 = input2[i].toCharArray();
				Arrays.sort(arr2);
				for(int j=0;j<input3;j++) {		
				if(arr2[j]!=arr[j]) {
					flag=1;
					break ;
				}else {
					//flag=0;
					count++;
				}
				}if(count==input3) {
					ans+=String.valueOf(i);
				}	
			}d++;
	}
		System.out.println(ans);
		}}

