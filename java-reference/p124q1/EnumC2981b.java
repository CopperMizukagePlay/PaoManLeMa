package p124q1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q1.b */
/* loaded from: classes.dex */
public final class EnumC2981b {

    /* renamed from: e */
    public static final EnumC2981b f15404e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC2981b[] f15405f;

    /* JADX WARN: Type inference failed for: r0v0, types: [q1.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q1.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Lsq2", 0);
        f15404e = r02;
        f15405f = new EnumC2981b[]{r02, new Enum("Impulse", 1)};
    }

    public static EnumC2981b valueOf(String str) {
        return (EnumC2981b) Enum.valueOf(EnumC2981b.class, str);
    }

    public static EnumC2981b[] values() {
        return (EnumC2981b[]) f15405f.clone();
    }
}
