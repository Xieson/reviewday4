package Day_4;

public class HashTreeSetDemo implements Comparable<HashTreeSetDemo>{
	 String name;
	 int age;
	
	@Override
	public String toString() {
		return "HashTreeSetDemo [name=" + name + ", age=" + age + "]";
	}
	public HashTreeSetDemo(String name,int age) {
		this.name=name;
		this.age=age;
	};
	@Override
	public int compareTo(HashTreeSetDemo o) {
		if(this.age>o.age) {
			return 1;
		}else if(this.age<o.age) {
			return -1;
		}
		return 0;
	}
	

}
