package RunningTimeOfAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());
		int arr[] = new int[size];
		String temp = bf.readLine();
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(temp.split(" ")[i]);
		}
		int counter=0;
		for (int i = 1 ;i<arr.length;i++) {
			for(int h=1;i-h>=0;h++) {
				if(arr[i]<arr[i-h]) counter++;
			}
		}
		System.out.println(counter);
		
	}

}
