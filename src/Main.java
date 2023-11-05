import java.util.Scanner;
//https://www.beginwithjava.com/java/loops/questions.html
public class Main {
    static void Problem1(){
        //Question_1: Write a program to print numbers from 1 to 10.

        int i=1;
        for(i=1; i<=10; i++){
            System.out.println(i);
        }
    }

    static void Problem2(){
        //Question_2: Write a program to calculate the sum of first 10 natural number.

        int sum=0;

        for(int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println("Result: " +sum);

    }

    static void Problem3(){
        //Question_3: Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

        Scanner multipTable = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number=multipTable.nextInt();
        System.out.println("Multiplication Table of "+number+" in below:");


        for(int i=1;i<=10;i++){
            System.out.println(number+" X "+" "+i+" = "+i*number);
        }

    }

    static void Problem4(){
        //Question_4: Write a program to find the factorial value of any number entered through the keyboard.

        int findFact=1;
        int number ;
        System.out.print("Enter A Value: ");
        Scanner input=new Scanner(System.in);
        number= input.nextInt();

        for (int i=1; i<=number; i++){

            findFact*=i;

        }
        System.out.println("Factorial of "+number+"! is " +findFact);
    }

    static void Problem5(){
        //Question_5: Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

        int base;
        int power;
        int result=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Value: ");
        base = input.nextInt();
        System.out.print("");
        System.out.print("Enter Second Value: ");
        power = input.nextInt();

        for (int i=1; i<=power;i++){

            result *=base;

        }

        System.out.println("Result of "+base+" to the power of "+power+" is: "+result);

    }

    static void Problem6(){
        //

        int n=1;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number =input.nextInt();

        for(int i=1; i<=10; i++){

            n=--i;
        }
        System.out.println(n);

    }
    public static void main(String[] args) {
        //Problem1();
        //Problem2();
        //Problem3();
        //Problem4();
        //Problem5();
        //Problem6();


    }
}