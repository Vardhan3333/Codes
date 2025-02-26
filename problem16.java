package problem;

import java.util.ArrayList;
import java.util.Arrays;

public class problem16 {

	public static void main(String[] args) {
		/* ArrayList<Integer> ans = new ArrayList<>();
		ArrayList<Integer> main = new ArrayList<>();
		int max=-1;
//		int d=0;
		int count =0;
//		int k=0;
//		int sum =0;
		int flag =0;
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr1.length;j++) {
				if(arr[i]!=arr[j] ){
					flag =1;
					if(max<count) {
						max=count;
						main.addAll(arr1);
						System.out.println(main);
					}
					count=0;
					i--;
					arr1.clear();
					ans.clear();
					break;
				}if(flag==0) {
					arr1.add(arr[i]);
					count++;
					ans.add(arr[i]);
				}else {
					flag=0;
				}
			}
		}
		if(max<count) {
			max=count;
			main=(ArrayList)ans.clone();
		}//String s = Arrays.toString(main);
		System.out.println(main);   */
		int[] arr = {1,2,3,3,3,4,5,6,6,6,6,3,4,5,6,6,7,7,7,7,7,8,9,9,9,9,9,8,8,8};
		int cnt=0;
		int max=-1;
		int num=0;
		int high_num=0;
		int flag=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			
			if(arr[i]!=arr[i+1]) 
			{
				if(flag==1)
				{
					cnt++;
					flag=0;
				}
				if(cnt>=max)
				{
					max=cnt;
					num=arr[i];
//					if(i==arr.length-1 && num==arr[arr.length-1]) {max=max+1;}
					
				}
				cnt=0;
			}
			else
			{
				cnt++;
				flag=1;
			}
		}
		if(flag==1)
		{
			cnt++;
			if(cnt>=max)
			{
				max=cnt;
				num=arr[arr.length-1];
			}
		}
		System.out.println(num);
		System.out.println(max);
	//	System.out.println(arr[arr.length-1]);
		
	}

}
