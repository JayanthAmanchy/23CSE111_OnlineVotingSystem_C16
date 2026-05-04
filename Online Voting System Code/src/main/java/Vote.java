package OnlineVotingSystem;

public class Vote {
    int voteID;
    int voterID;
    int candidateID;
    String encryptedVote;

    public Vote(int voteID, int voterID, int candidateID) {
        this.voteID = voteID;
        this.voterID = voterID;
        this.candidateID = candidateID;
    }

    public void encryptVote() {
        encryptedVote = "ENC(" + candidateID + ")";
    }

    public void storeVote() {
        System.out.println("Vote stored securely: " + encryptedVote);
    }
}