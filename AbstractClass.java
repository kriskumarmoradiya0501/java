abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void music(){
        System.out.println("Music is playing");
    }
}

class Bmw extends Car{
    public void drive(){
        System.out.println("Driving ..");
    }
    public void fly(){
        System.out.println("Not Flying..");
    }
}

class AbstractClass{
    public static void main(String[] args) {
        Bmw b = new Bmw();
        b.drive();
        b.fly();
        b.music();
    }
}