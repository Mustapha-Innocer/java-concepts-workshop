/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    int add(int number1, int number2){
        return number1 + number2;
    }

    int add(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    float add(int number1, int number2, float number3){
        return number1 + number2 +number3;
    }

    int add(String number1, String number2){
        return Integer.parseInt(number1) + Integer.parseInt(number1);
    }

}

