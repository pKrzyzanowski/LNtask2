import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PairsFinder {

    public static void main(String[] args) {
        int sumTo = 13;
        PairsFinder pairsFinder = new PairsFinder();
        pairsFinder.findPairs(pairsFinder.readList(), sumTo);
    }

    public List<Integer> readList() {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        return list;
    }

    public void findPairs(List<Integer> list, int sum) {
        Collections.sort(list);
        int range = sum / 2;
        List<Integer> firstPart = new ArrayList<>(list.subList(0, list.lastIndexOf(range) + 1));
        List<Integer> secondPart = new ArrayList<>(list.subList(list.lastIndexOf(range) + 1, list.size()));

        for (Integer i : firstPart)
            if (secondPart.contains(sum - i))
                System.out.println(i + " " + (sum - i));
    }
}