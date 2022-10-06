public class Person_Main{
    public static void main(String[] args) {
        //Here we are creating object of Student with respect to Person which is an abstract class
    Person p1 = new Student();
   if(p1 instanceof Student){
    ((Student)p1 ).printmarks();
   } 
   Person p2 = new Employee();
   if(p2 instanceof Employee){
    ((Employee)p2).personName();
   } 
    } 
}
