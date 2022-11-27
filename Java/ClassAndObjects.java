package ClassAndObjects;

public class CricketScorer {
	
	private int score;

	
	public void four() {
		score = score + 4;
	}

	public void six() {
		score = score + 6;
	}

	public int getScore() {
		return score;
	}

	public static void main(String[] args) {
		CricketScorer scorer = new CricketScorer();
		scorer.six();
		// State of scorer is (score => 6)
		scorer.four();
		// State of scorer is (score => 10)
		System.out.println(scorer.getScore());
	}
}
