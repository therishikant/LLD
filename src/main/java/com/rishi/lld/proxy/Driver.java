package com.rishi.lld.proxy;

import com.rishi.lld.proxy.caching.CachingProxy;
import com.rishi.lld.proxy.protection.DocumentProxy;
import com.rishi.lld.proxy.virtual.VideoProxy;
import com.rishi.models.document.Document;
import com.rishi.models.video.Video;
import com.rishi.services.dataService.DataService;

public class Driver {
    public static void main(String[] args) {
//        Video video = new VideoProxy("example_video.mp4");
//        video.play();

//        Document document = new DocumentProxy("ADMIN");
//        Document document = new DocumentProxy("USER");
//        document.read();

        DataService dataService = new CachingProxy();
        dataService.getData("RISHI");
        dataService.getData("RISHI");



    }
}
