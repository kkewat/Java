import java.util.Scanner;
class prime{
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		int n,i;
		System.out.println("enter the number");
		n = input.nextInt();
		for(i=2;i<n;i++){
			if(n%i==0){
				System.out.println(n+" is not prime number");
				break;
			}
		}
		if(n==i){
			System.out.println(n+" is prime number");
		}
	}
}
/*
enter the number
7
7 is prime number
*/