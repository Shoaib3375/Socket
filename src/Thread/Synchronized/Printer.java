package Thread.Synchronized;

class Printer {
    void printAssignment(Person p){
        System.out.println(p.name+"-->Printing started...");
        for(int i=0; i<p.pages; i++){
            System.out.println(p.name + "--> printed page#"+(i+1));
        }
        System.out.println(p.name+"-->Completed...");
    }
}