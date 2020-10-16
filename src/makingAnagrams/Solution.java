package makingAnagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		LinkedList<Character> charList = new LinkedList<Character>(); // contain character both s1 and s2 has
		for (int i = 0; i < s1.length(); i++) {
			if (!charList.contains(s1.charAt(i)) && s2.indexOf(s1.charAt(i)) != -1) {
				charList.add(s1.charAt(i));
			}
		}
		int numberOfDelete = 0;

		for (char charInList : charList) { //delete the difference between char that both s1 and s2 has
			int counterInS1 = 0;
			int counterInS2 = 0;
			for (char c1 : s1.toCharArray()) {
				if (c1 == charInList)
					counterInS1++;
			}
			for (char c2 : s2.toCharArray()) {
				if (c2 == charInList)
					counterInS2++;
			}
			numberOfDelete+=Math.abs(counterInS1-counterInS2);
		}
		for (char c1 : s1.toCharArray()) {
			if(!charList.contains(c1)) numberOfDelete++;
		}
		for (char c2: s2.toCharArray()) {
			if(!charList.contains(c2)) numberOfDelete++;
		}
		System.out.println(numberOfDelete);
	}

}
