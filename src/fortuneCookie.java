import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class fortuneCookie implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;

	public void showButton() {
		System.out.println("Button clicked");
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	public static void main(String[] args) {
		fortuneCookie fc = new fortuneCookie();
		fc.showButton();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
	      if (rand == 0) {
	    	  	JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camouflage");
	      } else if (rand == 1) {
	    	  	JOptionPane.showMessageDialog(null, "A person of words and not deeds is like a garden full of weeds");
	      }else if (rand == 2) {
	    	  	JOptionPane.showMessageDialog(null, "A golden egg of opportunity falls into your lap this month");
	      }else if (rand == 3) {
	    	  	JOptionPane.showMessageDialog(null, "A lifetime of happiness lies ahead of you");
	}else if (rand == 4) {
	  	JOptionPane.showMessageDialog(null, "A small donation is call for. It’s the right thing to do");
}else if (rand == 5) {
  	JOptionPane.showMessageDialog(null, "Courtesy is contagious");
	      
	}
	}
}
