public class Population {
    public static void main(String args[]) {
        double increased_total_population =  262500;
        double prev_total_population = 175000;
        double remaining = (increased_total_population - prev_total_population);
        double time = 10;
        double percent = remaining / prev_total_population * 100;
        double population_per_year = percent / time;
        System.out.println(population_per_year);
    }
}
