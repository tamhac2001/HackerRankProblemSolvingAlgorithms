package gameOfThronesI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String input = bf.readLine();
		LinkedList<Character> charList = new LinkedList<Character>();
		for(int i=0;i<input.length();i++) {
			if(!charList.contains(input.charAt(i)))
			charList.add(input.charAt(i));
		}
		int counterOdd=0;
		boolean ans = true;
		for(char charInList:charList) {
			int counter =0;
			for(char c:input.toCharArray()) {
				if(charInList==c) counter++;
			}
			if(counter%2!=0) counterOdd++;
			if(counterOdd>1) {
				ans = false;
				break;
			}
		}
		if(ans) System.out.println("YES");
		else System.out.println("NO");
	}

}
