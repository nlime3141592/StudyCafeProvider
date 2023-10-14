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
		super(_title, 600, 480);

		super.setLayout(new BorderLayout());

		m_label = new JLabel();
		m_label.setText("test-value: 0");

		super.add(m_label, BorderLayout.CENTER);

		// NOTE: 모델 관리자에서 모델을 찾습니다. 찾을 수 없다면 새로 할당합니다.
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
