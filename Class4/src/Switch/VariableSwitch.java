package Switch;

public class VariableSwitch {
    public static void main(String[] args) {


        String month = "february";

        switch (month) {
            case "january":
                System.out.println("Month is january");
                break;
            case "february":
                System.out.println("month is february");
                break;
            case "march":
                System.out.println("month is march");
                break;
            case"april":
                System.out.println("month is april");
                break;
                default:
                    System.out.println("Holidays");
        }

    }
}