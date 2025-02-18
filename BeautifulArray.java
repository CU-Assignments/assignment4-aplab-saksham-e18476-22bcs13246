import java.util.ArrayList;
import java.util.List;

public class BeautifulArray {
    public static int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1); // Base case
        
        while (result.size() < n) {
            List<Integer> temp = new ArrayList<>();
            
            // First, add all odd elements
            for (int num : result) {
                int odd = 2 * num - 1;
                if (odd <= n) temp.add(odd);
            }

            // Then, add all even elements
            for (int num : result) {
                int even = 2 * num;
                if (even <= n) temp.add(even);
            }

            result = temp;
        }

        // Convert list to array
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] beautifulArray = beautifulArray(n);
        for (int num : beautifulArray) {
            System.out.print(num + " ");
        }
    }
}
