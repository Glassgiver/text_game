
public class Player extends Living_things{

    //players stats. статистика игра

    private int health = 500;
    private int power = 50;
    private int lives = 3;
    private int stamine = 100;
    private int speed = 30;

    //players info. информация о игроке

    private String classG = "Player";

    // players creature. создание игрока



    // players actions


    public void hit_Enemy(Living_things creature){ //hit. удар/атака
        System.out.println("You hit the " + creature);
    }

    public void get_Damage(Living_things creature){
        int damage = creature.power;
        System.out.println(creature + "hit you! You got " + damage + " damage!");
        this.health -=  damage;
        System.out.println("Now you have " + this.health + " health.");
    }

}
