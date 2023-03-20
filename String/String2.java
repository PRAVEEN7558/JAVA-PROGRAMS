package String;

import java.util.Objects;

public class String2 {

	private String name;
	private int roll_num;
	private int age;

	public String2(String name, int roll_num, int age) {
		super();
		this.name = name;
		this.roll_num = roll_num;
		this.age = age;
	}

	public String2() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getroll_num() {
		return roll_num;
	}

	public void setroll_num(int roll_num) {
		this.roll_num = roll_num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//   public String toString() {
//	    return "leo";//this.getName()+" "+this.getroll_num()+"  "+this.getAge();
//        }

	public static void main(String[] arg) {
		String s1 = "praveen";
		String s2 = "ab";
		String s3 = "thank you";
		String s4 = "aa";
		String s5 = "prAveEn";
		System.out.println(s1);

		System.out.println(s3);

		System.out.println(s1.equals(s2));

		System.out.println(s1.hashCode());

		System.out.println(s3.charAt(1));

		System.out.println(s3.codePointAt(2));

		System.out.println(s3.codePointBefore(3));

		System.out.println(s3.codePointCount(1, 9));

		System.out.println(s2.compareTo(s4));

		System.out.println(s1.compareToIgnoreCase(s5));

		System.out.println(s3.toUpperCase());
		
		System.out.println(s2.concat(s5));
		System.out.println(s1.contains("a"));

		String2 obj = new String2("praveen", 58, 22);

		System.out.println(obj);
		System.out.println(obj.hashCode());
		// System.out.println(s1);
		char[] charArr = s3.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
	}

	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		String2 other = (String2) obj;
		return age == other.age && Objects.equals(name, other.name) && roll_num == other.roll_num;
	}
}
