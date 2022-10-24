public class Enemy {

    public int hpvrag = 0;
    public Enemy() { }
    public void enemydamage (Traffic traffic, Robot characteristic) {
        for (int i = traffic.x - 2; i < traffic.x + 3; i++) {
            for (int j = traffic.y - 2; j < traffic.y + 3; j++) {
                if(i < 0 || j < 0)
                {

                }
                else if(i > 14 || j > 14)
                {

                }
                else
                {
                    if(traffic.pole[i][j] == 8) {
                        characteristic.health = characteristic.health - 200;
                        System.out.println("You are being hit by an enemy LIGHT DESEPTICON");
                    }
                    if(traffic.pole[i][j] == 9) {
                        characteristic.health = characteristic.health - 300;
                        System.out.println("You are being hit by an enemy HEAVY DESEPTICON");
                    }

                }
            }
        }
    }
}
