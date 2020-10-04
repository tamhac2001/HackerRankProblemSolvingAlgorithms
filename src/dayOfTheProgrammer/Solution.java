package dayOfTheProgrammer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;



import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {


	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {
		LocalDate localDate = LocalDate.ofYearDay(year,256 );
        if(year==1918) localDate = localDate.plusDays(13);
        if(year<1918 && year%100==0) localDate = localDate.minusDays(1);
        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String sol = localDate.format(dFormatter);
        return sol;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
