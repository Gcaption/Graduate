/*
@author:杨兰
@file:Graduate.java
@package:default
@project:学校中有老师和学生两类人,而在职研究生既是老师又是学生,对学生的被管理和对于教师的责任管理在他们身上都有体现:
 * (1)设计两个信息管理接口StudentInterface和TeacherInterface。其中StudentInterface接口包括setFee()方法和getFee()方法，这些方法别用于设置和获取学生的学费；TeacherInterface接口包括setPay()方法和getPay()方法，别用于设置和获取老师的工资
 * (2)定义一个研究生类Graduate，实现StudentInterface和TeacherInterface接口，它定义的成员变量有name(姓名)sex(性别)age(年龄)fee(每学期学费) pay(月工资)，并添加返回值为float的方法f(),此方法用于计算年收入。其年收入算法为：每年的总工资减去一年的学费  
 * (3)在测试类中创建一个姓名为"zhangsan"的研究生，根据每学期的学费和月工资收入,统计他的年收入和学费 CodeGo.net，如果收入减去学费不足2000元，则输出“需要贷款”信息。 
@date time:2017年11月11日上午09:21:18
@location:https://github.com/Gcaption/Graduate.git
*/
interface StudentManageInterface{  //interface 接口名
	public abstract void setFee(double fee);  //抽象方法
	public abstract double getFee();
	}
interface TeacherManageInterface{
	public abstract void setPay(double pay);
	public abstract double getPay();
	}
class Graduate implements StudentManageInterface,TeacherManageInterface{ //接口的实现implements
private String name,sex;
private int age;
private double fee,pay;
Graduate(String name,String sex,int age,double fee,double pay){
	this.name=name;
	this.sex=sex;
	this.age=age;
	this.fee=fee;
	this.pay=pay;
	}
public String getName(){
	return name;
	}
public String getSex(){
	return sex;
	}
public int getAge(){
	return age;
	}
public void setFee(double fee){
	this.fee=fee;
	}
public double getFee(){
	return fee;
	}
public void setPay(double pay){
	this.pay=pay;
	}
public double getPay(){//对接口的抽象方法必须重写
	return pay;
	}    
}
