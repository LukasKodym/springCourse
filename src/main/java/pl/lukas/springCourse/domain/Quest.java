package pl.lukas.springCourse.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
//@Table(name = "Zadania")
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @Column(name = "Opis")
    private String description;
    private int reward = 100;

//    @Transient // this annotation hide this field in database
    protected int lengthInSeconds = 10;
    private boolean started = false;
    private boolean completed = false;
    protected LocalDateTime startDate;

    public Quest() {
    }



    public Quest(String description) {
        this.description = description;
    }

    public Quest(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public boolean isCompleted() {
        if (this.completed) {
            return this.completed;
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