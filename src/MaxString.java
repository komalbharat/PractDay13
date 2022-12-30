public class MaxString {
    public static String compareTo(String Name1, String Name2, String Name3){
        int Number1 = Name1.compareTo(Name2);
        int Number2 = Name2.compareTo(Name3);
        int Number3 = Name3.compareTo(Name1);

        if (Number1 > Number2 && Number1 > Number2) {
            return Name1;
        } else if (Number2 > Number3) {
            return Name2;
        } else {
            return Name3;
        }
    }
    public static void main(String[] args) {
        MaxString maxstring = new MaxString();
        System.out.printf(" This is the Maximum String " + maxstring);

    }
}