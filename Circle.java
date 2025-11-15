public class Circle {

    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double getCircumference(double radius){
        return 2*radius*Math.PI;
    }
    double getArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(2.4);
        System.out.printf("area is: %.2f \n",c1.getArea(2.4));
        System.out.printf("circumference: %.2f ",c1.getCircumference(2.4));
    }
}
