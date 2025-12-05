package kata.kyu8;

public class EvenOrOdd {

    public static String evenOrOdd(int number) {
       return (number%2==0) ?  "Even" : "Odd";
    }


    static void main(String[] args) {

        System.out.println("Test 1 (55): " + evenOrOdd(55));
    }
}

