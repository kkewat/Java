import java.io.*;
import java.util.*;
class arrayList1{
public static void main(String args[]){
	List<Integer> id = new ArrayList<Integer>();
	id.add(1);
	id.add(2);
	id.add(3);
	id.add(4);
	id.add(5);
	System.out.println(id);
	List<Integer> year= new ArrayList<Integer>();
	year.add(2020);
	year.add(2018);
	year.add(2019);
	year.add(2001);
	year.add(2005);
	year.add(2022);
	System.out.println(year);
	Collections.sort(year);
	System.out.println("year after sorting:");
	System.out.println(year);
}
}
/*
[1, 2, 3, 4, 5]
[2020, 2018, 2019, 2001, 2005, 2022]
year after sorting:
[2001, 2005, 2018, 2019, 2020, 2022]
*/