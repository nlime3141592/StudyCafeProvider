package deu.java002_02.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import deu.java002_02.data.Blacklist;
import deu.java002_02.gui.event.BlacklistDeleteListener;

public class BlacklistView extends View {
	static final int resolutionX = 640;
	static final int resolutionY = 480;
	
	private BlacklistModel m_model;
	private BlacklistTable m_table;
	
	private JPanel m_buttonPanel;
	private JButton m_deleteButton;
	private JButton m_addButton;

	public BlacklistView(String _title) 
	{
		super(_title);

		// TEST: 테스트 코드입니다. 블랙리스트 구현이 끝나면 지웁니다.
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m_table = new BlacklistTable();

		m_buttonPanel = new JPanel();
		m_deleteButton = new JButton("삭제");
		m_addButton = new JButton("추가");

		m_buttonPanel.setLayout(new GridLayout(1, 2));
		m_buttonPanel.add(m_deleteButton);
		m_buttonPanel.add(m_addButton);
		
		// m_deleteButton.setEnabled(false);
		m_deleteButton.addActionListener(new BlacklistDeleteListener(m_model));
		
		super.setLayout(new BorderLayout());
		super.add(new JScrollPane(m_table), BorderLayout.CENTER);
		super.add(m_buttonPanel, BorderLayout.SOUTH);

		String modelClassName = BlacklistModel.class.getName();

		if(!ModelManager.getInstance().hasModel(modelClassName))
			ModelManager.getInstance().addModel(modelClassName, new BlacklistModel());

		m_model = (BlacklistModel)ModelManager.getInstance().getModel(modelClassName);
		m_model.registerView(this);

		super.openView(resolutionX, resolutionY);
	}

	public void addBlacklist(Blacklist blacklist) {}
	public void removeBlacklist(Blacklist blacklist) {}

	@Override
	public Model getModel() {
		return null;
	}
}