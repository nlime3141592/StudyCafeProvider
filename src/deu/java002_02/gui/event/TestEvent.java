package deu.java002_02.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import deu.java002_02.gui.BlacklistModel;

public class TestEvent implements ActionListener
{
	private BlacklistModel m_model;
	
	// TEST: �׽�Ʈ �ʵ� �����Դϴ�.
	private int m_uuid;
	
	public TestEvent(BlacklistModel _model, int _uuid)
	{
		m_model = _model;
		
		m_uuid = _uuid;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
}
