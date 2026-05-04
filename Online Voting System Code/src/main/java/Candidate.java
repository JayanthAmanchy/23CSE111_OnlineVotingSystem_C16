package OnlineVotingSystem;

public class Candidate {
    int candidateID;
    String name;
    String party;
    int voteCount;

    public Candidate(int id, String name, String party) {
        this.candidateID = id;
        this.name = name;
        this.party = party;
        this.voteCount = 0;
    }

    public void getDetails() {
        System.out.println(candidateID + " - " + name + " (" + party + ")");
    }

    public void increaseVoteCount() {
        voteCount++;
    }
}