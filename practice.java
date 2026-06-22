import java.util.*;
class MyClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 :
                System.out.print("Monday");
            break;    
            case 2 : 
            System.out.print("Truesday");
            break;
            case 3 :
                System.out.print("Wednesday");
                break;
            case 4 :
                System.out.print("thusday");
            break;
            case 5 :
                System.out.print("friday");
            break;
            case 6 : 
            System.out.print("saturday");
            break;
            case 7 :
                System.out.print("sunday");
            break;
            default :
            System.out.print("Invalid");
            break;
        }
    }
}
