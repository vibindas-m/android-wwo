package com.example.androidwwo.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u001e\u0010\u0018\u001a\u00020\u00112\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/example/androidwwo/adapter/LocationListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/androidwwo/adapter/LocationListAdapter$LocationListHolder;", "()V", "items", "Ljava/util/ArrayList;", "Lcom/example/androidwwo/room/LocationData;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/example/androidwwo/adapter/LocationListAdapter$OnItemClickListener;", "getListener", "()Lcom/example/androidwwo/adapter/LocationListAdapter$OnItemClickListener;", "setListener", "(Lcom/example/androidwwo/adapter/LocationListAdapter$OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "setOnItemClickListener", "LocationListHolder", "OnItemClickListener", "app_debug"})
public final class LocationListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.androidwwo.adapter.LocationListAdapter.LocationListHolder> {
    @org.jetbrains.annotations.NotNull()
    public com.example.androidwwo.adapter.LocationListAdapter.OnItemClickListener listener;
    private java.util.ArrayList<com.example.androidwwo.room.LocationData> items;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidwwo.adapter.LocationListAdapter.OnItemClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.adapter.LocationListAdapter.OnItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.androidwwo.adapter.LocationListAdapter.LocationListHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.adapter.LocationListAdapter.LocationListHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.androidwwo.room.LocationData> list) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.androidwwo.adapter.LocationListAdapter.OnItemClickListener listener) {
    }
    
    public LocationListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/androidwwo/adapter/LocationListAdapter$OnItemClickListener;", "", "onClick", "", "view", "Landroid/view/View;", "data", "Lcom/example/androidwwo/room/LocationData;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.example.androidwwo.room.LocationData data);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/androidwwo/adapter/LocationListAdapter$LocationListHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "locationText", "Landroid/widget/TextView;", "getLocationText", "()Landroid/widget/TextView;", "app_debug"})
    public static final class LocationListHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView locationText = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLocationText() {
            return null;
        }
        
        public LocationListHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}