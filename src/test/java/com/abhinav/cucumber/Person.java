package com.abhinav.cucumber;

import static java.lang.Math.abs;

public class Person {

    private String lastMessageShouted;
    private String lastMessageHeard;
    private Integer distance;

    public void shout(String message) {
        this.setLastMessageShouted(message);
    }

    private int getDistance() {
        return this.distance;
    }

    private String getLastMessageShouted() {
        return this.lastMessageShouted;
    }

    public String getLastMessageHeard(Person p) {
        if(abs(p.getDistance()-this.getDistance())<=15)
            return p.getLastMessageShouted();
        return null;
    }

    public void setDistance(Integer distance) {
        this.distance=distance;
    }

    private void setLastMessageShouted(String message) {
        this.lastMessageShouted=message;
    }

    public void setLastMessageHeard(String message) {
        this.lastMessageHeard=message;
    }


}
