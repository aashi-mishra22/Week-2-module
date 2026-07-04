 import java.util.Scanner;
public class Fraudtransactiondetection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transaction IDs: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter transaction IDs:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter suspicious transaction ID: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Fraud Transaction Found");
        else
            System.out.println("Transaction Not Found");

        sc.close();
    }
}

