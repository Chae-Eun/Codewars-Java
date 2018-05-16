/**************************MY SOLUTION******************************/
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return Math.abs(number)%2 == 1 ? "Odd":"Even";
    }
}

/************************BEST SOLUTION******************************/
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number%2 == 0) ? "Even" : "Odd";
    }
}
/*******************************************************************/
