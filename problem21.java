package problem;

import java.util.Map;
import java.util.TreeMap;

public class problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new TreeMap<>();
		String [] input2= {"raj","abd","rah","priya","sanj","nidh","var","varsha","Bas","asif"};
		int [] input3= {99,46,39,102,45,521,65,4,47,741};
		int input1=10;
		for(int i =0;i<input3.length;i++) {
			for(int j=0;j<input3.length;j++) {
			if(input3[i]==input3[j]+1 && input3[i]!=input3[j] || input3[i]==input3[j]-1){
				map.put(input3[i],i);
			}
		}

	}System.out.println(map);
	for(int v : map.values()) {
		System.out.println(input2[v]+":");
	}
	}
}


