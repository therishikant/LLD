package com.rishi.lld.proxy.virtual;

import com.rishi.models.video.RealVideo;
import com.rishi.models.video.Video;

public class VideoProxy implements Video {
    private String filename;
    RealVideo realVideo;

    public VideoProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        if (realVideo == null){
            realVideo = new RealVideo(filename);
        }
        realVideo.play();
    }
}
