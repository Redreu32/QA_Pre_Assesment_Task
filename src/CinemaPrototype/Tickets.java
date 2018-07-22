package CinemaPrototype;

public abstract class Tickets {
    private int quantity; //Number of tickets will always be whole
    private double cost; //cost could have decimals as it is a monetary value


//    public double getCost() {
//        return cost;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setCost(double cost){
        this.cost =cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public abstract void add();

    public double compute(){
        double price;
        price = quantity * cost;
        return price;
    }

}
