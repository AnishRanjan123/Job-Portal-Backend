package com.jobportal.utility;

import java.time.LocalDateTime;

public class ErrorInfo {

    private String errorMesssage;
    private Integer errorCode;
    private LocalDateTime timeStamp;

    // ✅ No-args constructor
    public ErrorInfo() {
    }

    // ✅ All-args constructor
    public ErrorInfo(String errorMesssage, Integer errorCode, LocalDateTime timeStamp) {
        this.errorMesssage = errorMesssage;
        this.errorCode = errorCode;
        this.timeStamp = timeStamp;
    }

    // ✅ Getters and Setters
    public String getErrorMesssage() {
        return errorMesssage;
    }

    public void setErrorMesssage(String errorMesssage) {
        this.errorMesssage = errorMesssage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}

