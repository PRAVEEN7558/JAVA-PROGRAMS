package Collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Collections1> {

	@Override
	public int compare(Collections1 o1, Collections1 o2) {
		
		if(o1.getMark()>o2.getMark()) {
			return -12;
		}else if(o1.getMark()<o2.getMark()) {
			
			return 11;
		}else {
			
			return 0;
		}
	}
	

}
