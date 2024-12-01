
class Dog implements AnimalInteface {

    private final String sound = "Bark";
    private final int count = 4;
    private String name = "";

    public Dog(String petName) {
        this.name = petName;
    }

    @Override
    public void speak() {
        System.out.println(this.sound);
    }

    @Override
    public int getLegCount() {
        return this.count;
    }

    @Override
    public String getPetName() {
        return this.name;
    }

}

public class Execute {

    public static void main(String[] args) {
        Dog myDog = new Dog("Tom");
        myDog.speak();
        System.out.println(myDog.getLegCount());
    }
}
