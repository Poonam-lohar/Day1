public class VariableMethod {
    static int p = 15;
    static int o;
    static void func(int n){
        System.out.println("p= " + p);
        System.out.println("o= " + o);
        System.out.println("n= " + n);
    }
    static {
        System.out.println(" static for block");
        o=p+15;
    }
    public static void main(String[] args){
        func(8);
    }
}
