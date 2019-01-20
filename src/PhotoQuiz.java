/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String mob = "https://www.kzone.com.au/images/default-source/games/mobie-hostile-zombie.jpg?sfvrsn=3";
                Component box =  createImage(mob);
		// 3. use the "createImage()" method below to initialize your Component
                
		// 4. add the image to the quiz window
               quizWindow.add(box);
		// 5. call the pack() method on the quiz window
               quizWindow.pack();
		// 6. ask a question that relates to the image
            String questionOne =  JOptionPane.showInputDialog("What is this?");
		// 7. print "CORRECT" if the user gave the right answer
               if (questionOne.equals("zombie")) {
            	   JOptionPane.showMessageDialog(null, "CORRECT");
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
               quizWindow.remove(box);
		// 10. find another image and create it (might take more than one line of code)
               String other = "https://i.pinimg.com/236x/22/66/2e/22662e8c5b154752aac02601ea178fb6--minecraft-mobs-minecraft-stuff.jpg";
               Component boxTwo =  createImage(other);
		// 11. add the second image to the quiz window
               quizWindow.add(boxTwo);
		// 12. pack the quiz window
               quizWindow.pack();
		// 13. ask another question
               String questionTwo =  JOptionPane.showInputDialog("What is this?");
		// 14+ check answer, say if correct or incorrect, etc.
               if (questionTwo.equals("blaze")) {
            	   JOptionPane.showMessageDialog(null, "CORRECT");
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





