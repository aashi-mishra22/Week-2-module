import java.util.Scanner;
public class sortemployeesalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of salaries: ");
        int n = sc.nextInt();

        int[] salary = new int[n];

        System.out.println("Enter employee salaries:");

        for(int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {

                if(salary[j] > salary[j + 1]) {

                    int temp = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Salaries:");

        for(int i = 0; i < n; i++) {
            System.out.print(salary[i] + " ");
        }

        sc.close();
    }
}

