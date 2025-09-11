import java.util.Scanner;

public class deleteElement {

    int delEle(int arr[], int n, int x) {
        int i;
        // 1) find index of first occurrence of x
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }

        // 2) if not found, return original length
        if (i == n) {
            return n;
        }

        // 3) shift elements left from index i
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        // 4) return new length
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // take array input
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // take element to delete
        System.out.print("Enter element to delete: ");
        int x = sc.nextInt();

        // create object to call delEle
        deleteElement obj = new deleteElement();
        n = obj.delEle(arr, n, x);

        // print result
        System.out.print("Array after deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
