import java.awt.*;
import java.awt.event.*;
import java.time.Year;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	ImageIcon crosshair = new ImageIcon("Crosshair.png");
	ImageIcon image = new ImageIcon("C:\\Users\\kevin\\Downloads\\POg.png");
	ImageIcon congrats = new ImageIcon("Congrats.jpg");
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;
	int counter = 0;
	int x = (int) (Math.random()*1000);
	int y = (int) (Math.random()*725);

	
	MyFrame(){
		
		counter = 0;

		label = new JLabel();
		label.setIcon(congrats);
		label.setBounds(200, 0, 1800, 825);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(650, 325, 250, 100); 
		button.addActionListener(this);
		button.setText("Play");
		
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.black);
		button.setBackground(Color.white);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.getContentPane().setBackground(Color.black);
		this.setIconImage(image.getImage());
		this.setBackground(Color.black);
		this.setTitle("Penguin Aim Labs");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1800,825);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	/*public void paint(Graphics g) {

		g.setColor(Color.yellow);
		g.fillOval(x, y, 50, 50);
	}*/
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		if (counter == 20) {
			label.setVisible(true);
			button.setVisible(false);
		} else if (e.getSource()==button) {
			x = (int) (Math.random()*1000);
			y = (int) (Math.random()*725);
			button.setBounds(x,y,50, 50) ; // size minus 2*width and 2*height, that is the x and y
			button.setVisible(true);
			button.setText("");
			//repaint();
			button.setBackground(Color.yellow);
			counter++;

	}
}
	/*public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}*/

}
