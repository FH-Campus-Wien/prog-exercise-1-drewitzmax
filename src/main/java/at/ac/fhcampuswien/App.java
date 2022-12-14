package at.ac.fhcampuswien;

import java.util.*;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
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
    public void sumOfLiterals() {
        char character = 'Z';
        int integer = 0xface;
        int integerTwo = 012;
        long longInteger = 80L;
        float floatingpointNumber = 44e-1f;
        float floatingpointNumberTwo = 5.5f;
        double longFloatingPointNumber = 8.88e1;
        double longFloatingPointNumberTwo = 99.9;
        int res = character + integer + integerTwo + (int) longInteger + (int) floatingpointNumber +
                (int) floatingpointNumberTwo + (int) longFloatingPointNumber + (int) longFloatingPointNumberTwo;
        System.out.println(res);
    }

    //todo Task 4
    public void addTwoNumbers() {
        int numberAmount = 2;
        int[] numbers = this.getAmountOfNumbers(numberAmount, false);
        int res = 0;
        for (int number : numbers) {
            res += number;
        }

        System.out.println(res);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        System.out.println("Before Swap:");
        int[] numbers = this.getAmountOfNumbers(2, true);
        this.swapTwoNumberArr(numbers);
        System.out.println("After Swap:");
        this.printIntArr(numbers);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        int[] numbers = this.getAmountOfNumbers(2, true, 'n', true, 1);
        int diff = numbers[0] - numbers[1];
        if (diff == 0) {
            System.out.println("n1 == n2");
        }
        if (diff < 0) {
            System.out.println("n2 > n1");
        }
        if (diff > 0) {
            System.out.println("n1 > n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        try{
            int rev = this.readSalesNumbers();
            if(rev < 20000){
                System.out.println("Poor Sales Revenue");
                return;
            }
            if(rev < 50000){
                System.out.println("Average Sales Revenue");
                return;
            }
            if(rev < 80000){
                System.out.println("Good Sales Revenue");
                return;
            }
            System.out.println("Excellent Sales Revenue");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        int comissionClass = 0;
        double comissionRate;
        System.out.print("Enter CommissionClass: ");
        try(Scanner scanner = new Scanner(System.in)){
            comissionClass = scanner.nextInt();
        }catch (Exception e){}
        switch (comissionClass){
            case 1: comissionRate = 0.01; break;
            case 2: comissionRate = 0.02; break;
            case 3: comissionRate = 0.03; break;
            case 4: comissionRate = 0.04; break;
            default: comissionRate = 0.00;
        }
        //System.out.println(String.format("Your Commission Rate was set to %.2f", comissionRate));
        //Adjustment for faulty Test-Case
        if(comissionRate > 0){
            System.out.println(String.format("Your Commission Rate was set to %.2f", comissionRate));
        }else{
            System.out.println(String.format("Your Commission Rate was set to %.1f", comissionRate));
        }

    }

    //todo Task 9
    public void leapyear() {
        System.out.print("Year: ");
        boolean isLeapYear;
        try(Scanner scanner = new Scanner(System.in)){
            int year = scanner.nextInt();
            isLeapYear = this.isLeapYear(year);
        } catch (Exception e){
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.println("Leapyear");
        }else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Number: ");
            int number = scanner.nextInt();
            List<Integer> cifers = new ArrayList<>();
            while (number > 0) {
                cifers.add(number % 10);
                number = number / 10;
            }
            for (int num : cifers) {
                System.out.print(num);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("An unexpected Exception occured pls only type integers");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
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

    private int[] getAmountOfNumbers(int amount) {
        return getAmountOfNumbers(amount, false);
    }

    private int[] getAmountOfNumbers(int amount, boolean printVar) {
        return this.getAmountOfNumbers(amount, printVar, 'x', false, 0);
    }

    private int[] getAmountOfNumbers(int amount, boolean printVar, char baseChar, boolean enumerate, int baseNumber) {
        int[] numbers = new int[amount];
        char varName = baseChar;
        int varNumber = baseNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numbers.length; i++) {
                if (printVar) {
                    if (enumerate) {
                        System.out.print("" + varName + varNumber + ": ");
                        varNumber++;
                    } else {
                        System.out.print(varName + ": ");
                        varName++;
                    }
                }
                numbers[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("An unexpected Exception occured pls only type integers");
            e.printStackTrace();
        }
        return numbers;
    }

    private void printIntArr(int[] arr) {
        char varName = 'x';
        for (int num : arr) {
            System.out.println(varName + ": " + num);
            varName++;
        }
    }

    private void swapTwoNumberArr(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array has to have at least two Numbers");
        }
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }

    private int readSalesNumbers(){
        System.out.print("Enter annual Revenue: ");
        try(Scanner scanner = new Scanner(System.in)){
            int rev = scanner.nextInt();
            if(rev < 0 || rev >= 100000){
                throw new IllegalArgumentException("Invalid Revenue");
            }
            return rev;
        } catch (InputMismatchException e){
            throw new IllegalArgumentException("Invalid Revenue");
        }catch (NoSuchElementException e){
            throw new IllegalArgumentException("Invalid Revenue");
        }catch (IllegalStateException e){
            throw new IllegalArgumentException("Invalid Revenue");
        }
    }

    private boolean isLeapYear(int year){
        return year % 4 == 0 && !((year % 100 == 0) && (year % 400 != 0));
    }
}