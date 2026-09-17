package com.netflix.contentService.model;

public enum VideoStatus {
    PENDING,    // movie added but not upload yet
    UPLOADED,   // movie uploaded to amazon s3
    ENCODING,   // FFmpeg is encoding the video
    ENCODED,    // Encoding completed
    READY,      // HLS playlist ready - can be streamed
    FAILED      // Encoding failed
}
