package com.sevenlearn.nikestore.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u001a\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/sevenlearn/nikestore/common/NikeView;", "", "rootView", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getRootView", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "viewContext", "Landroid/content/Context;", "getViewContext", "()Landroid/content/Context;", "setProgressIndicator", "", "mustShow", "", "showEmptyState", "Landroid/view/View;", "layoutResId", "", "showError", "nikeException", "Lcom/sevenlearn/nikestore/common/NikeException;", "showSnackBar", "message", "", "duration", "app_debug"})
public abstract interface NikeView {
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.coordinatorlayout.widget.CoordinatorLayout getRootView();
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.content.Context getViewContext();
    
    public abstract void setProgressIndicator(boolean mustShow);
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.view.View showEmptyState(int layoutResId);
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.common.NikeException nikeException);
    
    public abstract void showSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void setProgressIndicator(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.common.NikeView $this, boolean mustShow) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public static android.view.View showEmptyState(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.common.NikeView $this, int layoutResId) {
            return null;
        }
        
        @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
        public static void showError(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.common.NikeView $this, @org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.common.NikeException nikeException) {
        }
        
        public static void showSnackBar(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.common.NikeView $this, @org.jetbrains.annotations.NotNull()
        java.lang.String message, int duration) {
        }
    }
}