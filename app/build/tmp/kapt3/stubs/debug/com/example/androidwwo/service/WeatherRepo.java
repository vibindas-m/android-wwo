package com.example.androidwwo.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/androidwwo/service/WeatherRepo;", "", "weatherService", "Lcom/example/androidwwo/service/WeatherService;", "(Lcom/example/androidwwo/service/WeatherService;)V", "getSearchLocation", "Lcom/example/androidwwo/model/Response;", "Lcom/example/androidwwo/data/SearchResponse;", "locationRequest", "Lcom/example/androidwwo/data/LocationRequest;", "(Lcom/example/androidwwo/data/LocationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherDetails", "Lcom/example/androidwwo/data/WeatherResponse;", "weatherRequest", "Lcom/example/androidwwo/data/WeatherRequest;", "(Lcom/example/androidwwo/data/WeatherRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepo {
    private final com.example.androidwwo.service.WeatherService weatherService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchLocation(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.data.LocationRequest locationRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidwwo.model.Response<com.example.androidwwo.data.SearchResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherDetails(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.data.WeatherRequest weatherRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidwwo.model.Response<com.example.androidwwo.data.WeatherResponse>> p1) {
        return null;
    }
    
    public WeatherRepo(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.service.WeatherService weatherService) {
        super();
    }
}