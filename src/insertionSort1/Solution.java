package insertionSort1;



import java.util.Scanner;

public class Solution {
    public static void insertionSort(int arr[]) {
        int outer,inner;
        int temp;
        for(outer = 1;outer<arr.length;outer++) {
            inner = outer;
            temp = arr[outer];
            while(inner>0 && arr[inner-1]>temp) {
                arr[inner] = arr[inner-1];        
                inner--;
                display(arr);
            }
            arr[inner] = temp;
        }
    }
    public static void display(int arr[]) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize = sc.nextInt();
        int arr[] = new int[maxSize];
        for(int i=0;i<maxSize;i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        display(arr);
    }

}
