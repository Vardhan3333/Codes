package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class problem4 {

	public static void main(String[] args) {
		String input1= "1234ygh788";
		int input2=0;
		int sum=0;
		if(input1.length()==0)
		{
			System.out.print('o');
		}
		
		else if(input2==0)
		{
			for(int i=0;i<input1.length();i++)
			{

				if((input1.charAt(i)>=65 && input1.charAt(i)<=90) || (input1.charAt(i)>=97 && input1.charAt(i)<=122))
                        System.out.print(input1.charAt(i));
			}
		}
		else
		{
			for(int i=0;i<input1.length();i++)
			{
			if(input1.charAt(i)>=48 && input1.charAt(i)<='9')
			{
				sum+=input1.charAt(i)-48;
			}
			}
			System.out.print(sum);
				        
		}
		//int sum =0;
	/*	ArrayList<Character> ch = new ArrayList<>();
		ArrayList<Character> ch1 = new ArrayList<>();
		ArrayList<Integer> arr = new ArrayList<>();
		//ArrayList<String> arr1 = new ArrayList<>()
		for(int i = 0;i<input1.length();i++)
		{
			ch.add(input1.charAt(i));
		}
		
		for(char e : ch) 
		{
			if(((int)e>=65 && (int)e<=90) || ((int)e>=97 && (int)e<=122))
			{
				ch1.add(e);
		}
		else 
		{
			arr.add(Character.getNumericValue(e));
				//System.out.println(arr);
			
		}
	}
		switch(input2) 
		{
	case 1:int sum =arr.stream().reduce((x, y) -> x+y).get();
	System.out.println(sum);
	break;
	case 0:
		String string = ch1.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(string);
		break;
		}  */
	}

}

