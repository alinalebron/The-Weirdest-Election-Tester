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
     * Constructs an immediate decision object
     *
     * @param candidateList the list of candidates
     * @param election the set of voter ballots (a VoterBallots object)
     */

    public ImmediateDecision(ArrayList<String> candidateList, VoterBallots election)
    {
        this.candidateList = candidateList;

        this.election = election;
    }

    /**
     * A method that selects a winner or gets an indecisive result
     *
     * @return who has won the election
     */

    public String electWinner()
    {
        ArrayList<String> winnerList = candidateList;

        while (winnerList.size() > 1) // as long as the winnerList contains more than 1 person
        {
            if (election.candidatesWithFewest(winnerList).size() > 1) // the election list is still greater than 1
            {
                if (winnerList.size() == election.candidatesWithFewest(winnerList).size()) // & winners/losers exist
                {
                    break; // breaks so that losers can be removed from the election
                }
            }

            for (String s : election.candidatesWithFewest(winnerList)) // look through to see who has the least votes
            {
//                System.out.println(s + " was removed from the election!"); // output for debugging

                winnerList.remove(s); // remove them from the election
            }
        }

        if (winnerList.size() > 1) // if the candidates are tied
        {
            return "Election is not decisive!";
        }

        return winnerList.get(0) + " has won the election!";
    }
}


