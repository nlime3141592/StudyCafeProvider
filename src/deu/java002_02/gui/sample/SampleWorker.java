package deu.java002_02.gui.sample;

import deu.java002_02.gui.Worker;

public class SampleWorker extends Worker
{
	private SampleModel m_model;

	public SampleWorker(SampleModel _model)
	{
		super(_model);

		m_model = _model;
		new Thread(this).start();
	}

	/*
	 * NOTE:
	 * Worker Thread�� ���� �� ������ ȣ��Ǵ� �Լ��Դϴ�.
	 * �ǽð� ó���� �̿��� �� �ֽ��ϴ�.
	 */
	@Override
	public void onUpdate()
	{
		
	}
}
