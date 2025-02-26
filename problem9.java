package problem;

import java.util.Arrays;
import java.util.HashMap;

public class problem9 {

	public static void main(String[] args) {
		String s = "abcdefabcdefghijklmno";
		
		char[] dup=s.toCharArray();
		char[] dup2= new char[s.length()];
		String ans="";
		String finalans="";
		int max=-1,flag=0,index=0,cnt=0,k=0;;
		for(int i=0;i<s.length();i++)
		{
			
		   for(int j=0;j<dup2.length;j++)
		   {
			   if(dup[i]==dup2[j])
			   {
				   
				   flag=1;
				  
				   if(max<cnt)
				   {
					   max=cnt;
					   finalans=ans;
					   
				   }  
				   cnt=0;
				   k=0;
				   ans="";
				   Arrays.fill(dup2,' ');
				   i--;
				   //i=i-1;
				   break;
			   }
		   }	   
		   if(flag==0)
		   {
			   dup2[k++]=dup[i];
			   
			   ans+=dup[i];
			   cnt++;
		   }
		   else
			   flag=0;
		  
		}
		if(max<cnt) {
			max=cnt;
			finalans=ans;
		}
		System.out.println(finalans+" "+max);
//		//StringBuffer sb = new StringBuffer();
//		HashMap<Integer,Integer> map = new HashMap<>();
//		//StringBuffer sb1 = new StringBuffer();
//		for(int i =0;i<s.length()-1;i++) {
//			StringBuffer sb = new StringBuffer();
//			int d = 0;
//			int count=0;
//			for(int j =i;j>=0;j--) {
//			if(s.charAt(i)!=(s.charAt(j))) {
//				count++;	
//			}else if(s.charAt(i)==(s.charAt(j))) {
//				continue;
//			}
//		if(count==i) {
//			sb.append(s.charAt(i));
//			System.out.println(count);
//			map.put(i, count-1);
//			System.out.println(map);
//			s = s.substring(count-1);
//			}//System.out.println(count);
////		}System.out.println(count);
//			}System.out.println(sb);
//		

	}}


