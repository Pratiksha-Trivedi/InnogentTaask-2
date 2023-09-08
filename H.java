import java.util.*;
import java.util.stream.*;
class H
{
public static void h(List<Employee> l)
{
System.out.println("Get the details of youngest mail employee in the product development department");
String targetDepartment = "Product Development";

        int minAge =l.stream().filter(e -> e.getDepartment().equals(targetDepartment)).mapToInt(x->x.getAge()).min().orElse(Integer.MAX_VALUE);

        if (minAge != Integer.MAX_VALUE) {
            System.out.println("The minimum age in the " + targetDepartment + " department is: " + minAge);
        } 
    }

 


public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
h(ll);
}
}