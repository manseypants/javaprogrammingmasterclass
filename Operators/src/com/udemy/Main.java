package com.udemy;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;

        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; //3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; //10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false; // one "=" is an assignment operator
        if (isAlien == false) { // two "==" is a comparison between the operands
            System.out.println("it is not an alien!"); //if you don't mke a code block then only one line can be added
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore !=100) { //you can use >= or <= or anything as the operator
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100.");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true.:");
        }

        double variable1 = 20.00;
        double variable2 = 80.00;
        double variable3 = ((variable1 + variable2) * 100.00);
        System.out.println("My values total " + variable3);
        double variable4 = variable3 % 40.00;
        System.out.println("The remainder equals " + variable4);
        boolean trueValue = variable4 == 0;
        if(!trueValue) {
            System.out.println("Got some remainder value");
        }

    }

}
