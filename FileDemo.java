package Day_4;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
//		String file=File.pathSeparator;//��ȡ���Էָ���
//		System.out.println(file);
//		char c = File.pathSeparatorChar;//��ȡ���Էָ���
//		System.out.println(c);
//		String separator = File.separator;//��ȡϵͳ�ļ��еķָ�·��
//		System.out.println(separator);
//		String separator2 = File.separator;//��ȡϵͳ�ļ��еķָ�·��
//		System.out.println(separator2);
		File file=new File("E:\\����\\2018��WebӦ��������������λ�ţ�XXX��\\�������shoppingDemo\\.settings");
		File fff=file.getParentFile();//�����ļ��µ���һĿ¼
		System.out.println(fff);
		String str=file.getName();//�����ļ�Ŀ¼�����һ���ļ��е�����
		System.out.println(str);
//		listFile(file);
//		File[] listFiles = file.listFiles();//���ҵ���Ӧ�ļ����������������(�ļ�)
//		for(File fi:listFiles) {
//			if(fi.isDirectory()) {//�ж�fi���ļ��Ƿ�Ϊ�ļ���,����ֵΪboolean
//			System.out.println(fi);
//			}
//		}
//		long lastModified = file.lastModified();//�����ϴ��޸ĵĵ����ڵ�ʱ��ms
//		System.out.println(lastModified);
	}

	private static void listFile(File file) {
		File[] fi=file.listFiles();
		for(File f:fi) {
			if(f.isDirectory()) {
			System.out.println(f);
				listFile(f);//�ݹ����,���ҵ��ļ��µ��������ļ��е�Ŀ¼
			}
		}
	}
}
