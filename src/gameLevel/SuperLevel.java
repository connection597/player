package gameLevel;

public class SuperLevel extends PlayerLevel{
	public void run() {
		System.out.println("엄청 빨리 달립니다");
	}
	public void jump() {
		System.out.println("아주 높이 jump합니다");
	}
	public void turn() {
		System.out.println("한바퀴 돕니다");
	}
	public void showLevelMessage() {
		System.out.println("****고급자 레벨 입니다****");
	}
	
}