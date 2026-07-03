package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public final class EnumC0203o {

    /* renamed from: e */
    public static final EnumC0203o f863e;

    /* renamed from: f */
    public static final EnumC0203o f864f;

    /* renamed from: g */
    public static final EnumC0203o f865g;

    /* renamed from: h */
    public static final EnumC0203o f866h;

    /* renamed from: i */
    public static final EnumC0203o f867i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC0203o[] f868j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f863e = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f864f = r12;
        ?? r22 = new Enum("CREATED", 2);
        f865g = r22;
        ?? r32 = new Enum("STARTED", 3);
        f866h = r32;
        ?? r42 = new Enum("RESUMED", 4);
        f867i = r42;
        f868j = new EnumC0203o[]{r02, r12, r22, r32, r42};
    }

    public static EnumC0203o valueOf(String str) {
        return (EnumC0203o) Enum.valueOf(EnumC0203o.class, str);
    }

    public static EnumC0203o[] values() {
        return (EnumC0203o[]) f868j.clone();
    }
}
