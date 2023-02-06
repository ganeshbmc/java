public class class_with_no_methods{
    // This class has methods. The class "no_methods_class" defined below has no methods in it. 
    // "no_methods_class" is a valid class. But we cannot make it a "public" class.
    public static void main(String[] args){
        no_methods_class obj = new no_methods_class();
        obj.width = 1;
        obj.height = 2;
        obj.depth = 3;
        System.out.println(obj.width);
        System.out.println(obj.height);
        System.out.println(obj.depth);
    }
}

class no_methods_class {
    double width;
    double height;
    double depth;
}