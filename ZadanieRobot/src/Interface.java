public class Interface {
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_PURPLE = "\u001B[35m";

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public void interfaceRobot(Robot characteristic, Enemy hpvrag, Traffic traffic, Weapon schetkill ) {

        System.out.print("You have HP: " + characteristic.health + "\n");
        System.out.print("You have : " + characteristic.medicine + " First aid kit\n");

        if(hpvrag.hpvrag > 0 && schetkill.schet > 0) {
            System.out.print("HP enemy " + hpvrag.hpvrag * schetkill.schet + "\n");
            System.out.print("\n" + "You beat " + schetkill.schet + " enemy \n");
        } else if (hpvrag.hpvrag<=100 && schetkill.schet>0) {
            System.out.print("HP enemy 0\n");
            System.out.print("You killed " + schetkill.schet + " enemy \n");
        } else {
            System.out.print("The review is clear \n");
        }
        schetkill.schet = 0;

        for (int i = 0; i < 15; i++) {  //идём по строкам
            for (int j = 0; j < 15; j++) {//идём по столбцам
                int currentNumber = traffic.pole[i][j];

                switch (currentNumber) {
                    case (1):
                        System.out.print(ANSI_BLUE + currentNumber + ANSI_RESET + "  ");
                        break;
                    case (7):
                        System.out.print(ANSI_YELLOW + currentNumber + ANSI_RESET + "  ");
                        break;
                    case (8):
                    case (9):
                        System.out.print(ANSI_RED + currentNumber + ANSI_RESET + "  ");
                        break;
                    default:
                        System.out.print(ANSI_WHITE + currentNumber + ANSI_RESET + "  ");
                        break;
                }
            }
            System.out.println();
        }

    }


}
