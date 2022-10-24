public class Main {
    public static void main(String[] args) {
        int R = 3;
        System.out.print("________ROBOTS________\n");
        //Actions robotMashineFinal1 = new Robot("Leobreaker",5000,25,3);
        //Actions robotMashineFinal2 = new Robot("Jetfire",6000,20,2);
        //Actions robotMashineFinal3 = new Robot("Backstop",4500,30,5);
        //Actions machineGunFinal = new Weapon("MachineGun",3,150,0);
        //Actions rocketsGunFinal = new Weapon("Rockets",2,500,0);
        //Actions laserGunFinal = new Weapon("LaserGun",1,800,0);
        Robot Autobots1 = new Robot("Leobreaker",5000,25,3);
        Robot Autobots2 = new Robot("Jetfire",6000,20,2);
        Robot Autobots3 = new Robot("Backstop",4500,30,5);
        Weapon machineGun = new Weapon("MachineGun",3,150,0);
        Weapon RocketsGun = new Weapon("Rockets",2,500,0);
        Weapon LaserGun = new Weapon("LaserGun",1,800,0);

        //Robot robotMove = new Robot();
        //Robot roborRestoreHealth = new Robot();
        //Robot robotMedicine = new Robot();
        Interface interFaceRobot = new Interface();
        Enemy enemyDamage = new Enemy();
        Traffic pole = new Traffic();

        Autobots1.robotActions();
        pole.traffic();
        while(R > 2)
        {
            Autobots1.restoreHealth();
            interFaceRobot.interfaceRobot(Autobots1, enemyDamage, pole, machineGun);
            machineGun.fire(pole,enemyDamage);
            Autobots1.move(pole);
            enemyDamage.enemydamage(pole,Autobots1);
        }
    }
}
interface Actions {
    void robotActions();
}
abstract class RobotMashine {
    public void move(Traffic traffic) {}
    public void restoreHealth() {}
    public void medicine() {}
}


