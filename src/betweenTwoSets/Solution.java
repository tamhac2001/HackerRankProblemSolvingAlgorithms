package betweenTwoSets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int arrA[] = new int[a.size()];
		int arrB[] = new int[b.size()];
		for (int i = 0; i < a.size(); i++) {
			arrA[i] = a.get(i);
		}
		for (int i = 0; i < b.size(); i++) {
			arrB[i] = b.get(i);
		}
		int lcmOfA = 0;
		if (arrA.length == 1)
			lcmOfA = arrA[0];
		else {
			lcmOfA = lcm(arrA[0],arrA[1]);
			for (int i = 2; i < arrA.length; i++) {
				lcmOfA = lcm(lcmOfA, arrA[i]);
			}
		}
		int betweenTwoSet[] = new int[arrB[0] / lcmOfA];
		for (int i = 0; i < betweenTwoSet.length; i++) {
			betweenTwoSet[i] = lcmOfA + lcmOfA * i;
		}
		int counter = 0;
		for (int i = 0; i < betweenTwoSet.length; i++) {
			int j = 0;
			for (; j < arrB.length; j++) {
				if (arrB[j] % betweenTwoSet[i] != 0)
					break;
			}
			if (j == arrB.length)
				counter++;
		}
		return counter;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = Result.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
