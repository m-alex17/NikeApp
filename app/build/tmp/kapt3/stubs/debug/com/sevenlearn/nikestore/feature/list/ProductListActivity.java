package com.sevenlearn.nikestore.feature.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/sevenlearn/nikestore/feature/list/ProductListActivity;", "Lcom/sevenlearn/nikestore/common/NikeActivity;", "Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter$ProductEventListener;", "()V", "productListAdapter", "Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter;", "getProductListAdapter", "()Lcom/sevenlearn/nikestore/feature/common/ProductListAdapter;", "productListAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/sevenlearn/nikestore/feature/list/ProductListViewModel;", "getViewModel", "()Lcom/sevenlearn/nikestore/feature/list/ProductListViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteBtnClick", "product", "Lcom/sevenlearn/nikestore/data/Product;", "onProductClick", "app_debug"})
public final class ProductListActivity extends com.sevenlearn.nikestore.common.NikeActivity implements com.sevenlearn.nikestore.feature.common.ProductListAdapter.ProductEventListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productListAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.feature.list.ProductListViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.feature.common.ProductListAdapter getProductListAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
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
    
    public ProductListActivity() {
        super();
    }
}