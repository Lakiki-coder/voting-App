/**
= prompt the user to enter the number of party
= obtain and save the user input
= prompt the user to enter the number of candidate
= obtain and save the user input
= initialize an array to carry the number of parties
= initialize multiple array to carry the input of number of party and number of candidates
= initialize another multiple array
= create a for loop to keep prompting the user to enter name till the condition is false
= obtain and save the inputs
= create another to kepp prompting the user to enter the  name of the candidate till count is less than number of inputed candidate
= collect and save the the user inputs inside  the candidate registered array
= 

**/

import java.util.Scanner;

public class VotingSystemApp {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of parties: ");

int numberOfParties = input.nextInt(); 

System.out.print("Enter the number of candidates per party: ");

int numberOfCandidates = input.nextInt();


String[] partyNames = new String[numberOfParties];

String[][]  candidateName = new String[numberOfParties][numberOfCandidates];

int[][] voteCounts = new int[numberOfParties][numberOfCandidates];



candidatePartiesNumber(partyNames,  candidateName, voteCounts ,numberOfCandidates,numberOfParties);

printOutProcess( voteCounts,  candidateName, partyNames,numberOfParties,numberOfCandidates);
}


public static void candidatePartiesNumber(String[] partyNames, String[][]  candidateName, int[][] voteCounts, int numberOfParties, int numberOfCandidates){

Scanner input = new Scanner(System.in);
/**
String[] partyNames = new String[numberOfParties];

String[][]  candidateName = new String[numberOfParties][numberOfCandidates];

int[][] voteCounts = new int[numberOfParties][numberOfCandidates];
**/

for (int count = 0; count < numberOfParties; count++) {

System.out.print("Enter the name of party " + (count + 1) + ": ");

partyNames[count] = input.next();

for (int counter = 0; counter < numberOfCandidates; counter++) {

System.out.print("Enter the name of candidate " + (counter + 1) + " for party " + partyNames[count] + ": ");

 

 candidateName[count][counter] = input.next();
voteCounts[count][counter] = 0; 
            }
        }
}
public static void printOutProcess(int [][] voteCounts,  String [][]  candidateName, String [] partyNames,int numberOfParties,int numberOfCandidates){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of voters: ");
int numberOfVoters = input.nextInt();

String[] voterNames = new String[numberOfVoters];
boolean[] hasVoted = new boolean[numberOfVoters];

for (int count = 0; count < numberOfVoters; count++) {
System.out.print("Enter name of voter " + (count + 1) + ": ");
voterNames[count] = input.next();
hasVoted[count] = false; 
        }

//  Voting Process

int value = 0;
for (int count = 0; count < numberOfVoters; count++) {
System.out.println("\nWelcome " + voterNames[count] + "!\nAvailable Candidates:");


 for (value = 0; value < numberOfParties; value++) {
for (int values = 0; values < numberOfCandidates; values++) {
System.out.println(">> " + value + "," + values + " << " +  candidateName[value][values] + " >> Party: " + partyNames[value] + " <<");
}
}
System.out.println("Select the candidate by entering their party and candidate index (e.g., 0 1): ");

                
            


int selectedParty = input.nextInt();

int selectedCandidate = input.nextInt();

if (selectedParty < numberOfParties && selectedCandidate < numberOfCandidates) {

voteCounts[selectedParty][selectedCandidate]++;

hasVoted[count] = true;

System.out.println("Thank you for voting!");
} else {

System.out.println("Invalid candidate selection. Skipping vote.");
            }
        

}        

        // print out Results
System.out.println("\nElection Results:");

for (int count = 0; count < numberOfParties; count++) {

for (int counter = 0; counter < numberOfCandidates; counter++) {
  
System.out.println( candidateName[count][counter] + " (Party: " + partyNames[count] + ") - Votes: " + voteCounts[count][counter]);
            }
        }
}

    
}

