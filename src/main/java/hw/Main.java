package hw;

public class Main {

  public static void main(String[] args) {

    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.out.println("The argument entered must be an integer");
        System.exit(1);
      }
    }

    for (int x = 1; x < max+1; x++) {
      if (x % 3 == 0 && x % 5 == 0) {
        System.out.println("Fizz Buzz");
      } else if (x % 3 == 0) {
        System.out.println("Fizz");
      } else if (x % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(x);
      }
    }
  }

  }









