import java.util.*;
class A
{
public static void count(List<Employee> l)
{
long maxm=l.stream().filter(x->x.getGender().equals("Male")).count();
long maxf=l.stream().filter(x->x.getGender().equals("Female")).count();
System.out.println(maxm);
System.out.println(maxf);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
count(ll);
}
}
// 1. map: The map method is used to return a stream consisting of the
 // results of applying the given function to the elements of this stream.
 
 