public class CircleArea implements ISubscriber{

    @Override
    public void notifySubscriber(String input) {
        double r = Double.parseDouble(input);
        System.out.println("Circle Area is: " + this.calcArea(r));

    }
    public double calcArea(double r){
        return 2.0*(22.0/7.0)*r;
    }
}