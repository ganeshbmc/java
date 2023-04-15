package code.rough.oppe2.q4;

public class Rectangle<T extends Number>{
    T l, b;
    public Rectangle(T l, T b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return this.l.doubleValue() * this.b.doubleValue();
    }
    public <T extends Number> double compareArea(Rectangle<T> r){
        if (this.area() > r.area()){
            return this.area();
        } else {
            return r.area();
        }
    }
}
