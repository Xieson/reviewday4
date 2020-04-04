package Day_4;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		String str="E:/File≤‚ ‘";
		File file=new File(str);
		File[] file1=file.listFiles();
		String str1="≤‚ ‘";
		for(File fi:file1) {
			if(fi.getName().concat(str1) != null) {
				String str2=fi.getName().replace(str1, "");
				fi.renameTo(new File(str,str1));
			}
		}
	}
}
