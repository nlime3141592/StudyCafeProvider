package deu.java002_02.gui.sample;

import deu.java002_02.gui.Model;
import deu.java002_02.gui.ModelManager;
import deu.java002_02.gui.View;

// NOTE: �߻� View Ŭ������ ��ӹ޴� ��ü View Ŭ������ final�� �����մϴ�.
public final class SampleView extends View
{
	private SampleModel m_model;

	public SampleView(String _title)
	{
		// NOTE: �������� ������ �����ϰ� ����, ���� �ػ󵵸� �����մϴ�.
		// 600 x 480
		super(_title);

		/*
		 * TODO:
		 * �� ������ ���� GUI ��Ҹ� ������ �� �ֽ��ϴ�.
		 * ������ �� ������ GUI ���� ���� �ڵ带 �����ϰ� �� �����Դϴ�.
		 */

		/* 
		 * NOTE:
		 * �� �����ڿ��� ���� ã���ϴ�. ã�� �� ���ٸ� ���� �Ҵ��մϴ�.
		 * �������� ���� �������� ȣ��Ǿ�� �մϴ�.
		 * �Ʒ� �ڵ� ���Ŀ� �� � �ڵ嵵 �ۼ��ؼ��� �� �˴ϴ�.
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
