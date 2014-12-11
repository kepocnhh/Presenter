package stan.presenter.mafia;

public class Action
        extends Mafia
{
    public static class Kill
            extends Action
    {
        public Kill() 
        {
            super("Убивает");
        }
        @Override
        public Player engage(Player p)
        {
            p.life = false;
            return p;
        }
    }
    public static class Jail
            extends Action
    {
        public Jail() 
        {
            super("Сажает в тюрьму");
            try_stop = true;
        }
        @Override
        public Player engage(Player p)
        {
            p.heal_night = true;
            p.stop = true;
            return p;
        }
    }
    public static class Violence
            extends Action
    {
        public Violence() 
        {
            super("Насилует");
            try_stop = true;
        }
        @Override
        public Player engage(Player p)
        {
            p.stop = true;
            return p;
        }
    }
    public static class Doctor_heal
            extends Action
    {
        public Doctor_heal() 
        {
            super("Лечит");
        }
        @Override
        public Player engage(Player p)
        {
            p.heal_night = true;
            return p;
        }
    }
    //
    public int to;
    public int from;
    public boolean try_stop;
    
    //
    public Player engage(Player p)
    {
        return p;
    }
    //
    public Action(String n)
    {
        super(n);
        try_stop = false;
        to = -1;
        from = -1;
    }
}