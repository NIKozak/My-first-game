public class Weapon implements Actions {
    private String typeWeapon;
    private int range;
    private int damage;
    public int schet;
    public Weapon(String typeWeapon, int range, int damage, int schet) {
        this.typeWeapon = typeWeapon;
        this.range = range;
        this.damage = damage;
        this.schet = schet;
    }
    public Weapon(){


    }
    void weaponInfo(){
        System.out.print("\nTypeWeapon: " + typeWeapon + " RateOfFire: " + range + " Damage: " + damage + "\n______________________________________________________");
    }
    public void robotActions(){
        System.out.print("\nTypeWeapon: " + typeWeapon + " RateOfFire: " + range + " Damage: " + damage + "\n______________________________________________________");

    }
    public void fire(Traffic traffic, Enemy hpvrag){
        System.out.println("___________________________________________");
        for (int i = traffic.x - range; i < traffic.x + range; i++) {
            for (int j = traffic.y - range; j < traffic.y + range; j++) {
                if(i < 0 || j < 0)
                {
                }
                else if(i > 14 || j > 14)
                {
                }
                else
                {
                    if(traffic.pole[i][j] == 8 && traffic.HP[i][j] > 0) {
                        traffic.HP[i][j] = traffic.HP[i][j] - damage;
                        hpvrag.hpvrag = traffic.HP[i][j];
                        schet++;
                        if(traffic.HP[i][j] <= 0) {
                            traffic.pole[i][j]=0;
                        }
                    }
                    if(traffic.pole[i][j] == 9 && traffic.HP[i][j] > 0) {
                        traffic.HP[i][j] = traffic.HP[i][j] - damage;
                        hpvrag.hpvrag = traffic.HP[i][j];
                        schet++;
                        if(traffic.HP[i][j] <= 0) {
                            traffic.pole[i][j] = 0;
                        }
                    }
                }
            }
        }
    }
}
