package gameLevel;

public class BeginnerLevel extends PlayerLevel{
	public void run() {
		System.out.println("천천히 달립니다");
	}
	public void jump() {
		System.out.println("Jump할줄 모릅니다");
	}
	public void turn() {
		System.out.println("turn할줄 모릅니다");
	}
	public void showLevelMessage() {
		System.out.println("***초보자 레벨입니다***");
	}

}
