
import java.util.*;


class Student{
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    
    public String toString() {
        return age + " " + name;
    }
     
}

class CollectionsOfJava{
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(5);
        nums.add(6);
        nums.add(6);
        nums.add(7);
        for(int n : nums){
            System.out.println(n);
        }

        Map<Integer,String> m = new HashMap<>();

        m.put(10, "Jay");
        m.put(11, "man");
        m.put(12, "lal");
        m.put(13, "klk");
        m.put(14, "bab");

        System.out.println(m);

        for(int n : m.keySet()){
            System.out.println(n+" "+m.get(n));
        }
        for(String s : m.values()){
            System.out.println(s);
        }

        Comparator<String> com = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };
        List<String> l = new ArrayList<>();
        l.add("jayukgkjb");
        l.add("Mnadjh");
        l.add("jbdha");
        l.add("Mnakjufbewad");
        l.add("Mnaksufd");
        l.add("Mnaejhyefbud");

        Collections.sort(l,com);

        for(String s : l){
            System.out.println(s);
        }

        Comparator<Student> com2 = ( i , j) -> i.age>j.age?1:-1;

        List<Student> stud = new ArrayList<>();

        stud.add(new Student(20,"Jay"));
        stud.add(new Student(30,"momos"));
        stud.add(new Student(18,"chinees"));
        stud.add(new Student(17,"dosa"));
        stud.add(new Student(15,"pizza"));

        Collections.sort(stud,com2);

        for(Student s : stud){
            System.out.println(s);
        }
    }
}