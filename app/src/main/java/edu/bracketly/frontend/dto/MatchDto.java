package edu.bracketly.frontend.dto;

import java.io.Serializable;
import java.util.List;

import edu.bracketly.frontend.consts.MATCH_STATUS;


public class MatchDto implements Serializable {
    private Long id;
    private String tag;
    private List<SeatDto> seats;
    private MATCH_STATUS matchStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<SeatDto> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatDto> seats) {
        this.seats = seats;
    }

    public MATCH_STATUS getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(MATCH_STATUS matchStatus) {
        this.matchStatus = matchStatus;
    }
}
