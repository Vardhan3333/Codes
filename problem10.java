package problem;

public class problem10 {

	public static void main(String[] args) {
		int n =9876654;
		int sum =0;
		int temp=n;
		while(temp>9) {
			n=temp;
			while(n!=0) {
				sum=sum+n%10;
				n=n/10;
			}
		temp=sum;
		sum=0;
		}
		System.out.println(temp);
//		}if(sum>10) {
//			n=sum;
//			sum=0;
//		}
	}

}
