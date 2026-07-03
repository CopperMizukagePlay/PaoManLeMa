package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fb */
/* loaded from: classes.dex */
public final class EnumC0865fb {

    /* renamed from: e */
    public static final EnumC0865fb f3982e;

    /* renamed from: f */
    public static final EnumC0865fb f3983f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0865fb[] f3984g;

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.fb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e5.fb, java.lang.Enum] */
    static {
        ?? r02 = new Enum("MBPS", 0);
        f3982e = r02;
        ?? r12 = new Enum("MB_PER_SEC", 1);
        f3983f = r12;
        f3984g = new EnumC0865fb[]{r02, r12};
    }

    public static EnumC0865fb valueOf(String str) {
        return (EnumC0865fb) Enum.valueOf(EnumC0865fb.class, str);
    }

    public static EnumC0865fb[] values() {
        return (EnumC0865fb[]) f3984g.clone();
    }
}
