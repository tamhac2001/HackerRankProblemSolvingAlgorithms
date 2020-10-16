package happyLadyBugs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int totalCase = Integer.parseInt(bf.readLine());
		for (int gameCase = 0; gameCase < totalCase; gameCase++) {
			int stringLen = Integer.parseInt(bf.readLine());
			char c[] = bf.readLine().toCharArray();
			boolean ans = true;
			LinkedList<Character> tempList = new LinkedList<Character>();
			for(int i=0;i<stringLen;i++) {
				if(!tempList.contains(c[i])) {
					tempList.add(c[i]);
				}
			}
			if(tempList.contains('_')) {
				for(char charInList:tempList) {
					int counter=0;
					if(charInList=='_') continue;
					for(char ch:c) {
						if(charInList==ch) counter++;
					}
					if(counter==1) {
						ans = false;
						break;
					}
				}
				if(ans) System.out.println("YES");
				else System.out.println("NO");
			}
			else { //not contain "_"
				char temp = c[0];
				int min = Integer.MAX_VALUE;
				int counter = 0;
				for(char ch:c) {
					if(ch==temp) counter++;
					else {
						min = Math.min(counter, min);
						if(min==1) {
							ans = false;
							break;
						}
						temp = ch;
						counter=1;
					}
				}
				if(counter==1) ans=false;
				if(ans) System.out.println("YES");
				else System.out.println("NO");
			}
		}//end of for(gameCase)
	}
}
