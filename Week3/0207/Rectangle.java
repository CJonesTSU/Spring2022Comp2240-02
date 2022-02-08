public class Rectangle{
    // fields
    private double length;
    private double width;
    
    // getters or accessors
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    // setters or mutator
    
    public void setLength(double l){
        if (l < 0){
            l = l * -1;
        }
        length = l;
    }
    
    public void setWidth(double w){
        if(w < 0){
            w = w * -1;
        }
        width = w;
    }
    
    public double getArea(){
        return length * width;
    }
}