interface A{
    void play();
    void teach();
}

interface B{
    void learn();
}

interface C extends A,B{
    void Drive();
}

abstract class D implements C{

    public void Drive() {
        System.out.println("Drive");
    }

    public void play() {
        System.out.println("play");

    }

    public void teach() {
        System.out.println("teach");
    }
    abstract void chat();
}

class E extends D{

    public void learn() {
        System.out.println("Learn");
    }

    void chat() {
        System.out.println("Chat");
    }
    
}
class InterfaceClass{
    public static void main(String[] args) {
        E ee = new E();

        ee.Drive();
        ee.learn();
        ee.play();
        ee.teach();
        ee.chat();
    }
}