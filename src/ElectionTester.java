import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main class. The Election Tester reads data from two files (counted
 * as ballots), creates the candidate list, the list of all of the voters' ballots
 * and passes them to the ImmediateDecision constructor repeatedly until
 * only 1 winner remains. It will then display the winner.
 * <p/>
 * I affirm that this program is entirely my own work and none of it is the work of any other person.
 * Created by Alina Lebron on 1/27/15.
 */

public class ElectionTester {

    public static void main(String[] args) throws IOException {

        /*
         * Constructs an arrayList that holds the candidates' names for the first input file
         */

        ArrayList<String> candidateList = new ArrayList<String>();

        /*
         * Reads input and adds each name to the candidateList array
         */

        Scanner candidateFile = new Scanner(new File("Assignment1/candidates1.txt"));

        /* Scanner candidateFile = new Scanner(new File("Assignment1/candidates2.txt")); */ // for second run

        while (candidateFile.hasNext()) // read until EOF
        {
            candidateList.add(candidateFile.next()); // add each name to a candidate list
        }

        /*
         * Prints out who's on the candidate list
         */

        System.out.print("The candidates are: ");

        for (int i = 0; i < candidateList.size(); i++) // traverses the candidatelist
        {
            System.out.print(candidateList.get(i) + " "); // prints out who's on the list
        }

        System.out.println(); // to separate lines
        System.out.println();

        /*
         * Constructs an empty Voter Ballot object
         */

        VoterBallots voterBallot= new VoterBallots();

        Scanner ballotFile = new Scanner(new File("Assignment1/ballots1.txt"));

        /* Scanner ballotFile = new Scanner(new File("Assignment1/ballots2.txt")); */ // for second run


        /*
         * Reads the input file, creates a new ballot with each line, and adds each ballot to the set
         * of voter ballots (the empty VoterBallots object)
         */

        while (ballotFile.hasNext()) // read until EOF
        {
            Ballot eachVoter = new Ballot(); // creates an empty ballot object

            for (int i = 0; i < candidateList.size(); i++) // traverse for as many candidates as there are left
            {
                String singleVote = ballotFile.next(); // store the next string into an object, singleVote

                eachVoter.addToBallot(singleVote); // add that singleVote to the empty ballot array list object
            }

            /*
             * Adds each newly created ballot object to the voter ballot object (the set of ballot objects)
             */

            voterBallot.addToBallotList(eachVoter);
        }

        /*
         * Creates a new Immediate Decision object to be able to run the election
         * and outputs the winner to the console
         */

        ImmediateDecision vote = new ImmediateDecision(candidateList, voterBallot);

        System.out.println(vote.electWinner()); // prints out the winner!

    }
}



