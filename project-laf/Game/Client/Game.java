package Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Game extends JComponent{
	public Game(){
		super();
		Dimension prefSize = new Dimension(180, 270);
		this.setPreferredSize(prefSize);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString("Test", 0, 200);
	}
	public static void main(String[] args){
		JFrame j = new JFrame();
		j.add(new Game());
		j.add(new GameButton("Close", Color.WHITE));
		j.pack();
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
