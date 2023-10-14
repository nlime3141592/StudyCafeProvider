package deu.java002_02.gui.test;

import java.util.Iterator;

import deu.java002_02.gui.Model;
import deu.java002_02.gui.View;

public class TestModel extends Model
{
	private TestWorker m_worker;

	private int m_testValue = 0;

	public TestModel()
	{
		m_worker = new TestWorker(this);

		this.setTestValue(m_testValue);
	}

	public void increaseTestValue()
	{
		++m_testValue;
		
		Iterator<View> iterator = super.getViewIterator();
		
		while(iterator.hasNext())
		{
			TestView view = (TestView)iterator.next();
			view.setTestValue(m_testValue);
		}
	}

	public void setTestValue(int _value)
	{
		m_testValue = _value;

		Iterator<View> iterator = super.getViewIterator();
		
		while(iterator.hasNext())
		{
			TestView view = (TestView)iterator.next();
			view.setTestValue(m_testValue);
		}
	}
}