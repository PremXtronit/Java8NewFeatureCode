package oops;


class SwipeCard {

    public void swipe(Manager manager) {
        System.out.println();
    }

    public String makeOfSwipeCard() {
        return "s1";
    }
}

class Manager {

    public void logs(SwipeCard swipeCard) {
        swipeCard.swipe(this);
    }
}

public class Association {

    public static void main(String[] args) {

        Manager manager = new Manager();

        SwipeCard swipeCard = new SwipeCard();
        swipeCard.makeOfSwipeCard();
        swipeCard.swipe(manager);
    }
}

