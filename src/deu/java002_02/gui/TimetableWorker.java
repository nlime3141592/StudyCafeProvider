package deu.java002_02.gui;

public class TimetableWorker extends Worker
{
	private TimetableModel m_model;

	public TimetableWorker(TimetableModel _model)
	{
		super(_model);

		m_model = _model;
		new Thread(this).start();
	}

}