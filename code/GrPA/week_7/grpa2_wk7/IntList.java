package code.GrPA.week_7.grpa2_wk7;

class InvalidInputEx extends Exception {
    public InvalidInputEx(String message){
        super(message);
    }
}

public class IntList {
    int[] arr = new int[5];
    public void set_value(int i, int v) throws InvalidInputEx, ArrayIndexOutOfBoundsException{
        try {
            arr[i] = v;
        } catch (ArrayIndexOutOfBoundsException ae) {
            InvalidInputEx iie = new InvalidInputEx("Invalid index input");
            iie.initCause(ae);
            throw iie;
        }
    }
    public int[] getArray(){
        return arr;
    }
}
