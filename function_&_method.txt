//Function - Create a new function and take as input a string and print.

import java.util.*;

public class Function{
    
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        printMyName(name);
    }
}

-----------X-----------------------------X-----------

//Function - Arithmatic operation applied by function
import java.util.*;

public class Function{
    public static void operation(int a, int b){
        int addition = a + b;
        int substration = a - b;
        int multiplication = a * b ;
        int division = a / b;
        System.out.println("Addition:- " + addition);
        System.out.println("Substration:-" + substration);
        System.out.println("Multiplication:-" + multiplication);
        System.out.println("Division:-" + division);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        operation(a,b);
    }
}

-----------X-----------------------------X-----------

//Function - It's look like different.

import java.util.*;

public class Function{
    
    public static int multi(int a, int b){
        // int total = a*b;
        // return total;
        return a*b;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(multi(a,b));
    }
}

-----------X-----------------------------X-----------

//Find the factorial to given input from the user.

import java.util.*;

public class Function{

    public static void findFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        findFactorial(n);
    }
}

-----------X-----------------------------X-----------

// Function Program - First Digit of a Number - Sample code

import java.util.*;

public class func_first_digit_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("Given number is: " + num);
        int firstDigit = 0;
        int totalDigits = (int) Math.log10(num);
        firstDigit = (int)(num/(int) Math.pow(10, totalDigits));
        System.out.println("First Digit is: " + firstDigit);
    }
}

-----------X-----------------------------X-----------

// Function Problem Prime Factorization
import java.util.*;
public class func_prime_factorization {

    public static void primeFactorization(int num) {
        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.println(i + " ");
                num = num / i;
            }
        }
        if (num > 2) {
            System.out.println(num);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        primeFactorization(num);
    }
}
