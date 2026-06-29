class Animal{
    void walk(){
        System.out.println("Animal Walk()");
    }
}
class Monkey extends Animal{
    void monkey(){

    }
}
class Test{
    void m1(Animal obj){
        System.out.println("m1 Animal");
    }
    void m1(Monkey obj){
        System.out.println("m1 Monkey");
    }
}

public class InheritanceLearning {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        Monkey obj2 = new Monkey();
        Animal obj3 = new Monkey();
        obj1.walk();
        obj2.walk();
        obj3.walk();
        //obj1.monkey();
        Test ref= new Test();
        ref.m1(obj1);
        ref.m1(obj2);
        ref.m1(obj3);
    }
}