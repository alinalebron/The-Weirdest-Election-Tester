import java.util.ArrayList;

public class VoterBallots {
    // instance variables

    private ArrayList<Ballot> ballotList;  // each element is one voter's ballot

    public VoterBallots(ArrayList<Ballot> ballotList) {
        this.ballotList = ballotList;
    }

    public void addBallot(Ballot one) {

        ballotList.add(one);
    }

    /**
     * Returns the number of times a given candidate appears first, among those
     * elements that are on candidateList, among all elements of ballotList
     * (i.e., among all ballots)
     *
     * @param candidate     the name of a candidate
     * @param candidateList a list of candidate names Precondition: candidate
     *                      appears in candidateList
     * @return the number of times that candidate is first among those in
     * candidateList for all elements of ballotList
     */
    private int numFirstVotes(String candidate, ArrayList<String> candidateList) {
        // implementation not shown
        return -999;   // bogus return value so that class will compile
    }

    /**
     * Returns a list of one or more candidates tied with the fewest first
     * choice votes
     * <p/>
     * Precondition: each String in candidateList appears exactly once in each
     * Ballot in ballotList
     *
     * @param candidateList a list of candidate names
     * @return a list of those candidates tied with the fewest first choice votes
     */
    public ArrayList<String> candidatesWithFewest(ArrayList<String> candidateList) {
        // implementation not shown
        return null;   // bogus return value so that class will compile
    }
}  // end of VoterBallots class definition 
