 class Games {
  public void display(){
    System.out.println("I am just a object of Game");
  }
}

class Sekiro extends Games {
  @Override
  public void display(){
    System.out.println("My game name is Sekiro");
  }

  public void printMessage(){

    //This will call the display message of Sekiro class
    display();
    //  This will call the display message of Game class
    super.display();
  }
}

class Games_main {
  public static void main(String[] args) {
    Sekiro s1 = new Sekiro();
    s1.printMessage();
  }
}