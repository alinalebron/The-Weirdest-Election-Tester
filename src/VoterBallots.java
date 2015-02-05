import java.util.ArrayList;

/**
 * A class that represents a set of voter ballots.
 * It is an array list of Ballots (ballots are an array list of candidates a voter chose)
 * <p/>
 * I affirm that this program is entirely my own work and none of it is the work of any other person.
 * Created by Alina Lebron on 1/27/15.
 */

public class VoterBallots {
    // instance variables

    private ArrayList<Ballot> ballotList;  // each element is one voter's ballot

    /**
     * Constructs the VoterBallots object list with no ballots
     */

    public VoterBallots() {
        ballotList = new ArrayList<Ballot>();
    }


    /**
     * Gets the information from the ballotList
     *
     * @return ballotList - the set of voter ballots
     */

    public ArrayList<Ballot> getBallotList() {
        return ballotList;
    }

    /**
     * Sets the ballotList
     *
     * @param ballotList the set of voter ballots
     */

    public void setBallotList(ArrayList<Ballot> ballotList) {
        this.ballotList = ballotList;
    }

    /**
     * Adds one voter ballot to the entire set of ballots
     *
     * @param one a single ballot
     */

    public void addToBallotList(Ballot one) {

        ballotList.add(one);
    }

    /**
     * Retrieves the size of the entire VoterBallots object
     *
     * @return the size of the VoterBallots array list object
     */

    public int getBallotListSize() {

        return ballotList.size();
    }


    public String readBallotList() {

        String ballotRead = null;

        for (int i = 0; i < ballotList.size(); i++) {

            Ballot theBallot = ballotList.get(i);
            ballotRead = theBallot.toString();

        }

        return ballotRead;
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

        int candidateCounter = 0; // initializes counter for candidates that were voted for first

        Ballot ballot = new Ballot();

        boolean candidateAppears = candidateList.contains(candidate); // boolean to determine if the candidate is included in the election

        boolean candidateisFirst = candidateList.indexOf(candidate) == 0;

        for (int i = 0; i < getBallotListSize(); i++) {
            
            candidate = ballot.getBallotElement();

            if (!candidateAppears) {

                return 0;
        }
            else if (candidateAppears && candidateisFirst) {

                candidateCounter++;
            }

        }
        return candidateCounter;   // bogus return value so that class will compile
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


        return null;   // bogus return value so that class will compile
    }

//    public String toString(){
//
//        String theVoterBallot = null;
//
//        String oneBallot = null;
//
//        for (int i = 0 ; i < ballotList.size(); i++) {
//
//            oneBallot = ballotList.get(i);
//
//            theVoterBallot = theVoterBallot + oneBallot;
//
//        }
//
//        return theVoterBallot;
//    }
}  // end of VoterBallots class definition 
