import java.util.ArrayList;

public class Ballot {
    // instance variables

    private int voter; // the number assigned to each voter

    private ArrayList<String> ballot; // an ordered list of all the candidates
    // in the election, where the first name
    // listed is the voter’s first choice, the
    // second name is the voter’s second choice,
    // etc

    /**
     * Constructs a voter ballot object with no information
     *
     * @param voter  the voter number
     * @param ballot a list of candidates the voter chose
     */

    public Ballot(int voter, ArrayList<String> ballot) {
        this.voter = voter;
        this.ballot = ballot;
    }

    /**
     * Gets the voter number from the ballot
     *
     * @return the number of the voter
     */

    public int getVoter() {
        return voter;
    }

    /**
     * Get the list of candidates on the ballot
     *
     * @return the candidates on the ballot
     */

    public ArrayList<String> getBallot() {
        return ballot;
    }

    public void setBallot(ArrayList<String> ballot) {
        this.ballot = ballot;
    }

    public void setVoter(int voter) {
        this.voter = voter;
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

        for (String candidate : this.ballot) {

            if (candidateList.contains(candidate)) {
                return candidate;
            }

        }

        return "";
    }


}

