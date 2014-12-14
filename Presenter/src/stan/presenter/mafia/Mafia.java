package stan.presenter.mafia;

import java.io.Serializable;

public class Mafia
        implements Serializable
{
    public String name;
    public int UI;
    public Mafia(String n)
    {
        this.name = n;
        this.UI = -1;
    }
}