package strangeCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		long timeInput = Long.parseLong(br.readLine());
		long cycleAtTimeInput= (long) (Math.log10(Math.ceil((double)timeInput/3))/Math.log10(2))+1;
		long maxValueAtCycle = 3*(long)Math.pow(2, cycleAtTimeInput-1);
		long ans = maxValueAtCycle - (timeInput-(maxValueAtCycle-2));
		System.out.println(ans);
	}
}