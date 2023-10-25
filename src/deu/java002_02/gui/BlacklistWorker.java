package deu.java002_02.gui;

public class BlacklistWorker extends Worker
{
	private BlacklistModel m_model;
	
	public BlacklistWorker(BlacklistModel _model)
	{
		super(_model);
		
		m_model = _model;
		new Thread(this).start();
	}
	
}