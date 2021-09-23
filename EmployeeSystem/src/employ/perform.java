package employ;
import java.util.Scanner;
public class perform extends functions{
	int a = 1,n;
	Scanner input = new Scanner(System.in);
	void option() {
		while(a>0){
			System.out.println("\n1. Add the employee data");
			System.out.println("2. Show the employees data");
			System.out.println("3. Delete the employees data");
			System.out.println("4. Update the employees data");
			System.out.println("5. Exit");
			System.out.print("Select the operation you want to perform:");
			n = input.nextInt();
			System.out.println("---------------------------------------");
			switch(n){
			case 1:
					getData();
					break;
			case 2:
					showdata();
					break;
			case 3:
					deletedata();
					break;
			case 4:
					updatedata();
					break;
			case 5:
					System.exit(0);
			default:
					System.out.println("invalid operation");
			}
		}
	}
}
