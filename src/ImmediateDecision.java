import java.util.ArrayList;

/**
 * A class that represents the Immediate Decision process:
 * it selects a winner by repeatedly selecting the candidate
 * with the fewest votes and removing them from the election
 * (by using the candidatesWithFewest method from the VotersBallot
 * class) until only one candidate remains
 *
 * Created by alina on 1/27/15.
 */
public class ImmediateDecision {

    private ArrayList<String> candidateList; // represents one candidate list
    private ArrayList<VoterBallots> election; // represents one set of voter ballots

    public ImmediateDecision(ArrayList<String> candidateList, ArrayList<VoterBallots> election) {
        this.candidateList = candidateList;
        this.election = election;
    }

    public String runElection () {




    }
}
