package problem;

public class problem7 {
	

	public static void main(String[] args) {
		int input1=2345;
		int input2=3456;
		int input3 =123;
		int min1=input1%100;
		int min2=input2%10;
		int min3=input3%10;
		while(input1!=0) {
			int n = input1%10;
			if(n<min1) {
				min1=n;
			}input1=input1/10;
		}
		while(input2!=0) {
			int n = input2%10;
			if(n<min2) {
				min2=n;
			}input2=input2/10;
		}
		while(input3!=0) {
			int n = input3%10;
			if(n<min3) {
				min3=n;
			}input3=input3/10;
		}System.out.println(min1+min2+min3);

	}

}
