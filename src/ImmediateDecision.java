import java.util.ArrayList;

/**
 * A class that represents the Immediate Decision process:
 * it selects a winner by repeatedly selecting the candidate
 * with the fewest votes and removing them from the election
 * (by using the candidatesWithFewest method from the VotersBallot
 * class) until only one candidate remains
 * <p/>
 * I affirm that this program is entirely my own work and none of it is the work of any other person.
 * Created by Alina Lebron on 1/27/15.
 */

public class ImmediateDecision {

    private ArrayList<String> candidateList; // represents one candidate list
    private VoterBallots election; // represents one set of voter ballots

    /**
     * Constructs an Immediate Decision object
     */

    public ImmediateDecision() {
        this.candidateList = new ArrayList<String>();
        this.election = new VoterBallots();

    }
}

