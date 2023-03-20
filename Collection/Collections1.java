package Collection;

public class Collections1 {

	private int roll;
	private int age;
	private int mark;
	private String name;

	/**
	 * @param roll
	 * @param age
	 * @param mark
	 * @param name
	 */
	public Collections1(int roll, int age, int mark, String name) {
		super();
		this.roll = roll;
		this.age = age;
		this.mark = mark;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Collections1 [roll=" + roll + ", age=" + age + ", mark=" + mark + ", name=" + name + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

	}

}
