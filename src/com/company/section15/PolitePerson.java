package com.company.section15;

public class PolitePerson {
    public static void main() {
        final PolitePerson2 jane = new PolitePerson2("Jane");
        final PolitePerson2 john = new PolitePerson2("John");

        new Thread(() -> jane.sayHello(john)).start();

        new Thread(() -> jane.sayHello(john)).start();
    }

    static class PolitePerson2 {
        private final String name;

        PolitePerson2(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson2 person) {
            System.out.format("%s: %s" + " has said hello to me !%n", this.name, person.getName());
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePerson2 person) {
            System.out.format("%s: %s" + " has said hello back to me !%n", this.name, person.getName());
        }
    }
}
