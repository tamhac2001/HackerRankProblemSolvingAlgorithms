package findTheMedian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String strInput = br.readLine();
		String strArr[] = strInput.split(" ");
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<size;i++) {
			list.add(Integer.parseInt(strArr[i]));
		}
		list.sort(null);
		System.out.println(list.get(size/2));
	}

}
