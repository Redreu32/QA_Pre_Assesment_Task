package CinemaPrototype;

import java.util.Calendar;
import java.util.Scanner;

public class Student extends Tickets {

    //constructor
    public Student() {
        double cost = 6.00;
        Calendar now = Calendar.getInstance();
        if (now.get(Calendar.DAY_OF_WEEK)== Calendar.WEDNESDAY){
            cost= cost - 2.0;
        }
        super.setCost(cost);
    }

    @Override
    public void add() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many Student tickets? ");
        this.setQuantity(keyboard.nextInt());
        System.out.print(this.getQuantity());
        System.out.println(" Student tickets added");
    }
}
