package imptest;

import java.awt.Color;

import javax.swing.JButton;

public interface JbuttonTest {
	class btn extends JButton{
		public btn() {
			// TODO Auto-generated constructor stub
			setSize(100, 60);
			setBackground(Color.white);
			setText("按钮");
			setVisible(true);
		}
	}
}
