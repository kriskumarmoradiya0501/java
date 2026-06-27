
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



class RendomValues{
    public static void main(String[] args) {
        int size = 10000;
        List l = new ArrayList<>(size);        

        Random ran = new Random();
        int sum = 0;

        for(int i = 1 ; i <=10000 ; i++){
            int temp = ran.nextInt(1000)*2;
            sum += temp;
            l.add(temp);
        }
        System.out.println("List : "+l+"Sum : "+sum);
    }
}