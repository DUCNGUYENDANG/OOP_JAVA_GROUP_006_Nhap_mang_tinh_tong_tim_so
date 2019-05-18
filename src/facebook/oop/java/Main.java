package facebook.oop.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Step1: Input Element Of Array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        inPutArray(input, size, arr);
        System.out.print("\nStep 2: Caculate SUM elements of Array: "+caculateSum(arr));
        System.out.print("\nStep 3: Sort Array: {"); sortArr(arr);System.out.print("}");
        System.out.print("\nStep 4: Found Number 4 in array: "); findNumber(arr,4);
    }

    private static void inPutArray(Scanner input, int size, int[] arr) {
        for (int i=0; i < size; i++){
            System.out.format("     . a[%d] = ",i);
            arr[i] = input.nextInt();
        }
    }

    public static int caculateSum(int[] arr){
        int sum =0;
        for (int index: arr) {
            sum += index;
        }
        return sum;
    }
    public static void sortArr(int[] arr){
        for (int i=0; i < arr.length;i++){
            for(int j=i+1; j < arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int index: arr) {
            System.out.print(index+ " ");
        }
    }
    public static void findNumber (int[] arr, int number){
        boolean flagCheck = false;
        int position =0;
        for (int i=0; i < arr.length; i++){
            if (arr[i] == number) {
                flagCheck = true;
                position =i;
            } else
                flagCheck = false;
        }
        if (flagCheck)
            System.out.format("\n     .Found number at Position: %d",position);
        else
            System.out.format("\n     .Not Found");
    }
}
