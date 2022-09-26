class Player {
    void stadium(){
        System.out.println("This is a regular stadium");
    }
    
    void fees(){
        System.out.println("Fees of every player");
    }

    void jersey(){
        System.out.println("This is the jersey regular ads ");
    }
}
class Cricketer extends Player{
    
    //Overriding the same method
    @Override
    void stadium(){
        System.out.println("This stadium is 15km wide");
    }
    void bat(){
        System.out.println("Batting pe me utrega");
    }

    void ball(){
        System.out.println("Dhang se balling kariyo");
    }
}
class Footballer extends Player{
    
    //Overriding the same method
    @Override
    void stadium(){
        System.out.println("This stadium is 10km wide");
    }
    void ball(){
        System.out.println("Football ko laat me marunga");
    }

    void defender(){
        System.out.println("Me bhidunga");
    }
}
class Player_main {
    public static void main(String[] args) {
        //Here the stadium method is overrided
        Player p1 = new Cricketer();
        p1.stadium();

        //Downcasting
        Cricketer c1 = (Cricketer)p1;
        c1.ball();

        //Upcasting
        Player p2 = (Footballer)p1;
        p2.stadium();

        //Doing downcasting in footballer class
        //In order to call the rest of two methods we have to type cast it again
        Footballer f1 = (Footballer)p1;

        f1.ball();

        //Instanceof example
        if( p1 instanceof Cricketer ){
            System.out.println("Yes it is true");
        }

    }
}
