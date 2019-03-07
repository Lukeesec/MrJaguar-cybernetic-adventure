package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Player> teams;
        // Collections.sort(teams);

        LeagueTable<Team<FootBallPlayer>> footBallLeague = new LeagueTable<>("AFL");
        Team<FootBallPlayer> cooks = new Team<>("cooks");
        Team<FootBallPlayer> loops = new Team<>("loops");
        Team<FootBallPlayer> hoops = new Team<>("hoops");
        Team<FootBallPlayer> clocks = new Team<>("clocks");
        Team<BaseBallPlayer> baller = new Team<>("baller");

        cooks.matchResults(loops, 1,5);
        hoops.matchResults(clocks, 2,6);
        clocks.matchResults(loops, 4,0);

        footBallLeague.add(cooks);
        footBallLeague.add(loops);
        footBallLeague.add(hoops);
        footBallLeague.add(clocks);

    //    footBallLeague.add(baller);
        footBallLeague.showLeagueTable();





    }
}
// Generic class would be the teams class i think
// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.