


class Laptop{
    int price;
    String name;

    public void Laptop1(){
        System.err.println(name+" "+price);
    }

    public boolean equals(Laptop that){
        return this.name.equals(that.name)&&this.price == that.price;
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

        System.out.println(isSame);
    }
}