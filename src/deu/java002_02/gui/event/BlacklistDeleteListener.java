package deu.java002_02.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import deu.java002_02.gui.BlacklistModel;

public class BlacklistDeleteListener implements ActionListener
{
	private BlacklistModel m_model;

	public BlacklistDeleteListener(BlacklistModel _model)
	{
		m_model = _model;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showConfirmDialog(null,  "�ش� ������ ������Ʈ���� �����Ͻðڽ��ϱ�?");
	}
}
