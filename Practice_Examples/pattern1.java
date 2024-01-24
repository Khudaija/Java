public class Main
{
	public static void main(String[] args) {
        int n = 4;
        // int m = 4;
        for(int i = 1; i <= (2*n)-1; i++){
            
            if(i <= n){
                for(int j=1; j<=i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            
            if(i >= n){
                for(int j=i; j<=n-1; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
	}
}
