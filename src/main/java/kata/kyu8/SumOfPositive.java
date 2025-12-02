package kata.kyu8;

public class SumOfPositive {

    public static int sum(int[] arr){

        int sum=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>0) {
                sum+=arr[i];
            }
        }
        return sum;
    }

    static void main(String[] args) {

        int [] test1 = {1,2,3,4,5,-1,-10};
        System.out.println("Test 1 (1,2,3,4,5,-1,-10): " + sum(test1));
    }
}



