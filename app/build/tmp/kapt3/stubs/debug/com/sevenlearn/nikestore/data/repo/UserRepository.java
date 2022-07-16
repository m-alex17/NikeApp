package com.sevenlearn.nikestore.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/UserRepository;", "", "getUserName", "", "loadToken", "", "login", "Lio/reactivex/Completable;", "username", "password", "signOut", "signUp", "app_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void loadToken();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUserName();
    
    public abstract void signOut();
}