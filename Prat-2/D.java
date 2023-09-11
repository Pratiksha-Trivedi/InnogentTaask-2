import java.util.*;
import java.util.stream.*;
class D
{
public static void Msal(List<Employee> l)
{
System.out.println("Get the details of highest paid employee in the organization?");
Optional<Employee> maxsal=l.stream().collect(Collectors.maxBy(Comparator.comparingDouble(x->x.getSalary())));
System.out.println(maxsal);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
Msal(ll);
}
}