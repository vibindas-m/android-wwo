package com.example.androidwwo.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nJ*\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/androidwwo/domain/LocationRoomUseCase;", "", "locationRoom", "Lcom/example/androidwwo/room/LocationRoom;", "(Lcom/example/androidwwo/room/LocationRoom;)V", "deleteLocationData", "", "locationData", "Lcom/example/androidwwo/room/LocationData;", "getSavedLocationList", "", "saveLocationData", "value", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class LocationRoomUseCase {
    private final com.example.androidwwo.room.LocationRoom locationRoom = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.androidwwo.room.LocationData> getSavedLocationList() {
        return null;
    }
    
    public final void saveLocationData(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.room.LocationData locationData, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.androidwwo.room.LocationData> value) {
    }
    
    public final void deleteLocationData(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.room.LocationData locationData) {
    }
    
    public LocationRoomUseCase(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.room.LocationRoom locationRoom) {
        super();
    }
}