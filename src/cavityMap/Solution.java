package cavityMap;



import java.util.Scanner;

public class Solution {
    public static void display(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        char[][] arrChar = new char[size][size];
        int[][] arrInt = new int[size][size];
        String[] temp = new String[size];
        for (int i = 0; i < size; i++) {
            temp[i] = sc.nextLine();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrChar[i][j] = temp[i].charAt(j);
                arrInt[i][j] = Character.getNumericValue(temp[i].charAt(j));
            }
        }
        for (int row = 1; row < size - 1; row++) {
            for (int col = 1; col < size - 1; col++) {
                boolean largest = true;
                for (int i = -1; i <= 1; i++) {
                    if(i==0) continue;
                    if (arrInt[row + i][col] >= arrInt[row][col]) {
                        largest = false;
                        break;
                    }
                    if (arrInt[row][col + i] >= arrInt[row][col]) {
                        largest = false;
                        break;
                    }

                } // end of for i
                if (largest)
                    arrChar[row][col] = 'X';
            } // end of for col
        } // end of for row
        display(arrChar);
    }

}
