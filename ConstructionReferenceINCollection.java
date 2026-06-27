
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Student{
    String name;
    int age;

    public Student(){

    }
    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}

class ConstructionReferenceINCollection{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Krish","Man","Tan","Hir","Happy","Ish","Pri","Dhru","Drash","Het","Hira","Radh","Bin");
        
        List<Student> Students = new ArrayList<>();

        // for(String name : names){
        //     Students.add(new Student(name));
        // }
        // System.out.println(Students);
        
        // Students = names.stream().map(name -> new Student(name)).toList();
        // System.out.println(Students);

        Students = names.stream().map(Student::new).toList();
        System.out.println(Students);
    }
}