package org.montanajr.lab12.zad01;


import org.montanajr.lab12.memento.Nadzorca;
import org.montanajr.lab12.memento.StanDiety;

public class Demo {
    public static void main(String[] args) {
        MementoObj mementoObj = new MementoObj();

        Repo repo = new Repo();

        System.out.println("=======================Commit!");
        repo.commit("Co7mmit2", "USERNAME2");
        System.out.println(repo.toString());
        mementoObj.newCommit(repo);

        repo.commit("Commit3", "USERNAME3");
        System.out.println(repo.toString());
        repo.commit("Commit4", "USERNAME4");
        System.out.println(repo.toString());

        System.out.println("=======================REVERT COMMIT");
        mementoObj.revertMemento(repo);
        System.out.println(repo.toString());
    }
}
