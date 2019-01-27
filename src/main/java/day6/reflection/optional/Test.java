package day6.reflection.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
    List<Dog> dogList = new ArrayList<>();

    public Test() {
        dogList.add(new Dog(1, "Azorek1"));
        dogList.add(new Dog(2, "Azorek2"));
        dogList.add(new Dog(3, "Azorek3"));
        dogList.add(new Dog(4, "Azorek4"));
        dogList.add(new Dog(5, "Azorek5"));
    }

    public void method1 (){
       Optional<Dog> optional = dogList.stream()
                .filter(x-> x.getId()==3)
                .findFirst();
       Dog d = optional.orElse(new Dog(6, "Azor"));
       Optional<Dog> newOptional = new Optional<>();
       newOptional.
    }
}
