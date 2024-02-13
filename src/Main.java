import java.util.*;

public class Main {
    public static int countNegativesOne(ArrayList<Integer> arr) {
        int count = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j) < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegativesTwo(ArrayList<Integer> arr) {
        int count = 0;
        for (int j = 0; j <= arr.size() - 1; j++) {
            if (arr.get(j) < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("countNegativesOne TEST\n----------");
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(-1, 2, 5, 6, -10, 4, 8));
        System.out.println(arr);
        System.out.println(countNegativesOne(arr));

        System.out.println("countNegativesTwo TEST\n----------");
        System.out.println(arr);
        System.out.println(countNegativesTwo(arr));

        System.out.println("\nAs you can see, both outputs are the same!");
    }
}