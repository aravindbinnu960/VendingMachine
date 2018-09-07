import java.util.Scanner;
//import java.lang.*;
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int choice,count=0,ReturnMoney,quantity,bill1=0,bill2=0,bill3=0,bill4=0,bill=0,input,inputnext,money,temp;
System.out.println("Food items in vending machine are");
System.out.println("*****************************************************");
System.out.print("ITEM\t\t\t\t\tPRICE");
System.out.println("\n*****************************************************");
System.out.println("1.Sprite\t\t\t\t70rs");
System.out.println("2.Pizza\t\t\t\t\t20rs");	
System.out.println("3.Puff\t\t\t\t\t30rs");
System.out.println("4.Water\t\t\t\t\t10rs");
System.out.println("5.EXIT");
System.out.println("6.Pay Bill");
System.out.println("*****************************************************");
while(true){
	System.out.println("Enter your choice");
	choice=s.nextInt();
switch(choice){
		case 1:	System.out.println("You have choosen Sprite");
				System.out.println("enter number of Sprite bottles:");
				quantity=s.nextInt();
				System.out.println("you have choosen "+quantity+"bottels");
				bill1+=quantity*70;
				System.out.println("bill on sprite:"+bill1);
       
       break;
		case 2:	System.out.println("You have choosen Pizza");
				System.out.println("enter number of pizza pieces:");
        		quantity=s.nextInt();
        		System.out.println("you have choosen "+quantity+"piecess");
        		bill2+=quantity*20;
        		System.out.println("bill on Pizza"+bill2);
                 break;
		case 3:	System.out.println("You have choosen Puff");
				System.out.println("enter number of pieces:");
				quantity=s.nextInt();
				System.out.println("you have choosen "+quantity+"pieces");
				bill3+=quantity*30;
				System.out.println("bill on puffs:"+bill3);
        
				break;
		case 4:	System.out.println("You have choosen Water");
				System.out.println("enter number of water bottles:"); 
        		quantity=s.nextInt();
        		System.out.println("you have choosen "+quantity+"bottels");
        		bill4+=quantity*10;
        		System.out.println("bill on water bottles:"+bill4);
         
        		break;
		case 5: System.out.println("canceled order");
        
			System.exit(0);
				count++;
				break;
		case 6:System.out.println("please insert money in socket");	
				input=s.nextInt();
				ReturnMoney=input-bill;
				if(ReturnMoney<0){
					money=bill-input;
					System.out.println("You have inserted low amount please enter more"+money);
					while(true) {
						System.out.println("please insert balance money in socket");
						inputnext=s.nextInt();
						temp=money-inputnext;
						while(temp!=0&&temp>0) {
							System.out.println("please insert balance money in socket"+temp);
							inputnext=s.nextInt();
							temp=temp-inputnext;
						}
						if(temp<0) {
							System.out.println("You have entered more money");
							temp=(temp)*(-1);
							System.out.println("collect money "+temp);
							System.out.println("Thankyou visit again!!!!!!");System.exit(0);
						}
						else if(temp==0) {
							System.out.println("Thankyou visit again!!!!!!");
							System.exit(0);
						}
						
								}
								}
				else { 
					System.out.println("collect "+ReturnMoney+" rupees");
    	   
					System.exit(0);} break;
		default:System.out.println("Oops!!! can't find the item kindly try another");
}

bill=bill1+bill2+bill3+bill4;
System.out.println("bill is:"+bill);
System.out.println(".....................");
if(count==1)
{System.out.println("Thankyou visit again!!!!!!");
	System.exit(0);
}
}


}
}
