package vote.model;

import org.springframework.stereotype.Component;

@Component
public class VoteResult {

    private int personOneResult;
    private int personTwoResult;
    private int personThreeResult;
    private int personFourResult;
    private int personFiveResult;

    public void votePersonOne() {
        this.personOneResult++;
    }

    public void votePersonTwo() {
        this.personTwoResult++;
    }

    public void votePersonThree() {
        this.personThreeResult++;
    }

    public void votePersonFour() {
        this.personFourResult++;
    }

    public void votePersonFive() {
        this.personFiveResult++;
    }

    public int getPersonOneResult() {
        return personOneResult;
    }

    public int getPersonTwoResult() {
        return personTwoResult;
    }

    public int getPersonThreeResult() {
        return personThreeResult;
    }

    public int getPersonFourResult() {
        return personFourResult;
    }

    public int getPersonFiveResult() {
        return personFiveResult;
    }
}
