package CinemaPrototype;

import java.util.Calendar;
import java.util.Scanner;

public class Child extends Tickets {

    //constructor
    public Child() {
        double cost = 4.00;
        Calendar now = Calendar.getInstance();
        if (now.get(Calendar.DAY_OF_WEEK)== Calendar.WEDNESDAY){
            cost= cost - 2.0;
        }
        this.setCost(cost);
    }

    @Override
    public void add() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many Child tickets? ");
        this.setQuantity(keyboard.nextInt());
        System.out.print(this.getQuantity());
        System.out.println(" Child tickets added");
    }
}
