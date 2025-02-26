package problem;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int [] arr = {12,13,12,14,15,16,12,16,16,17};
		int len=arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> res=new ArrayList<Integer>();
		res.add(arr[len-1]);
		for(int i=0;i<=len;i++)
		{try{
		    if(arr[i]!=arr[i+1])
		    {
		        res.add(arr[i]);
		        System.out.println(res);
		    }
		}catch(Exception e){}}
		for(int i=0;i<res.size();i++)
		{
		    Collections.sort(res);
		    System.out.print(res+" ");
		    break;
		}
}


	}



