package com.example.androidwwo.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/androidwwo/service/WeatherService;", "", "search", "Lretrofit2/Call;", "Lcom/example/androidwwo/data/SearchResponse;", "query", "", "numOfResults", "weather", "Lcom/example/androidwwo/data/WeatherResponse;", "q", "app_debug"})
public abstract interface WeatherService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search.ashx?")
    public abstract retrofit2.Call<com.example.androidwwo.data.SearchResponse> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "num_of_results")
    java.lang.String numOfResults);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather.ashx?")
    public abstract retrofit2.Call<com.example.androidwwo.data.WeatherResponse> weather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String q);
}