package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fs {
public void show() {
	Students a=new Students();
	 Teacher b=new Teacher();
	 Course c=new Course("程序设计");
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	 a.setNumber("20203232422");	
		a.setName("sws");
		a.setSex("man");
		b.setNumber("202032343233");
		b.setName("王二");
		b.setInstruction("人文素养授课老师");
		c.setNumber("101");
		c.setPalce("教学楼3#206");
		c.setTeacher("李逵");
	   String mName = a.getName();
	   String mNumber = a.getNumber();
       String mSex = a.getSex();
	   mName = a.getName();
	   mNumber = a.getNumber();
	   mSex = a.getSex();
	
	String teachernumber=b.getNumber();
	String teachername = b.getName();
	String teacherclass =b.getInstruction();
	teachername = b.getName();
	teachernumber=b.getNumber();
	teacherclass=b.getInstruction();
	String coursenumber =c.getNumber();
 
	String courseplace =c.getPalce();
	String courseteacher=c.getTeacher();
	coursenumber =c.getNumber();
	courseplace =c.getPalce();
	courseteacher=c.getTeacher();
	  System.out.println("学生选课系统");
	  System.out.println("Serial number is : " + mNumber);
	  System.out.println("Name is : " + mName);
	  System.out.println("Gerder is :" + mSex);
	  a.setClasss("java");
	  String mClass = a.getClasss();
	    System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teachernumber);
		System.out.println("lecture teacher is ："+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course number :"+coursenumber);
        System.out.println("The course name :"+c); //课程名
		System.out.println("Course plance :"+courseplace);
		System.out.println("sclooltime is :"+df.format(new Date()));
		System.out.println("lecture teacher name is :"+courseteacher);
        System.out.println("------------------------------------------");
        c.xuanke(a.name);
        System.out.println("------------------------------------------");
	
}
}
