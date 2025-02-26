package problem;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class problem2 {
	public static String input(int [] arr) {
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}//System.out.println(map);
		return map.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size=scan.nextInt();
		int [] arr = new int [size];
		for(int i =0;i<size;i++) {
			arr[i]= scan.nextInt();		
		}
		System.out.println(input(arr));
		//nput(arr);
		

	}

}
