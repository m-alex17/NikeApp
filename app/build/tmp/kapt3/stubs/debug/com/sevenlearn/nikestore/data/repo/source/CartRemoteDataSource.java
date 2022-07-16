package com.sevenlearn.nikestore.data.repo.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/source/CartRemoteDataSource;", "Lcom/sevenlearn/nikestore/data/repo/source/CartDataSource;", "apiService", "Lcom/sevenlearn/nikestore/services/http/ApiService;", "(Lcom/sevenlearn/nikestore/services/http/ApiService;)V", "getApiService", "()Lcom/sevenlearn/nikestore/services/http/ApiService;", "addToCart", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/AddToCartResponse;", "productId", "", "changeCount", "cartItemId", "count", "get", "Lcom/sevenlearn/nikestore/data/CartResponse;", "getCartItemsCount", "Lcom/sevenlearn/nikestore/data/CartItemCount;", "remove", "Lcom/sevenlearn/nikestore/data/MessageResponse;", "app_debug"})
public final class CartRemoteDataSource implements com.sevenlearn.nikestore.data.repo.source.CartDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.services.http.ApiService apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.AddToCartResponse> addToCart(int productId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.CartResponse> get() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.MessageResponse> remove(int cartItemId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.AddToCartResponse> changeCount(int cartItemId, int count) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.CartItemCount> getCartItemsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.services.http.ApiService getApiService() {
        return null;
    }
    
    public CartRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.services.http.ApiService apiService) {
        super();
    }
}