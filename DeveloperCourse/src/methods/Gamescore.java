package methods;

public class Gamescore {
	public static void main(String[] args) {
		boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        
        
       String playerName = "Armando";
       int playerScore = 1500;
       int position=calculateHighScorePosition(playerScore);
       displayHighScorePosition(playerName, position);
       
       playerName = "Gabriel";
       playerScore = 900;
       position=calculateHighScorePosition(playerScore);
       displayHighScorePosition(playerName, position);
       
       playerName = "Juan";
       playerScore = 400;
       position=calculateHighScorePosition(playerScore);
       displayHighScorePosition(playerName, position);
       
       playerName = "Rodrigo";
       playerScore = 50;
       position=calculateHighScorePosition(playerScore);
       displayHighScorePosition(playerName, position);
       
	}
	public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
	
	public static void displayHighScorePosition (String playerName, int position) {
		System.out.println(playerName+" managed to get into position "	
				+ position+" on the high score table");
	}
	
	public static int calculateHighScorePosition (int playerScore) {
		int position =4;
		if (playerScore>=1000) {
			position = 1;
		}
		else if(playerScore>=500) {
			position = 2;
		}
		else if(playerScore>=100) {
			position = 3;
		}
		return position;
	}
	
}


