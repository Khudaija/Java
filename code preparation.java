//palindrom Number 

import java.util.*;
public class Main{
    public static void main(String args[]){
        int n = 252, temp,r;
        int sum = 0;
        
        temp = n;
        
        while(n!=0){
            r = n%10;
            sum = (sum*10) + r;
            n = n/10;
        }
        
        if(temp == sum){
            System.out.println("palindrom Number");
        }
        else{
            System.out.println("Not Palindrom Number");
        }
    }
}

--------------------------------------------------------------

//Sum of Number
  
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int sum = 0;
        int a[] = new int[size];
        
        for(int i=0; i<=size-1; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<=size-1; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of Number is : " + sum );
    }
}

--------------------------------------------------------------

//Check Prime Number

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        for(int i=2; i<=a/2; i++){
            if(a %i ==0){
                c = c+1;
                break;
            }
        }
        if(c==1){
            System.out.println("Not Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}

------------------------------------------------------
  
// Reverse String

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String rev = "";
        String a = sc.nextLine();
        char ch[] = a.toCharArray();
        
        for(int i=ch.length-1; i>=0; i--){
            rev = rev + ch[i];
        }
        System.out.println("Reverse String: " + rev);
    }
}

-------------------------------------------------------------------
    
