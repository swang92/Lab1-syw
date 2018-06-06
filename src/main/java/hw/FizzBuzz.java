package hw;

public class FizzBuzz {

    public static String[] fizzBuzzArray(final int n) {

        int arrayIndex = 0;
        String[] myArray;

        if (n <= 0) {
            myArray = new String[1];
            myArray[0] = "This need to be an positive integer > 0";
        }
        else {
            myArray = new String[n];
            if (n > 0) {
                for (int x = 1; x <= n; x++, arrayIndex++) {
                    if (x % 3 == 0 && x % 5 == 0) {
                        myArray[arrayIndex] = ("Fizz Buzz");
                    } else if (x % 3 == 0) {
                        myArray[arrayIndex] = ("Fizz");
                    } else if (x % 5 == 0) {
                        myArray[arrayIndex] = ("Buzz");
                    } else {
                        myArray[arrayIndex] = (String.valueOf(x));
                    }
                }
            }

        }
        return myArray;
    }
}















