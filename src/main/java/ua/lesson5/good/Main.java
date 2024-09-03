package ua.lesson5.good;

import ua.lesson5.good.obstacle.Obstacle;
import ua.lesson5.good.obstacle.impl.ObstaclePool;
import ua.lesson5.good.obstacle.impl.ObstacleWall;
import ua.lesson5.good.participants.Participant;
import ua.lesson5.good.participants.impl.ParticipantCat;
import ua.lesson5.good.participants.impl.ParticipantDog;
import ua.lesson5.good.participants.impl.ParticipantRat;

public class Main {
    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new ObstacleWall(),
                new ObstaclePool()
        };

        Participant[] participants = {
                new ParticipantCat("Barsik"),
                new ParticipantDog("Sharik"),
                new ParticipantRat("Remi")
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }
    }
}
