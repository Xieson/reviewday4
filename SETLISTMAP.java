package Day_4;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class SETLISTMAP {
	public static void main(String[] args) {
//		Set<String> set=new HashSet<String>();//�����������ظ�,�ظ������ݻ��Զ�����,��Ҳ����¼�������ݵ��Ⱥ�˳��
//		set.add("zhangsan");
//		set.add("lisi");
//		set.add("lisi");
//
//		set.add("wanger");
//		Map<String, Set<String>> map=new HashMap<>();//Map<key,vlaue>--->������key��ֵ�ظ�,value��ֵ�����ظ�,����¼�������ݵ��Ⱥ�˳��
//		map.put("��ʦ3", set);
//		map.put("��ʦ14", set);
//		map.put("��ʦ", set);
//		map.put("��ʦ1", set);
//		List<Map<String,Set<String>>> list=new ArrayList<Map<String,Set<String>>>();//List<Object>-->���������ظ�,�Ҽ�¼�������ݵ��Ⱥ�˳��
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
