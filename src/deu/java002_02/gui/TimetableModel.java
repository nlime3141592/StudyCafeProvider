package deu.java002_02.gui;

import java.time.LocalTime;
import java.util.Iterator;

import deu.java002_02.data.Day;

public class TimetableModel extends Model
{
	@Deprecated
	private TimetableWorker m_worker;

	private boolean[] runBool = new boolean[7]; // 운영유무 배열
	private LocalTime[] runTime = new LocalTime[14]; // 운영시간 배열

	public boolean isRun(Day _day)
	{
		return runBool[_day.getValue()];
	}

	public void setRun(Day _day, boolean _isRun)
	{
		runBool[_day.getValue()] = _isRun;
		
		Iterator<View> iterator = super.getViewIterator();

		while(iterator.hasNext())
		{
			TimetableView view = (TimetableView)iterator.next();
			view.setRun(_day, _isRun);
		}
	}

	public void setOpentime(Day _day, LocalTime _time)
	{
		runTime[2 * _day.getValue()] = _time;
		
		Iterator<View> iterator = super.getViewIterator();

		while(iterator.hasNext())
		{
			TimetableView view = (TimetableView)iterator.next();
			view.setOpentime(_day, runTime[2 * _day.getValue()]);
		}
	}

	public void setClosetime(Day _day, LocalTime _time)
	{
		runTime[1 + 2 * _day.getValue()] = _time;

		Iterator<View> iterator = super.getViewIterator();

		while(iterator.hasNext())
		{
			TimetableView view = (TimetableView)iterator.next();
			view.setClosetime(_day, runTime[1 + 2 * _day.getValue()]);
		}
	}

	public LocalTime getOpentime(Day _day)
	{
		return runTime[2 * _day.getValue()];
	}

	public LocalTime getClosetime(Day _day)
	{
		return runTime[1 + 2 * _day.getValue()];
	}

	public TimetableModel()
	{
		m_worker = new TimetableWorker(this);
	}
}