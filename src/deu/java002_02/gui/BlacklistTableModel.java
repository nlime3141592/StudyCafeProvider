package deu.java002_02.gui;

import javax.swing.table.DefaultTableModel;

public class BlacklistTableModel extends DefaultTableModel
{
	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean isCellEditable(int row, int column)
	{
		return false;
	}
}