import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
  public static <N> ArrayList<N>removeduplicate(ArrayList<N>list) {
      HashSet<N> set = new HashSet<>(list);

      set.addAll(list);

      list.clear();

      list.addAll(set);
      return list;
  }

    public static void main(String[] args) {
        ArrayList<Integer>Number = new ArrayList<>(
                Arrays.asList(1, 2, 3, 2, 4, 3, 5));
        System.out.println("ArrayList with duplicate:" + Number);// print with duplicate numbers

        ArrayList<Integer> newNumber =removeduplicate(Number);
        System.out.println("ArrayList without duplicate:" + newNumber);// print without duplicate numbersxx

    }
  }