import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> emps = new ArrayList<>();
        emps.add( new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        emps.add( new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        emps.add( new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        emps.add( new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        emps.add( new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        emps.add( new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        emps.add( new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        emps.add( new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        emps.add( new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println("Count By Department");
        System.out.println("------------------------");
        Map<String, Long> counting=
                emps.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        counting.forEach((department, count) -> System.out.println(department + " " + count));
        //System.out.println(all);
        //distinct, counting, grouping by
        System.out.println("Employee Names by Department");
        System.out.println("------------------------");

        Map<String, List<Employee>> employeeListByDepartment=
                emps.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet)
        {

            System.out.println("Employees In "+entry.getKey() + " : ");



            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }
    }
}
