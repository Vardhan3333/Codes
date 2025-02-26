package problem;

public class problem5 {
	//public int ADD(int N,int opt) {
//	    int N = 6;
//		int sum =0;
		//int sum1=0;
		//if(opt==1) {
//			if(N%2!=0) {
//				N=N*(-1);
//				sum+=N;
//				N--;
//			}
		

	public static void main(String[] args) {
		int N = 6;
		int opt=2;
		int sum =0;
		int sum1=0;
		//while(N<6 && N>0) {
			for(int i=N-1;i>0;i--) {
				if(opt==1) {
					if(i%2!=0) {
					//i=i*(-1);
					sum-=i;
					}
					else {
					sum1=sum1+i;
				}}else if(opt==2) {
					if(i%2==0) {
						//i=i*(-1);
						sum-=i;}
						else {
						sum1=sum1+i;}
				}
			}System.out.println(N+sum+sum1);
		//System.out.println(sum);
		}//System.out.println(N);
		//System.out.println(sum);

	}


