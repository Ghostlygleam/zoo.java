package by.vika.zooapp.animal;

public class Beaver extends AdctractAnimal{
    @Override
    void voice(){
        System.out.println("Я борб, кррр");
    }

    @Override
    void walk(){
        super.walk();
        System.out.println("Я бобр и я карабкаюсь");

    }
}
