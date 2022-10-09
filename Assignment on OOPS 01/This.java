public class This {

    String gameName;
    int coins;

    This(){
        System.out.println("This is a default constructor");
    }

    This(String gameName, int coins){
     this.gameName = gameName;
     this.coins = coins;
    }

    public static void main(String[] args) {
        This t1 = new This();
        System.out.println("Game name is "+ t1.gameName+" " + "Coins you have" +" " + t1.coins);
        This t2 = new This("Clash of clans", 999999);
        System.out.println("Game name is "+ t2.gameName+" " + "Coins you have" +" " + t2.coins);
    }   
}
