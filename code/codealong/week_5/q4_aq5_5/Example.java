package code.codealong.week_5.q4_aq5_5;

class Example<T1,T2 extends Number>{
    T1 ob1;
    T2 ob2;
    void push(T1 obj){
        this.ob1=obj;
        System.out.println(ob1);
    }
    void push(T2 obj){
        this.ob2=obj;
        System.out.println(ob2);
    }
 }