public class RectDrive{
    public static void main(String[] args){
        Rectangle myRectangle = new Rectangle();
        Rectangle myRect2 = new Rectangle(11.2, 35.6);
        myRectangle.setLength(2.5);
        myRectangle.setWidth(-3.125);
        System.out.println(myRectangle);
        System.out.println("Rectangle length is: " + myRectangle.getLength());
        System.out.println("Rectangle width is: " + myRectangle.getWidth());
        System.out.println("Rectangle area is: " + myRectangle.getArea());
    }
}