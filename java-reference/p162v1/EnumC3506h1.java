package p162v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.h1 */
/* loaded from: classes.dex */
public final class EnumC3506h1 {

    /* renamed from: e */
    public static final EnumC3506h1 f16924e;

    /* renamed from: f */
    public static final EnumC3506h1 f16925f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3506h1[] f16926g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.h1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.h1] */
    static {
        ?? r02 = new Enum("Width", 0);
        f16924e = r02;
        ?? r12 = new Enum("Height", 1);
        f16925f = r12;
        f16926g = new EnumC3506h1[]{r02, r12};
    }

    public static EnumC3506h1 valueOf(String str) {
        return (EnumC3506h1) Enum.valueOf(EnumC3506h1.class, str);
    }

    public static EnumC3506h1[] values() {
        return (EnumC3506h1[]) f16926g.clone();
    }
}
