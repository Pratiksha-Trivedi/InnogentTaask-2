package task;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Part1
{

static List<Student> studentName(List<Student> students, List<Address> addres, int pin_code)
{
List<Student> studentsdata= students.stream().filter(student -> addres.stream().anyMatch(address -> address.getStudent_id() == student.getId() && address.getPin_code() == pin_code)).collect(Collectors.toList());
 List<Integer> newList= addres.stream().filter(a -> a.getPin_code() == pin_code ).map(Address::getStudent_id).collect(Collectors.toList());
 List<Student> studentsOfPin_code= students.stream().filter(student -> newList.contains(student.getId())).collect(Collectors.toList());
List<Student> newStudentsOfPin_code = studentsOfPin_code.stream().filter(s -> s.getGender().equals("F")).collect(Collectors.toList());   

return newStudentsOfPin_code;
}

//Q-2
static List<Student>	 studentHavingCity(List<Student> students, List<Address> addresss, String  city)
{
List<Student> studentCity= students.stream().filter(student -> addresss.stream().anyMatch(address -> address.getStudent_id() == student.getId() && address.getCity().equals(city))).collect(Collectors.toList());

List<Integer> newList= addresss.stream().filter(a -> a.getCity().equals(city)).map(Address::getStudent_id).collect(Collectors.toList());
 List<Student> studentsCity = students.stream().filter(student -> newList.contains(student.getId())).collect(Collectors.toList());
return studentsCity;	
}

//Q.3
public static List<Student> PassingStudents(List<Student> studentList) {
    return studentList.stream()
            .filter(student -> student.getMarks() >= 50)
            .collect(Collectors.toList());
}

public static List<Student> FailingStudents(List<Student> studentList) {
    return studentList.stream()
            .filter(student -> student.getMarks() < 50)
            .collect(Collectors.toList());
}

public static List<Student> highestMarkAchievers(List<Student> studentList) {
    return studentList.stream()
            .sorted(Comparator.comparingInt(Student::getMarks).reversed())
            .limit(3)
            .collect(Collectors.toList());
}

public static List<Student> assignRanksToHighestMarkAchievers(List<Student> studentList) {
    List<Student> highestMarkAchievers = highestMarkAchievers(studentList);
    for (int i = 0; i < highestMarkAchievers.size(); i++) {
        highestMarkAchievers.get(i).setName("Rank " + (i + 1) + ": " + highestMarkAchievers.get(i).getName());
    }
   return highestMarkAchievers;
}



//Q-4
static List<Student>	 passedStudents(List<Student> studentList)
{
List<Student> passedStudents = studentList.stream().filter(student -> student.getMarks() >= 50).collect(Collectors.toList());

//If any filter is applied for example by age then 
//List<Student> newPassedStudents = passedStudents.stream().filter(s -> s.getAge() < 50).collect(Collectors.toList());   

return passedStudents;	
//return newPassedStudents;	
}

//Q-5
static List<Student>	 failedStudents(List<Student> studentList)
{
List<Student> failedStudents = studentList.stream().filter(student -> student.getMarks() < 50).collect(Collectors.toList());
//If any filter is applied for example by gender then 
//List<Student> newFailedStudents = failedStudents.stream().filter(s -> s.getGender().equals("M")).collect(Collectors.toList());   

return failedStudents;	

//return newFailedStudents;
}


//Q-6
static List<Student>	 studentHavingClass(List<Student> studentList, List<Class1> class1List, String  class1)
{
List<Integer> newList= class1List.stream().filter(c -> c.getName().equals(class1)).map(Class1::getId).collect(Collectors.toList());
List<Student> studentsOfClassX = studentList.stream().filter(student -> newList.contains(student.getClass_id())).collect(Collectors.toList());

//If any filter is applied for example by age then 
//List<Student> newStudentsOfClassX = studentsOfClassX.stream().filter(s -> s.getAge() < 45).collect(Collectors.toList());   

return studentsOfClassX;	
//return newStudentsOfClassX;	
}


//Q-7
static List<Student>	 failedStudentsByAge(List<Student> studentList)
{
List<Student> failedStudentsByAge = studentList.stream().filter(student -> student.getAge() < 20).collect(Collectors.toList());

//If any filter is applied for example by age then 
//List<Student> newFailedStudentsByAge = failedStudentsByAge.stream().filter(s -> s.getAge() < 35).collect(Collectors.toList()); 

return failedStudentsByAge;	
//return newFailedStudentsByAge;	
}

//Q.8
public static void deleteStudent(List<Student> studentList, List<Address> addressList, int studentId) {
    studentList.removeIf(student -> student.getId() == studentId ); // public boolean removeIf(Predicate filter)
    addressList.removeIf(address -> address.getStudent_id() == studentId);
}

//Q.9
public static List<Class1> deleteClass(List<Student> studentList, List<Class1> class1List) {
List<Integer> newIdList =   studentList.stream().map(Student::getClass_id).collect(Collectors.toList());
List<Class1> newClass1List = class1List.stream().filter(class1 ->newIdList.contains(class1.getId())).collect(Collectors.toList());
return newClass1List;
}



//Q.10
static List<Student>	FemaleStudentsList(List<Student> studentList)
{
List<Student> femaleStudents = studentList.stream()
.filter(student -> student.getGender().equals("F"))
.collect(Collectors.toList());
return femaleStudents;
}

public static List<Student> FirstFemaleListInRange(List<Student> studentList, int start, int end) {
    return FemaleStudentsList(studentList).stream()
            .skip(start - 1)
            .limit(end - start + 1)
            .collect(Collectors.toList());
}

private static List<Student> FemaleOrderByName(List<Student> studentList, int start, int end) {
    return FemaleStudentsList(studentList).stream()
            .sorted(Comparator.comparing(Student::getName))
            .skip(start - 1)
            .limit(end - start + 1)
            .collect(Collectors.toList());
}

private static List<Student> FemaleOrderByMarks(List<Student> studentList, int start, int end) {
    return FemaleStudentsList(studentList).stream()
            .sorted(Comparator.comparingInt(Student::getMarks).reversed())
            .skip(start - 1)
            .limit(end - start + 1)
            .collect(Collectors.toList());
}

	public static void main(String[] args) {

		List<Student> students= CSV.studentList;
		List<Address> addres = CSV.addressList;
		List<Class1> class1es= CSV.class1List;
		//1
		//System.out.println("Q-1.Find all students of pincode X(ex X = 482002).I can pass different filters like gender, age, class:\n\n");
		List<Student> updatedStudentList1 = studentName(students, addres, 452002);
		//System.out.println(updatedStudentList1);
		
		//2
	
		//System.out.println("Q-2.Find all students of city ex X = Indore. I can pass different filters like gender, age, class:\n\n");
		List<Student> updatedStudentList2 = studentHavingCity(students, addres, "indore");
		//System.out.println(updatedStudentList2);
		
		//3
		//System.out.println("Q-3.marks < 50 failed else passed\r\n"+ "Give ranks to highest mark achievers.\r\n"+ "Highest marks - First\r\n"+ "\r\n"+ "Third Highest marks - third\r\n"+ "Rest of all pass / fail:\n\n");
		//System.out.println(PassingStudents(studentList));
		//System.out.println(FailingStudents(studentList));
		//System.out.println(assignRanksToHighestMarkAchievers(studentList));
		
		//4
		System.out.println("Q-4.Get the passed students. I can pass different filters like gender, age, class, city, pincode:\n\n");
		List<Student> updatedStudentList4 = passedStudents(students);
		System.out.println(updatedStudentList4);
		
		//5
		//System.out.println("Q-5.Get the failed students. I can pass different filters like gender, age, class, city, pincode:\n\n");
		List<Student> updatedStudentList5 = failedStudents(students);
		//System.out.println(updatedStudentList5);
		
		//6
		//System.out.println("Q-6.Find all student of class X (ex X = A).  I can pass different filters like gender, age, class, city, pincode:\n\n");
		List<Student> updatedStudentList6 = studentHavingClass(students, class1es, "A");
		//System.out.println(updatedStudentList6);
		
		//7
		//System.out.println("Q-7.It should fail if student record is having age > 20.:\n\n");
		List<Student> updatedStudentList7 = failedStudentsByAge(students);
		//System.out.println(updatedStudentList7);
		
		//8
		//System.out.println("Q-8.I should be able to delete student. After that it should delete the respective obj from Address & Student.:\n\n");
		//deleteStudent(studentList, addressList,"Abc");

		//9
		//System.out.println("Q-9.If there is no student remaining in that class. Class should also be deleted.:\n\n");
		//System.out.println(deleteClass(studentList,class1List));
		
		//10
		//System.out.println("Q-10.I should be able to read paginated students.\r\n"+ "like : read female students first 1-9\r\n"+ "like : read female students first 7-8 order by name\r\n"+ "like : read female students first 1-5 order by marks\r\n"+ "like : read female students first 9-50 order by marks\r\n"+ ":\n\n");
		/*
		System.out.println(FemaleStudentsList(studentList));
		System.out.println(FirstFemaleListInRange(studentList,1,9));
		System.out.println(FemaleOrderByName(studentList,7,8));
		System.out.println(FemaleOrderByMarks(studentList,1,5));
		System.out.println(FemaleOrderByMarks(studentList,9,50));
		*/

		
	}

		
		
		

}