import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.xml.bind.SchemaOutputResolver;
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
         Constructs an arrayList that holds the candidates' names
         */

        ArrayList<String> candidateList = new ArrayList<String>();

        /*
        Reads input and adds each name to the candidateList array
         */
        Scanner candidateFile = new Scanner(new File("/Users/alina/IdeaProjects/Assignments/ProgrammingII/Assignment1/candidates1.txt"));

        while (candidateFile.hasNext()) { // until EOF

            candidateList.add(candidateFile.next()); // add each name to a candidate list

        }

        /*
        * Prints out who's on the candidate list
         */

        System.out.print("The candidates are: ");

        for (int i = 0; i < candidateList.size(); i++) {  // traverses the candidatelist
            System.out.print(candidateList.get(i) + " ");
        }

        System.out.println(); // to separate lines

        /*
         * Constructs an empty Voter Ballot object
         */
        VoterBallots voterBallotOne = new VoterBallots();

        /*
         * Creates a scanner object that will scan the first ballots input file
         */

        Scanner ballotFile = new Scanner(new File("/Users/alina/IdeaProjects/Assignments/ProgrammingII/Assignment1/ballots1.txt"));


        /*
         * Reads the input file, creates a new ballot with each line, and adds each ballot to the set
         * of voter ballots (the empty VoterBallots object)
         */

        while (ballotFile.hasNext()) { // read until EOF

            Ballot eachVoter = new Ballot(); // creates an empty ballot object

            for (int i = 0; i < candidateList.size(); i++) { // traverse for as many candidates as there are left

                String singleVote = ballotFile.next(); // store the next string into an object, singleVote

                eachVoter.addToBallot(singleVote); // add that singleVote to the empty ballot array list object
            }

            System.out.println("This is a new ballot " + eachVoter.getBallot()); // output for debugging

            /*
             Adds each newly created ballot object to the voter ballot object (the set of ballot objects)
              */

            voterBallotOne.addToBallotList(eachVoter);

        }


//        System.out.println(voterBallotOne.toString());

//        for (int i = 0; i < voterBallotOne.size(); i++) {
//
//            String theBallot = voterBallotOne.readBallotList();
//
//            System.out.println(theBallot);
//        }


    }
}



