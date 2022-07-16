package com.sevenlearn.nikestore.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/sevenlearn/nikestore/common/NikeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/sevenlearn/nikestore/common/NikeView;", "()V", "rootView", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getRootView", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "viewContext", "Landroid/content/Context;", "getViewContext", "()Landroid/content/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public abstract class NikeActivity extends androidx.appcompat.app.AppCompatActivity implements com.sevenlearn.nikestore.common.NikeView {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.coordinatorlayout.widget.CoordinatorLayout getRootView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.content.Context getViewContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public NikeActivity() {
        super();
    }
    
    public void setProgressIndicator(boolean mustShow) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.view.View showEmptyState(int layoutResId) {
        return null;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void showError(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.common.NikeException nikeException) {
    }
    
    public void showSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
}