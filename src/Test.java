/*
@author:杨兰
@file:Test.java
@package:default
@project:学校中有老师和学生两类人,而在职研究生既是老师又是学生,对学生的被管理和对于教师的责任管理在他们身上都有体现:
 * (1)设计两个信息管理接口StudentInterface和TeacherInterface。其中StudentInterface接口包括setFee()方法和getFee()方法，这些方法别用于设置和获取学生的学费；TeacherInterface接口包括setPay()方法和getPay()方法，别用于设置和获取老师的工资
 * (2)定义一个研究生类Graduate，实现StudentInterface和TeacherInterface接口，它定义的成员变量有name(姓名)sex(性别)age(年龄)fee(每学期学费) pay(月工资)，并添加返回值为float的方法f(),此方法用于计算年收入。其年收入算法为：每年的总工资减去一年的学费  
 * (3)在测试类中创建一个姓名为"zhangsan"的研究生，根据每学期的学费和月工资收入,统计他的年收入和学费 CodeGo.net，如果收入减去学费不足2000元，则输出“需要贷款”信息。 
@date time:2017年11月11日上午09:48:22
@location:https://github.com/Gcaption/Graduate.git
*/
public class Test {
public static void main(String[] args){
	Graduate gr=new Graduate("zhangsan","男",22,4500,2000);
	judgeLoan(gr);
	}
public static void judgeLoan(Graduate gr){//对象作形参
if(gr.getPay()*12-gr.getFee()*2<2000){
	System.out.println("zhangsan provide a loan");
	}
else 
	System.out.println("zhangsan don't need a loan");}
}
