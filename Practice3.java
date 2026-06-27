

class Demo{
    String str;
    int c;
    static String name;
    public Demo(){
        str = "hello";
        c = 10;
        System.out.println("Constructer");
    }
    public void cal(int a,int b){
        System.out.println(a+b);
    }
    static {
        name = "static";
        System.out.println("Static block");
    }
}

class Practice3{
    public static void main(String[] args){
        // Demo d = new Demo();
        try{
            Class.forName("Demo");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}