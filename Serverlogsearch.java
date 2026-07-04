 import java.util.Scanner;
public class Serverlogsearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of log IDs: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted log IDs:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target log ID: ");
        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                found = true;
                break;
            }
            else if(target < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if(found)
            System.out.println("Log Found");
        else
            System.out.println("Log Not Found");

        sc.close();
    }
}

