package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input1 = scan.next();
		String input2 = scan.next();
		String input3 = scan.next();
		String output4 = "";
		ArrayList<String> list = new ArrayList<>();
		list.add(input1);
		list.add(input2);
		list.add(input3);
		String[][] res = new String[3][3];
		System.out.println(list.get(0));
//		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				String input = list.get(j);
				System.out.println(input);
				int l = input.length();
				if(l%3==0 || l%3==1) {
			res[j][0]=input.substring(0,l/3);
			res[j][1]=input.substring(l/3,l-l/3);
			res[j][2]=input.substring(l-l/3);}
			else {
				res[j][0]=input.substring(0,l/3+1);
				res[j][1]=input.substring(l/3+1,l-l/3);
				res[j][2]=input.substring(l-l/3);
				
			}}
		String output1 = res[0][0]+res[1][1]+res[2][2];
		String output2= res[0][1]+res[1][2]+res[2][0];
		String output3= res[0][2]+res[1][0]+res[2][1];
		for(int i =0;i<output3.length();i++) {
			char c = output3.charAt(i);
			if(Character.isLowerCase(c)) {
				c= Character.toUpperCase(c);
			}else if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}
			output4 += c;
		}
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output4);
	}

	}