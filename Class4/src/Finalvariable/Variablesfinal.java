package Finalvariable;

public class Variablesfinal {
    final int MIN_BAL=10;

    public static void main(String[] args) {
        Variablesfinal obj = new Variablesfinal();
        obj.travelcard(11);
        obj.travelcard(8);
        obj.travelcard(100);

    }
    public void travelcard(int mybal){
        if(mybal>=MIN_BAL){
            System.out.println("Open the Gate");
        }else
            System.out.println("Not enough Balance,Please Top-up");
    }
}
