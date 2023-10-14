package deu.java002_02.gui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public abstract class View extends JFrame implements WindowListener
{
	public View(String _title, int _width, int _height)
	{
		super.setTitle(_title);
		super.setSize(_width, _height);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.addWindowListener(this);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) { }

	// NOTE: Frame Ÿ��Ʋ ���� X ��ư�� ������ �� �Լ��� ����˴ϴ�.
	@Override
	public void windowClosing(WindowEvent e) { }

	// NOTE: Window.dispose() �Լ��� ȣ��Ǹ� �� �Լ��� ����˴ϴ�.
	@Override
	public void windowClosed(WindowEvent e)
	{
		// NOTE: ���� ī���͸� ���ҽ�Ű�� ���� ����
		Model model = this.getModel();

		if(model != null)
			model.unregisterView(this);
	}

	@Override
	public void windowIconified(WindowEvent e) { }

	@Override
	public void windowDeiconified(WindowEvent e) { }

	@Override
	public void windowActivated(WindowEvent e) { }

	@Override
	public void windowDeactivated(WindowEvent e) { }

	public abstract Model getModel();
}
