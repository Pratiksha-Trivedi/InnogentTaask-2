import java.util.*;
import java.util.stream.*;
class M
{
public static void m(List<Employee> l)
{
System.out.println("Seprate the employees who are youger or equal to  25 years from those employees who are older then 25 years?");
 Map<Boolean, List<Employee>> g= l.stream().collect(Collectors.partitioningBy(e -> e.getAge() <= 25));

        List<Employee> younger25=g.get(true);
        List<Employee> older25 = g.get(false);

        System.out.println("Employees younger or equal to 25:");
        younger25.forEach(e -> System.out.println(e.getName()));

        System.out.println("\nEmployees older than 25:");
        older25.forEach(e -> System.out.println(e.getName()));
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
m(ll);
}
}