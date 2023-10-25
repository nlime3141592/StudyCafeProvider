package deu.java002_02.gui;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalTime;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimetableRow extends JPanel
{
	private static final long serialVersionUID = 1L;

	private final static String FONT_TYPE = "¸¼Àº °íµñ";
	private final static int FONT_SIZE = 14;

	private final static Integer[] HOURS = {
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
		10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
		20, 21, 22, 23
	};

	private final static Integer[] MINUTES = {
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
		10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
		20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
		30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
		40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
		50, 51, 52, 53, 54, 55, 56, 57, 58, 59
	};

	private Font m_font;
	
	private JLabel m_dayLabel;
	private JLabel m_waveLabel;
	private JPanel m_separator;
	private JComboBox<Integer> m_begHH;
	private JComboBox<Integer> m_begMM;
	private JComboBox<Integer> m_endHH;
	private JComboBox<Integer> m_endMM;
	private JCheckBox m_checkBox;

	public TimetableRow(String _day)
	{
		super.setLayout(null);
		super.setSize(640, 50);

		m_font = new Font(FONT_TYPE, Font.BOLD, FONT_SIZE);

		m_dayLabel = new JLabel(_day);
		m_dayLabel.setSize(40, 50);
		m_dayLabel.setLocation(20, 0);
		m_dayLabel.setFont(m_font);

		m_waveLabel = new JLabel("~");
		m_waveLabel.setSize(20, 50);
		m_waveLabel.setFont(m_font);
		
		m_separator = new JPanel();
		m_separator.setSize(640, 1);
		m_separator.setLocation(0, 49);
		m_separator.setBackground(Color.LIGHT_GRAY);
		
		m_checkBox = new JCheckBox();
		m_checkBox.setSize(20, 20);
		m_checkBox.setLocation(570, 15);

		m_begHH = getTimeBox(HOURS);
		m_begMM = getTimeBox(MINUTES);
		m_endHH = getTimeBox(HOURS);
		m_endMM = getTimeBox(MINUTES);

		m_waveLabel.setLocation(210, 0);
		
		m_begHH.setLocation(90, 15);
		m_begMM.setLocation(150, 15);
		m_endHH.setLocation(230, 15);
		m_endMM.setLocation(290, 15);
		
		super.add(m_dayLabel);
		super.add(m_waveLabel);
		super.add(m_separator);
		super.add(m_begHH);
		super.add(m_begMM);
		super.add(m_endHH);
		super.add(m_endMM);
		super.add(m_checkBox);
	}

	public void setRun(boolean _isRun)
	{
		m_checkBox.setSelected(_isRun);
	}

	public void setOpentime(LocalTime _time)
	{
		m_begHH.setSelectedIndex(_time.getHour());
		m_begMM.setSelectedIndex(_time.getMinute());
	}

	public void setClosetime(LocalTime _time)
	{
		m_endHH.setSelectedIndex(_time.getHour());
		m_endMM.setSelectedIndex(_time.getMinute());
	}

	private JComboBox<Integer> getTimeBox(Integer[] _elements)
	{
		JComboBox<Integer> box = new JComboBox<Integer>(_elements);
		
		box.setSize(55, 20);
		box.setEditable(false);
		box.setSelectedIndex(0);
		
		return box;
	}
}
