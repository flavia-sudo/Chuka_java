public class Rectangle {
    private final int length;
    private final int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int calculateArea(){
        return length * width;
    }
    public static void main(String[] args){
        Rectangle rec = new Rectangle(5, 3);
        int area = rec.calculateArea();
        System.out.println("The area: " +area);
    }
}
