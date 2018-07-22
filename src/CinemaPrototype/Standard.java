package CinemaPrototype;

import java.util.Calendar;
import java.util.Scanner;


public class Standard extends Tickets {

    //constructor
    public Standard() {
        double cost = 8.00;
        Calendar now = Calendar.getInstance();
        if(now.get(Calendar.DAY_OF_WEEK)==Calendar.WEDNESDAY) //checks against computer clock if it is a Wednesday
        {                                                     //If it is a wednesday
            cost = cost - 2.0;                                //apply discount
        }
        super.setCost(cost);
    }

    @Override
    public void add() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many Standard tickets? ");
        this.setQuantity(keyboard.nextInt());
        System.out.print(this.getQuantity());
        System.out.println(" Standard tickets added");
    }
}

