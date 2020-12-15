package Conditional;
import java.util.Scanner;

public class PromTickets {
private String Name;
private int TicketFee;
private String Class;
private String TicketType;
public PromTickets() {
	Name = "John Doe";
	TicketFee = 0;
    TicketType="Unknown";
	
  }
Scanner input= new Scanner(System.in);
public String setName() {
	System.out.println("What is your name ?");
	 Name =input.nextLine()  ;
	return Name;
}

public int  AmountRequired() {
	System.out.println("What is your Class(Freshman/Sophmore/Junior/Senior?)");
	 Class = input.nextLine();
	System.out.println("What is combination package do you want ?(Solo/Couple/Group)"); 
	TicketType=input.nextLine();
	if (Class.equalsIgnoreCase("Freshman")){
		if (TicketType.equalsIgnoreCase("Solo")) {
			TicketFee=65;
			TicketType ="Solo";
		}
		else if (TicketType.equalsIgnoreCase("Couple")) {
			TicketFee=98;
			TicketType="Couple";
		}
		else  {
			TicketFee=163;
			TicketType="Group(3 or 4)";
			}
	Class="Freshman";
	}
	else if (Class.equalsIgnoreCase("Sophmore")) {
		if (TicketType.equalsIgnoreCase("Solo")) {
			TicketFee=55;
			TicketType ="Solo";
		}
		else if (TicketType.equalsIgnoreCase("Couple")) {
			TicketFee=83;
			TicketType="Couple";
		}
		else  {
			TicketFee=138;
			TicketType="Group(3 or 4)";
			}
	Class="Sophmore";
	}
	else if (Class.equalsIgnoreCase("Junior")) {
		if (TicketType.equalsIgnoreCase("Solo")) {
			TicketFee=45;
			TicketType ="Solo";
		}
		else if (TicketType.equalsIgnoreCase("Couple")) {
			TicketFee=68;
			TicketType="Couple";
		}
		else  {
			TicketFee=113;
			TicketType="Group(3 or 4)";
		}
	Class="Junior";
	}
	else {
		if (TicketType.equalsIgnoreCase("Solo")) {
			TicketFee=40;
			TicketType ="Solo";
		}
		else if (TicketType.equalsIgnoreCase("Couple")) {
			TicketFee=60;
			TicketType="Couple";
		}
		else  {
			TicketFee=100;
			TicketType="Group(3 or 4)";
		}
    Class = "Senior";
	}
    
return TicketFee;
}

public static String Generate() {
	int count =0;
	int rand =0;
	String Password = "";
	String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
	while (count < 6){
		rand = (int)(Math.random()*characters.length());
		Password += characters.substring(rand, rand+1);
		count ++;
		}
	return Password;
}


public void Ticket(){
 System.out.print("Your name is " + Name+ " and you are a "+Class+". You are going as "+TicketType+". For the plan you choose your payment is "+TicketFee+". Your password is "+Generate());
}


}


