package CinemaPrototype;


public class Main {

    public static void main(String[] args) {

        //Instantiate Objects
        Tickets Standard = new Standard();
        Tickets Student = new Student();
        Tickets Child = new Child();
        Tickets OAP = new OAP();
        double total;

        System.out.println("Welcome to QA Cinemas ticket calculator prototype!");

        //add standard tickets Standard.add()
        Standard.add();

        //add Student tickets
        Student.add();

        //add Child tickets
        Child.add();

        //add OAP tickets
        OAP.add();

        //calculate total cost
        total = Standard.compute() + Student.compute() + Child.compute() + OAP.compute();

        //output total
        System.out.print("The total cost for this movie is £");
        System.out.print(total);
        System.out.println(".");

    }
}
