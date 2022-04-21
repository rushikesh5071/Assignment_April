import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class SortList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ramesh", 30, 400000));
		employees.add(new Employee("Ritesh", 28, 400000));
		employees.add(new Employee("Sunil", 25, 400000));
		employees.add(new Employee("Parth", 24, 400000));
		
		List<Employee> sortedByName = employees.stream()
				.sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		
		sortedByName.forEach(System.out :: println);
        

	}

}
