import java.util.ArrayList;

/**
 * A class that represents a single voter ballot.
 * It is an array list that contains the candidates one voter chose
 * in the election
 * <p/>
 * I affirm that this program is entirely my own work and none of it is the work of any other person.
 * Created by Alina Lebron on 1/27/15.
 */

public class Ballot {
    // instance variables


    private ArrayList<String> ballot; // an ordered list of all the candidates
    // in the election, where the first name
    // listed is the voter’s first choice, the
    // second name is the voter’s second choice,
    // etc

    /**
     * Constructs a voter ballot object with no information
     */

    public Ballot()
    {
        this.ballot = new ArrayList<String>();

    }

    /**
     * Get the list of candidates on the ballot
     *
     * @return the candidates on the ballot
     */

    public ArrayList<String> getBallot()
    {
        return ballot;
    }

    /**
     * Sets the ballot
     *
     * @param ballot the list of candidates the voter chose
     */

    public void setBallot(ArrayList<String> ballot)
    {
        this.ballot = ballot;
    }

    /**
     * Adds a candidate to the ballot
     *
     * @param name the name of the candidate
     */

    public void addToBallot(String name)
    {
        getBallot().add(name);
    }

    public int getBallotSize()
    {
        return ballot.size();
    }

    /**
     * Gets a single element (a candidate a voter chose) from the ballot array list
     *
     * @return a candidate's name
     */

    public String getBallotElement()
    {
        String singleElement = null;

        for (int i = 0; i < ballot.size(); i++)
        {
            singleElement = ballot.get(i);
        }

        return singleElement;
    }


    /**
     * Examine a Ballot and return the voter's first choice among the names on
     * the list of candidates
     *
     * @param candidateList the list of candidate names
     * @return the name of the first choice candidate on this Ballot from those
     * in candidateList
     */


    public String firstChoiceFrom(ArrayList<String> candidateList)
    {
        for (String candidate : ballot)  // looks through the ballot
        {
            if (candidateList.contains(candidate)) // if it matches an original candidate
            {
                return ballot.get(0); // return the first candidate on the ballot
            }
        }
        return ""; // if the candidate is not on the list, return nothing
    }
}



