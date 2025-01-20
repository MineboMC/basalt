package net.minebo.basalt.models.grant.types.proof;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u000278BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010$Jd\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00069"}, d2 = {"Lnet/minebo/basalt/models/grant/types/proof/ProofEntry;", "", "link", "", "type", "Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ProofType;", "addedAt", "", "whoAdded", "Ljava/util/UUID;", "shouldBeConfidential", "", "reviewer", "reviewStatus", "Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ReviewStatus;", "reviewedAt", "<init>", "(Ljava/lang/String;Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ProofType;JLjava/util/UUID;ZLjava/util/UUID;Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ReviewStatus;Ljava/lang/Long;)V", "getLink", "()Ljava/lang/String;", "getType", "()Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ProofType;", "getAddedAt", "()J", "getWhoAdded", "()Ljava/util/UUID;", "getShouldBeConfidential", "()Z", "getReviewer", "setReviewer", "(Ljava/util/UUID;)V", "getReviewStatus", "()Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ReviewStatus;", "setReviewStatus", "(Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ReviewStatus;)V", "getReviewedAt", "()Ljava/lang/Long;", "setReviewedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ProofType;JLjava/util/UUID;ZLjava/util/UUID;Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ReviewStatus;Ljava/lang/Long;)Lnet/minebo/basalt/models/grant/types/proof/ProofEntry;", "equals", "other", "hashCode", "", "toString", "ProofType", "ReviewStatus", "commons"})
public final class ProofEntry {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String link = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.grant.types.proof.ProofEntry.ProofType type = null;
    private final long addedAt = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID whoAdded = null;
    private final boolean shouldBeConfidential = false;
    @org.jetbrains.annotations.Nullable()
    private java.util.UUID reviewer;
    @org.jetbrains.annotations.Nullable()
    private net.minebo.basalt.models.grant.types.proof.ProofEntry.ReviewStatus reviewStatus;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long reviewedAt;
    
    public ProofEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.proof.ProofEntry.ProofType type, long addedAt, @org.jetbrains.annotations.NotNull()
    java.util.UUID whoAdded, boolean shouldBeConfidential, @org.jetbrains.annotations.Nullable()
    java.util.UUID reviewer, @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.grant.types.proof.ProofEntry.ReviewStatus reviewStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Long reviewedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.proof.ProofEntry.ProofType getType() {
        return null;
    }
    
    public final long getAddedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getWhoAdded() {
        return null;
    }
    
    public final boolean getShouldBeConfidential() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID getReviewer() {
        return null;
    }
    
    public final void setReviewer(@org.jetbrains.annotations.Nullable()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.grant.types.proof.ProofEntry.ReviewStatus getReviewStatus() {
        return null;
    }
    
    public final void setReviewStatus(@org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.grant.types.proof.ProofEntry.ReviewStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getReviewedAt() {
        return null;
    }
    
    public final void setReviewedAt(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.proof.ProofEntry.ProofType component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.grant.types.proof.ProofEntry.ReviewStatus component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.proof.ProofEntry copy(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.proof.ProofEntry.ProofType type, long addedAt, @org.jetbrains.annotations.NotNull()
    java.util.UUID whoAdded, boolean shouldBeConfidential, @org.jetbrains.annotations.Nullable()
    java.util.UUID reviewer, @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.grant.types.proof.ProofEntry.ReviewStatus reviewStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Long reviewedAt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ProofType;", "", "displayName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "VIDEO", "IMAGES", "STAFF_SUPERVISION", "commons"})
    public static enum ProofType {
        /*public static final*/ VIDEO /* = new VIDEO(null) */,
        /*public static final*/ IMAGES /* = new IMAGES(null) */,
        /*public static final*/ STAFF_SUPERVISION /* = new STAFF_SUPERVISION(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayName = null;
        
        ProofType(java.lang.String displayName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<net.minebo.basalt.models.grant.types.proof.ProofEntry.ProofType> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/models/grant/types/proof/ProofEntry$ReviewStatus;", "", "displayName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "ACCEPTED", "REPUNISHED", "REJECTED", "commons"})
    public static enum ReviewStatus {
        /*public static final*/ ACCEPTED /* = new ACCEPTED(null) */,
        /*public static final*/ REPUNISHED /* = new REPUNISHED(null) */,
        /*public static final*/ REJECTED /* = new REJECTED(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayName = null;
        
        ReviewStatus(java.lang.String displayName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<net.minebo.basalt.models.grant.types.proof.ProofEntry.ReviewStatus> getEntries() {
            return null;
        }
    }
}