package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Check {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("FFFF", 200, "6", 30));
        humans.add(new Human("DDDD", 500, "4",  28));
        humans.add(new Human("AAAA", 1000, "1", 15));
        humans.add(new Human("EEEE", 1000, "5", 100));
        humans.add(new Human("CCCC", 1000, "3", 18));
        humans.add(new Human("BBBB", 500, "2", 17));
        /**
         * 1. Добавить +1 к возрасту
         * 2. Отфильтровать совершеннолетних
         * 3. Собрать в мапу, ключ
         */

        System.out.println();
    }
}
