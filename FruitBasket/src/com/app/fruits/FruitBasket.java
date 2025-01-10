
package com.app.fruits;
import java.util.Scanner;
public class FruitBasket {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter basket size");
		int basketsize=sc.nextInt();
		
		FruitAss[] basket=new FruitAss[basketsize];
		int counter =0;
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println("\nOption:");
			System.out.println("0.exit");
			System.out.println("1. Add Mango ");
			System.out.println("2. Add Orange ");
			System.out.println("3. Add Apple ");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display details of all fresh fruits.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			
			
			switch(choice)
			{
			case 0:
				exit=true;
				break;
				
				
			case 1:
				if(counter<basket.length) {
					System.out.print("enter name:");
	                String name = sc.nextLine();
	                System.out.print("Enter color: ");
	                String color = sc.nextLine();
	                System.out.print("Enter weight: ");
	                double weight = sc.nextDouble();
	                basket[counter++] = new Mango(name, color, weight, true);
	                  } 
				    else {
	                    System.out.println("Basket is full!");
	                }
	                break;
			
			case 2:
                if (counter < basket.length) 
                {
                  System.out.print("Enter name: ");
                  String name = sc.nextLine();
                  System.out.print("Enter color: ");
                  String color = sc.nextLine();
                  System.out.print("Enter weight: ");
                  double weight = sc.nextDouble();
                  basket[counter++] = new Orange(name, color, weight, true);
                } else {
                  System.out.println("Basket is full!");
              }
              break;
              
			case 3:
                if (counter < basket.length) 
                {
                  System.out.print("Enter name: ");
                  String name = sc.nextLine();
                  System.out.print("Enter color: ");
                  String color = sc.nextLine();
                  System.out.print("Enter weight: ");
                  double weight = sc.nextDouble();
                  basket[counter++] = new Apple(name, color, weight, true);
                } else {
                  System.out.println("Basket is full!");
              }
              break;
              
			case 4:
				System.out.println("enter all fruits name");
				for(FruitAss f:basket) {
					if(f!=null) {
						System.out.println(f.getName());
						}
					}
				break;
				
			case 5:
                System.out.println("Details of all fresh fruits:");
                for (FruitAss f : basket) {
                    if (f.isFresh == true) {
                        System.out.println(f.getName());
                        System.out.println("Taste: " + f.taste());
                    }
                }
                break;

            case 6:
                System.out.println("Tastes of stale fruits:");
                for (FruitAss f : basket) {
                    if (f != null && !f.isFresh()) {
                        System.out.println(f.taste());
                    }
                }
                break; 
                
            default:
                System.out.println("Invalid choice!");
       
        
       } 
    } 
  }
 }