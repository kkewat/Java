import java.util.*;
public class Employee{
	String id;
	String name;
	String designation;
	int salary;
    ArrayList<Employee> emp = new ArrayList<Employee>();
	public Scanner input = new Scanner(System.in);
	
	void getData()
	{
		Employee empdata = new Employee();
		Scanner input = new Scanner(System.in);
		System.out.print(" enter the employees id : ");
		empdata.id = input.nextLine();
		System.out.print(" enter the employees Name :");
		empdata.name = input.nextLine();
		System.out.print(" enter the employees salary : ");
		empdata.salary = input.nextInt();
		System.out.print(" enter the employees designation: ");
		input.nextLine();
		empdata.designation = input.nextLine();
		emp.add(empdata);
		System.out.println("------------------------");
	}
	
	void showdata(){
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()){
			Employee show=(Employee)itr.next();
			System.out.println("------------------------");
			System.out.println("Employee id: "+show.id+"\nEmployee name: "+show.name+"\nEmployee salary: "+show.salary+"\nEmployee designation: "+show.designation);
			System.out.println("------------------------");
		}
	}
	
	void deletedata(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the id of the employees data you want to delete: ");
		String del = input.nextLine();
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()){
			Employee show=(Employee)itr.next();
			if(itr.next().id.equals(del)){
				System.out.println("Deleted the data:"+"\nEmployee id: "+show.id+"\nEmployee name: "+show.name+"\nEmployee salary: "+show.salary+"\nEmployee designation: "+show.salary);
				itr.remove();
			}
		}
	}
	
	void updatedata(){
		Scanner input = new Scanner(System.in);
		System.out.print("enter the id of the employees data you want to update: ");
		String search = input.nextLine();
		for(Iterator<Employee> itr = emp.iterator();itr.hasNext();){
			Employee show=(Employee)itr.next();
			if(search.equals(show.id))
				System.out.println("enter the update changes");
			show.new_data();
			System.out.println("Update Successful");
			System.out.println("------------------------");
		}
	}
	void new_data(){
		int n;
		boolean end_loop=false;
		Scanner input = new Scanner(System.in);
		while(end_loop!=true){
			System.out.println("1. update id \n2. update name \n3. update salary \n4. Update designation \n5. Exit");
			System.out.print("Select the operation you want to perform:");
			n = input.nextInt();
			switch(n){
			case 1: System.out.print("new id = ");
					input.nextLine();
					String new_id=input.nextLine();
					id = new_id;
					break;
			case 2: System.out.print("new name = ");
					input.nextLine();
					String new_name=input.nextLine();
					name = new_name;
					break;
			case 3: System.out.print("new salary = ");
					int new_salary  =input.nextInt();
					salary = new_salary;
					break;
			case 4: System.out.print("new designation = ");
					input.nextLine();
					String new_designation=input.nextLine();
					designation = new_designation;
					break;
			case 5: end_loop=true;
			default: //System.out.println("invalid operation");
			}
		}
	}
	
	public static void main(String args[]){
		int n,a=1;
		Scanner input = new Scanner(System.in);
        Employee empl = new Employee();
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
					empl.getData();
					break;
			case 2:
					empl.showdata();
					break;
			case 3:
					empl.deletedata();
					break;
			case 4:
					empl.updatedata();
					break;
			case 5:
					System.exit(0);
			default:
					System.out.println("invalid operation");
			}
		}	
	}

}