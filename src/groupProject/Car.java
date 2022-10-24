package groupProject; /*
    Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount

     */

public abstract  class Car {
    double carPrice;
    String color;
    Car(double carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }abstract double calculateSalePrice();}

class Truck extends Car{
    double weight;

    Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice(){
        double discountprice;
       if (weight>2000){
            discountprice=carPrice-(carPrice*10/100);
       }else {
           discountprice=carPrice-(carPrice*20/100);
       }
        System.out.println("The discount price of Truck is "+ discountprice);
        return discountprice;
    }
}
class Sedan extends Car{
    double length;

    Sedan(double carPrice, String color,double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        double discountprice;

        if (length>20){
            discountprice=carPrice-(carPrice*5/100);
        }else {
            discountprice=carPrice-(carPrice*10/100);
        }
        System.out.println("The discount price of Sedan is "+ discountprice);
        return discountprice;

    }
}
class CarTester{
    public static void main(String[] args) {
        Car truck=new Truck(234.56,"grey",67);
        truck.calculateSalePrice();
        Car sedan=new Sedan(567.67,"grey",56);
        sedan.calculateSalePrice();
    }
}
