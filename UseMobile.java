package com.onesoft.oops1;

public class UseMobile {
	public static void main(String[] args) {
		Processor p1=new Processor();
		p1.name="intel";
		p1.price=4000;
		p1.model="s75";
		Processor p2=new Processor();
		p2.name="amd";
		p2.price=4500;
		p2.model="d67";
		Processor p3=new Processor();
		p3.name="pro";
		p3.price=5000;
		p3.model="58f";
		Mobile mobile1=new Mobile();
		mobile1.brand="samsung";
		mobile1.price=21222;
		mobile1.ram=400;
		mobile1.isAndroid=true;
		mobile1.processor=p1;
		Mobile mobile2=new Mobile();
		mobile2.brand="vivo";
		mobile2.price=37589;
		mobile2.ram=500;
		mobile2.isAndroid=true;
		mobile2.processor=p2;
		Mobile mobile3=new Mobile();
		mobile3.brand="apple";
		mobile3.price=57890;
		mobile3.ram=1500;
		mobile3.isAndroid=true;
		mobile3.processor=p3;
		
/*System.out.println(mobile1.brand+" "+mobile1.price+" "+mobile1.ram+" "+mobile1.isAndroid+" "+mobile1.processor.name+" "+mobile1.processor.price+" "+mobile1.processor.model);		

System.out.println(mobile2.brand+" "+mobile2.price+" "+mobile2.ram+" "+mobile2.isAndroid+" "+mobile2.processor.name+" "+mobile2.processor.price+" "+mobile2.processor.model);		

System.out.println(mobile3.brand+" "+mobile3.price+" "+mobile3.ram+" "+mobile3.isAndroid+" "+mobile3.processor.name+" "+mobile3.processor.price+" "+mobile3.processor.model);*/
Mobile[] m= {mobile1,mobile2,mobile3};
for(Mobile x:m) {
	System.out.println(x.brand+" "+x.price+" "+x.ram);
}
}
	}

	


