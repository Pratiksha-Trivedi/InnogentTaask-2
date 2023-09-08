import java.util.*;
import java.util.stream.*;
class B
{
public static void name(List<Employee> l)
{
System.out.println("Print the names of all departmenet in the organisation");
Set<String> name=l.stream().map(x->x.getDepartment()).collect(Collectors.toSet());
System.out.println(name);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
name(ll);
}
}