package beautifulDaysAtTheMovies;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int startDay = sc.nextInt();
		int endDay = sc.nextInt();
		int divisor = sc.nextInt();
		double temp;
		int counter =0;
		for(;startDay<=endDay;startDay++) {
			StringBuilder sbd = new StringBuilder();
			sbd.append(startDay);
			sbd.reverse();
			temp =(double)(startDay - Integer.parseInt(sbd.toString()))/divisor;
			if(temp == (int)temp) counter++;
		}
		System.out.println(counter);
	}

}
