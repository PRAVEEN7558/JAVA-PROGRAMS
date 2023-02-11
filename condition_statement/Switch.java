package condition_statement;

public class Switch {
	public void animal(char A) {
		switch (A) {
		case 'A':
			System.out.println("cat");
			break;
		case 'B':
			System.out.println("lion");
			break;
		case 'C':
			System.out.println("dog");
			break;
		case 'D':
			System.out.println("tiger");
			break;
		}
	}

	public static void main(String[] args) {
		Switch obj = new Switch();
		obj.animal('D');
	}

}
