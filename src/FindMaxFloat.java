public class FindMaxFloat {

    public static Float compareTo(Float number1,Float number2, Float number3){
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
        FindMaxFloat numbers = new FindMaxFloat();
        System.out.println(numbers.compareTo(1.0F,2.8F,6.3F));

    }
}