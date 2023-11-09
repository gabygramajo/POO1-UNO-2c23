import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListasGenericas <T> {
  
  public List<T> todosDeMayorAMenor(List<T> l1, List<T> l2) {
    List<T> l3 = new ArrayList<>();

    for (T el : l1) {
      l3.add(el);
    }

    for (T el : l2) {
      l3.add(el);
    }

    Collections.sort(l3, Collections.reverseOrder());

    return l3;
  }

  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<>();
    l1.addAll(Arrays.asList(new Integer[]{10, 4, 8}));

    List<Integer> l2 = new ArrayList<>();
    l2.addAll(Arrays.asList(new Integer[]{34, 12, 81}));

    System.out.println(l1);
    System.out.println(l2);

    ListasGenericas<Integer> lg = new ListasGenericas<Integer>();

    System.out.println(lg.todosDeMayorAMenor(l1, l2));
  }

}
