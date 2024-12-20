package com.xworks.formsexampl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CricketFormDto {
    private String teamName;
    private int budget;
    private int noOfPlayers;
    private String sponsers;
    private String homeGround;
    private String owner;
    private String IplSponser;
    private String fanOrNot;
}
