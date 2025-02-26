package problem;

public class problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] res = new int[3][4];
		int input1=3521;
		int input2=2452;
		int input3=1352;
		int t1 = input1/1000;
		int h1 = (input1%1000)/100;
		int te1=((input1%1000)%100)/10;
		int o1 = ((input1%1000)%100)%10;
		int t2 = input2/1000;
		int h2 = (input2%1000)/100;
		int te2=((input2%1000)%100)/10;
		int o2 = ((input2%1000)%100)%10;
		int t3 = input3/1000;
		int h3= (input3%1000)/100;
		int te3=((input3%1000)%100)/10;
		int o3 = ((input3%1000)%100)%10;
		int t4 = Math.min(Math.min(t1, t2), t3);
		int h4 = Math.max(Math.max(h1, h2), h3);
		int te4 = Math.min(Math.min(te1, te2), te3);
		int o4 = Math.max(Math.max(o1, o2), o3);
		System.out.print(t4);
		System.out.print(h4);
		System.out.print(te4);
		System.out.print(o4);
	}

	}


