public class Main {
    public static void f(int a){

        if(a<=2){
            System.out.println(a);
        }

        else {

            f(a/2);
            System.out.println(a);
        }



    }

    public static void main(String[] args) {
        f(9);
    }
}