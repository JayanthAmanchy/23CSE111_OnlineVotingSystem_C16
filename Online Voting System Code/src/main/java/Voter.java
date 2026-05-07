package OnlineVotingSystem;

public class Voter {
    int voterID;
    String name;
    String password;
    String phoneNumber;
    boolean hasVoted;

    public Voter(int voterID, String name, String password, String phoneNumber) {
        this.voterID = voterID;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.hasVoted = false;
    }

    public boolean login(int id, String pass) {
        return this.voterID == id && this.password.equals(pass);
    }

    public boolean verifyOTP() {
        
        return true;
    }

    public void viewBallot(VotingSystem system) {
        system.displayBallot();
    }

    public void castVote(VotingSystem system, int candidateID) {
        if (!hasVoted) {
            system.recordVote(this.voterID, candidateID);
            hasVoted = true;
        } else {
            System.out.println("You have already voted!");
        }
    }
}