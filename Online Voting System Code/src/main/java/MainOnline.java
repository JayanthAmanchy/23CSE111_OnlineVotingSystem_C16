package OnlineVotingSystem;

import java.util.Scanner;

public class MainOnline {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.votersList.add(new Voter(1, "Abhilaash", "123", "9999999999"));
        system.votersList.add(new Voter(2, "Hanumath", "456", "8888888888"));
        system.votersList.add(new Voter(3, "Shantanu", "789", "7777777777"));

        system.candidatesList.add(new Candidate(1, "INC", "Party A"));
        system.candidatesList.add(new Candidate(2, "BJP", "Party B"));
        system.candidatesList.add(new Candidate(3, "JJP", "Party C"));

        Scanner sc = new Scanner(System.in);
        while (true) {
        	System.out.println("Enter Voter ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Password:");
            String pass = sc.nextLine();

            if (system.authenticateVoter(id, pass)) {
                System.out.println("Login Successful!");

                system.displayBallot();

                System.out.println("Enter Candidate ID to vote:");
                int cid = sc.nextInt();

                for (Voter v : system.votersList) {
                    if (v.voterID == id) {
                        v.castVote(system, cid);
                    }
                }
            } else {
                System.out.println("Invalid Login!");
            }
            
            system.countVotes();

        }
        
    }
}