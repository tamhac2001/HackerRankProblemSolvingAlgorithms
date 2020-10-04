package timeConversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	String[] temp = new String [3];
    	temp=s.split(":");
    	String hour = temp[0];
    	String minute = temp[1];
    	String second = temp[2].substring(0, 2);
    	String amOrPm = temp[2].substring(2);
    	if(Integer.parseInt(hour)==12 && amOrPm.equalsIgnoreCase("AM"))
    		return "00:"+minute+":"+second;
    	else if(Integer.parseInt(hour)==12 && amOrPm.equalsIgnoreCase("PM"))
    		return "12:"+minute+":"+second;
    	if(amOrPm.equalsIgnoreCase("PM")) {
    		hour= String.valueOf((Integer.parseInt(hour)+12));
    	}
    	return hour+":"+minute+":"+second;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
