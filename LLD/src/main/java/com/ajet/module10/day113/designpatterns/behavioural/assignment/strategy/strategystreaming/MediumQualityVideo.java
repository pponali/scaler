package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategy.strategystreaming;

public class MediumQualityVideo implements QualityAdjustmentStrategy{
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video streamVideo(Video video) {
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
}
