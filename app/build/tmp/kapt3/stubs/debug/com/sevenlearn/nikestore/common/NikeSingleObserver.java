package com.sevenlearn.nikestore.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/sevenlearn/nikestore/common/NikeSingleObserver;", "T", "Lio/reactivex/SingleObserver;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lio/reactivex/disposables/CompositeDisposable;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "onError", "", "e", "", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "app_debug"})
public abstract class NikeSingleObserver<T extends java.lang.Object> implements io.reactivex.SingleObserver<T> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @java.lang.Override()
    public void onSubscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable d) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public NikeSingleObserver(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}