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
	String Name=null;//�γ���
   
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
		System.out.println("����������ѡ�޵Ŀγ�");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();//����ѡ�޵Ŀγ�
		while(sc.hasNextLine()) {
			if(sc.hasNextInt()) {
				ID=sc.nextLine();
				System.out.println("��ѡ��Ŀγ�Ϊ��"+a);
				System.out.println("��ѡ��Ŀγ̵�IDΪ��"+ID);
				System.out.println("��ѡ��ĵص㣺"+place);
				System.out.println("��ѡ���ʱ����"+time);
				break;
			}else {
				System.out.println("����������Ŷ");
				ID=sc.nextLine();
				continue;
			}
		}
	
	}

}

