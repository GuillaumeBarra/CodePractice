import java.util.*;

public class smallestNotInArray {
    public static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            if (a > 0) {
             set.add(a);
            }
        }

        for (int i = 1; i <= A.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1;
    }
}

//O(n) time and O(1) space