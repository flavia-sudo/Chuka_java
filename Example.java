public class Example {
    private double radius;
    private double area;
    final double PI = 3.142;
    public void setRadius(double radius) {
        this.radius = radius;
    }
        public void calculateArea(){
        this.area = PI * radius * radius;
    }
    public void displayArea(){
        System.out.println("the area of the circle is: " +area);
    }
    public static void main(String[] args){
        Example example = new Example();
        example.setRadius(10.48);
        example.calculateArea();
        example.displayArea();

    }
}
