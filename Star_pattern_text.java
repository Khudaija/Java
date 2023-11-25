//Star pattern

//square
public class Main{
    public static void main(String args[]){
        
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

output:-
* * * * 
* * * * 
* * * * 
* * * *

//-----------X-----------------------------X-----------

//hologram
public class Main{
    public static void main(String args[])
    {
        int n=5;
        int m=4;
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

output:-
*****
*   *
*   *
*   *
*****

//-----------X-----------------------------X-----------

// Traingle - 1
public class Main{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

output:-
  
 * 
 *  * 
 *  *  * 
 *  *  *  * 

//-----------X-----------------------------X-----------

// Traingle - 2
public class Main{
    public static void main(String args[])
    {
        int n=5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

output:-

 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 

//-----------X-----------------------------X-----------

// Traingle - 3
public class Main{
    public static void main(String args[]){
        int n=4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print("   ");
            }
            for(int j=0; j<=n-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

output:-
      *
    * *
  * * *
* * * *

//-----------X-----------------------------X-----------

//Traingle - Number - System - 1
public class Main{
    public static void main(String args[])
    {
        int n=4;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

output:-
1 
1 2 
1 2 3 
1 2 3 4 

//-----------X-----------------------------X-----------

//Traingle - Number - System - 2
public class Main{
    public static void main(String args[]){
        int n=4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

output:- 
1 2 3 4 
1 2 3 
1 2 
1 

//-----------X-----------------------------X-----------

//Traingle - Number - System - 3
public class Main{
    public static void main(String args[]){
        int n=4;
        int a=1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}

output:-
1 
2 3 
4 5 6 
7 8 9 10 

//-----------X-----------------------------X-----------

//Traingle - Number - System - 4
public class Main{
    public static void main(String args[]){
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}

output:-
1 
0 1 
1 0 1 
0 1 0 1 

//-----------X-----------------------------X-----------

//Butterfly
public class Main{
    public static void main(String args[]){
        int n=4;

        // uper part 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }

            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Second part
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


output:-
 *                    * 
 *  *              *  * 
 *  *  *        *  *  * 
 *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  * 
 *  *  *        *  *  * 
 *  *              *  * 
 *                    * 

//-----------X-----------------------------X-----------

// start pattern
public class Main{
    public static void main(String args[])
    {
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

Output:-
             *  *  *  *  * 
          *  *  *  *  * 
       *  *  *  *  * 
    *  *  *  *  * 
 *  *  *  *  * 

//-----------X-----------------------------X-----------

//Traingle
public class Main{
    public static void main(String args[]){
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

OUtput:-
   1 
  2 2 
 3 3 3 
4 4 4 4 

//-----------X-----------------------------X-----------

//Number Traingle
public class Main{
    public static void main(String args[])
    {
        int n=4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

OUtput:-

   1
  212
 32123
4321234

//-----------X-----------------------------X-----------

//pattern
public class Main{
    public static void main(String args[]){
        int n=4;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=2; j<=2*(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=2; j<=2*(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

Output:-
   
  *
 ***
*****
*****
 ***
  *
  
 // -----------X-----------------------------X-----------
