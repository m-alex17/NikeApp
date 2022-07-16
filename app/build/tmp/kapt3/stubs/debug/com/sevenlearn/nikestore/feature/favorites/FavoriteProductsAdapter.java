package com.sevenlearn.nikestore.feature.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter$ViewHolder;", "products", "", "Lcom/sevenlearn/nikestore/data/Product;", "favoriteProductEventListener", "Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter$FavoriteProductEventListener;", "imageLoadingService", "Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "(Ljava/util/List;Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter$FavoriteProductEventListener;Lcom/sevenlearn/nikestore/services/ImageLoadingService;)V", "getFavoriteProductEventListener", "()Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter$FavoriteProductEventListener;", "getImageLoadingService", "()Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "getProducts", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavoriteProductEventListener", "ViewHolder", "app_debug"})
public final class FavoriteProductsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sevenlearn.nikestore.feature.favorites.FavoriteProductsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sevenlearn.nikestore.data.Product> products = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.feature.favorites.FavoriteProductsAdapter.FavoriteProductEventListener favoriteProductEventListener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.services.ImageLoadingService imageLoadingService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sevenlearn.nikestore.feature.favorites.FavoriteProductsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.feature.favorites.FavoriteProductsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sevenlearn.nikestore.data.Product> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.feature.favorites.FavoriteProductsAdapter.FavoriteProductEventListener getFavoriteProductEventListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.services.ImageLoadingService getImageLoadingService() {
        return null;
    }
    
    public FavoriteProductsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sevenlearn.nikestore.data.Product> products, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.feature.favorites.FavoriteProductsAdapter.FavoriteProductEventListener favoriteProductEventListener, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.services.ImageLoadingService imageLoadingService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter;Landroid/view/View;)V", "productIv", "Lcom/sevenlearn/nikestore/view/NikeImageView;", "kotlin.jvm.PlatformType", "getProductIv", "()Lcom/sevenlearn/nikestore/view/NikeImageView;", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "bindProduct", "", "product", "Lcom/sevenlearn/nikestore/data/Product;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView titleTv = null;
        private final com.sevenlearn.nikestore.view.NikeImageView productIv = null;
        
        public final android.widget.TextView getTitleTv() {
            return null;
        }
        
        public final com.sevenlearn.nikestore.view.NikeImageView getProductIv() {
            return null;
        }
        
        public final void bindProduct(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.Product product) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsAdapter$FavoriteProductEventListener;", "", "onClick", "", "product", "Lcom/sevenlearn/nikestore/data/Product;", "onLongClick", "app_debug"})
    public static abstract interface FavoriteProductEventListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.Product product);
        
        public abstract void onLongClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.Product product);
    }
}