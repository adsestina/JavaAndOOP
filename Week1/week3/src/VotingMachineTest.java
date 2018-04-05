public class VotingMachineTest {
    public static void main(String[] args) {
    VotingMachine toDoHomework = new VotingMachine("Should I do homework?");
    toDoHomework.voteYes();
    toDoHomework.voteYes();
    toDoHomework.voteNo();
        System.out.println(VotingMachine.numberNoVotes);
        System.out.println(VotingMachine.numberYesVotes);
        toDoHomework.clearMachine();
        System.out.println(VotingMachine.numberYesVotes);
        System.out.println(VotingMachine.numberNoVotes);
    }
}
