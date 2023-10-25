package deu.java002_02.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimetableHeader extends JPanel
{
	private final static String FONT_TYPE = "맑은 고딕";
	private final static int FONT_SIZE = 14;
	
	private Font m_font;

	private JLabel m_dayLabel;
	private JLabel m_timeLabel;
	private JLabel m_enableLabel;
	private JPanel m_separatorBlack;
	private JPanel m_separatorGray;

	public TimetableHeader()
	{
		super.setLayout(null);
		super.setLocation(0, 0);
		super.setSize(640, 60);
		
		m_font = new Font(FONT_TYPE, Font.BOLD, FONT_SIZE);
		
		m_dayLabel = getDayLabel(m_font);
		m_timeLabel = getTimeLabel(m_font);
		m_enableLabel = getEnableLabel(m_font);
		m_separatorBlack = getSeparatorBlack();
		m_separatorGray = getSeparatorGray();
		
		super.add(m_dayLabel);
		super.add(m_timeLabel);
		super.add(m_enableLabel);
		super.add(m_separatorBlack);
		super.add(m_separatorGray);
	}

	private JLabel getDayLabel(Font _font)
	{
		JLabel label = new JLabel();
		label.setText("요일");
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setSize(40, 60);
		label.setLocation(20, 0);
		label.setFont(_font);
		return label;
	}
	
	private JLabel getTimeLabel(Font _font)
	{
		JLabel label = new JLabel();
		label.setText("운영 시간");
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setSize(150, 60);
		label.setLocation(90, 0);
		label.setFont(_font);
		return label;
	}
	
	private JLabel getEnableLabel(Font _font)
	{
		JLabel label = new JLabel();
		label.setText("운영 유무");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(120, 60);
		label.setLocation(520, 0);
		label.setFont(_font);
		return label;
	}
	
	private JPanel getSeparatorBlack()
	{
		JPanel panel = new JPanel();
		panel.setSize(640, 3);
		panel.setLocation(0, 0);
		panel.setBackground(Color.BLACK);
		return panel;
	}

	private JPanel getSeparatorGray()
	{
		JPanel panel = new JPanel();
		panel.setSize(640, 1);
		panel.setLocation(0, 59);
		panel.setBackground(Color.GRAY);
		return panel;
	}
}
