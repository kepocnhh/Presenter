package stan.presenter.mafia;

public class Role
        extends Mafia
{
    public Action[] act;//
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
    public boolean rang_shot;//возможность стрелять при разделении на ранги
    public int rang;//степень ранга ( 1 - главный / 5 - второстепенный / -1 - нет ранга)
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
    public Role clone(String n, int r)
    {
        Action[] new_act = new Action[this.act.length];
        for(int i=0;i<this.act.length;i++)
        {
            new_act[i] = this.act[i].clone();
        }
        return new Role(n, this.TR, this.TV, this.selfie, new_act, this.rang_shot, r, this.UI);
    }
    public Role clone(String n, Action[] a)
    {
        return new Role(n, this.TR, this.TV, this.selfie, a, this.rang_shot, this.rang, this.UI);
    }
    public Role clone()
    {
        Action[] new_act = new Action[this.act.length];
        for(int i=0;i<this.act.length;i++)
        {
            new_act[i] = this.act[i].clone();
        }
        return new Role(this.name, this.TR, this.TV, this.selfie, new_act, this.rang_shot, this.rang, this.UI);
    }
    //
    
    private void set_config(Role.TypeRole tr, Role.TypeVisibility tv, boolean s, int ui)
    {
        this.TR = tr;
        this.TV = tv;
        this.selfie = s;
        this.UI = ui;
    }
    private void set_rang(boolean rs, int r)
    {
        this.rang_shot = rs;
        this.rang = r;
    }
    public Role(String n, Role.TypeRole tr, Role.TypeVisibility tv, boolean s, Action[] a, boolean rs, int r, int ui)
    {
        super(n);
        set_config(tr,tv,s,ui);
        set_rang(rs,r);
        this.act = a;
    }
    public Role(String n, Role.TypeRole tr, Role.TypeVisibility tv, boolean s, Action a, boolean rs, int r, int ui)
    {
        super(n);
        set_config(tr,tv,s,ui);
        set_rang(rs,r);
        this.act = new Action[]{a};
    }
    public Role(String n, Role.TypeRole tr, Role.TypeVisibility tv, boolean s, Action a)
    {
        super(n);
        set_config(tr,tv,s,-1);
        set_rang(false,-1);
        this.act = new Action[]{a};
    }
    public Role(String n, Role.TypeRole tr, Role.TypeVisibility tv)
    {
        super(n);
        set_config(tr,tv,false,-1);
        set_rang(false,-1);
        this.act = null;
    }
}