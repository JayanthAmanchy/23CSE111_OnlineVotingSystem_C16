package OnlineVotingSystem;

public class Administrator {
    int adminID;
    String name;
    String password;

    public Administrator(int id, String name, String password) {
        this.adminID = id;
        this.name = name;
        this.password = password;
    }

    public void addCandidate(VotingSystem system, Candidate c) {
        system.candidatesList.add(c);
    }

    public void removeCandidate(VotingSystem system, int id) {
        system.candidatesList.removeIf(c -> c.candidateID == id);
    }

    public void startElection() {
        System.out.println("Election Started!");
    }

    public void endElection() {
        System.out.println("Election Ended!");
    }
}