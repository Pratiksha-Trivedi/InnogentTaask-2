import java.util.*;
import java.util.stream.*;
class K
{
public static void k(List<Employee> l)
{
System.out.println("List down the names of employees in each department");
   Map<String, List<String>> eD= l.stream().collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.mapping(x->x.getName(), Collectors.toList())));
 System.out.println(eD);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
k(ll);
}
}