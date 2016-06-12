package Logic;

public class Player {
	
	private String _player;
	
	private int _finalScore;
	
	public Player(String pPlayer){
		
		this._player = pPlayer;
	}

	public String get_player() {
		return _player;
	}

	public void set_player(String _player) {
		this._player = _player;
	}

	public int get_finalScore() {
		return _finalScore;
	}

	public void set_finalScore(int _finalScore) {
		this._finalScore = _finalScore;
	}
	
	

}
