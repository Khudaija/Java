// Recursive Approach Array is Sorted or Not

class Recursive_array_is_sorted_or_not {

    static int arraySortedOrNot(int arr[], int n) {
        if (n == 1 || n == 0)
            return 1;

        if (arr[n - 1] < arr[n - 2])
            return 0;

        return arraySortedOrNot(arr, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;

        if (arraySortedOrNot(arr, n) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

-----------X-----------------------------X-----------

// Iterative Approach for Array is sorted or not

public class iteration_array_is_sorted_or_not {

    static boolean arraySortedOrNot(int arr[], int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
        if (arraySortedOrNot(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

-----------X-----------------------------X-----------

//Maximum elment in Array - sample Code

public class maximum_array {

    static int arr[] = { 10, 324, 45, 90, 9808 };

    static int largest(){
        int i;
        int max = arr[0];

        for(i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        System.out.println("Largest in given array is " + largest());
    }
}

-----------X-----------------------------X-----------

// Iterative  sum of elements in a given array - sample code 

public class array_sum {

    static int arr[] = { 12, 3, 4, 15 };

    static int sum() {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Sum of given array is " + sum());
    }
}

-----------X-----------------------------X-----------

// Average of array element

public class average_array {

    static double average(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;

        System.out.println(average(arr, n));
    }
}
