package problem;

import java.util.ArrayList;
import java.util.Arrays;

public class problem12 {

	public static void main(String[] args) {
		int input = 2345687;
		//String b = input + " ";
		int dif;
		int d;
		int k=0;
		while(input>=100) {
			int temp=input;
//			int[] arr1 = new int[b.length()];
			ArrayList<Integer> arr1 = new ArrayList<>();
		while(temp!=0) {
			d=temp%10;
			arr1.add(d);
			temp=temp/10;}String q="";
			for(int i=0;i<arr1.size()-1;i++) {
				dif=Math.abs(arr1.get(i)-arr1.get(i+1));
				q+=String.valueOf(dif);
		}input=Integer.parseInt(q);}
		System.out.println(input);
	}

}
