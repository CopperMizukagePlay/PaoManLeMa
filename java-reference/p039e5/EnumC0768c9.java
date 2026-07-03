package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.c9 */
/* loaded from: classes.dex */
public final class EnumC0768c9 {

    /* renamed from: e */
    public static final EnumC0768c9 f3005e;

    /* renamed from: f */
    public static final EnumC0768c9 f3006f;

    /* renamed from: g */
    public static final EnumC0768c9 f3007g;

    /* renamed from: h */
    public static final EnumC0768c9 f3008h;

    /* renamed from: i */
    public static final EnumC0768c9 f3009i;

    /* renamed from: j */
    public static final EnumC0768c9 f3010j;

    /* renamed from: k */
    public static final EnumC0768c9 f3011k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC0768c9[] f3012l;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.c9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.c9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e5.c9] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, e5.c9] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, e5.c9] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, e5.c9] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, e5.c9] */
    static {
        ?? r02 = new Enum("QUEUED", 0);
        f3005e = r02;
        ?? r12 = new Enum("PREPARING", 1);
        f3006f = r12;
        ?? r22 = new Enum("DOWNLOADING", 2);
        f3007g = r22;
        ?? r32 = new Enum("FINALIZING", 3);
        f3008h = r32;
        ?? r42 = new Enum("PAUSED", 4);
        f3009i = r42;
        ?? r52 = new Enum("COMPLETED", 5);
        f3010j = r52;
        ?? r62 = new Enum("FAILED", 6);
        f3011k = r62;
        f3012l = new EnumC0768c9[]{r02, r12, r22, r32, r42, r52, r62};
    }

    public static EnumC0768c9 valueOf(String str) {
        return (EnumC0768c9) Enum.valueOf(EnumC0768c9.class, str);
    }

    public static EnumC0768c9[] values() {
        return (EnumC0768c9[]) f3012l.clone();
    }
}
