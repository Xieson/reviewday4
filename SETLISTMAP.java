package Day_4;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class SETLISTMAP {
	public static void main(String[] args) {
//		Set<String> set=new HashSet<String>();//不充许数据重复,重复的数据会自动覆盖,且也不记录存入数据的先后顺序
//		set.add("zhangsan");
//		set.add("lisi");
//		set.add("lisi");
//
//		set.add("wanger");
//		Map<String, Set<String>> map=new HashMap<>();//Map<key,vlaue>--->不充许key的值重复,value的值可以重复,不记录存入数据的先后顺序
//		map.put("大师3", set);
//		map.put("大师14", set);
//		map.put("大师", set);
//		map.put("大师1", set);
//		List<Map<String,Set<String>>> list=new ArrayList<Map<String,Set<String>>>();//List<Object>-->充许数据重复,且记录存入数据的先后顺序
//		list.add(map);
//		System.out.println(list);
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		List<int[]> list=Arrays.asList(num);
		for(int[] nu:list) {
			System.out.println(Arrays.toString(nu));
		}
		String sr=UUID.randomUUID().toString();
	}
}
