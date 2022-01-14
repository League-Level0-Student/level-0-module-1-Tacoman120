package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
int fail = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog(null, "riddle me this:"
		+ "Brothers and sisters I have none but this man's father is my father's son.\n"
		+ "Who is the man?");
if (riddle.equals("my son")) {
JOptionPane.showMessageDialog(null, "Correct!");
score++;
JOptionPane.showMessageDialog(null, "Your score is... "+score+" right and "+fail+" wrong!");
}else {
	JOptionPane.showMessageDialog(null, "Wrong! "
			+ "Correct Answer:  																							"
			+ "my son");
	fail++;
	JOptionPane.showMessageDialog(null, "Your score is... "+score+" right and "+fail+" wrong!");
}
String riddle2 = JOptionPane.showInputDialog(null, "riddle me this:																"
		+ "What can travel around the world while staying in a corner?");
if(riddle2.equals("a stamp")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
	JOptionPane.showMessageDialog(null, "Your score is... "+score+" right and "+fail+" wrong!");
	}else {	
		JOptionPane.showMessageDialog(null, "Wrong! "
				+ "Correct Answer:  																							"
				+ "a stamp");
		fail++;
		JOptionPane.showMessageDialog(null, "Your score is... "+score+" right and "+fail+" wrong!");
		}
String riddle3 = JOptionPane.showInputDialog(null, "riddle me this: ");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
JOptionPane.showMessageDialog(null, "Your final score is... "+score+" right and "+fail+" wrong!");
	}
}

