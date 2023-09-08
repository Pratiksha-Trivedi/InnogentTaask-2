import java.util.*;
import java.util.stream.*;
class I
{
public static void i(List<Employee> l)
{
System.out.println("How many male and female employees are there in the sales and marketing team");
 Map<String, Long> Counts = l.stream().filter(e -> e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(x->x.getGender(), Collectors.counting()));
 
        System.out.println(Counts);

}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
i(ll);
}
}