import java.util.Scanner;
class pattern{
public static void main(String arg[]){
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number of rows: ");
	int n = input.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=n;j>=i;j--){
			System.out.print(" ");
				    }
			for(int k=1;k<=i;k++){
			    System.out.print("*"+" ");
			                    }
				System.out.print("\n");
	                   }
             }
}
/*
enter the number of rows:
6
      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *

*/