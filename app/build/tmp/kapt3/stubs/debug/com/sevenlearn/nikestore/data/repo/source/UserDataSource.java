package com.sevenlearn.nikestore.data.repo.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0005H&J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u0012"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;", "", "getUsername", "", "loadToken", "", "login", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/TokenResponse;", "username", "password", "saveToken", "token", "refreshToken", "saveUsername", "signOut", "signUp", "Lcom/sevenlearn/nikestore/data/MessageResponse;", "app_debug"})
public abstract interface UserDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.TokenResponse> login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.MessageResponse> signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void loadToken();
    
    public abstract void saveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken);
    
    public abstract void saveUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUsername();
    
    public abstract void signOut();
}