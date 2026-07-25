class A {
    void m1() {
        System.out.println("A m1");
    }
}

class B extends A {
    void m2() {
        System.out.println("B m2");
    }

    @Override
    void m1() {
        System.out.println("B m1");
    }
}
public class interfaceLearning {

}
