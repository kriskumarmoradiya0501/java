
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class FindInArrayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = Arrays.asList("jay","Man","Pankaj","Jatin");
        String find1 = sc.nextLine();
        // Optional<String> name = l.stream().filter(str -> str.contains(find1)).findFirst();

        // System.out.println(name.orElse("Null"));
        String name = l.stream().filter(str -> str.contains(find1)).findFirst().orElse("Not Found");

        System.out.println(name);

        List<String> upper1 = l.stream()
                            .map(name1 -> name1.toUpperCase())
                            .toList();
        System.out.println(upper1);

        List<String> upper2 = l.stream().map(String::toUpperCase).toList();

        System.out.println(upper2);

        upper2.forEach(System.out::println);

        
    }
}