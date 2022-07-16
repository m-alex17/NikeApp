package com.sevenlearn.nikestore.feature.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010\'\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u001a\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lcom/sevenlearn/nikestore/feature/cart/CartFragment;", "Lcom/sevenlearn/nikestore/common/NikeFragment;", "Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter$CartItemViewCallbacks;", "()V", "cartItemAdapter", "Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter;", "getCartItemAdapter", "()Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter;", "setCartItemAdapter", "(Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "imageLoadingService", "Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "getImageLoadingService", "()Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "imageLoadingService$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/sevenlearn/nikestore/feature/cart/CartViewModel;", "getViewModel", "()Lcom/sevenlearn/nikestore/feature/cart/CartViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDecreaseCartItemButtonClick", "", "cartItem", "Lcom/sevenlearn/nikestore/data/CartItem;", "onIncreaseCartItemButtonClick", "onProductImageClick", "onRemoveCartItemButtonClick", "onStart", "onViewCreated", "view", "app_debug"})
public final class CartFragment extends com.sevenlearn.nikestore.common.NikeFragment implements com.sevenlearn.nikestore.feature.cart.CartItemAdapter.CartItemViewCallbacks {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.sevenlearn.nikestore.feature.cart.CartItemAdapter cartItemAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy imageLoadingService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.feature.cart.CartViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sevenlearn.nikestore.feature.cart.CartItemAdapter getCartItemAdapter() {
        return null;
    }
    
    public final void setCartItemAdapter(@org.jetbrains.annotations.Nullable()
    com.sevenlearn.nikestore.feature.cart.CartItemAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.services.ImageLoadingService getImageLoadingService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onRemoveCartItemButtonClick(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
    }
    
    @java.lang.Override()
    public void onIncreaseCartItemButtonClick(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
    }
    
    @java.lang.Override()
    public void onDecreaseCartItemButtonClick(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
    }
    
    @java.lang.Override()
    public void onProductImageClick(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
    }
    
    public CartFragment() {
        super();
    }
}