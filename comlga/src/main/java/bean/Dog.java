package bean;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author lga
 * @date 2021-03-04 13:39
 * @desc
 */
public class Dog implements Comparator<Dog> {
    public int age;
    public int weight;

    public Dog(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.age-o2.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                weight == dog.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}
