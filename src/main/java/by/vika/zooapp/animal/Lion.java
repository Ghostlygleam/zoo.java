package by.vika.zooapp.animal;

public class Lion extends AdctractAnimal {
    @Override
    void voice(){
        System.out.println("Я лев рррррр");
    }

    @Override
    void walk(){
        super.walk();
        System.out.println("Я лев, я быстро бегаю");
    }

}
