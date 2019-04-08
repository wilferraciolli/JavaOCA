package com.wiltech.chapter.four;

public class FinalMembers {

    private final int volume; //the error here is because final variables must beassigned a value within a constructor
    private final String name = "Wiliam";

    public FinalMembers(int volume) {
        this.volume = volume;
    }

    public FinalMembers() {
    }
}
