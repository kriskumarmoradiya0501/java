// interface A{
//     void show();
// }

// class FunctionalInterface{
//     public static void main(String[] args) {
//         A obj = ()->{
//             System.out.println("Showing");
//         };
//         obj.show();
//     }
// }

interface A{
    int show(int a,int b);
}

class FunctionalInterface{
    public static void main(String[] args) {
        A obj = (a,b)->a+b;
        int result = obj.show(10,20);
        System.out.println(result);
    }  
}