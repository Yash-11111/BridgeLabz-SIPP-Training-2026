interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming Movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Launching Game...");
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        System.out.println("Streaming + Gaming Subscription Active");
    }
}

public class SmartTVDemo {

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Inception",
                "Interstellar"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");
        for (String movie : movies)
            System.out.println(movie);

        System.out.println("\nGames:");
        for (String game : games)
            System.out.println(game);

        tv.streamMovie();
        tv.playGame();
    }
}
