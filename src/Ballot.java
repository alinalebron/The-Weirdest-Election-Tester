import java.util.ArrayList;

public class Ballot {
    // instance variables

    private int voter; // the number assigned to each voter

    private ArrayList<String> ballot; // an ordered list of all the candidates
    // in the election, where the first name
    // listed is the voter’s first choice, the
    // second name is the voter’s second choice,
    // etc

    private String firstChoice; // the first candidate picked from the ballot


    /**
     * The Ballot class constructor: initializes all of the variables of the ballot
     * @param voter         the voter number
     * @param ballot        a list of candidates the voter chose
     * @param firstChoice   the first choice the voter chose on the ballot
     */

    public Ballot(int voter, ArrayList<String> ballot, String firstChoice) {
        this.voter = voter;
        this.ballot = ballot;
        this.firstChoice = firstChoice;
    }

    /**
     * Gets the voter number from the ballot
     * @return the number of the voter
     */

    public int getVoter() {
        return voter;
    }

    /**
     * Get the list of candidates on the ballot
     * @return the candidates on the ballot
     */

    public ArrayList<String> getBallot() {
        return ballot;
    }

    /**
     * Examine a Ballot and return the voter's first choice among the names on
     * the list of candidates
     *
     * @param candidateList the list of candidate names
     * @return the name of the first choice candidate on this Ballot from those
     * in candidateList
     */


    public String firstChoiceFrom(ArrayList<String> candidateList) {

        return candidateList.get(0);  // bogus return value so that class will compile
    }
}  // end of Ballot class definition

