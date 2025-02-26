package problem;

import java.util.*;
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','d'};
		char[] arr1= {'e','f','c','a'};
		int sum=0;
		HashMap <Character,Integer> hash = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!hash.containsKey(arr[i]))
				hash.put(arr[i], 1);
			else
				hash.put(arr[i], hash.get(arr[i])+1);
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(!hash.containsKey(arr1[i]))
				hash.put(arr1[i], 1);
			else
				hash.put(arr1[i], hash.get(arr1[i])+1);
		}
       for(Map.Entry<Character,Integer> e:hash.entrySet()) {
    	   if(e.getValue()==1)
    	   {
    		   sum+=(int)e.getKey();
    		   //System.out.println(sum);
    	   }
    		  
    	   }
       
       int copy=sum;
       int z=sum;
       int sum1=0;
		while(copy>10) {
			while(z!=0 ) {
				sum1+=z%10;
				z=z/10;
			}copy=sum1;
			z=sum1;
			
		}
	System.out.println(copy);
	}

}
