package com.example.androidwwo.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00040\u00030\u00012\u00020\b2\u00020\tB\r\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/androidwwo/domain/LocationListUseCase;", "Lcom/example/androidwwo/model/UseCase;", "Lcom/example/androidwwo/data/LocationRequest;", "Landroidx/lifecycle/LiveData;", "Lcom/example/androidwwo/model/Result;", "Ljava/util/ArrayList;", "Lcom/example/androidwwo/room/LocationData;", "Lkotlin/collections/ArrayList;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/example/androidwwo/model/Cancellable;", "weatherRepo", "Lcom/example/androidwwo/service/WeatherRepo;", "(Lcom/example/androidwwo/service/WeatherRepo;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "cancel", "", "execute", "params", "app_debug"})
public final class LocationListUseCase implements com.example.androidwwo.model.UseCase<com.example.androidwwo.data.LocationRequest, androidx.lifecycle.LiveData<com.example.androidwwo.model.Result<? extends java.util.ArrayList<com.example.androidwwo.room.LocationData>>>>, kotlinx.coroutines.CoroutineScope, com.example.androidwwo.model.Cancellable {
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private final com.example.androidwwo.service.WeatherRepo weatherRepo = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.androidwwo.model.Result<java.util.ArrayList<com.example.androidwwo.room.LocationData>>> execute(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.data.LocationRequest params) {
        return null;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    public LocationListUseCase(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.service.WeatherRepo weatherRepo) {
        super();
    }
}