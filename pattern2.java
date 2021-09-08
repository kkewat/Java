import java.util.Scanner;
class pattern2{
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the rows: ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*enter the rows:
5
*
**
***
****
*****

*/