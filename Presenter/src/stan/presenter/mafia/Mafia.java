package stan.presenter.mafia;

import java.io.Serializable;

public class Mafia
        implements Serializable
{
    public String name;
    public Mafia(String n)
    {
        this.name = n;
    }
}