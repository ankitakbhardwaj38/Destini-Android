package com.londonappbrewery.destini;

public class StoryPath {
    private int storyId;
    private int topButtonId;
    private int bottomButtonId;

    public StoryPath(int newStoryId, int newTopButtonId, int newBottomButtonId){
        storyId=newStoryId;
        topButtonId=newTopButtonId;
        bottomButtonId=newBottomButtonId;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public int getTopButtonId() {
        return topButtonId;
    }

    public void setTopButtonId(int topButtonId) {
        this.topButtonId = topButtonId;
    }

    public int getBottomButtonId() {
        return bottomButtonId;
    }

    public void setBottomButtonId(int bottomButtonId) {
        this.bottomButtonId = bottomButtonId;
    }
}
