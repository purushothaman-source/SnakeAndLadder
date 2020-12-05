package com.program.snakeandladder;

import java.util.Random;

class SnakeAndLadderGame{
	Random random =new Random();
	public static int game() {
		int playerA=0;
		while(playerA>=0 && playerA<100) {
			Random random =new Random();
			int rollDie=random.nextInt(7);
			playerA=rollDie+playerA;
			if(playerA==10)
				playerA=playerA+10;
			if(playerA==17)
				playerA=playerA+12;
			if(playerA==64)
				playerA=playerA+10;
			if(playerA==18)
				playerA=playerA-10;
			if(playerA==28)
				playerA=playerA-12;
			if(playerA==87)
				playerA=playerA-33;
		}
		return playerA;
	}
}

public class SnakeAndLadder {

	public static void main(String[] args) {
		
             System.out.print( SnakeAndLadderGame.game());
	}

}
