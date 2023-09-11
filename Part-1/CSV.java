package task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.*;
import java.util.stream.Collectors;


public class CSV 
{
	static List<Student> studentList  	= new ArrayList<>();
	static List<Address> addressList  = new ArrayList<>();
	static List<Class1> class1List = new ArrayList<>();
	
	 static String studentFile = "C:\\Users\\HP\\eclipse-workspace\\TaskDay2\\src\\task\\Book4.csv";
     static String addressFile = "C:\\Users\\HP\\eclipse-workspace\\TaskDay2\\src\\task\\Book6.csv";
     static String class1File = "C:\\Users\\HP\\eclipse-workspace\\TaskDay2\\src\\task\\Book5.csv";

	static 
	{
		try {
		uploadStudent(studentFile);
        uploadAddress(addressFile);
        uploadClass1(class1File);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
     
	public static void uploadStudent(String file )throws IOException
	{
		//lines() gives stream of lines of file 
		//get() return object of path of file
		List<Student> students = Files.lines(Paths.get(file))
                .skip(1) // Skip the header line
                .map(line -> {
                    String[] data= line.split(",");
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int classId = Integer.parseInt(data[2]);
                    int marks = Integer.parseInt(data[3]);
                    String gender = data[4];
                    int age = Integer.parseInt(data[5]);
                    Student student = new Student(id, name, classId, marks, gender, age);
                    return  student;
                })
                .collect(Collectors.toList());		
		studentList = students;

	}

	
	public static void uploadAddress(String file )throws IOException
	{
		List<Address> addresses = Files.lines(Paths.get(file))
                .skip(1) // Skip the header line
                .map(line -> {
                    String[] data= line.split(",");
                    int id = Integer.parseInt(data[0]);
                    int pin_code = Integer.parseInt(data[1]);
                      String city = data[2];
                    int student_id = Integer.parseInt(data[3]);
                    Address address= new Address(id, pin_code, city, student_id);
                    return  address;
                })
                .collect(Collectors.toList());		
		addressList = addresses;

	}
	public static void uploadClass1(String file)throws IOException
	{
		List<Class1> classes1 = Files.lines(Paths.get(file))
                .skip(1) // Skip the header line
                .map(line -> {
                    String[] data= line.split(",");
                    
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    Class1 class1= new Class1(id, name);
                    return  class1;
                })
                .collect(Collectors.toList());		
		class1List = classes1;

	}

	
    public static void main(String[] args) throws IOException
	{
        }
    }
