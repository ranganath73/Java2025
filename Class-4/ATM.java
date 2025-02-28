// String[] str1, str2, str3;
// String str[] = new String[];

// int[] a, b, c;
// a[] = new int[10];

public class ATM {

public static void main(String[] args) {
    int[] accountNumbers = {1245, 6974, 6568, 8956};


    String[] options = {"BANKING", "CHECK"};

    
    // for (int i = 0; i < accountNumbers.length; i++) {
    //     if (accountNumbers[i] == 85223) {
    //         System.out.println("You can continue the transaction.");
    //     }
    // }
 
    // ADMIN
    for (int number : accountNumbers) {
        if (number == 6568) {
            System.out.println("Continue the transaction");
        }
    }
}





}