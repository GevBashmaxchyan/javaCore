package lesson18;

public enum Apple {
    JONATHAN,
    GOLDEN_DEL,
    RED_DEL,
    WINESAP,
    CORTLAND;

    private int price;

    Apple(int p) {
        price = p;
    }

    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }

}
