import java.util.*;
import java.util.stream.*;
class Employee
{
    int id;
     
    String name;
     
    int age;
     
	 static int size;
	 
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
	 // int no.=0;
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
		
    }
     
	
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
		// no.++;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
		
        return salary;
    }
     
  
    public String toString() 
    {
        return "Id = "+id
                +", Name = "+name
                +", age = "+age
                +", Gender = "+gender
                +", Department = "+department
                +", Year Of Joining = "+yearOfJoining
                +", Salary = "+salary;
    }
}

