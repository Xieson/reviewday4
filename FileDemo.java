package Day_4;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
//		String file=File.pathSeparator;//获取属性分隔符
//		System.out.println(file);
//		char c = File.pathSeparatorChar;//获取属性分隔符
//		System.out.println(c);
//		String separator = File.separator;//获取系统文件夹的分割路径
//		System.out.println(separator);
//		String separator2 = File.separator;//获取系统文件夹的分割路径
//		System.out.println(separator2);
		File file=new File("E:\\比赛\\2018年Web应用软件开发赛项（工位号：XXX）\\功能完成shoppingDemo\\.settings");
		File fff=file.getParentFile();//返回文件下的上一目录
		System.out.println(fff);
		String str=file.getName();//返回文件目录的最后一个文件夹的名字
		System.out.println(str);
//		listFile(file);
//		File[] listFiles = file.listFiles();//查找到对应文件夹下面的所有数据(文件)
//		for(File fi:listFiles) {
//			if(fi.isDirectory()) {//判断fi的文件是否为文件夹,返回值为boolean
//			System.out.println(fi);
//			}
//		}
//		long lastModified = file.lastModified();//返回上次修改的到现在的时间ms
//		System.out.println(lastModified);
	}

	private static void listFile(File file) {
		File[] fi=file.listFiles();
		for(File f:fi) {
			if(f.isDirectory()) {
			System.out.println(f);
				listFile(f);//递归操作,查找到文件下的所有是文件夹的目录
			}
		}
	}
}
