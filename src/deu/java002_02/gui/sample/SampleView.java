package deu.java002_02.gui.sample;

import deu.java002_02.gui.Model;
import deu.java002_02.gui.ModelManager;
import deu.java002_02.gui.View;

// NOTE: 추상 View 클래스를 상속받는 구체 View 클래스는 final로 선언합니다.
public final class SampleView extends View
{
	private SampleModel m_model;

	public SampleView(String _title)
	{
		// NOTE: 프레임의 제목을 설정하고 가로, 세로 해상도를 설정합니다.
		super(_title, 600, 480);

		/*
		 * TODO:
		 * 이 곳에서 각종 GUI 요소를 생성할 수 있습니다.
		 * 앞으로 이 곳에서 GUI 생성 관련 코드를 구현하게 될 예정입니다.
		 */

		/* 
		 * NOTE:
		 * 모델 관리자에서 모델을 찾습니다. 찾을 수 없다면 새로 할당합니다.
		 * 생성자의 가장 마지막에 호출되어야 합니다.
		 * 아래 코드 이후에 그 어떤 코드도 작성해서는 안 됩니다.
		 */
		String modelClassName = SampleModel.class.getName();

		if(!ModelManager.getInstance().hasModel(modelClassName))
			ModelManager.getInstance().addModel(modelClassName, new SampleModel());
		
		m_model = (SampleModel)ModelManager.getInstance().getModel(modelClassName);
	}

	@Override
	public Model getModel()
	{
		return m_model;
	}
}
