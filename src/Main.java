import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char conlp='a';
        Scanner usr= new Scanner(System.in);
        System.out.println("Welcome to Animal Application");
        do {

            System.out.println("Choice animal from the List :\n 1 Dog. \n 2 Cat \n 3 Bird");
            int option = usr.nextInt();
            if (option == 1) {
                Animal dog = new Dog();
                dog.eat();
                dog.makeSound();
            } else if (option == 2) {
                Animal cat = new Cat();
                cat.eat();
                cat.makeSound();
            } else if (option == 3) {
                Animal bird = new Bird();
                bird.eat();
                bird.makeSound();
            } else {
                System.out.println("Invalid input try again ");
            }
            System.out.println("Do you want to choice other animal (y/n)?");
            conlp=Character.toLowerCase(usr.next().charAt(0));
        }while(conlp=='y');
        System.out.println("Thanks ...enjoy your day!");
    }
}

abstract class Animal{
    abstract void eat();
    abstract void makeSound();

}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("The Dog eat meat ");
    }

    @Override
    void makeSound() {
        System.out.println("The dog sound:Woof! Woof!Woof!");
    }
}
class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("The Cat eats meat ");

    }

    @Override
    void makeSound() {
        System.out.println("The cat sound :Meow! Meow! Meow!");

    }
}
class Bird extends Animal{
    @Override
    void eat() {
        System.out.println("The Birds eat beans");

    }

    @Override
    void makeSound() {
        System.out.println("The Bird sound :Chirp! Chirp! Chirp!");
    }
}