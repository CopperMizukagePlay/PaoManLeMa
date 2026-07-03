package p191z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z0.a */
/* loaded from: classes.dex */
public final class EnumC3862a {

    /* renamed from: e */
    public static final EnumC3862a f18097e;

    /* renamed from: f */
    public static final EnumC3862a f18098f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3862a[] f18099g;

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z0.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SHOW_ORIGINAL", 0);
        f18097e = r02;
        ?? r12 = new Enum("SHOW_TRANSLATED", 1);
        f18098f = r12;
        f18099g = new EnumC3862a[]{r02, r12};
    }

    public static EnumC3862a valueOf(String str) {
        return (EnumC3862a) Enum.valueOf(EnumC3862a.class, str);
    }

    public static EnumC3862a[] values() {
        return (EnumC3862a[]) f18099g.clone();
    }
}
