package problem;

import java.util.Arrays;

public class problem15 {

	public static void main(String[] args) {
		int [] arr ={74,-56,15,71,92,23};
		int input2 = 6;
		int key;
		int address =0;
		int sum=0;
		int d =0;
		int [] arr1 = new int[arr.length];
		while(address<7) {
			key=arr[address]/10;
			if(key<0) {
				key=Math.abs(key);
				arr1[d++]=key;
				break;
			}else {
				arr1[d++]=key;
			}
			address=arr[address]%10;
		}
		for(int i =1;i<arr1.length;i++) {
			if(i%2==0) {
				arr1[i] = Math.multiplyExact(arr1[i], -1);
			}sum+=arr1[i];
		}System.out.println(arr1[0]+sum);
	}

}
