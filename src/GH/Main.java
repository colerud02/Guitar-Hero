package GH;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main implements ActionListener {
	// objects
	JFrame jf = new JFrame("Controls: Green=a, Red=s, Yellow=d, Blue=f, Strum = Space");
	JPanel jp = new JPanel();
	JButton jb = new JButton("Start");

	public static void main(String[] args) throws IOException {
		Main m = new Main();
	}

	public Main() throws IOException {
		jf.add(jp);
		jp.add(jb);
		jf.setVisible(true);
		
		jb.addActionListener(this);
		
		Image image = ImageIO.read(getClass().getResource("gh3.lor.07.lg.jpg"));
		JLabel label = new JLabel(new ImageIcon(image));
		jp.add(label);
		jf.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "I hope you are good at figuring out video games.");

	}
}
