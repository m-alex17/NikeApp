package com.sevenlearn.nikestore.data.repo.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/source/UserRemoteDataSource;", "Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;", "apiService", "Lcom/sevenlearn/nikestore/services/http/ApiService;", "(Lcom/sevenlearn/nikestore/services/http/ApiService;)V", "getApiService", "()Lcom/sevenlearn/nikestore/services/http/ApiService;", "getUsername", "", "loadToken", "", "login", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/TokenResponse;", "username", "password", "saveToken", "token", "refreshToken", "saveUsername", "signOut", "signUp", "Lcom/sevenlearn/nikestore/data/MessageResponse;", "app_debug"})
public final class UserRemoteDataSource implements com.sevenlearn.nikestore.data.repo.source.UserDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.services.http.ApiService apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.TokenResponse> login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.MessageResponse> signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override()
    public void loadToken() {
    }
    
    @java.lang.Override()
    public void saveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
    }
    
    @java.lang.Override()
    public void saveUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override()
    public void signOut() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.services.http.ApiService getApiService() {
        return null;
    }
    
    public UserRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.services.http.ApiService apiService) {
        super();
    }
}