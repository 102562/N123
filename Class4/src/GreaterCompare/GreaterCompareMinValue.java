package GreaterCompare;

public class GreaterCompareMinValue {
    public static void main(String[] args) {

        int a = 10;
        int b = 220;
        int c = 30;

        if (a<b&&a<c){
            System.out.println("A is lesser then other");
        }else if(b<c){
            System.out.println("B is lesser then other");
        }
        else
            System.out.println("C is lesser then other");
    }
}