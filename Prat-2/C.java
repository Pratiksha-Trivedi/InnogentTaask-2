import java.util.*;
import java.util.stream.*;
class C
{
public static void avg(List<Employee> l)
{
System.out.println("What is the average age of male and female employees");
System.out.println();
Map<String,Double> average=l.stream().collect(Collectors.groupingBy(x->x.getGender(),Collectors.averagingInt(x->x.getAge())));
System.out.println(average);
}

public static void main(String arg[])
{

List<Employee> ll=EmpList.getEmpList();
avg(ll);
}
}
// The Collectors.groupingBy method in Java's Stream API is a powerful tool 
// for grouping elements of a stream based on a specific criterion. 
// It allows you to partition the elements into different buckets, where each bucket is 
// represented by a key, and the elements that satisfy a certain
 // condition are collected under that key.