package Day_4;

import java.util.Comparator;

public class HashSetDemo1 implements Comparator<HashTreeSetDemo>{
	
	@Override
	public int compare(HashTreeSetDemo o1, HashTreeSetDemo o2) {
		if(o1.name.length()>o2.name.length()) {
			return 1;
		}else if(o1.name.length()>o2.name.length()) {
			return -1;
		}
		return 0;
	}

}
