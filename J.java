import java.util.*;
import java.util.stream.*;
class J
{
public static void j(List<Employee> l)
{
System.out.println("What is the average salary of  male and female employees");
 
Map<String,Double> avgm=l.stream().collect(Collectors.groupingBy(x->x.getGender(),Collectors.averagingDouble(x->x.getSalary())));
System.out.println(avgm);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
j(ll);
}
}