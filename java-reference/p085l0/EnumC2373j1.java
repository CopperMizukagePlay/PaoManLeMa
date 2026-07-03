package p085l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.j1 */
/* loaded from: classes.dex */
public final class EnumC2373j1 {

    /* renamed from: e */
    public static final EnumC2373j1 f13415e;

    /* renamed from: f */
    public static final EnumC2373j1 f13416f;

    /* renamed from: g */
    public static final EnumC2373j1 f13417g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC2373j1[] f13418h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2373j1 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l0.j1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l0.j1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l0.j1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l0.j1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, l0.j1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, l0.j1] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, l0.j1] */
    static {
        ?? r02 = new Enum("Invalid", 0);
        ?? r12 = new Enum("Cancelled", 1);
        f13415e = r12;
        ?? r22 = new Enum("InitialPending", 2);
        ?? r32 = new Enum("RecomposePending", 3);
        ?? r42 = new Enum("Recomposing", 4);
        f13416f = r42;
        ?? r52 = new Enum("ApplyPending", 5);
        f13417g = r52;
        f13418h = new EnumC2373j1[]{r02, r12, r22, r32, r42, r52, new Enum("Applied", 6)};
    }

    public static EnumC2373j1 valueOf(String str) {
        return (EnumC2373j1) Enum.valueOf(EnumC2373j1.class, str);
    }

    public static EnumC2373j1[] values() {
        return (EnumC2373j1[]) f13418h.clone();
    }
}
