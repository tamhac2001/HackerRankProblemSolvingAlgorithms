package manasaAndStones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalCase = Integer.parseInt(br.readLine().trim());
		
		for(int test=0;test<totalCase;test++) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			int numberOfStone = Integer.parseInt(br.readLine().trim());
			int a = Integer.parseInt(br.readLine().trim());
			int b = Integer.parseInt(br.readLine().trim());
			int total = 0;
			for(int i=1;i<=numberOfStone-1;i++) {
				total+=Math.min(a, b);
			}
			if(!list.contains(total)) {
				list.add(total);
				System.out.print(total+" ");
			}
			
			for(int i=1;i<=numberOfStone-1;i++) {
				total=total-Math.min(a, b)+Math.max(a, b);
				if(!list.contains(total)) {
					list.add(total);
					System.out.print(total+" ");
				}
				
			}
			System.out.println();
		}
		
		
	}
}
