package com.sevenlearn.nikestore.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/sevenlearn/nikestore/common/NikeException;", "", "type", "Lcom/sevenlearn/nikestore/common/NikeException$Type;", "userFriendlyMessage", "", "serverMessage", "", "(Lcom/sevenlearn/nikestore/common/NikeException$Type;ILjava/lang/String;)V", "getServerMessage", "()Ljava/lang/String;", "getType", "()Lcom/sevenlearn/nikestore/common/NikeException$Type;", "getUserFriendlyMessage", "()I", "Type", "app_debug"})
public final class NikeException extends java.lang.Throwable {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.common.NikeException.Type type = null;
    private final int userFriendlyMessage = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String serverMessage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.common.NikeException.Type getType() {
        return null;
    }
    
    public final int getUserFriendlyMessage() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getServerMessage() {
        return null;
    }
    
    public NikeException(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.common.NikeException.Type type, @androidx.annotation.StringRes()
    int userFriendlyMessage, @org.jetbrains.annotations.Nullable()
    java.lang.String serverMessage) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/sevenlearn/nikestore/common/NikeException$Type;", "", "(Ljava/lang/String;I)V", "SIMPLE", "DIALOG", "AUTH", "app_debug"})
    public static enum Type {
        /*public static final*/ SIMPLE /* = new SIMPLE() */,
        /*public static final*/ DIALOG /* = new DIALOG() */,
        /*public static final*/ AUTH /* = new AUTH() */;
        
        Type() {
        }
    }
}