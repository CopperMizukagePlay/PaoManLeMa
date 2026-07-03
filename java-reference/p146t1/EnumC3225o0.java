package p146t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.o0 */
/* loaded from: classes.dex */
public final class EnumC3225o0 {

    /* renamed from: e */
    public static final EnumC3225o0 f16021e;

    /* renamed from: f */
    public static final EnumC3225o0 f16022f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3225o0[] f16023g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t1.o0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t1.o0] */
    static {
        ?? r02 = new Enum("Min", 0);
        f16021e = r02;
        ?? r12 = new Enum("Max", 1);
        f16022f = r12;
        f16023g = new EnumC3225o0[]{r02, r12};
    }

    public static EnumC3225o0 valueOf(String str) {
        return (EnumC3225o0) Enum.valueOf(EnumC3225o0.class, str);
    }

    public static EnumC3225o0[] values() {
        return (EnumC3225o0[]) f16023g.clone();
    }
}
