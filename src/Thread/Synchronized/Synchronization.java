package Thread.Synchronized;



public class Synchronization {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Person shoaib = new Person("shoaib", printer, 12);
        Person joti = new Person("joti", printer, 8);
        Person uday = new Person("uday", printer, 8);
    }
}