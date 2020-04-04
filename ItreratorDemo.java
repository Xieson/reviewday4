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
//				list.remove();//不能使用集合里面的remove()方法数组里面的袁术进行删除;
//			否则报ConcurrentModificationException错
//			应该使用迭代器里面的remove();方法
//			iterator.remove();
//			}
			System.out.println(iterator.next());
		}
	}
}
