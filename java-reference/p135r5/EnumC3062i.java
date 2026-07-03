package p135r5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r5.i */
/* loaded from: classes.dex */
public final class EnumC3062i {

    /* renamed from: e */
    public static final EnumC3062i f15656e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC3062i[] f15657f;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3062i EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r5.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r5.i] */
    static {
        ?? r02 = new Enum("TOP_DOWN", 0);
        ?? r12 = new Enum("BOTTOM_UP", 1);
        f15656e = r12;
        f15657f = new EnumC3062i[]{r02, r12};
    }

    public static EnumC3062i valueOf(String str) {
        return (EnumC3062i) Enum.valueOf(EnumC3062i.class, str);
    }

    public static EnumC3062i[] values() {
        return (EnumC3062i[]) f15657f.clone();
    }
}
