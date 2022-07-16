package com.sevenlearn.nikestore.feature.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bJ\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/sevenlearn/nikestore/feature/cart/CartViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "cartRepository", "Lcom/sevenlearn/nikestore/data/repo/CartRepository;", "(Lcom/sevenlearn/nikestore/data/repo/CartRepository;)V", "cartItemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sevenlearn/nikestore/data/CartItem;", "getCartItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getCartRepository", "()Lcom/sevenlearn/nikestore/data/repo/CartRepository;", "emptyStateLiveData", "Lcom/sevenlearn/nikestore/data/EmptyState;", "getEmptyStateLiveData", "purchaseDetailLiveData", "Lcom/sevenlearn/nikestore/data/PurchaseDetail;", "getPurchaseDetailLiveData", "calculateAndPublishPurchaseDetail", "", "decreaseCartItemCount", "Lio/reactivex/Completable;", "cartItem", "getCartItems", "increaseCartItemCount", "refresh", "removeItemFromCart", "app_debug"})
public final class CartViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.CartItem>> cartItemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.PurchaseDetail> purchaseDetailLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.EmptyState> emptyStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.CartRepository cartRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.CartItem>> getCartItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.PurchaseDetail> getPurchaseDetailLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.EmptyState> getEmptyStateLiveData() {
        return null;
    }
    
    private final void getCartItems() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable removeItemFromCart(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable increaseCartItemCount(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable decreaseCartItemCount(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
        return null;
    }
    
    public final void refresh() {
    }
    
    private final void calculateAndPublishPurchaseDetail() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.CartRepository getCartRepository() {
        return null;
    }
    
    public CartViewModel(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.CartRepository cartRepository) {
        super();
    }
}