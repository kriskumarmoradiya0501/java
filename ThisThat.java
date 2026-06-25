
import java.util.Objects;




class Laptop{
    int price;
    String name;

    public void Laptop1(){
        System.err.println(name+" "+price);
    }

    // public boolean equals(Laptop that){
    //     return this.name.equals(that.name)&&this.price == that.price;
    // }

    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.price;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop{");
        sb.append("price=").append(price);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

}
class ThisThat{
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.price = 10;
        l1.name = "Dell";

        Laptop l2 = new Laptop();
        l2.name = "Dell";
        l2.price = 0;

        boolean isSame = l2.equals(l1);

        String str = l1.toString();
        System.out.println(str);

        int i = l1.hashCode();
        System.out.println(i);

        

        System.out.println(isSame);
    }
}