package com.sevenlearn.nikestore.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\u0010"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/CartRepository;", "", "addToCart", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/AddToCartResponse;", "productId", "", "changeCount", "cartItemId", "count", "get", "Lcom/sevenlearn/nikestore/data/CartResponse;", "getCartItemsCount", "Lcom/sevenlearn/nikestore/data/CartItemCount;", "remove", "Lcom/sevenlearn/nikestore/data/MessageResponse;", "app_debug"})
public abstract interface CartRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.AddToCartResponse> addToCart(int productId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.CartResponse> get();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.MessageResponse> remove(int cartItemId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.AddToCartResponse> changeCount(int cartItemId, int count);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.CartItemCount> getCartItemsCount();
}