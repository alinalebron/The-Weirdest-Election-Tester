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

    public VoterBallots()
    {
        ballotList = new ArrayList<Ballot>();
    }


    /**
     * Gets the information from the ballotList
     *
     * @return ballotList - the set of voter ballots
     */

    public ArrayList<Ballot> getBallotList()
    {
        return ballotList;
    }

    /**
     * Sets the ballotList
     *
     * @param ballotList the set of voter ballots
     */

    public void setBallotList(ArrayList<Ballot> ballotList)
    {
        this.ballotList = ballotList;
    }

    /**
     * Adds one voter ballot to the entire set of ballots
     *
     * @param one a single ballot
     */

    public void addToBallotList(Ballot one)
    {
        ballotList.add(one);
    }

    /**
     * Retrieves the size of the entire VoterBallots object
     *
     * @return the size of the VoterBallots array list object
     */

    public int getBallotListSize()
    {
        return ballotList.size();
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

    private int numFirstVotes(String candidate, ArrayList<String> candidateList)
    {
        int candidateCounter = 0; // initializes counter for candidates that were voted for first

        for (Ballot b : ballotList)
        {

            if (candidate.equals(b.firstChoiceFrom(candidateList)))
            {
                candidateCounter++;
            }
        }

//        System.out.println(candidate + "'s votes: " + candidateCounter); // output for debugging

        return candidateCounter;
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

    public ArrayList<String> candidatesWithFewest(ArrayList<String> candidateList)
    {

        ArrayList<String> fewest = new ArrayList<String>(); // declaring empty list

        int min = Integer.MAX_VALUE; // sets a number to the highest possible value

        for (String s : candidateList)
        {
            min = Math.min(min, numFirstVotes(s, candidateList)); // takes minimum of current & min of first candidates
        }

        for (String s : candidateList)
        {
            if (min == numFirstVotes(s, candidateList)) // compares lowest number of votes to current candidate
            {
                fewest.add(s); // add to the list if candidate has lowest number of votes
            }
        }
        return fewest;
    }

    public String toString()
    {

        String theVoterBallot = "";

        Ballot oneBallot;

        for (int i = 0; i < ballotList.size(); i++)
        {
            oneBallot = ballotList.get(i);

            theVoterBallot = theVoterBallot + oneBallot.getBallot();
        }

        return theVoterBallot;
    }
}  // end of VoterBallots class definition 
