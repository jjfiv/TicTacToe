package edu.smith.cs.csc212.p5;

public enum TTTState {
	Player1Turn, // 0
	Player2Turn, // 1
	Tie,         // 2
	Player1Win,  // 3
	Player2Win   // 4
	;
	
	public boolean isPlaying() {
		return this == Player1Turn || this == Player2Turn;
	}
}
