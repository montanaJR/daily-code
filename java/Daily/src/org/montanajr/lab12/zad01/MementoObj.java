package org.montanajr.lab12.zad01;


public class MementoObj {

    Object mementoObj;

    public void newCommit(Repo repo)
    {
        mementoObj = repo.push();
    }

    public void revertMemento(Repo repo)
    {
        repo.revert(mementoObj);
    }


}
