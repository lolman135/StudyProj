package ua.lesson5.bad;

public class Main {
    public static void main(String[] args) {
        ObstaclePool pool = new ObstaclePool();
        ObstacleWall wall = new ObstacleWall();

        ParticipantCat cat = new ParticipantCat("Barsik");
        ParticipantDog dog = new ParticipantDog("Sharik");

        pool.start(cat);
        pool.start(dog);

        wall.start(cat);
        wall.start(dog);
    }
}
