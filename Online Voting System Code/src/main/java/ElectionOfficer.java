package OnlineVotingSystem;

public class ElectionOfficer {
    int officerID;
    String name;

    public ElectionOfficer(int id, String name) {
        this.officerID = id;
        this.name = name;
    }

    public void monitorTurnout(VotingSystem system) {
        System.out.println("Total Votes Cast: " + system.votesList.size());
    }

    public void viewElectionStatus(VotingSystem system) {
        system.countVotes();
    }
}