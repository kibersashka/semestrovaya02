package org.example;

public class Result {
    private int wordLength;
    private int wordCount;
    long summaryInsertTime;
    long summarySearchTime;
    long summaryDeleteTime;
    private double averageInsertTime;
    private double averageSearchTime;
    private double averageDeleteTime;

    public Result() {
        this.wordLength = 0;
        this.wordCount = 0;
        this.summaryInsertTime = 0;
        this.summarySearchTime = 0;
        this.summaryDeleteTime = 0;
        this.averageInsertTime = 0;
        this.averageSearchTime = 0;
        this.averageDeleteTime = 0;
    }

    @Override
    public String toString() {
        return "Result{" +
                "wordLength=" + wordLength +
                ", wordCount=" + wordCount +
                ", averageInsertTimeMillis=" + averageInsertTime +
                ", averageSearchTimeMillis=" + averageSearchTime +
                ", averageDeleteTimeMillis=" + averageDeleteTime +
                '}';
    }

    public int getWordLength() {
        return wordLength;
    }

    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public Long getSummaryInsertTime() {
        return summaryInsertTime;
    }

    public void setSummaryInsertTime(Long summaryInsertTime) {
        this.summaryInsertTime = summaryInsertTime;
    }

    public Long getSummarySearchTime() {
        return summarySearchTime;
    }

    public void setSummarySearchTime(Long summarySearchTime) {
        this.summarySearchTime = summarySearchTime;
    }

    public Long getSummaryDeleteTime() {
        return summaryDeleteTime;
    }

    public void setSummaryDeleteTime(Long summaryDeleteTime) {
        this.summaryDeleteTime = summaryDeleteTime;
    }

    public double getAverageInsertTime() {
        return averageInsertTime;
    }

    public void setAverageInsertTime(double averageInsertTime) {
        this.averageInsertTime = averageInsertTime;
    }

    public double getAverageSearchTime() {
        return averageSearchTime;
    }

    public void setAverageSearchTime(double averageSearchTime) {
        this.averageSearchTime = averageSearchTime;
    }

    public double getAverageDeleteTime() {
        return averageDeleteTime;
    }

    public void setAverageDeleteTime(double averageDeleteTime) {
        this.averageDeleteTime = averageDeleteTime;
    }
}
