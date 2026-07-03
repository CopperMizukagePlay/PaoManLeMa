package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.v8 */
/* loaded from: classes.dex */
public final class EnumC1359v8 {

    /* renamed from: e */
    public static final EnumC1359v8 f8123e;

    /* renamed from: f */
    public static final EnumC1359v8 f8124f;

    /* renamed from: g */
    public static final EnumC1359v8 f8125g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1359v8[] f8126h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.v8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.v8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e5.v8] */
    static {
        ?? r02 = new Enum("Idle", 0);
        f8123e = r02;
        ?? r12 = new Enum("RedirectEnhancement", 1);
        f8124f = r12;
        ?? r22 = new Enum("Dns", 2);
        f8125g = r22;
        f8126h = new EnumC1359v8[]{r02, r12, r22};
    }

    public static EnumC1359v8 valueOf(String str) {
        return (EnumC1359v8) Enum.valueOf(EnumC1359v8.class, str);
    }

    public static EnumC1359v8[] values() {
        return (EnumC1359v8[]) f8126h.clone();
    }
}
