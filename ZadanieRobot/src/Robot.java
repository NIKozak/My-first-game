import java.util.Scanner;

public class Robot extends RobotMashine implements Actions{
    Scanner in = new Scanner(System.in);
    private String robotName;
    public int health;
    private int recoveryRate;
    public int medicine;

    private String trafic;
    public Robot(String robotName, int health, int recoveryRate, int medicine){
        this.robotName = robotName;
        this.health = health;
        this.recoveryRate = recoveryRate;
        this.medicine = medicine;

    }
    public Robot() {

    }
    void robotInfo() {
        System.out.print("\nRobot name: " + robotName + "\nHP: " + health + "\nRecovery: " + recoveryRate +
        "\nMedicine: "+medicine+"\n______________________");
    }
    public void robotActions(){
        System.out.print("\nRobot name: " + robotName + "\nHP: " + health + "\nRecovery: " + recoveryRate +
                "\nMedicine: " + medicine+"\n______________________\n");

    }
    public void move(Traffic traffic) {
        System.out.println("Enter button WASD to move or click on Enter to skip a turn, use first aid kit 1 button Q");
        String trafic = in.nextLine();
        switch (trafic) {
            case "w":
                int i = traffic.x; int j = traffic.y;
                if (traffic.pole[i - 1][j] != 0) {
                    System.out.println("Movement is not possible in front of a wall or enemy");
                } else
                {
                    traffic.pole[i - 1][j] = traffic.pole[i][j];
                    traffic.x = i - 1; traffic.y = j;
                    traffic.pole[i][j] = 0;
                }
                break;
            case "a":
                i = traffic.x; j = traffic.y;
                if (traffic.pole[i][j - 1] != 0 ) {
                    System.out.println("Movement is not possible in front of a wall or enemy");
                } else
                {
                    traffic.pole[i][j - 1] = traffic.pole[i][j];
                    traffic.x = i;traffic.y = j - 1;
                    traffic.pole[i][j] = 0;

                }
                break;
            case "s":
                i = traffic.x; j = traffic.y;
                if (traffic.pole[i + 1][j] != 0) {
                    System.out.println("Movement is not possible in front of a wall or enemy");
                } else {
                    traffic.pole[i + 1][j] = traffic.pole[i][j];
                    traffic.x = i + 1; traffic.y = j;
                    traffic.pole[i][j] = 0;
                }
                break;
            case "d":
                i = traffic.x; j = traffic.y;
                if (traffic.pole[i][j + 1] != 0) {
                    System.out.println("Movement is not possible in front of a wall or enemy");
                } else {
                    traffic.pole[i][j + 1] = traffic.pole[i][j];
                    traffic.x = i;traffic.y = j + 1;
                    traffic.pole[i][j] = 0;
                }
                break;
            case "q":
                if(medicine > 0 && health < 4000) {
                    health = health + 1000; medicine--;
                } else if(health > 4000) {
                    System.out.print("Many more HP \n");
                } else {
                    System.out.print("You don't have first aid kits \n");
                }
                break;
            default:
                System.out.println("___________________________________________");
        }
        System.out.println("Coordinates " + traffic.x + " " + traffic.y + "");

        System.out.print("___________________________________________\n");
    }

    public void restoreHealth() {
        if(health < 5000){
            health = health + recoveryRate;
            System.out.print("Works RestoreHealth \n");
        }
    }
    public void medicine(){
        System.out.println("Enter to skip a turn, use first aid kit 1 button Q");
        String trafic = in.nextLine();
        switch (trafic) {
            case "q":
                if(medicine > 0 && health < 4000) {
                    health = health + 1000; medicine--;
                } else if(health > 4000) {
                    System.out.print("Many more HP \n");
                } else {
                    System.out.print("You don't have first aid kits \n");
                }
                break;
        }
    }
}
