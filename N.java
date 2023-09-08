import java.util.*;
import java.util.stream.*;
class N
{
public static void n(List<Employee> l)
{
System.out.println("Who is the oldest employee in the oranisation?What is his age and which department he belongs to");
 Optional<Employee> oldestEmployee = l.stream().max(Comparator.comparingInt(x->x.getAge()));

        if (oldestEmployee.isPresent()) {
            Employee employee = oldestEmployee.get();
            System.out.println("Oldest Employee:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Department: " + employee.getDepartment());
        } else {
            System.out.println("No employees found.");
        }
}


public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
n(ll);
}
}