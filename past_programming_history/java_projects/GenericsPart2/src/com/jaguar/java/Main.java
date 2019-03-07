package com.jaguar.java;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        FootBallPlayer eli = new FootBallPlayer("Joe");
        BaseBallPlayer luke = new BaseBallPlayer("Luke");
        SoccerPlayer joejoe = new SoccerPlayer("Joejoe");


        Team<FootBallPlayer> FootBallTeamm = new Team<>("Footer");
        FootBallTeamm.addPlayer(eli);
        FootBallTeamm.matchResults(FootBallTeamm, 1, 2);
        System.out.println(FootBallTeamm.numPlayers());
        System.out.println("Rankings");
        System.out.println(FootBallTeamm.getName() + ": " + FootBallTeamm.ranking());

        Team<BaseBallPlayer> BaseBallTeam = new Team<>("Baller");
        BaseBallTeam.addPlayer(luke);
        BaseBallTeam.matchResults(BaseBallTeam, 1, 2);
        System.out.println(BaseBallTeam.numPlayers());
        System.out.println("Rankings");
        System.out.println(BaseBallTeam.getName() + ": " + BaseBallTeam.ranking());

        Team<BaseBallPlayer> BallerClub = new Team<>("SecondBaller");
        BallerClub.addPlayer(luke);
        BallerClub.matchResults(BallerClub, 1, 2);
        System.out.println(BallerClub.numPlayers());
        System.out.println("Rankings");
        System.out.println(BallerClub.getName() + ": " + BallerClub.ranking());

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccers");
        soccerTeam.addPlayer(joejoe);
        soccerTeam.matchResults(soccerTeam, 1, 2);
        System.out.println(soccerTeam.numPlayers());
        System.out.println("Rankings");
        System.out.println(soccerTeam.getName() + ": " + soccerTeam.ranking());

        System.out.println(BallerClub.compareTo(BaseBallTeam));
    }
}
