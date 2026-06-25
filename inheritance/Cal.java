class Cal{
    public static void main(String[] args){
        AddSub as = new AddSub();

        float result = as.add(10,20);
        System.out.println(result);
        
        MulDiv md = new MulDiv();
        result = md.add(20, 30);

        MathFeature mf = new MathFeature();
        result = mf.add(10, 50);
        System.out.println(result);
        result = mf.mul(50, 20);
        System.out.println(result);
        result = mf.power(5, 3);
        System.out.println(result);
    }
}