public class Refactor1 {

    public static <T extends Comparable<T>> T FindMaxNum(T num1, T num2, T num3) {
        if (num3.compareTo(num1) > 0) {
            return num3;
        } else if (num3.compareTo(num2) > 0) {
            return num2;
        } else {
            return num1;
        }

    }



    public static void main(String[] args) {
        System.out.println(" Max Integer " + FindMaxNum( 1 , 2 , 6));
        System.out.println(" Max Float " + FindMaxNum( 1.0F, 2.8F, 6.3F));
        System.out.println(" Max String " + FindMaxNum(" Apple "," Mango "," Strawberry "));
    }
}