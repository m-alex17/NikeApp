package com.sevenlearn.nikestore.feature.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&\'(B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006)"}, d2 = {"Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "cartItems", "", "Lcom/sevenlearn/nikestore/data/CartItem;", "imageLoadingService", "Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "cartItemViewCallbacks", "Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter$CartItemViewCallbacks;", "(Ljava/util/List;Lcom/sevenlearn/nikestore/services/ImageLoadingService;Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter$CartItemViewCallbacks;)V", "getCartItemViewCallbacks", "()Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter$CartItemViewCallbacks;", "getCartItems", "()Ljava/util/List;", "getImageLoadingService", "()Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "purchaseDetail", "Lcom/sevenlearn/nikestore/data/PurchaseDetail;", "getPurchaseDetail", "()Lcom/sevenlearn/nikestore/data/PurchaseDetail;", "setPurchaseDetail", "(Lcom/sevenlearn/nikestore/data/PurchaseDetail;)V", "decreaseCount", "", "cartItem", "getItemCount", "", "getItemViewType", "position", "increaseCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeCartItem", "CartItemViewCallbacks", "CartItemViewHolder", "PurchaseDetailViewHolder", "app_debug"})
public final class CartItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.sevenlearn.nikestore.data.PurchaseDetail purchaseDetail;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sevenlearn.nikestore.data.CartItem> cartItems = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.services.ImageLoadingService imageLoadingService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.feature.cart.CartItemAdapter.CartItemViewCallbacks cartItemViewCallbacks = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.sevenlearn.nikestore.data.PurchaseDetail getPurchaseDetail() {
        return null;
    }
    
    public final void setPurchaseDetail(@org.jetbrains.annotations.Nullable()
    com.sevenlearn.nikestore.data.PurchaseDetail p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void removeCartItem(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
    }
    
    public final void increaseCount(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
    }
    
    public final void decreaseCount(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItem cartItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sevenlearn.nikestore.data.CartItem> getCartItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.services.ImageLoadingService getImageLoadingService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.feature.cart.CartItemAdapter.CartItemViewCallbacks getCartItemViewCallbacks() {
        return null;
    }
    
    public CartItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sevenlearn.nikestore.data.CartItem> cartItems, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.services.ImageLoadingService imageLoadingService, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.feature.cart.CartItemAdapter.CartItemViewCallbacks cartItemViewCallbacks) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter$CartItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter;Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "bindCartItem", "", "cartItem", "Lcom/sevenlearn/nikestore/data/CartItem;", "app_debug"})
    public final class CartItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        
        public final void bindCartItem(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.CartItem cartItem) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public CartItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter$PurchaseDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "bind", "", "totalPrice", "", "shippingCost", "payablePrice", "app_debug"})
    public static final class PurchaseDetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        
        public final void bind(int totalPrice, int shippingCost, int payablePrice) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public PurchaseDetailViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/sevenlearn/nikestore/feature/cart/CartItemAdapter$CartItemViewCallbacks;", "", "onDecreaseCartItemButtonClick", "", "cartItem", "Lcom/sevenlearn/nikestore/data/CartItem;", "onIncreaseCartItemButtonClick", "onProductImageClick", "onRemoveCartItemButtonClick", "app_debug"})
    public static abstract interface CartItemViewCallbacks {
        
        public abstract void onRemoveCartItemButtonClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.CartItem cartItem);
        
        public abstract void onIncreaseCartItemButtonClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.CartItem cartItem);
        
        public abstract void onDecreaseCartItemButtonClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.CartItem cartItem);
        
        public abstract void onProductImageClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.CartItem cartItem);
    }
}