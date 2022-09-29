package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char character = 'Z';
        int integer = 0xface;
        int integerTwo = 012;
        long longInteger = 80L;
        float floatingpointNumber = 44e-1f;
        float floatingpointNumberTwo = 5.5f;
        double longFloatingPointNumber = 8.88e1;
        double longFloatingPointNumberTwo = 99.9;
        int res = character + integer + integerTwo +(int) longInteger + (int) floatingpointNumber +
                (int) floatingpointNumberTwo + (int) longFloatingPointNumber + (int) longFloatingPointNumberTwo;
        System.out.println(res);
    }

    //todo Task 4
    public void addTwoNumbers(){
        int numberAmount = 2;
        int[] numbers = this.getAmountOfNumbers(numberAmount, false);
        int res = 0;
        for(int number: numbers){
            res += number;
        }

        System.out.println(res);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        int[] numbers = this.getAmountOfNumbers(2, true);
        this.swapTwoNumberArr(numbers);
        System.out.println("After Swap:");
        this.printIntArr(numbers);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Number: ");
            int number = scanner.nextInt();
            List<Integer> cifers = new ArrayList<>();
            while(number > 0){
                cifers.add(number % 10);
                number = number / 10;
            }
            for(int num: cifers){
                System.out.print(num);
            }
            System.out.println();
        } catch (Exception e){
            System.out.println("An unexpected Exception occured pls only type integers");
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }

    private int[]getAmountOfNumbers(int amount, boolean printVar){
        int[] numbers = new int[amount];
        char varName = 'x';
        try(Scanner scanner = new Scanner(System.in)) {
            for(int i=0; i < numbers.length; i++){
                if(printVar){
                    System.out.print(varName + ": ");
                    varName++;
                }
                numbers[i] = scanner.nextInt();
            }
        }catch (Exception e){
            System.out.println("An unexpected Exception occured pls only type integers");
            e.printStackTrace();
        }
        return numbers;
    }

    private void printIntArr(int[] arr){
        char varName = 'x';
        for(int num: arr){
            System.out.println(varName + ": " + num);
            varName++;
        }
    }

    private void swapTwoNumberArr(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Array has to have at least two Numbers");
        }
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }
}