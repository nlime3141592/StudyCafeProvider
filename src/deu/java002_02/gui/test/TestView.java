package deu.java002_02.gui.test;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import deu.java002_02.gui.Model;
import deu.java002_02.gui.ModelManager;
import deu.java002_02.gui.View;

public class TestView extends View
{
	private TestModel m_model;

	private JLabel m_label;

	public TestView(String _title)
	{
		// 600 x 480
		super(_title);

		super.setLayout(new BorderLayout());

		m_label = new JLabel();
		m_label.setText("test-value: 0");

		super.add(m_label, BorderLayout.CENTER);

		// NOTE: �� �����ڿ��� ���� ã���ϴ�. ã�� �� ���ٸ� ���� �Ҵ��մϴ�.
		String modelClassName = TestModel.class.getName();

		if(!ModelManager.getInstance().hasModel(modelClassName))
			ModelManager.getInstance().addModel(modelClassName, new TestModel());

		m_model = (TestModel)ModelManager.getInstance().getModel(modelClassName);
		m_model.registerView(this);
	}

	@Override
	public Model getModel()
	{
		return m_model;
	}

	public void setTestValue(int _value)
	{
		m_label.setText(String.format("test-value: %d", _value));
	}
}
