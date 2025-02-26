package problem;

import java.util.Arrays;

public class problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input1 = {"rac","nit","nip"};
		String [] input2 = {"car","pin","tin"};
		int input3=3;
		String input="";
		int d=0;
		String ans="";
		int flag=0;
		int count=0;
		while(d<input3) {
			input = input1[d];
			
			char[] arr = input.toCharArray();
			Arrays.sort(arr);
			String check = new String(arr);
			for(int i=0;i<input3;i++) {
				char[] dup=input2[i].toCharArray();
				Arrays.sort(dup);
				String check1=new String(dup);
				if(check.equals(check1)) {
					System.out.println(i);
					break;
				}
			}
			d++;
			}

	}

}
