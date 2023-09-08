import java.util.*;
import java.util.stream.*;
class F
{
public static void dept(List<Employee> l)
{
System.out.println("Count the number of employees in each departmenet");
Map<String,Long> depart=l.stream().collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.counting()));
 System.out.println(depart);

}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
dept(ll);
}
}