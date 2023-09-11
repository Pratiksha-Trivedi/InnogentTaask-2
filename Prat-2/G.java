import java.util.*;
import java.util.stream.*;
class G
{
public static void Avg(List<Employee> l)
{
System.out.println("What is the average salary of each department");
 Map<String, Double> average= l.stream().collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.averagingDouble(x->x.getSalary())));
 System.out.println(average);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
Avg(ll);
}
}