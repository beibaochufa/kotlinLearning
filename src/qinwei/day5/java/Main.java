package qinwei.day5.java;

import qinwei.day5.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        String string = new String("sss");
        Object object = new Object();
        //协变
        object = string;
        //逆变
//        string = object;

        List<String> strings = new ArrayList<>();
        List<? extends Object> objects = new ArrayList<>();
        objects = strings;



//        fruits.add(new Apple());
//        Fruit fruit1 = fruits.get(0);
//        Fruit fruit1 = (Fruit) fruits.get(0);
//        Fruit fruit1 = fruits.get(0);
//
//        BasketJ<Object> basketObj = new BasketJ<>();
//        BasketJ<Fruit> basketFruit = new BasketJ<>();
//        BasketJ<Apple> basketJApple = new BasketJ<>();


        List<Apple> source = Arrays.asList(new Apple());
        //Object 也是最终父类 也ok
//        List<Object> destination = Arrays.asList(new Object());
        List<Fruit> destination = Arrays.asList(new Fruit());
        Collections.copy(destination,source);

//        basketFruit.set(basketJApple);
//        List<?> list = new ArrayList();
//        list.add(null);
//        Object x = test("a");
//        St y = pick("a",new ArrayList<String>());
    }

//    static <T> T test(T a1) {
//        return a1;
//    }
}
