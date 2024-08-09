package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategy.strategystreaming;

public class HighQualityStrategy implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }

    @Override
    public Video streamVideo(Video video) {
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }

}
