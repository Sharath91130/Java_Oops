package ClassAndObeject;

public class vechicle {
	 int vechicleId;
	    int price;
	    String make;
	    String model;
	     void displayVechicle(){
	         System.out.println("the vichleId:"+vechicleId);
	         System.out.println("the making"+":"+make);
	         System.out.println("the model"+":"+model);
	     }
	     void displayDiscount(double percentage){
	         price-=price*(percentage/100);
	         System.out.println("the new price after discsout"+":"+price);
	     }



	}



