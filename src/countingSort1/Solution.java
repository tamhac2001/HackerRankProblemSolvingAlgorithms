package countingSort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in) );
		int size = Integer.parseInt(bf.readLine());
		int arr[] = new int[100];
		String temp = bf.readLine();
		int lower = 0;
		int upper;
		if(temp.length()>50) upper=50;
		else upper=temp.length();
		do {
			if(upper!=temp.length()) {
				while(temp.charAt(upper)!=' ') {
					upper++;	
				}
			}
			
			String tempSubString = temp.substring(lower, upper);
			String strArr[] = tempSubString.split(" ");
			for(int i=0;i<strArr.length;i++) {
				arr[Integer.parseInt(strArr[i])]++;	
			}
			
			lower=upper+1;
			upper+=50;
			if(temp.length()>upper && temp.length()-upper<50) upper=temp.length();
		}while(upper<=temp.length()) ;
		for(int i:arr) {
			System.out.print(i+" ");
		}
			
			
	}
}
