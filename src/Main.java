import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Michael J. Servilla
 * @version date 9/12/21, 7:47 PM
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(); //Should use int[]
        a.add(2);
        a.add(7);
        a.add(3);
        a.add(1);
        a.add(5);
        a.add(6);

        int n = a.size() - 1;
        Collections.sort(a); //Should use mergesort
        int k = a.get(n) + a.get(n - 1);
        int[] T = new int[k];
        for (int i = 0; i < k; i++) {
            T[i] = 0;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                int m = a.get(i) + a.get(j);
                T[m] +=1;
            }
        }
        n = 0;
        int p = 0;
        for (int i = k - 1; i > 0; i--) {
            if (T[i] > n) {
                n = T[i];
                p = i;
            }
        }
        System.out.println(p);
    }
}
