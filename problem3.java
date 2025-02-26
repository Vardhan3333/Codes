package problem;

public class problem3 {
	public static void input(String s) {
		int count = 0;
		for(int i =0;i<s.length();i++) {
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) ) {
				count = count+1;
			}
			
			if(count==s.length()) {
				
				System.out.println((int)s.charAt(0)+(int)s.charAt(s.length()-1));
			}else
			{
				   System.out.print("1");
				    break;
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input("abbbbb");

	}

}
