package stan.presenter.mafia;

public class Role
        extends Mafia
{
    public Action act;//
    //
    public static enum TypeVisibility//тип видимости для ролей со способностью проверки
    {
        mafia,
        peace;
    }
    public static enum TypeRole//тип отнесения роли к определенной команде
    {
        mafia,
        peace,
        neutral;
    }
    private TypeVisibility TV;
    private TypeRole TR;
    private boolean selfie;//возможность действовать на себя
    //
    public TypeVisibility Get_TV()
    {
        return this.TV;
    }
    public TypeRole Get_TR()
    {
        return this.TR;
    }
    public void Set_TV(TypeVisibility tv)
    {
        this.TV = tv;
    }
    public void Set_TR(TypeRole tr)
    {
        this.TR = tr;
    }
    public boolean Get_selfie()
    {
        return this.selfie;
    }
    public void Set_selfie(boolean s)
    {
        this.selfie = s;
    }
    public Role clone()
    {
        return new Role(this.name, this.TR, this.TV, this.selfie, this.act);
    }
    public Role clone(String n, Action a)
    {
        return new Role(n, this.TR, this.TV, this.selfie, a);
    }
    //
    public Role(String n, Role.TypeRole tr, Role.TypeVisibility tv, boolean s, Action a)
    {
        super(n);
        this.TR = tr;
        this.TV = tv;
        this.selfie = s;
        this.act = a;
    }
}