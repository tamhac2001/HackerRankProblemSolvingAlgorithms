package tutorialntro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = Integer.parseInt(br.readLine());
		int size = Integer.parseInt(br.readLine());
		String strInput = br.readLine();
		String tempArr[] = strInput.split(" ");
		int arr[] = new int [size];
		for(int i=0;i<size;i++) {
			arr[i] = Integer.parseInt(tempArr[i]);
		}
		int pointer = size/2;
		int oldPointer=size; 
		int valueTemp = arr[size/2];
		while(valueTemp!=value) {
			if(value<valueTemp) {
				int temp = pointer;	
				pointer -=  Math.ceil((double)(Math.abs(oldPointer-pointer))/2);
				valueTemp= arr[pointer];
				oldPointer = temp;
			}
			else if(value>valueTemp) {
				int temp = pointer;
				pointer += Math.ceil((double)(Math.abs(oldPointer-pointer))/2);
				valueTemp= arr[pointer];
				oldPointer=temp;
			}
		}
		System.out.println(pointer);
	}

}
