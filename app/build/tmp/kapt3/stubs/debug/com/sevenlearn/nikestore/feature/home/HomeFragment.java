package com.sevenlearn.nikestore.feature.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/sevenlearn/nikestore/feature/home/HomeFragment;", "Lcom/sevenlearn/nikestore/common/NikeFragment;", "Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ProductEventListener;", "()V", "homeViewModel", "Lcom/sevenlearn/nikestore/feature/home/HomeViewModel;", "getHomeViewModel", "()Lcom/sevenlearn/nikestore/feature/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "productListAdapter", "Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter;", "getProductListAdapter", "()Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter;", "productListAdapter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteBtnClick", "", "product", "Lcom/sevenlearn/nikestore/data/Product;", "onProductClick", "onViewCreated", "view", "app_debug"})
public final class HomeFragment extends com.sevenlearn.nikestore.common.NikeFragment implements com.sevenlearn.nikestore.feature.common.ProductListAdapter.ProductEventListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productListAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.feature.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.feature.common.ProductListAdapter getProductListAdapter() {
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
    public void onProductClick(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product) {
    }
    
    @java.lang.Override()
    public void onFavoriteBtnClick(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product) {
    }
    
    public HomeFragment() {
        super();
    }
}