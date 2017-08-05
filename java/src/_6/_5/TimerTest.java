package _6._5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;


public class TimerTest {
	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(1000, listener);
		t.start();
		String a = "";
	}
}

class TimePrinter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("The time is " + new Date());
	}
	
}
