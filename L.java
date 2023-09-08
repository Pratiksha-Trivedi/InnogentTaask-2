import java.util.*;
import java.util.stream.*;
class L
{
public static void l(List<Employee> l)
{
System.out.println("What is the average salary and total salary of whole organisation");
double totalSalary = l.stream().mapToDouble(x->x.getSalary()).sum();

        double averageSalary = totalSalary / l.size();

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
l(ll);
}
}