package Logic;

public class PlayerScore {
	
	private static int _score = 0;
	
	private static int _crashedPlanes = 0;
	
	public static void addScore(int pScore){
		_score += pScore;
	}

	public static int get_score() {
		return _score;
	}

	public static void set_score(int _score) {
		PlayerScore._score = _score;
	}

	public static int get_crashedPlanes() {
		return _crashedPlanes;
	}

	public static void set_crashedPlanes(int _crashedPlanes) {
		PlayerScore._crashedPlanes = _crashedPlanes;
	}
	
	

}
