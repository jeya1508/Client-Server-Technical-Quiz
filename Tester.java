
import java.util.*;

public class Tester {
	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add(new String("A"));
		linkedHashSet.add(new String("B"));
		linkedHashSet.add(new String("C"));
		linkedHashSet.add(new String("C"));
		linkedHashSet.add(new String("E"));
		linkedHashSet.add(new String("D"));
		linkedHashSet.add(new String("E"));
		linkedHashSet.add(null);
		linkedHashSet.add(new String("E"));
		Object[] elements = linkedHashSet.toArray();
		for (Object element : elements)
			System.out.print(element + " ");
	}
}