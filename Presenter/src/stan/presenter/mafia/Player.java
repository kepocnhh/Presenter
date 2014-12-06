package stan.presenter.mafia;

public class Player
        extends Mafia
{
    public String name;
    public Role role;
    //
    public boolean life;//состояние здоровья
    public boolean stop;//возможность действовать
    public boolean heal_night;//исцеление ночью
    public boolean heal_day;//исцеление днём
}