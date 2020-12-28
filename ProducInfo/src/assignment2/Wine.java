package Assignment2;

public class Wine extends Product {

    double bottleVolume;
    final double additionalPDV = 10;

    public Wine(String productName, int barCode, double originalPrice, double bottleVolume) {
        super(productName, barCode, originalPrice);
        this.bottleVolume = bottleVolume;
    }

    @Override
    public double calculatedPrice() {

        return super.calculatedPrice()*((100+additionalPDV)/100);

    }

    @Override
    public String toString() {
        return super.toString() + "\nBottle volume: " + bottleVolume;
    }
}
