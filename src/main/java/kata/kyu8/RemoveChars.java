package kata.kyu8;

public class RemoveChars {

    public static String remove(String str) {

        StringBuilder res= new StringBuilder(str);

        // We use str.length() instead of res.length() because res.length() changes
        // every time we delete a character. If we used res.length(), the first or
        // last character check could fail after a deletion, since the indices shift.

        for(int i=str.length()-1; i>-1  ; i--){

            if( i==0 || i== str.length() - 1){
                res.deleteCharAt(i);
            }
        }

        /*
        Simpler solution:
        res.deleteCharAt(res.length() - 1);
        res.deleteCharAt(0);
        */

        return res.toString();
    }


    static void main(String[] args) {

        System.out.println("Input eloquent: " + remove("eloquent"));

    }



}
