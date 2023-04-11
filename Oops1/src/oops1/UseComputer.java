package oops1;

public class UseComputer {
	public static void main(String[] args) {
		Cpu cp1=new Cpu("lenovo",2000,"12 gb","4gb");
		Cpu cp2=new Cpu("dell",1500,"8 gb","6 gb");
		Cpu cp3=new Cpu("hp",3000,"16 gb","8 gb");
		Cpu cp4=new Cpu("acer",1000,"8 gb","4 gb");
		Cpu cp5=new Cpu("mac book",5000,"64 gb","32 gb");
		
		Computer com1=new Computer("lenovo",20000,false,cp1);
		Computer com2=new Computer("dell",40000,true,cp2);
		Computer com3=new Computer("hp",35000,true,cp3);
		Computer com4=new Computer("acer",28000,true,cp4);
		Computer com5=new Computer("mac book",20000,true,cp5);
		
		Cpu[]arr= {cp1,cp2,cp3,cp4,cp5};
		
//	Cpu print the all brand name---------------
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].getBrand());
//		}
		
		
//		find the max then print brand name------------
		
     	Computer[] arr1= {com1,com2,com3,com4,com5};
//		int max=0;
//		int valI=0;
//		for(int i=0;i<arr1.length;i++) {
//			if(arr1[i].getPrice()>max) {
//				max=arr1[i].getPrice();
//				valI=i;
//			}
//		}
//		System.out.println(arr1[valI].getBrand());
     	
     	
//     	enhanced loop 
//     	print the all brand in cpu
//     	for(Cpu var:arr) {
//     		System.out.println(var.getBrand());
//     	}
     	
//     	find the length string the price brand name;
//     	String lengthStr=arr[1].getBrand();
//     
//     	for(Computer var1:arr1) {
//     		if(var1.getBrand().length()>lengthStr.length()) {
//     			lengthStr=var1.getBrand();
//     		}
//     	}
//     	System.out.println(lengthStr);
	}

}
