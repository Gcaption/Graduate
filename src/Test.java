/*
@author:����
@file:Test.java
@package:default
@project:ѧУ������ʦ��ѧ��������,����ְ�о���������ʦ����ѧ��,��ѧ���ı�����Ͷ��ڽ�ʦ�����ι������������϶�������:
 * (1)���������Ϣ����ӿ�StudentInterface��TeacherInterface������StudentInterface�ӿڰ���setFee()������getFee()��������Щ�������������úͻ�ȡѧ����ѧ�ѣ�TeacherInterface�ӿڰ���setPay()������getPay()���������������úͻ�ȡ��ʦ�Ĺ���
 * (2)����һ���о�����Graduate��ʵ��StudentInterface��TeacherInterface�ӿڣ�������ĳ�Ա������name(����)sex(�Ա�)age(����)fee(ÿѧ��ѧ��) pay(�¹���)������ӷ���ֵΪfloat�ķ���f(),�˷������ڼ��������롣���������㷨Ϊ��ÿ����ܹ��ʼ�ȥһ���ѧ��  
 * (3)�ڲ������д���һ������Ϊ"zhangsan"���о���������ÿѧ�ڵ�ѧ�Ѻ��¹�������,ͳ�������������ѧ�� CodeGo.net����������ȥѧ�Ѳ���2000Ԫ�����������Ҫ�����Ϣ�� 
@date time:2017��11��11������09:48:22
@location:https://github.com/Gcaption/Graduate.git
*/
public class Test {
public static void main(String[] args){
	Graduate gr=new Graduate("zhangsan","��",22,4500,2000);
	judgeLoan(gr);
	}
public static void judgeLoan(Graduate gr){//�������β�
if(gr.getPay()*12-gr.getFee()*2<2000){
	System.out.println("zhangsan provide a loan");
	}
else 
	System.out.println("zhangsan don't need a loan");}
}
