package com.sevenlearn.nikestore.feature.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Lcom/sevenlearn/nikestore/feature/list/ProductListViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "sort", "", "productRepository", "Lcom/sevenlearn/nikestore/data/repo/ProductRepository;", "(ILcom/sevenlearn/nikestore/data/repo/ProductRepository;)V", "getProductRepository", "()Lcom/sevenlearn/nikestore/data/repo/ProductRepository;", "productsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sevenlearn/nikestore/data/Product;", "getProductsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "selectedSortTitleLiveData", "getSelectedSortTitleLiveData", "getSort", "()I", "setSort", "(I)V", "sortTitles", "", "getSortTitles", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "getProducts", "", "onSelectedSortChangedByUser", "app_debug"})
public final class ProductListViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Product>> productsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> selectedSortTitleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Integer[] sortTitles = {2131886219, 2131886220, 2131886221, 2131886222};
    private int sort;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.ProductRepository productRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Product>> getProductsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSelectedSortTitleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Integer[] getSortTitles() {
        return null;
    }
    
    public final void getProducts() {
    }
    
    public final void onSelectedSortChangedByUser(int sort) {
    }
    
    public final int getSort() {
        return 0;
    }
    
    public final void setSort(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.ProductRepository getProductRepository() {
        return null;
    }
    
    public ProductListViewModel(int sort, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.ProductRepository productRepository) {
        super();
    }
}