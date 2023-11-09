import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

class ListaGenericaTest {

	@Test
	void todosDeMayorAMenorTest() {

	    List<Integer> l1 = new ArrayList<Integer>();
	    l1.addAll(Arrays.asList(new Integer[]{10, 4, 8}));

	    List<Integer> l2 = new ArrayList<Integer>();
	    l2.addAll(Arrays.asList(new Integer[]{34, 12, 81}));

	    List<Integer> l3 = new ArrayList<Integer>();
	    l3.addAll(Arrays.asList(new Integer[]{81, 34, 12, 10, 8, 4}));

	    ListasGenericas<Integer> lg = new ListasGenericas<Integer>();

	    assertEquals(l3, lg.todosDeMayorAMenor(l1, l2));
	  }

}
