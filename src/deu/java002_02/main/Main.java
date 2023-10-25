package deu.java002_02.main;

import java.time.LocalTime;

import deu.java002_02.data.Day;
import deu.java002_02.gui.BlacklistView;
import deu.java002_02.gui.TimetableModel;
import deu.java002_02.gui.TimetableView;
import deu.java002_02.gui.test.TestView;

public class Main
{
	public static void main(String[] args)
	{
		// testViewMain();
		// TimetableView view = new TimetableView("독서실 운영 시간 설정");
		BlacklistView view = new BlacklistView("블랙리스트 추가/삭제");

		// new MyTestFrame();
	}

	private static void testViewMain()
	{
		int count = 5; // View를 5개 생성
		int ms = 5000; // 5000ms = 5초

		for(int i = 0; i < count; ++i)
		{
			try
			{
				new TestView(String.format("View #%d", i + 1));
				Thread.sleep(ms);
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
