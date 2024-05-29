package by.vika.zooapp.animal;

public class Zoo {
    public static void main(String args[]) {
        Beaver beaver = new Beaver();
        Cow cow = new Cow();
        Lion lion = new Lion();
        Shark shark = new Shark();
        Zookepeer zookepeer = new Zookepeer();

        zookepeer.makeVoice(cow);
        zookepeer.makeWalk(cow);
        System.out.println("------------");
        zookepeer.makeVoice(lion);
        zookepeer.makeWalk(lion);
        System.out.println("------------");
        zookepeer.makeVoice(shark);
        zookepeer.makeWalk(shark);
        System.out.println("------------");
        zookepeer.makeVoice(beaver);
        zookepeer.makeWalk(beaver);
        System.out.println("------------");
    }
}
