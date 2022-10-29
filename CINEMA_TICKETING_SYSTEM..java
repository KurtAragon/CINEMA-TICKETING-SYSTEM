//Title: CINEMA TICKETING SYSTEM
//Description:Description:Cinema Ticket Booking System also can be called as Movie Ticket Booking System or even named as Ticket Reserving System.This is a system that enable consumer to reserve or book movie ticket online with the help of internet.
//Programmers: 
//1.Kurt ANgelo Aragon
//2.Cyrell Tomas Domingo
//3.Jayson Juanico
//4. Joshua Buyo
//Date Submitted: October 29, 2022
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner key = new Scanner (System.in);
        //SOUTH-2
        Queue cine = new LinkedList();
        cine.add("VIP SEAT");
        cine.add("FRONT SEAT");
        cine.add("SIDE SEAT");
        cine.add("MID");
        cine.add("REGULAR SEAT");
        System.out.println("------------------------------Cinema Ticketing System------------------------------");
        System.out.println("Programmers:");
        System.out.println("-Kurt Angelo Aragon\n-Cyrell Tomas Domingo\n-Jayson Juanico\n-Joshua Buyo");
        System.out.println("Description:Cinema Ticket Booking System also can be called as Movie Ticket\n Booking System or even named as Ticket Reserving System. \nThis is a system that enable consumer\n to reserve or book movie ticket online with the help of internet.\n ");
        
        System.out.println("Queue" + cine);
        
        int hakdog;
        do{
            System.out.println("Buy Ticket!");
            System.out.println("1.Press 1 to buy ticket\n2.Buy\n3.exit\n");
            hakdog = key.nextInt();
            if (hakdog == 1)
            {
                System.out.println("----------CHOOSE YOUR SEAT!!!----------");
                cine.add(key.nextInt());
                    System.out.println("Queue" + cine);
            }
            else if (hakdog == 2)
            {
                System.out.println("De-queue");
                cine.poll();
                System.out.println("De-Queued \n" + cine);
            }
            
        }while(hakdog != 3);
        
    }
}
