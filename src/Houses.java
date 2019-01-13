import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	 static Robot r = new Robot();
	 
	 
public static void main(String[] args) {
	Random number = new Random();
	r.setPenWidth(10);
	r.setSpeed(30);
	r.setX(50);
	r.setY(500);
	int size = 0;
	for (int i = 0; i < 10; i++) {
		int rand = number.nextInt(3);
	System.out.println(rand);
	if (rand == 0) {
		size = 60;
	} else if (rand == 1) {
		size = 120;
	} else if (rand == 2) {
		size = 250;
	} else size = 60;
	if (size == 60) {
		drawPointyHouse(size, Color.GREEN);
	} else if (size == 120) {
		drawPointyHouse(size, Color.GREEN);
	} else if (size == 250) {
		drawFlatHouse(size, Color.RED);
	}

}
}	
static void drawFlatHouse(int size, Color c) {
	r.setPenColor(Color.RED);
	r.penDown();
	r.move(size);
	r.turn(90);
	r.move(30);
	r.turn(90);
	r.move(size);
	r.turn(-90);
	r.setPenColor(0, 150, 0);
	r.move(30);
	r.turn(-90);
	r.setPenColor(Color.RED);
}
static void drawPointyHouse(int size, Color C) {
	r.setPenColor(Color.GREEN);
	r.penDown();
	r.move(size);
	r.turn(45);
	r.move(30);
	r.turn(90);
	r.move(30);
	r.turn(45);
	r.move(size);
	r.turn(-90);
	r.setPenColor(0, 150, 0);
	r.move(30);
	r.turn(-90);
	r.setPenColor(Color.GREEN);
}
}


