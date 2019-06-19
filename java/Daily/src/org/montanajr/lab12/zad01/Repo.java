package org.montanajr.lab12.zad01;

public class Repo {
    private String commitMsg;
    private String userName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Repo{");
        sb.append("commitMsg='").append(commitMsg).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void commit(String commitMsg, String userName)
    {
        this.commitMsg = commitMsg;
        this.userName = userName;
    }

    public Memento push()
    {
        return new Memento(userName, commitMsg);
    }

    public void revert(Object obj)
    {
        Memento mem = (Memento) obj;
        userName = mem.mementoUsername;
        commitMsg = mem.mementoCommitMsg;
    }

    private class Memento{
        String mementoUsername;
        String mementoCommitMsg;

        public Memento(String username, String commitMsg)
        {
            mementoUsername = username;
            mementoCommitMsg = commitMsg;
        }
    }
}
