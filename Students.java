package classpackage;

import java.util.Scanner;

class Personer{
	static String number;
	static String name=null;
	static String sex;
	public Personer(String number,String name,String sex) {
		this.number=number;
		this.name=name;
		this.sex=sex;
		
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
public class Students extends Personer{
	public Students(String number, String name, String sex) {
		super(number, name, sex);	
	}
	public Students() {
		super(number, name, sex);
	}
    String classs;
	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}
	
}
class Teacher extends Personer{
	public Teacher(String number, String name, String sex) {
		super(number, name, sex);
	}
	public Teacher() {
		super(number, name, sex);
	}
	String  instruction;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}
class Course  {
	String Name=null;//课程名
   
	int arress;
	String time;
	String number;
	String palce;
	String teacher;
	String [] a= {"java","java web","ps"};
	public Course(String name) {
		
		this.Name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public void xuanke(String name){
		String ID;
		String course;
		String place="11#104";
		String time="8:00";
		System.out.println("请输输入你选修的课程");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();//输入选修的课程
		while(sc.hasNextLine()) {
			if(sc.hasNextInt()) {
				ID=sc.nextLine();
				System.out.println("你选择的课程为："+a);
				System.out.println("你选择的课程的ID为："+ID);
				System.out.println("你选择的地点："+place);
				System.out.println("你选择的时间是"+time);
				break;
			}else {
				System.out.println("请输入数字哦");
				ID=sc.nextLine();
				continue;
			}
		}
	
	}

}

