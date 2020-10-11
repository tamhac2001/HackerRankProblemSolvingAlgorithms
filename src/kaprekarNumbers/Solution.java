package kaprekarNumbers;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextInt();
		long max = sc.nextInt();
		long counter = 0;
		for(;min<=max;min++) {
			long temp =(long) Math.pow(min, 2);
			String tempStr = Long.toString(temp);
			long firstHalf=0;
			long lastHalf=0;
			if(tempStr.length()%2!=0) {
				if(temp>10)firstHalf = Long.parseLong(tempStr.substring(0,(int)Math.floor((double)tempStr.length()/2)) );
				lastHalf = Long.parseLong(tempStr.substring((int)Math.floor((double)tempStr.length()/2)) );
			}
			else {
				if(temp>10)firstHalf = Long.parseLong(tempStr.substring(0,(int)Math.ceil((double)tempStr.length()/2)) );
				lastHalf = Long.parseLong(tempStr.substring((int)Math.ceil((double)tempStr.length()/2)) );
			}
			if(firstHalf+lastHalf==min) {
				System.out.print(min+" ");
				counter++;
			}
		}
		if(counter==0) System.out.println("INVALID RANGE");
	} 
			
}
