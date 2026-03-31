class DuplicateVoteException extends Exception {}

class Voter {
    boolean voted = false;
    void vote() throws DuplicateVoteException {
        if (voted) throw new DuplicateVoteException();
        voted = true;
    }
}

public class OnlineVoting {
    public static void main(String[] args) throws Exception {
        Voter v = new Voter();
        v.vote();
        System.out.println("Vote cast");
    }
}
