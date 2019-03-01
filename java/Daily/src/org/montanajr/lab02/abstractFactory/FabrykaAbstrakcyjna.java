package org.montanajr.lab02.abstractFactory;

/**
 * Wiele komponentow - abstaract factory
 *
 */
public abstract class FabrykaAbstrakcyjna
{
  public abstract Bank getBank(String bank);
  public abstract Kredyt getKredyt(String kredyt);

}
