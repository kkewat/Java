package employ;
import java.util.*;
public class functions {
	String id;
	String name;
	String designation;
	int salary;
	Scanner input = new Scanner(System.in);
    ArrayList<functions> emp = new ArrayList<functions>();
	void getData()
	{
		functions empdata = new functions();
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
		Iterator<functions> itr = emp.iterator();
		while(itr.hasNext()){
			functions show=(functions)itr.next();
			System.out.println("------------------------");
			System.out.println("Employee id: "+show.id+"\nEmployee name: "+show.name+"\nEmployee salary: "+show.salary+"\nEmployee designation: "+show.designation);
			System.out.println("------------------------");
		}
	}
	
	void deletedata(){
		System.out.println("enter the id of the employees data you want to delete: ");
		String del = input.nextLine();
		Iterator<functions> itr = emp.iterator();
		while(itr.hasNext()){
			functions show=(functions)itr.next();
			if(itr.next().id.equals(del)){
				System.out.println("Deleted the data:"+"\nEmployee id: "+show.id+"\nEmployee name: "+show.name+"\nEmployee salary: "+show.salary+"\nEmployee designation: "+show.salary);
				itr.remove();
			}
		}
	}
	
	void updatedata(){
		System.out.print("enter the id of the employees data you want to update: ");
		String search = input.nextLine();
		for(Iterator<functions> itr = emp.iterator();itr.hasNext();){
			functions show=(functions)itr.next();
			if(search.equals(show.id)){
				System.out.println("enter the update changes");
				show.new_data();
				System.out.println("Update Successful");
				System.out.println("------------------------");
			}
		}
	}
	void new_data(){
		int n;
		boolean end_loop=false;
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
}
