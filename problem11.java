package problem;

public class problem11 {
	public static String Password(String input1,String input2) {
		String[][] res =new String[2][3];
		String[]words= {input1,input2};
		for(int i =0;i<2;i++) {
			int l = words[i].length();
			res[i][0]=words[i].substring(0,l/3);
			res[i][1]=words[i].substring(l/3,l-l/3);
			res[i][2]=words[i].substring(l-l/3);
		} String password= res[1][0]+res[0][0]+res[0][2]+res[1][2];
	return password;}

	public static void main(String[] args) {
		System.out.println(Password("wipro","technologies"));
			}

}
