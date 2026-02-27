package DSAweek3;
import java.util.*;

public class c5_nestedArrayListSorting {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nestedList = new ArrayList<>();

        // Create nested lists
        nestedList.add(new ArrayList<>(Arrays.asList(3, 1, 4)));
        nestedList.add(new ArrayList<>(Arrays.asList(1, 5, 9)));
        nestedList.add(new ArrayList<>(Arrays.asList(2, 6, 5)));

        System.out.println("Before sorting: " + nestedList);

        // Sort by first element of each sub-list
        Collections.sort(nestedList, (a, b) -> a.get(0).compareTo(b.get(0)));

        System.out.println("After sorting by first element: " + nestedList);

        // Sort by sum of elements in each sub-list
        Collections.sort(nestedList, (a, b) -> {
            int sumA = a.stream().mapToInt(Integer::intValue).sum();
            int sumB = b.stream().mapToInt(Integer::intValue).sum();
            return Integer.compare(sumA, sumB);
        });
        System.out.println("After sorting by sum: " + nestedList);
    }

}
