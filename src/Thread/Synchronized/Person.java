package Thread.Synchronized;

class Person implements Runnable {

    String name;
    final Printer printer;
    int pages;
    Thread t;

    Person(String name, Printer p, int pages){
        this.name= name;
        this.printer = p;
        this.pages = pages;
        t= new Thread(this, name);
        t.start();
    }


    @Override
    public void run() {
        synchronized (printer) {
            printer.printAssignment(this);
        }
    }
}