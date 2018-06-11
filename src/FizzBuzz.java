public class FizzBuzz {


    public String evaluate(int number) {
        if(isDivisibleByThreeAndFive(number)) return("FizzBuzz");
        if(isDivisibleByThree(number)) return("Fizz");
        if(isDivisibleByFive(number)) return("Buzz");
        return String.valueOf(number);
    }

    private boolean isDivisibleByThreeAndFive(int number) {
        return(isDivisibleByThree(number) && isDivisibleByFive(number));
    }

    private boolean isDivisibleByThree(int number) {
        return 0 == number % 3;
    }

    private boolean isDivisibleByFive(int number) {
        return 0 == number % 5;
    }
}
