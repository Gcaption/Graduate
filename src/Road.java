/*
@author:杨兰
@file:Road.java
@package:default
@project:卡车要装载一批货物,货物由种商品:电视、计算机和洗衣机。需要计算出大货车和小货车各自所装载的3种货物的总重量。
 * 要求有一个ComputeWeight接口,该接口中有一个方法:public double computeWeight()有3个实现该接口的类:
 * Television、Computer和WashMachine.这3个类通过实现接口ComputeWeight给出自重。有一个Car类,该类用
 * ComputeWeight接口类型的数组作为成员,那么该数组的单元就可以存放Television对象的引用、Computer对象的引用或
 * WashMachine对象的引用.程序能输出Car对象所装载的货物的总重量。
@date time:2017年11月11日下午19:10:12
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
 //实现computeWeight()方法。
}

class Computer implements ComputerWeight
{  
	public double computeWeight() {
		return 70.5; 
}
 //实现computeWeight()方法。
} 

class WashMachine implements ComputerWeight
{
	public double computeWeight() {
		return 168; 
} 
 //实现computeWeight()方法。
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
 //计算totalWeights
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
		Car  大货车=new Car(goodsOne);
		System.out.println("大货车装载的货物重量:"+大货车.getTotalWeights());
		Car  小货车=new Car(goodsTwo);
		System.out.println("小货车装载的货物重量:"+小货车.getTotalWeights());
		}
}