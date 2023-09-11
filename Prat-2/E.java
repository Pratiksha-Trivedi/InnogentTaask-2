import java.util.*;
import java.util.stream.*;
class E
{
public static void joining(List<Employee> l)
{
System.out.println("Get the name of Employee who have joined after 2015?");
 Set<String> date= l.stream().filter(x->x.getYearOfJoining() > 2015).map(x->x.getName()).collect(Collectors.toSet());
System.out.println(date);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
joining(ll);
}
}