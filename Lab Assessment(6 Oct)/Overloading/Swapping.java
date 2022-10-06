class Swapping {
    public static void display(int a, int b){
        System.out.println("Integer: " + a + " and " + b);
    }

    public static void display(double a, double b){
        System.out.println("Double " + a + " and " + b);
    }

    public static void main(String[] args) {
        //Converting from int to double
        display(50, 60);
        display(50.0, 60.0);

          //Converting from double to int
          display(50.0, 60.0);
          display(50, 60);
    }
}