package com.hummer.educationalgame;

import java.util.ArrayList;

public class ObstacleManager {
    private ArrayList<Obstacle> obstacles;
    private int playerGap;

    public ObstacleManager(int playerGap) {
        this.playerGap = playerGap;

        obstacles = new ArrayList<>();

        populateObstacles();
    }
}
