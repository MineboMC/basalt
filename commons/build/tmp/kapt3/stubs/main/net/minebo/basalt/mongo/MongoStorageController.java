package net.minebo.basalt.mongo;

/**
 * Class created on 9/27/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e2\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0013J7\u0010\u0014\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015 \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u000e0\u000e2\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u000eJ!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001\u00a2\u0006\u0002\u0010!J.\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u000e\"\u0004\b\u0002\u0010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0%2\u0006\u0010\u001e\u001a\u00020\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lnet/minebo/basalt/mongo/MongoStorageController;", "K", "V", "", "collectionName", "", "serialClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "retrieve", "Ljava/util/concurrent/CompletableFuture;", "key", "(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;", "delete", "", "(Ljava/lang/Object;)V", "deleteAsynchronously", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "aggregate", "", "constraints", "", "Lorg/bson/conversions/Bson;", "getAll", "asynchronouslyInsert", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;", "insert", "(Ljava/lang/Object;Ljava/lang/Object;)V", "filter", "T", "property", "Lkotlin/reflect/KProperty;", "commons"})
public final class MongoStorageController<K extends java.lang.Object, V extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<V> serialClass = null;
    @org.jetbrains.annotations.NotNull()
    private com.mongodb.client.MongoCollection<org.bson.Document> collection;
    
    public MongoStorageController(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionName, @org.jetbrains.annotations.NotNull()
    java.lang.Class<V> serialClass) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<V> retrieve(K key) {
        return null;
    }
    
    public final void delete(K key) {
    }
    
    public final java.util.concurrent.CompletableFuture<java.lang.Void> deleteAsynchronously(K key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<V>> aggregate(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.bson.conversions.Bson> constraints) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<V>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> asynchronouslyInsert(K key, V value) {
        return null;
    }
    
    public final void insert(K key, V value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.util.concurrent.CompletableFuture<java.util.List<V>> filter(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<? extends T> property, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}