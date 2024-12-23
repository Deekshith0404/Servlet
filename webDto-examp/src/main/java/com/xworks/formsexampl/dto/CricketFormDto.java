package com.xworks.formsexampl.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
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
