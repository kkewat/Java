import java.util.Scanner;
class fibonacci{
	public static void main(String arg[])
	{
	int a=0,b=1,c=0,i,n;
	Scanner input = new Scanner(System.in);
	System.out.print("enter the total number you want to display: ");
	n = input.nextInt();
	System.out.print(a+" "+b+" ");
	for(i=2;i<n;i++){
		c = a+b;
		a = b;
		b = c;
		System.out.print(c+" ");
	}
	}
}
/*
enter the total number you want to display: 6
0 1 1 2 3 5
*/