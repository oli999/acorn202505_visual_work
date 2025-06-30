package test.main;

import test.mypac.MyUtill;
import test.mypac.WowException;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 됐습니다.");
		try {
			MyUtill.generate();	
		} catch(WowException we) {
			System.out.println("오잉 WowException 이 발생했네요?");
			System.out.println("예외 메세지:"+we.getMessage());
		}
		
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
