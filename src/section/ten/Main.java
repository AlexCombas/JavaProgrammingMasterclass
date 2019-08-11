package section.ten;
public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<> ("Melbourne");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);

        adelaideCrows.matchResult(melbourne, 1, 0);
        melbourne.matchResult(adelaideCrows, 2, 2);
        adelaideCrows.matchResult(melbourne, 0, 2);
        melbourne.matchResult(adelaideCrows, 0, 3);


        footballLeague.showLeagueTable();
    }
}