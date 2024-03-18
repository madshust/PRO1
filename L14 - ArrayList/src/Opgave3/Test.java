package Opgave3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Team t1 = new Team("A-team");

        t1.addPlayer(new Player("Mads", 29));
        t1.addPlayer(new Player("Victor",23));
        t1.addPlayer(new Player("Jeppe",21));
        t1.addPlayer(new Player("Malthe",21));
        t1.addPlayer(new Player("Kobe",39));

        t1.getPlayers().get(0).setScore(28);
        t1.getPlayers().get(1).setScore(15);
        t1.getPlayers().get(2).setScore(0);
        t1.getPlayers().get(3).setScore(26);
        t1.getPlayers().get(4).setScore(28);

        t1.printPlayers();
        System.out.println("t1.calcAverageAge() = " + t1.calcAverageAge());
        System.out.println("t1.calcTotalScore() = " + t1.calcTotalScore());
        System.out.println("t1.calcOldPlayersScore(22) = " + t1.calcOldPlayersScore(22));
        System.out.println("t1.maxScore() = " + t1.maxScore());
        System.out.println("t1.bestPlayerNames() = " + t1.bestPlayerNames());


    }
}
