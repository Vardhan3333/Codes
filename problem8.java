package problem;

import java.util.*;

public class problem8 {
	public void Small(int input1,int input2,int input3) {
		int a,b,c =0;
		int small1;
		int small2;
		int small3;
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		ArrayList<Integer> list3= new ArrayList<>();
		ArrayList<Integer> list4= new ArrayList<>();
		while(input1!=0) {
			a=input1%10;
			list1.add(a);
			input1=input1/10;
		}
		while(input2!=0) {
			b=input2%10;
			list2.add(b);
			input2=input2/10;
		}
		while(input3!=0) {
			c=input3%10;
			list3.add(c);
			input3=input3/10;
		}
	    Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		list4.add(list1.get(0));
		list4.add(list1.get(1));
		list4.add(list2.get(0));
		list4.add(list2.get(1));
		list4.add(list3.get(0));
		list4.add(list3.get(1));
		small1= list4.get(0)*10 +list4.get(1);
		small2= list4.get(2)*10 +list4.get(3);
		small3= list4.get(4)*10 +list4.get(5);
//		return small1;
//		return small2;
//		return small3;
		System.out.println(small1 + " " + small2+ " "+small3);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s=scan.nextInt();
		int m=scan.nextInt();
		int g=scan.nextInt();
		problem8  prob = new problem8();
		prob.Small(s,m,g);
//		int a,b,c =0;
//		int small1;
//		int small2;
//		int small3;
//		ArrayList<Integer> list1= new ArrayList<>();
//		ArrayList<Integer> list2= new ArrayList<>();
//		ArrayList<Integer> list3= new ArrayList<>();
//		ArrayList<Integer> list4= new ArrayList<>();
//		while(input1!=0) {
//			a=input1%10;
//			list1.add(a);
//			input1=input1/10;
//		}
//		while(input2!=0) {
//			b=input2%10;
//			list2.add(b);
//			input2=input2/10;
//		}
//		while(input3!=0) {
//			c=input3%10;
//			list3.add(c);
//			input3=input3/10;
//		}
//	    Collections.sort(list1);
//		Collections.sort(list2);
//		Collections.sort(list3);
//		list4.add(list1.get(0));
//		list4.add(list1.get(1));
//		list4.add(list2.get(0));
//		list4.add(list2.get(1));
//		list4.add(list3.get(0));
//		list4.add(list3.get(1));
//		small1= list4.get(0)*10 +list4.get(1);
//		System.out.println(small1);
//		small2= list4.get(2)*10 +list4.get(3);
//		System.out.println(small2);
//		small3= list4.get(4)*10 +list4.get(5);
//		System.out.println(small3);
		
	

	}

}
