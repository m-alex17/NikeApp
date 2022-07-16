package com.sevenlearn.nikestore.feature.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/sevenlearn/nikestore/feature/favorites/FavoriteProductsViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "productRepository", "Lcom/sevenlearn/nikestore/data/repo/ProductRepository;", "(Lcom/sevenlearn/nikestore/data/repo/ProductRepository;)V", "productsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sevenlearn/nikestore/data/Product;", "getProductsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "removeFromFavorites", "", "product", "app_debug"})
public final class FavoriteProductsViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Product>> productsLiveData = null;
    private final com.sevenlearn.nikestore.data.repo.ProductRepository productRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Product>> getProductsLiveData() {
        return null;
    }
    
    public final void removeFromFavorites(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product) {
    }
    
    public FavoriteProductsViewModel(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.ProductRepository productRepository) {
        super();
    }
}