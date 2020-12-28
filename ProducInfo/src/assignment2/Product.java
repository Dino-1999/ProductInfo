package Assignment2;

abstract class Product {

    String productName;
    int barCode;
    double originalPrice;
    final double PDV = 20;

    public Product(String productName, int barCode, double originalPrice) {
        this.productName = productName;
        this.barCode = barCode;
        this.originalPrice = originalPrice;
    }

    public double calculatedPrice() {
         
        return ((100+PDV)/100) *originalPrice;
    }

    @Override
    public String toString() {
        return "Name: " + productName + "\nBarcode: " + barCode + "\nOriginal price: " + originalPrice+"\nFinal price: "+calculatedPrice();
    }
}
