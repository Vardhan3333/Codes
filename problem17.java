package problem;

public class problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="ABCst";
		String input2 ="stCBA";
		int count1=0;
		int count2=0;
		int count3 =0;
		for(int i =0;i<input1.length()-1;i++) {
			if((input1.charAt(i))<(input1.charAt(i+1))) {
				count1++;
			}else {
				break;
			}
		}for(int j =0;j<input1.length()-1;j++) {
			if((int)input1.charAt(j)>(int)input1.charAt(j+1)) {
				count2++;
			}else {
				break;
			}
		}for(int z=0;z<input1.length();z++) {
			if((int)input1.charAt(z)!=(int)input2.charAt(z)) {
				count3++;
			}
		}
		if(count1+1==input1.length()) {
			System.out.println("Increasing:"+count3);
		}else if(count2+1==input1.length()) {
			System.out.println("Decreasing:"+count3);
		}else {
			System.out.println("Invalid");
		}

	}

}
