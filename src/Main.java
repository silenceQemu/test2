public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Dog dog1 =  new Dog();
        dog1.bark();
        dog1.name = "Bart";
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }

        SimpleDotCom dot = new SimpleDotCom();
        int[] location = {2,3,4};
        dot.setLocationCells(location);
        String userGuess = "4";
        String result = dot.checkYourself(userGuess);
    }
}
