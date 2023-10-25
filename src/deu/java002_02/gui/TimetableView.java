package deu.java002_02.gui;

import java.time.LocalTime;

import javax.swing.JFrame;

import deu.java002_02.data.Day;

public class TimetableView extends View
{
	private static final long serialVersionUID = 1L;

	private final static int resolutionX = 640;
	private final static int resolutionY = 480;
	
	private final static String[] DAY_STRINGS = { "월", "화", "수", "목", "금", "토", "일" };

	private TimetableModel m_model;
	
	private TimetableHeader m_header;
	private TimetableTrailer m_trailer;
	private TimetableRow[] m_timeRows = new TimetableRow[7];

	public TimetableView(String _title)
	{
		super(_title);

		m_header = new TimetableHeader();
		m_trailer = new TimetableTrailer();

		for(int i = 0; i < 7; ++i)
		{
			m_timeRows[i] = new TimetableRow(DAY_STRINGS[i]);
			m_timeRows[i].setLocation(0, 60 + 50 * i);
			super.add(m_timeRows[i]);
		}

		super.add(m_header);
		super.add(m_trailer);

		String modelClassName = TimetableModel.class.getName();

		if(!ModelManager.getInstance().hasModel(modelClassName))
			ModelManager.getInstance().addModel(modelClassName, new TimetableModel());
		
		m_model = (TimetableModel)ModelManager.getInstance().getModel(modelClassName);
		m_model.registerView(this);

		super.openView(resolutionX, resolutionY);
	}

	@Override
	public Model getModel()
	{
		return m_model;
	}

	public void setRun(Day _day, boolean _isRun)
	{
		m_timeRows[_day.getValue()].setRun(_isRun);
	}

	public void setOpentime(Day _day, LocalTime _time)
	{
		m_timeRows[_day.getValue()].setOpentime(_time);
	}
	
	public void setClosetime(Day _day, LocalTime _time)
	{
		m_timeRows[_day.getValue()].setClosetime(_time);
	}
}