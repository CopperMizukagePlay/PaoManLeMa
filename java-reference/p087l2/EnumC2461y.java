package p087l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.y */
/* loaded from: classes.dex */
public final class EnumC2461y {

    /* renamed from: e */
    public static final EnumC2461y f13728e;

    /* renamed from: f */
    public static final EnumC2461y f13729f;

    /* renamed from: g */
    public static final EnumC2461y f13730g;

    /* renamed from: h */
    public static final EnumC2461y f13731h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC2461y[] f13732i;

    /* JADX WARN: Type inference failed for: r0v0, types: [l2.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l2.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l2.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l2.y, java.lang.Enum] */
    static {
        ?? r02 = new Enum("StartInput", 0);
        f13728e = r02;
        ?? r12 = new Enum("StopInput", 1);
        f13729f = r12;
        ?? r22 = new Enum("ShowKeyboard", 2);
        f13730g = r22;
        ?? r32 = new Enum("HideKeyboard", 3);
        f13731h = r32;
        f13732i = new EnumC2461y[]{r02, r12, r22, r32};
    }

    public static EnumC2461y valueOf(String str) {
        return (EnumC2461y) Enum.valueOf(EnumC2461y.class, str);
    }

    public static EnumC2461y[] values() {
        return (EnumC2461y[]) f13732i.clone();
    }
}
