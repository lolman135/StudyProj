package ua.lesson5.good.obstacle.impl;

import ua.lesson5.good.obstacle.Obstacle;
import ua.lesson5.good.participants.Participant;

public class ObstaclePool implements Obstacle {

    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start swim");
    }
}
