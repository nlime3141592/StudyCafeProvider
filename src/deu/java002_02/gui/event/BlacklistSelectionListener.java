package deu.java002_02.gui.event;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import deu.java002_02.gui.BlacklistTable;

public class BlacklistSelectionListener implements ListSelectionListener
{
	private BlacklistTable m_table;
	private int m_selectedRow = -1;

	public BlacklistSelectionListener(BlacklistTable _table)
	{
		m_table = _table;
		m_selectedRow = _table.getSelectedRow();
	}

	@Override
	public void valueChanged(ListSelectionEvent _event)
	{
		if(!_event.getValueIsAdjusting())
		{
			int selectedRow = m_table.getSelectedRow();

			if(m_selectedRow == selectedRow)
			{
				m_table.getSelectionModel().clearSelection();
				m_selectedRow = -1;
			}
			else
			{
				m_selectedRow = selectedRow;
			}
		}
	}
}
