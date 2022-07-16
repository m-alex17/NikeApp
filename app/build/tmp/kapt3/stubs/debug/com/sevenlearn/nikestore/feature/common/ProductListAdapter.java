package com.sevenlearn.nikestore.feature.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002%&B\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u001c\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ViewHolder;", "viewType", "", "imageLoadingService", "Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "(ILcom/sevenlearn/nikestore/services/ImageLoadingService;)V", "getImageLoadingService", "()Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "productEventListener", "Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ProductEventListener;", "getProductEventListener", "()Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ProductEventListener;", "setProductEventListener", "(Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ProductEventListener;)V", "value", "Ljava/util/ArrayList;", "Lcom/sevenlearn/nikestore/data/Product;", "products", "getProducts", "()Ljava/util/ArrayList;", "setProducts", "(Ljava/util/ArrayList;)V", "getViewType", "()I", "setViewType", "(I)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ProductEventListener", "ViewHolder", "app_debug"})
public final class ProductListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sevenlearn.nikestore.feature.common.ProductListAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.sevenlearn.nikestore.feature.common.ProductListAdapter.ProductEventListener productEventListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.sevenlearn.nikestore.data.Product> products;
    private int viewType;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.services.ImageLoadingService imageLoadingService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.sevenlearn.nikestore.feature.common.ProductListAdapter.ProductEventListener getProductEventListener() {
        return null;
    }
    
    public final void setProductEventListener(@org.jetbrains.annotations.Nullable()
    com.sevenlearn.nikestore.feature.common.ProductListAdapter.ProductEventListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sevenlearn.nikestore.data.Product> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sevenlearn.nikestore.data.Product> value) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sevenlearn.nikestore.feature.common.ProductListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.feature.common.ProductListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final int getViewType() {
        return 0;
    }
    
    public final void setViewType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.services.ImageLoadingService getImageLoadingService() {
        return null;
    }
    
    public ProductListAdapter(int viewType, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.services.ImageLoadingService imageLoadingService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter;Landroid/view/View;)V", "currentPriceTv", "Landroid/widget/TextView;", "getCurrentPriceTv", "()Landroid/widget/TextView;", "favoriteBtn", "Landroid/widget/ImageView;", "getFavoriteBtn", "()Landroid/widget/ImageView;", "previousPriceTv", "getPreviousPriceTv", "productIv", "Lcom/sevenlearn/nikestore/view/NikeImageView;", "getProductIv", "()Lcom/sevenlearn/nikestore/view/NikeImageView;", "titleTv", "getTitleTv", "bindProduct", "", "product", "Lcom/sevenlearn/nikestore/data/Product;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.sevenlearn.nikestore.view.NikeImageView productIv = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTv = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView currentPriceTv = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView previousPriceTv = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView favoriteBtn = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.sevenlearn.nikestore.view.NikeImageView getProductIv() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTv() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCurrentPriceTv() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPreviousPriceTv() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFavoriteBtn() {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ProductEventListener;", "", "onFavoriteBtnClick", "", "product", "Lcom/sevenlearn/nikestore/data/Product;", "onProductClick", "app_debug"})
    public static abstract interface ProductEventListener {
        
        public abstract void onProductClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.Product product);
        
        public abstract void onFavoriteBtnClick(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.Product product);
    }
}