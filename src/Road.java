/*
@author:����
@file:Road.java
@package:default
@project:����Ҫװ��һ������,����������Ʒ:���ӡ��������ϴ�»�����Ҫ������������С����������װ�ص�3�ֻ������������
 * Ҫ����һ��ComputeWeight�ӿ�,�ýӿ�����һ������:public double computeWeight()��3��ʵ�ָýӿڵ���:
 * Television��Computer��WashMachine.��3����ͨ��ʵ�ֽӿ�ComputeWeight�������ء���һ��Car��,������
 * ComputeWeight�ӿ����͵�������Ϊ��Ա,��ô������ĵ�Ԫ�Ϳ��Դ��Television��������á�Computer��������û�
 * WashMachine���������.���������Car������װ�صĻ������������
@date time:2017��11��11������19:10:12
@location:https://github.com/Gcaption/Graduate.git
*/
interface ComputerWeight
{
   public double computeWeight();
}

class Television implements ComputerWeight
{   
	public double computeWeight() 	{
		return 55.5; 
} 
 //ʵ��computeWeight()������
}

class Computer implements ComputerWeight
{  
	public double computeWeight() {
		return 70.5; 
}
 //ʵ��computeWeight()������
} 

class WashMachine implements ComputerWeight
{
	public double computeWeight() {
		return 168; 
} 
 //ʵ��computeWeight()������
}

class Car
{ 
	ComputerWeight[] goods;
	double totalWeights=0;
	Car(ComputerWeight[] goods)
	{
      this.goods=goods;
      }
   public double getTotalWeights(){
	   totalWeights=0;
	   for(int k=0;k<goods.length;k++) 
	   { 
		   totalWeights=totalWeights+goods[k].computeWeight();
		   } 
 //����totalWeights
	   return totalWeights;
	   }  
   }

public class Road
{
	public static void main(String args[]){
		ComputerWeight[] goodsOne=new ComputerWeight[50],goodsTwo=new ComputerWeight[22] ;
		for(int i=0;i<goodsOne.length;i++)
		{
			if(i%3==0)
				goodsOne[i]=new Television();
			else if(i%3==1)
				goodsOne[i]=new Computer();
			else if(i%3==2)
				goodsOne[i]=new WashMachine();
			}
		for(int i=0;i<goodsTwo.length;i++)
		{
			if(i%3==0)
				goodsTwo[i]=new Television();
			else if(i%3==1)
				goodsTwo[i]=new Computer();
			else if(i%3==2)
				goodsTwo[i]=new WashMachine();
			}
		Car  �����=new Car(goodsOne);
		System.out.println("�����װ�صĻ�������:"+�����.getTotalWeights());
		Car  С����=new Car(goodsTwo);
		System.out.println("С����װ�صĻ�������:"+С����.getTotalWeights());
		}
}