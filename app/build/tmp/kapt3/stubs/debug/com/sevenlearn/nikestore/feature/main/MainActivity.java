package com.sevenlearn.nikestore.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/sevenlearn/nikestore/feature/main/MainActivity;", "Lcom/sevenlearn/nikestore/common/NikeActivity;", "()V", "currentNavController", "Landroidx/lifecycle/LiveData;", "Landroidx/navigation/NavController;", "viewModel", "Lcom/sevenlearn/nikestore/feature/main/MainViewModel;", "getViewModel", "()Lcom/sevenlearn/nikestore/feature/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCartItemsCountChangeEvent", "", "cartItemCount", "Lcom/sevenlearn/nikestore/data/CartItemCount;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "onResume", "onSupportNavigateUp", "", "setupBottomNavigationBar", "app_debug"})
public final class MainActivity extends com.sevenlearn.nikestore.common.NikeActivity {
    private androidx.lifecycle.LiveData<androidx.navigation.NavController> currentNavController;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.sevenlearn.nikestore.feature.main.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Called on first creation and when restoring state.
     */
    private final void setupBottomNavigationBar() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onCartItemsCountChangeEvent(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.CartItemCount cartItemCount) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public MainActivity() {
        super();
    }
}