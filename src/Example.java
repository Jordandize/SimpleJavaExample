import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
	
	/*private field*/
	private int score;
	
	public Example() {
		/*It is mean that object doesn't init yet*/
		score = 0;
	}
	
	public Example(int scoreAmount) {
		score = scoreAmount;
	}
	
	public void addScore(int scoreAmount) {
		score += scoreAmount;
	}
	
	public void doubleScore() {
		score *= score;
	}
	
	public void resetScore() {
		score = 0;
	}
	
	/*Write information about this object in file Example.txt*/
	public void saveAsFile() {
		try {
			BufferedWriter wr = new BufferedWriter(new FileWriter("Example.txt"));
			wr.write(toString());
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*Getter and Setter*/
	public void setScore(int newScore) {
		score = newScore;
	}
	
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return "Example with score: " + score;
	}

	/*Test*/
	public static void main(String[] args) {
		Example ex = new Example();
		ex.addScore(20);
		ex.doubleScore();
		System.out.println(ex.toString());
	}

}
