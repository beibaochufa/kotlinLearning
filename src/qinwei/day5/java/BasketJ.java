package qinwei.day5.java;

import qinwei.day5.Color;
import qinwei.day5.Fruit;

public class BasketJ<T extends Fruit&Color> {

    private T content;

    public void set(BasketJ<? super T> fruit) {
        this.content = (T) fruit.get();
    }

    public T get() {
        return content;
    }

    public static class SmallBasketJ extends BasketJ {

    }
}




