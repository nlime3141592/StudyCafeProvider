package deu.java002_02.gui;

import java.time.LocalDateTime;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import deu.java002_02.gui.event.BlacklistSelectionListener;

public class BlacklistTable extends JTable
{
	private BlacklistTableModel m_tableModel;
	private int m_selectedRow = -1;

	public BlacklistTable()
	{
		m_tableModel = new BlacklistTableModel();

		m_tableModel.addColumn("����� ���� ��ȣ");
		m_tableModel.addColumn("�̸�");
		m_tableModel.addColumn("���� �Ͻ�");
		
		m_tableModel.addRow(new String[] { "0", "�Ϻ�", "1945. 8. 15." });
		m_tableModel.addRow(new String[] { "1", "�ƺ�ġ", "2018. 4. 20." });
		
		for(int i = 2; i < 30; ++i)
		{
			String id = String.format("%d", i + 1);
			String name = String.format("name%d", i + 1);
			String day = "2023. 10. 21.";

			m_tableModel.addRow(new String[] { id, name, day });
		}
		
		ListSelectionModel selectionModel = super.getSelectionModel();
		selectionModel.addListSelectionListener(new BlacklistSelectionListener(this));

		super.setModel(m_tableModel);
		super.setEnabled(true);
		super.setRowSelectionAllowed(true);
		super.getTableHeader().setReorderingAllowed(false);
		super.getTableHeader().setResizingAllowed(false);
		super.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		super.setVisible(true);
	}
	
	public void addRow(int _uuid, String _name, LocalDateTime _time)
	{
		String uuidString = getUuidString(_uuid);
		String nameString = getNameString(_name);
		String dateString = getDateString(_time);
		
		m_tableModel.addRow(new String[] { uuidString, nameString, dateString} );
	}
	
	public void removeRow(int _uuid)
	{
		String uuidString = getUuidString(_uuid);

		for(int i = 0; i < m_tableModel.getRowCount(); ++i)
		{
			if(m_tableModel.getValueAt(_uuid, _uuid).equals(uuidString))
			{
				m_tableModel.removeRow(i);
				return;
			}
		}
	}

	private String getUuidString(int _uuid)
	{
		return Integer.toString(_uuid);
	}
	
	private String getNameString(String _name)
	{
		return _name;
	}
	
	private String getDateString(LocalDateTime _time)
	{
		return String.format("%d. %d. %d.", _time.getYear(), _time.getMonth(), _time.getDayOfMonth());
	}
}