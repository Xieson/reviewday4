package Day_4;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDemo1 {
	public static void main(String[] args) {
		String str="E:\\比赛\\2018年Web应用软件开发赛项（工位号：XXX）\\功能完成shoppingDemo\\.settings";
		File file=new File(str);
		List<String> list=new ArrayList<>();
		listDemo(list,file);
		Collections.reverse(list);
		StringBuilder ab=new StringBuilder(20);
		for(String li:list) {
			ab.append(li).append(">");
		}
		ab.deleteCharAt(ab.length()-1);
		System.out.println(ab);
	}

	private static void listDemo(List<String> list, File file) {
		if(!" ".equals(file.getParentFile().getName())) {
			list.add(file.getName());
		}
		if(file.getParentFile().getParentFile()!=null) {
			listDemo(list,file.getParentFile());
		}
	}
}
