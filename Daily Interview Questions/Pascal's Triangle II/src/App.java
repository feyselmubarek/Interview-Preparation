import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>(Arrays.asList(1));

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(prev.get(j) + prev.get(j - 1));
                }
            }

            if (i == rowIndex) {
                return curr;
            }

            prev = curr;
        }

        return prev;
    }
}
