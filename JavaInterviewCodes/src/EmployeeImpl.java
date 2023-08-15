import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee(3,"Shanika",50000.0);
		Employee e2 = new Employee(2,"Tharanga",30000.0);
		Employee e3 = new Employee(1,"Some",70000.0);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		List<Employee> sortList = empList.stream().sorted((p1,p2)->Double.compare(p1.getSalary(), p2.getSalary()))
				.collect(Collectors.toList());
		
		System.out.println(sortList);
	}

}
