package com.xworks.formsexampl.dto;

import lombok.*;

public class CricketFormDto {
    private String teamName;
    private int budget;
    private int noOfPlayers;
    private String sponsers;
    private String homeGround;
    private String owner;
    private String IplSponser;
    private String fanOrNot;
    private int id;


    public CricketFormDto(String teamName, String fanOrNot, String iplSponser, String owner, String homeGround, String sponsers, int noOfPlayers, int budget) {
        this.teamName = teamName;
        this.fanOrNot = fanOrNot;
        this.IplSponser = iplSponser;
        this.owner = owner;
        this.homeGround = homeGround;
        this.sponsers = sponsers;
        this.noOfPlayers = noOfPlayers;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFanOrNot() {
        return fanOrNot;
    }

    public void setFanOrNot(String fanOrNot) {
        this.fanOrNot = fanOrNot;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getSponsers() {
        return sponsers;
    }

    public void setSponsers(String sponsers) {
        this.sponsers = sponsers;
    }

    public String getHomeGround() {
        return homeGround;
    }

    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getIplSponser() {
        return IplSponser;
    }

    public void setIplSponser(String iplSponser) {
        IplSponser = iplSponser;
    }

    @Override
    public String toString() {
        return "CricketFormDto{" +
                "teamName='" + teamName + '\'' +
                ", budget=" + budget +
                ", noOfPlayers=" + noOfPlayers +
                ", sponsers='" + sponsers + '\'' +
                ", homeGround='" + homeGround + '\'' +
                ", owner='" + owner + '\'' +
                ", IplSponser='" + IplSponser + '\'' +
                ", fanOrNot='" + fanOrNot + '\'' +
                ", id=" + id +
                '}';
    }
}
