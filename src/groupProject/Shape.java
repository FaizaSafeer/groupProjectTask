package groupProject;

public interface Shape {

    /*
        1. Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.
   */
    void calculateArea(double a);

    void calculatePerimeter(double b);
}
 class Circle implements Shape{

     @Override
     public void calculateArea(double r) {
         System.out.println(Math.PI*r*r);
     }

     @Override
     public void calculatePerimeter(double r) {
         System.out.println(2*Math.PI*r);
     }
 }
 class Square implements Shape{

     @Override
     public void calculateArea(double l) {
         System.out.println(l*l);
     }

     @Override
     public void calculatePerimeter(double l) {
         System.out.println(l+l+l+l);
     }
 }
 class TestCode{
     public static void main(String[] args) {
        Shape circle=new Circle();
circle.calculateArea(3.4);
circle.calculatePerimeter(3.4);
     }
 }