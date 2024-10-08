package com.vishal.BankingPortal.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;

import com.vishal.BankingPortal.dto.GeolocationResponse;

public interface GeolocationService {

    @Async
    public CompletableFuture<GeolocationResponse> getGeolocation(String ip);
}
