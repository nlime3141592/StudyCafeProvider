package deu.java002_02.main;

import deu.java002_02.gui.test.TestView;

public class Main
{
	public static void main(String[] args)
	{
		testViewMain();
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
