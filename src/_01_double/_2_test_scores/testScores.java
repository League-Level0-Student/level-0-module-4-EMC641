package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	
	String testScoresString =JOptionPane.showInputDialog("What did you get on your test?");
	int testScore = Integer.parseInt(testScoresString);  

	if(testScore>79) {
		JOptionPane.showMessageDialog(null, "Good Job, you studied hard");

		}

	else if(testScore<80) {
		JOptionPane.showMessageDialog(null, "study harder next time");

		
	}
	
	
	
	
	
}
}
