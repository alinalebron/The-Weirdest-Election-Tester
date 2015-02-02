import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by alina on 1/27/15.
 * <p/>
 * The main class. The Election Tester reads data from two files (counted
 * as ballots), creates the candidate list, the list of all of the voters' ballots
 * and passes them to the ImmediateDecision constructor repeatedly until
 * only 1 winner remains. It will then display the winner.
 */

public class ElectionTester {

    public static void main(String[] args) throws IOException {


/**
 *  TO DO:
 *
 *  1) Read from file
 *  2) Create a VoterBallots object
 *  3) For each line, split each name into an element in an array list
 *  4) Create a new ballot
 *  5) Store ballot in VoterBallots instance
 */

            ArrayList<String> ballot = new ArrayList<String>(Arrays.asList("Moes","Larry","Curly","Shemp"));

            Ballot example = new Ballot(0, ballot);

        /*
         Constructs an arrayList that holds the candidates' names
         */

        ArrayList<String> candidateList = new ArrayList<String>();

        /*
        Reads input and adds each name to the candidateList array
         */
        Scanner candidateFile = new Scanner(new File("/Users/alina/IdeaProjects/Assignments/ProgrammingII/Assignment1/candidates1.txt"));

        while (candidateFile.hasNext()) {

            candidateList.add(candidateFile.next());

        }

        System.out.println(example.firstChoiceFrom(candidateList));
//
//        for (int i = 0; i < candidateList.size(); i++) {
//
//            String candidate = candidateList.get(i) + "  ";
//
//            System.out.print(candidate);
//        }

//        System.out.println("The candidate list is:" + candidateList);

//        Ballot initialBallot = new Ballot();
//
//        VoterBallots voterBallot1 = new VoterBallots();



    }


    /**
     * Asks the user to key in the input file of candidates
     * and creates a candidate list object
     */

//    public static void readCandidates(ArrayList<String> candidateList) throws IOException {
//
//        System.out.print("Enter the name of the file with candidates:");
//        Scanner candidateFile = new Scanner(System.in);
//
//
//        while (candidateFile.hasNext()) {
//
//            candidateList.add(candidateFile.next());
//        }
//
//        System.out.println(candidateList);
//
//    }


}
