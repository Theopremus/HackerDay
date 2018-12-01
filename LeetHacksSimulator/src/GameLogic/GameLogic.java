package GameLogic;

import java.util.LinkedList;

public class GameLogic {
	LinkedList<Event> setList;
	public GameLogic()
	{
      setList = EventData.setList;
	}
	
	public void RandomMessage(String[] message, int bound)
	{
		int eventNum = (int)(Math.round(Math.random() * bound));
		System.out.println(message[eventNum]);
	}
	
	public int CalcScore(int[][] userData)
    {
        int score;
        double sum = 0;
        double average;
        double variance;
        double stdDeviation;

        for (int i = 0; i < 95; i++)
        {
            sum += userData[1][i];
        }

        score = (int)sum;
        average = (double)sum / 95;

        for (int i = 0; i < 95; i++)
        {
            sum += Math.pow(average - userData[1][i], 2);
        }

        variance = (double)sum / 95;

        stdDeviation = Math.sqrt(variance);

        return (int)Math.round((1000 * score) / stdDeviation);
    }

    public void RandomEvent(Player player)
    {
        int eventNum = (int)(Math.floor(Math.random() * setList.size()));

        setList.get(eventNum).Draw();
        
        player.score += setList.get(eventNum).ScoreBonus("");
        //TODO

    }
    
}
