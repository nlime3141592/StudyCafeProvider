package deu.java002_02.gui.test;

import deu.java002_02.gui.Worker;

public class TestWorker extends Worker
{
	private TestModel m_model;

	public TestWorker(TestModel _model)
	{
		super(_model);

		m_model = _model;
		new Thread(this).start();
	}

	@Override
	public void onUpdate()
	{
		m_model.increaseTestValue();
	}
}
