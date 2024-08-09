package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategy.strategystreaming;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();
    public Video streamVideo(Video video);
}