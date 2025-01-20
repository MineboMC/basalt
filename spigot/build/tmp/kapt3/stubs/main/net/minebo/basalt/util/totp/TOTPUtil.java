package net.minebo.basalt.util.totp;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0005J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005J.\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\u0010\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\bJ \u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\bJ\u001e\u0010%\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0002J\u0018\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lnet/minebo/basalt/util/totp/TOTPUtil;", "", "<init>", "()V", "DEFAULT_TIME_STEP_SECONDS", "", "NUM_DIGITS_OUTPUT", "blockOfZeros", "", "SECURE_RANDOM", "Ljava/security/SecureRandom;", "BASE_32_ENCODER", "Lorg/apache/commons/codec/binary/Base32;", "generateSecret", "qrImageUrl", "secret", "username", "generateOtpAuthUrl", "keyId", "addOtpAuthPart", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "generateBase32Secret", "length", "validateCurrentNumber", "", "base32Secret", "authNumber", "windowMillis", "timeMillis", "", "timeStepSeconds", "generateCurrentNumberString", "generateNumberString", "generateCurrentNumber", "generateNumber", "zeroPrepend", "num", "digits", "decodeBase32", "", "string", "spigot"})
public final class TOTPUtil {
    public static final int DEFAULT_TIME_STEP_SECONDS = 30;
    private static final int NUM_DIGITS_OUTPUT = 6;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String blockOfZeros;
    @org.jetbrains.annotations.Nullable()
    private static java.security.SecureRandom SECURE_RANDOM;
    @org.jetbrains.annotations.NotNull()
    private static final org.apache.commons.codec.binary.Base32 BASE_32_ENCODER = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.util.totp.TOTPUtil INSTANCE = null;
    
    private TOTPUtil() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String generateSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String qrImageUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateOtpAuthUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String keyId, @org.jetbrains.annotations.NotNull()
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    private final void addOtpAuthPart(java.lang.String keyId, java.lang.String username, java.lang.String secret, java.lang.StringBuilder sb) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateBase32Secret(int length) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.GeneralSecurityException.class})
    public final boolean validateCurrentNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String base32Secret, int authNumber, int windowMillis) throws java.security.GeneralSecurityException {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.GeneralSecurityException.class})
    public final boolean validateCurrentNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String base32Secret, int authNumber, int windowMillis, long timeMillis, int timeStepSeconds) throws java.security.GeneralSecurityException {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.GeneralSecurityException.class})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String generateCurrentNumberString(@org.jetbrains.annotations.NotNull()
    java.lang.String base32Secret) throws java.security.GeneralSecurityException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.GeneralSecurityException.class})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String generateNumberString(@org.jetbrains.annotations.NotNull()
    java.lang.String base32Secret, long timeMillis, int timeStepSeconds) throws java.security.GeneralSecurityException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.GeneralSecurityException.class})
    public final long generateCurrentNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String base32Secret) throws java.security.GeneralSecurityException {
        return 0L;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.GeneralSecurityException.class})
    public final long generateNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String base32Secret, long timeMillis, int timeStepSeconds) throws java.security.GeneralSecurityException {
        return 0L;
    }
    
    /**
     * Return the otp-auth part of the QR image which is suitable to be injected into other QR generators (e.g. JS
     * generator).
     *
     * @param keyId
     * Name of the key that you want to show up in the users authentication application. Should already be
     * URL encoded.
     * @param secret
     * Secret string that will be used when generating the current number.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateOtpAuthUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String keyId, @org.jetbrains.annotations.NotNull()
    java.lang.String secret) {
        return null;
    }
    
    private final void addOtpAuthPart(java.lang.String keyId, java.lang.String secret, java.lang.StringBuilder sb) {
    }
    
    /**
     * Return the string prepended with 0s. Tested as 10x faster than String.format("%06d", ...); Exposed for testing.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String zeroPrepend(long num, int digits) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] decodeBase32(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
}