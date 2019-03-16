package GreaterCompare;

public class GreaterCompare3values {
    public static void main(String[] args) {
        int a =1;
        int b =2;
        int c =3;

        if(a>b && a>c){
            System.out.println("A is Greater");
        }else if(b>c){
            System.out.println("B is Greater");
        }else
            System.out.println("C is Greater");
    }
}
