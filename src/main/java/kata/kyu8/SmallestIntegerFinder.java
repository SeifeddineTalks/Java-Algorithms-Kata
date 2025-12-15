package kata.kyu8;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int smallestNum=args[0];

        for (int i=1; i<args.length; i++){
           if(smallestNum>args[i]){
               smallestNum=args[i];
           }
        }
        return smallestNum;
    }

    static void main(String[] args) {
        System.out.println("Input {78,56,-2,12,-8}: " + findSmallestInt(new int[]{78,56,-2,12,-8}));
    }
}
