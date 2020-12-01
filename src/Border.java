import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Border extends JFrame {
	
	Border(){
		
		JPanel pa = new JPanel();
		pa.setLayout(new BorderLayout());
		
		pa.add(new JButton("Nord"), BorderLayout.NORTH);
		pa.add(new JButton("Sud"), BorderLayout.SOUTH);
		pa.add(new JButton("Est"), BorderLayout.EAST);
		pa.add(new JButton("Vest"), BorderLayout.WEST);
		pa.add(new JButton("Centru"), BorderLayout.CENTER);
		
		add(pa);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
}
class Aplicatie {
	public static void main (String[] args) {
		new Border();
	}
}


