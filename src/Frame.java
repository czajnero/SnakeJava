import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame {

	
	public Frame() // wyswietla mi czyste okno
	{
		int WIDTH = 800, HEIGHT = 800;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake");
        frame.setResizable(false);
        frame.pack();
        frame.setLocation(dim.width / 2 - WIDTH/2, dim.height / 2 - HEIGHT/2); // odpalanie po srodku ekranu
        frame.setVisible(true);    
        frame.setSize(WIDTH, HEIGHT);
	}

	public static void main(String[] args)
	{		
		Frame frame = new Frame();		
	}

}
