public class VotingMachine {
    private String issueName;
    public static int numberYesVotes;
    public static int numberNoVotes;

    public VotingMachine(String issueName) {
        this.issueName = issueName;
        this.numberYesVotes = 0;
        this.numberNoVotes = 0;

    }
    public void voteYes() {
        numberYesVotes++;
    }

    public void voteNo() {
        numberNoVotes++;
    }
    public static int returnYesCount() {
        return numberYesVotes;
    }

    public static int returnNoCount() {
        return numberNoVotes;
    }

    public void clearMachine() {
        numberNoVotes = 0;
        numberYesVotes = 0;

    }
    public String toString() {
        return issueName + "There were " + returnYesCount() + " voted YES and " + returnNoCount() + " voted NO";
    }
}
