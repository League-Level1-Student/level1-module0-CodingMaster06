import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class sensitiveKeyboard implements KeyListener {
public static void main(String[] args) {
	sensitiveKeyboard SB = new sensitiveKeyboard();
	SB.createKL();
	
	
	
	
	
}

private void createKL() {
	JFrame f = new JFrame();
	f.setVisible(true);
	f.addKeyListener(this);
	f.pack();
}		
		@Override
		public void keyTyped(KeyEvent e) {
			
			//speak("ouch");
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			speak("OUCH");
			
		}
	



	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
