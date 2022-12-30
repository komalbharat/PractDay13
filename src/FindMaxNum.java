//import org.junit.Test;


public class FindMaxNum {

    public static Integer compareTo(Integer number1,Integer number2, Integer number3){
        if(number1 > number2 && number1 <number3){
            return number2;
        }
        else if (number2>number1 && number2>number3){
            return number2;
        }
        else {
            return number3;
        }
    }
    public static void main(String[] args) {
        FindMaxNum integer = new FindMaxNum();
        System.out.println(integer.compareTo(1,2,6));

    }
}