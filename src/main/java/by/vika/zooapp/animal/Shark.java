package by.vika.zooapp.animal;

public class Shark extends AdctractAnimal{
    @Override
    void voice(){
        System.out.println("Я акула и я молчу");
    }
    @Override
    void walk(){
        System.out.println("Я акула и я плыву");
    }
}
