/*
@author:����
@file:Graduate.java
@package:default
@project:ѧУ������ʦ��ѧ��������,����ְ�о���������ʦ����ѧ��,��ѧ���ı�����Ͷ��ڽ�ʦ�����ι������������϶�������:
 * (1)���������Ϣ����ӿ�StudentInterface��TeacherInterface������StudentInterface�ӿڰ���setFee()������getFee()��������Щ�������������úͻ�ȡѧ����ѧ�ѣ�TeacherInterface�ӿڰ���setPay()������getPay()���������������úͻ�ȡ��ʦ�Ĺ���
 * (2)����һ���о�����Graduate��ʵ��StudentInterface��TeacherInterface�ӿڣ�������ĳ�Ա������name(����)sex(�Ա�)age(����)fee(ÿѧ��ѧ��) pay(�¹���)������ӷ���ֵΪfloat�ķ���f(),�˷������ڼ��������롣���������㷨Ϊ��ÿ����ܹ��ʼ�ȥһ���ѧ��  
 * (3)�ڲ������д���һ������Ϊ"zhangsan"���о���������ÿѧ�ڵ�ѧ�Ѻ��¹�������,ͳ�������������ѧ�� CodeGo.net����������ȥѧ�Ѳ���2000Ԫ�����������Ҫ�����Ϣ�� 
@date time:2017��11��11������09:21:18
@location:https://github.com/Gcaption/Graduate.git
*/
interface StudentManageInterface{  //interface �ӿ���
	public abstract void setFee(double fee);  //���󷽷�
	public abstract double getFee();
	}
interface TeacherManageInterface{
	public abstract void setPay(double pay);
	public abstract double getPay();
	}
class Graduate implements StudentManageInterface,TeacherManageInterface{ //�ӿڵ�ʵ��implements
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
public double getPay(){//�Խӿڵĳ��󷽷�������д
	return pay;
	}    
}
