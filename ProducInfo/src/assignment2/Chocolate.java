package Assignment2;

public class Chocolate extends Product {

    double weight;

    public Chocolate(String productName, int barCode, double originalPrice, double weight) {
        super(productName, barCode, originalPrice);
        this.weight = weight;
    }
    @Override
    public String toString(){
     return super.toString()+"\nWeight"+ weight;
    }
}
