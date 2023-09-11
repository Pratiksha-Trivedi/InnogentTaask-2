package task;
public class Class1 
{
int 	id;
String	name;

	public Class1() {
		// TODO Auto-generated constructor stub
	}
	
	public Class1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Class1 [id=" + id + ", name=" + name + "]";
	}

}
