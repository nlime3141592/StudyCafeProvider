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
	 * Worker Thread에 의해 매 프레임 호출되는 함수입니다.
	 * 실시간 처리에 이용할 수 있습니다.
	 */
	@Override
	public void onUpdate()
	{
		
	}
}
