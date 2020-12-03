# java-10.25

## 1. 实验目的
1.掌握面向对象的类设计方法（属性、方法）；  
2.掌握类的继承用法，通过构造方法实例化对象；  
3.会使用super()，用于实例化子类；  
4.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  

## 2. 实验要求
1.编写上述实体类以及测试主类  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；再打印课程信息。  

## 3. 实验设计

  设置Student类中的对象和方法
```
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
```
 ## 4. 核心方法
 
  通过course类中的方法进行学生选课操作。
  
  ```
  String Name=null;//课程名
   
	int arress;
	String time;
	String number;
	String palce;
	String teacher;
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
	
	 
   ```
   
   ## 5. 实验结果截图
   
   https://github.com/1141565458sws/java-10.25/blob/main/img/sws.png

  ## 6.实验感想

  1.学会了面向对象的类设计方法（属性、方法）；  
  2.学会了类的继承用法，通过构造方法实例化对象；  
  3.学会使用super()，用于实例化子类；  
  4.掌握了使用Object根类的toString（）方法,应用在相关对象的信息输出中。  
