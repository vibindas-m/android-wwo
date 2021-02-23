package com.example.androidwwo.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00012\u00020\u00062\u00020\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/androidwwo/domain/WeatherUseCase;", "Lcom/example/androidwwo/model/UseCase;", "Lcom/example/androidwwo/data/WeatherRequest;", "Landroidx/lifecycle/LiveData;", "Lcom/example/androidwwo/model/Result;", "Lcom/example/androidwwo/data/WeatherResponse;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/example/androidwwo/model/Cancellable;", "weatherRepo", "Lcom/example/androidwwo/service/WeatherRepo;", "(Lcom/example/androidwwo/service/WeatherRepo;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "cancel", "", "execute", "params", "app_debug"})
public final class WeatherUseCase implements com.example.androidwwo.model.UseCase<com.example.androidwwo.data.WeatherRequest, androidx.lifecycle.LiveData<com.example.androidwwo.model.Result<? extends com.example.androidwwo.data.WeatherResponse>>>, kotlinx.coroutines.CoroutineScope, com.example.androidwwo.model.Cancellable {
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
    public androidx.lifecycle.LiveData<com.example.androidwwo.model.Result<com.example.androidwwo.data.WeatherResponse>> execute(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.data.WeatherRequest params) {
        return null;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    public WeatherUseCase(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.service.WeatherRepo weatherRepo) {
        super();
    }
}