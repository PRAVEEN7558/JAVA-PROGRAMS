package Collection;

import java.util.LinkedList;
import java.util.List;

public class Single_rotate_elements_list {

	public static void main(String[] args) {

		List num = new LinkedList();

		num.add(48);
		num.add(44);
		num.add(5);
		num.add(432);
		num.add(33);
		System.out.println("List "+num);

		int rotate = 1;
		int count = 0;
		while (rotate > count) {
			int rot = (int) num.remove(0);
			num.add(rot);
			count++;
		}
		System.out.println("Single Rotate "+num);
	}

}
