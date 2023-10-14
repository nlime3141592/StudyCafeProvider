package deu.java002_02.gui.sample;

import deu.java002_02.gui.Model;

public class SampleModel extends Model
{
	private SampleWorker m_worker;

	public SampleModel()
	{
		m_worker = new SampleWorker(this);
	}
}