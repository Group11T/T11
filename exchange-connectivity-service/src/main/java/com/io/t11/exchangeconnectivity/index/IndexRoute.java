package com.io.t11.exchangeconnectivity.Index;

import java.time.LocalDate;

public class IndexRoute {
    private boolean status;
    private String serviceName;
    private LocalDate date;

    public IndexRoute(boolean status, String serviceName, LocalDate date){
        this.status = status;
        this.serviceName = serviceName;
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "IndexRoute{" +
                "status=" + status +
                ", serviceName='" + serviceName + '\'' +
                ", date=" + date +
                '}';
    }
}