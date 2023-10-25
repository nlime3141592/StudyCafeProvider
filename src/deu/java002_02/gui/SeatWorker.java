package deu.java002_02.gui;

public final class SeatWorker extends Worker
{
	private SeatModel m_model;

    public SeatWorker(SeatModel _model)
    {
		super(_model);
		
		m_model = _model;
		new Thread(this).start();
	}
}