

package StaticVariable;

public class VariableMethos {
    static int a =120;
    static int b =20;
    static int c=a+b;
    public static void add(){
        System.out.println(c);
    }

    public static void main(String[] args)
    {
       VariableMethos.add();
           }
}
