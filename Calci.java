Public Interface Calci{
    int add();
}

public class CalciImplements implements Calci{
    public static void main(String[]args){
        public int add(int a, int b){
            System.out.println(a+b);
        }
    }

public class Calcidriver{
    public Static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();
        Calci c= new CalciImplements();
        c.add(a,b);
    }
}
