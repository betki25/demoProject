package Package1;

public class Student {
	int rollNo;
	int age;
public void display1()
{
	System.out.println("welcome to all of you");
}
public void display2()
{
	System.out.println("Automation is very easy");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student betty= new Student();
	betty.display1();
	betty.display2();
	betty.rollNo = 233;
	System.out.println(betty.rollNo);
	betty.age =21;
	System.out.println(betty.age);
	}

}
