package ClassWork;

public class FinalKeyword {
	final int speedlimit;// blank final variable

	FinalKeyword() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		new FinalKeyword();
	}
}

