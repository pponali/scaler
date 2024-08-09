package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategy.strategystreaming;

public class LowQualityStrategy implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @Override
    public Video streamVideo(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }

}