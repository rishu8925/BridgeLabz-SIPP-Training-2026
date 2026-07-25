
class Animal{
    void walk(){
        System.out.println("Animal Walk()");
        //WALK METHD INHERITED INTO MONKEY
    }
}
class Monkey extends Animal{
    void monkey(){

    }
    @Override
    void walk(){
        System.out.println("MONKEY WALK");
    }
}
class Test{
    void m1(Animal obj){
        //method->non static method
        System.out.println("m1 animal");
    }
    void m1(Monkey obj){
        System.out.println("m1 monkey");
        //method jhaving same name but diffrencet argument->overriding//overloading mae return type dosent matter
        
    }
}
public class inheritanceLearning {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        Monkey obj2 = new Monkey();
        Animal obj3 = new Monkey();
        obj1.walk();
        obj2.walk();
        obj3.walk();
        Test ref = new Test();
        ref.m1(obj1);
        ref.m1(obj2);
        ref.m1(obj3); //compile time polymorpohosirm - > animal
        // obj1.monkey();
        // obj3.monkey();
        //parents ko monkey refernce kae baare mae nai pata

    }
}