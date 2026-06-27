sealed class A permits B,C{
    public void showA(){
        System.out.println("In A class");
    }
}

non-sealed class B extends A{
    public void showB(){
        System.out.println("In B class");
    }
}

final class C extends A{
    public void showC(){
        System.out.println("In C class");
    }
}

class D extends B{
    public void showD(){
        System.out.println("In D class");
    }
}




class SealedClass{
    public static void main(String[] args) {
        A a = new A();
        a.showA();

        B b = new B();
        b.showA();
        b.showB();

        C c = new C();
        c.showA();
        c.showC();

        D d = new D();
        d.showA();
        d.showB();
        d.showD(); 
    }
}