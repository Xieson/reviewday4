package Day_4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ItreratorDemo {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
//		for(Object li:list) {
//			System.out.println(li);
//		}
//		Iterator itrerator=list.iterator();
		java.util.Iterator<Object> iterator = list.iterator();
		while(iterator.hasNext()) {
//			if("B".equals(iterator.next())) {
//				list.remove();//����ʹ�ü��������remove()�������������Ԭ������ɾ��;
//			����ConcurrentModificationException��
//			Ӧ��ʹ�õ����������remove();����
//			iterator.remove();
//			}
			System.out.println(iterator.next());
		}
	}
}
