//First Programming - Hello World!
public class Main{
    public static void main(String args[]){
        System.out.println("Hello World!");
    }
}

-----------X-------------X-----------

//Add two Strings
public class Main{
    public static void main(String args[]){
        String firstName = "Khudaija ";
        String lastName = "Pinjari";
        String fullName = firstName + lastName;
        System.out.println(fullName);
    }
}

-----------X-------------X-----------

//Arithmetic Operation 
public class Main{
    public static void main(String args[]){
        int a = 4;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        
        //Invalid Syntax
        // System.out.println(ab);
        
        boolean isAdult = false;
        System.out.println(isAdult);
    }
}

-----------X-------------X-----------

//++, -- Use 
public class Main{
    public static void main(String args[]){
        int a = 4;
        System.out.println(++a); //add then print 
        System.out.println(a++); //print then add 
        System.out.println(--a); //substract then print 
        System.out.println(a--); //print then substract
    }
}

-----------X-------------X-----------

// Find last digit of a number
import java.util.*;

public class FindLastDigitOfANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        System.out.println("The last digit of the Number is " + lastDigit);
    }
}

-----------X-------------X-----------

//Swap two number using third variable
public class swaptwonumber {
    public static void main(String args[]) {
        int a = 3;
        int b = 4;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}

-----------X-------------X-----------

//Swap two number without third variable
public class swaptwonumber_withoutthirdvariable {
    public static void main(String args[]) {
        int a = 3;
        int b = 4;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}

-----------X-------------X-----------

// take input and complete the name 
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("My name is " + name);
    }
}

-----------X-------------X-----------

//if, else if, else
public class Main{
    public static void main(String args[]){
        int n = 43;
        if (n>0 && n<20){
            System.out.println("less than 20");
        }
        else if(n>20){
            System.out.println("greater than 20");
        }
        else{
            System.out.println("less than zero");
        }
    }
}

-----------X-------------X-----------

// Even Odd Number - Sample Code
import java.util.*;

public class EvenOddNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }

    }
}

-----------X-------------X-----------

// Largest of three numbers
import java.util.*;

public class LargestOfThreeNumbers {
    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        x = sc.nextInt();
        System.out.println("Enter the Second number: ");
        y = sc.nextInt();
        System.out.println("Enter the third number: ");
        z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println("Largest number is : " + x);
        } else if (y > z) {
            System.out.println("Largest number is : " + y);
        } else {
            System.out.println("Largest number is : " + z);
        }

    }
}

-----------X-------------X-----------

//Leap Year
import java.util.*;
public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

-----------X-------------X-----------

//Switch cases Problem
public class Main{
    public static void main(String args[]){
        int day = 5;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
                
            case 2:
                System.out.println("Tuesday");
                break;
                
            case 3:
                System.out.println("Wednesday");
                break;
                
            case 4:
                System.out.println("Thursday");
                break;
                
            case 5:
                System.out.println("Friday");
                break;
                
            case 6:
                System.out.println("Saturday");
                break;
                
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("Invalid Day");
                
                
        }
    }
}

-----------X-------------X-----------

//for loop 
// in this loop first declear initialization, condition  and updation in one line.
public class Main{
    public static void main(String args[]){
        int n = 5;
        for(int i=1; i<=n; i++ ){
            System.out.println(i);
        }
    }
}

-----------X-------------X-----------

// Sum of N natural number
import java.util.*;

public class SumOfNNaturalNumber {
    public static void main(String args[]) {
        int sum = 0;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers : " + sum);
    }

}

-----------X-------------X-----------

// Table of A Number
import java.util.*;

public class TableOfANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}


-----------X-------------X-----------

//while loop 
//In while loop we write initialization in code, then condition with while and lastley in while process we write updation...

public class Main{
    public static void main(String args[]){
        int i=1;
        while(i<11){
            System.out.println(i);
            i=i+1; //updation
        }
    }
}

-----------X-------------X-----------

// Count Number
import java.util.*;

public class CountNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);

    }
}

-----------X-------------X-----------

// do while loop
//In do while loop we write initialization in code, then in loop process we write updation and last after closing break with while write condition. And do while loop is atleast one time play and then check condition.

public class Main{
    public static void main(String[] args){
        int i=3;
        do{
            System.out.println(i);
            ++i;
        }while(i<0);
    }
}

-----------X-------------X-----------
