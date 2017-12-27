package edu.bracketly.frontend.dto;


import java.util.List;

public class RoundDto {
    private int number;
    private List<MatchDto> matches;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<MatchDto> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchDto> matches) {
        this.matches = matches;
    }
}