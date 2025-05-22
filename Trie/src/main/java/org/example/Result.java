package org.example;

import java.util.List;

public class Result {
    private int wordLength;
    private int wordCount;
    long summaryInsertTime;
    long summarySearchTime;
    long summaryDeleteTime;
    private double averageInsertTimeMillis;
    private double averageSearchTimeMillis;
    private double averageDeleteTimeMillis;

    public Result() {
        this.wordLength = 0;
        this.wordCount = 0;
        this.summaryInsertTime = 0;
        this.summarySearchTime = 0;
        this.summaryDeleteTime = 0;
        this.averageInsertTimeMillis = 0;
        this.averageSearchTimeMillis = 0;
        this.averageDeleteTimeMillis = 0;
    }

    @Override
    public String toString() {
        return "Result{" +
                "wordLength=" + wordLength +
                ", wordCount=" + wordCount +
                ", averageInsertTimeMillis=" + averageInsertTimeMillis +
                ", averageSearchTimeMillis=" + averageSearchTimeMillis +
                ", averageDeleteTimeMillis=" + averageDeleteTimeMillis +
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

    public double getAverageInsertTimeMillis() {
        return averageInsertTimeMillis;
    }

    public void setAverageInsertTimeMillis(double averageInsertTimeMillis) {
        this.averageInsertTimeMillis = averageInsertTimeMillis;
    }

    public double getAverageSearchTimeMillis() {
        return averageSearchTimeMillis;
    }

    public void setAverageSearchTimeMillis(double averageSearchTimeMillis) {
        this.averageSearchTimeMillis = averageSearchTimeMillis;
    }

    public double getAverageDeleteTimeMillis() {
        return averageDeleteTimeMillis;
    }

    public void setAverageDeleteTimeMillis(double averageDeleteTimeMillis) {
        this.averageDeleteTimeMillis = averageDeleteTimeMillis;
    }
}
