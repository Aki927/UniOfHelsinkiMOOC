/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akirucorpuz
 */
public class Team {
    private String homeTeam, visitorTeam;
    private int homeScore, visitorScore, games, wins, losses;

    public Team(String homeTeam, String visitorTeam, int homeScore, int visitorScore) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.homeScore = homeScore;
        this.visitorScore = visitorScore;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitorTeam() {
        return this.visitorTeam;
    }
    
    public int getHomeScore() {
        return this.homeScore;
    }
    
    public int getVisitorScore() {
        return this.visitorScore;
    }
    
    public int playGame() {
        return this.games += 1;
    }
    
    public int setWins() {
        return this.wins += 1;
    }
    
    public int setLosses() {
        return this.losses += 1;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
    
}
