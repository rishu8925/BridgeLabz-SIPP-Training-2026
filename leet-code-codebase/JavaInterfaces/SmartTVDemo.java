interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming subscription active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming subscription active");
    }
}

class SmartTV implements StreamingService, GamingService {
    public void streamMovie() {
        System.out.println("Streaming movie");
    }

    public void playGame() {
        System.out.println("Playing game");
    }

    public void showSubscriptionDetails() {
        System.out.println("Streaming + Gaming subscriptions active");
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {
        String[] movies = {"Avengers", "Inception"};
        String[] games = {"FIFA", "Minecraft"};

        SmartTV tv = new SmartTV();
        tv.showSubscriptionDetails();

        for (String movie : movies)
            System.out.println(movie);

        for (String game : games)
            System.out.println(game);
    }
}