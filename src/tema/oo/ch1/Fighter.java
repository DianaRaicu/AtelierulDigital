package tema.oo.ch1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public void attack(Fighter fighter){
        fighter.health = fighter.health - this.damagePerAttack;
    }

    public int getHealth(){
        return health;
    }
    public String toString(){
        return this.name;
    }
}
