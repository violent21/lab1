package ad211.dovbyshev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu;
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("\nEnter task number(1, 2, 3) or 4 for exit: ");
            menu = scan.nextInt();

            switch(menu){
                case 1:
                    firstTask();
                    break;
                case 2:
                    FizzBuzz();
                    break;
                case 3:
                    thirdTask();
                    break;
                case 4:
                    System.out.print("\nClosing the program...");
                    System.exit(0);
                default:
                    System.out.print("\nNon-existent menu number");
            }
        }
    }
    public static void firstTask(){
        int arraySize;
        boolean result = false;
        Scanner getUserAnswer = new Scanner(System.in);

        System.out.print("Array size is: ");
        arraySize = getUserAnswer.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element №" + i + ": ");
            array[i] = getUserAnswer.nextInt();
        }

        System.out.print("\nYour array is: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        if (array.length >= 2) {
            for (int i = 0; i < array.length - 1; i++) {
                result = array[i + 1] >= array[i] ? true : false;
            }
        }
        else {
            System.out.print("\nArray is very small");
        }
        System.out.print("\n" + result);
    }
    public static void FizzBuzz(){
        for(int i = 1; i <= 100; i++){
            if (i % 15 == 0){
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0){
                System.out.print("Fizz ");
            } else if (i % 5 == 0){
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean thirdTask(){
        int arrSize, centerOfArray, firstPart = 0, secondPart = 0;
        boolean result = false;
        Scanner getUserAnswer = new Scanner(System.in);

        System.out.print("Array size is: ");
        arrSize = getUserAnswer.nextInt();
        centerOfArray = arrSize / 2;

        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element №" + i + ": ");
            arr[i] = getUserAnswer.nextInt();
        }

        System.out.print("\nYour array is: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        for (int i = 0; i < centerOfArray; i++){
            firstPart += arr[i];
        }
        System.out.print("\nsum of the first part: " + firstPart);

        for (int i = centerOfArray; i < arr.length; i++){
            secondPart += arr[i];
        }
        System.out.print("\nsum of the second part:" + secondPart);

        if (arrSize % 2 != 0){
            if (firstPart != secondPart){
                firstPart = 0;
                secondPart = 0;

                for (int i = 0; i <= centerOfArray; i++){
                    firstPart += arr[i];
                }
                System.out.print("\nsum of the first part: " + firstPart);

                for (int i = centerOfArray + 1; i < arr.length; i++){
                    secondPart += arr[i];
                }
                System.out.print("\nsum of the second part: " + secondPart);
            } else {
                result = true;
            }
        } else if (firstPart == secondPart){
            result = true;
        } else if (firstPart != secondPart){
            result = false;
        }
        System.out.print("\n" + result);
        return result;
    }
}
