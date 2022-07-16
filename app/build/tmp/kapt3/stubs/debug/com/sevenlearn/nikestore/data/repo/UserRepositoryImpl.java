package com.sevenlearn.nikestore.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/UserRepositoryImpl;", "Lcom/sevenlearn/nikestore/data/repo/UserRepository;", "userLocalDataSource", "Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;", "userRemoteDataSource", "(Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;)V", "getUserLocalDataSource", "()Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;", "getUserRemoteDataSource", "getUserName", "", "loadToken", "", "login", "Lio/reactivex/Completable;", "username", "password", "onSuccessfulLogin", "tokenResponse", "Lcom/sevenlearn/nikestore/data/TokenResponse;", "signOut", "signUp", "app_debug"})
public final class UserRepositoryImpl implements com.sevenlearn.nikestore.data.repo.UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.source.UserDataSource userLocalDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.source.UserDataSource userRemoteDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override()
    public void loadToken() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUserName() {
        return null;
    }
    
    @java.lang.Override()
    public void signOut() {
    }
    
    public final void onSuccessfulLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.TokenResponse tokenResponse) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.source.UserDataSource getUserLocalDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.source.UserDataSource getUserRemoteDataSource() {
        return null;
    }
    
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.source.UserDataSource userLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.source.UserDataSource userRemoteDataSource) {
        super();
    }
}