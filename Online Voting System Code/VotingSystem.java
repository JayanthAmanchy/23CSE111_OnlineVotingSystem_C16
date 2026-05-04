package OnlineVotingSystem;

import java.util.*;

public class VotingSystem {
    List<Voter> votersList = new ArrayList<>();
    List<Candidate> candidatesList = new ArrayList<>();
    List<Vote> votesList = new ArrayList<>();

    public boolean authenticateVoter(int voterID, String password) {
        for (Voter v : votersList) {
            if (v.login(voterID, password)) {
                return true;
            }
        }
        return false;
    }

    public void displayBallot() {
        System.out.println("Candidates:");
        for (Candidate c : candidatesList) {
            c.getDetails();
        }
    }

    public void recordVote(int voterID, int candidateID) {
        Vote vote = new Vote(votesList.size() + 1, voterID, candidateID);
        vote.encryptVote();
        vote.storeVote();
        votesList.add(vote);

        for (Candidate c : candidatesList) {
            if (c.candidateID == candidateID) {
                c.increaseVoteCount();
            }
        }
    }

    public void countVotes() {
        System.out.println("\nElection Results:");
        for (Candidate c : candidatesList) {
            System.out.println(c.name + ": " + c.voteCount + " votes");
        }
    }
}