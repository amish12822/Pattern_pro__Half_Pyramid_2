/**
 * half_pyramid2
 */
public class half_pyramid2 {

    public static void main(String[] args) {
        

        int n = 5;

        for (int i=1; i<=n; i++){

            //space
            int space = ( n-i );
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            

            System.out.println();
        }
    }
}