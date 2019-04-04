package pl.lukas.springCourse.domain;

import java.time.LocalDateTime;

public class Quest {

    private int id;
    private String description;
    private int reward = 100;
    protected int lengthInSeconds = 30;
    private boolean started = false;
    private boolean completed = false;
    protected LocalDateTime startDate;

    public Quest() {
    }

    public Quest(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public boolean isCompleted() {
        if (this.completed) {
            return true;
        } else {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime questEndDate = this.startDate.plusSeconds(this.lengthInSeconds);
            boolean isAfter = now.isAfter(questEndDate);
            if (isAfter) this.completed = true;
            return isAfter;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        if (started) {
            this.startDate = LocalDateTime.now();
        }
        this.started = started;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return description;
    }
}