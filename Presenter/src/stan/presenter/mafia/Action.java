package stan.presenter.mafia;

public class Action
        extends Mafia
{
    public static class Kill//попытка убийства
            extends Action
    {
        public Kill(boolean s) 
        {
            super("Убивает");
            selfie = s;
        }
        @Override
        public Player engage(Player p)
        {
            p.life = false;
            return p;
        }
        //
        @Override
        public Kill clone()
        {
            return new Kill(this.selfie);
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
        //
        @Override
        public Violence clone()
        {
            return new Violence();
        }
    }
    public static class Doctor_heal
            extends Action
    {
        public Doctor_heal() 
        {
            super("Лечит");
            selfie = true;
        }
        @Override
        public Player engage(Player p)
        {
            p.heal_night = true;
            return p;
        }
    }
    //
    public boolean selfie;//возможность действовать на себя
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
        selfie = false;
    }
    private Action(String n, boolean ts, int t, int f, boolean s)
    {
        super(n);
        try_stop = ts;
        to = t;
        from = f;
        selfie = s;
    }
    //
    public Action clone()
    {
        return new Action(this.name, this.try_stop, this.to, this.from, this.selfie);
    }
}