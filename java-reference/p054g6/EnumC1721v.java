package p054g6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.v */
/* loaded from: classes.dex */
public final class EnumC1721v {

    /* renamed from: e */
    public static final EnumC1721v f10560e;

    /* renamed from: f */
    public static final EnumC1721v f10561f;

    /* renamed from: g */
    public static final EnumC1721v f10562g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1721v[] f10563h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g6.v] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g6.v] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g6.v] */
    static {
        ?? r02 = new Enum("START", 0);
        f10560e = r02;
        ?? r12 = new Enum("STOP", 1);
        f10561f = r12;
        ?? r22 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f10562g = r22;
        f10563h = new EnumC1721v[]{r02, r12, r22};
    }

    public static EnumC1721v valueOf(String str) {
        return (EnumC1721v) Enum.valueOf(EnumC1721v.class, str);
    }

    public static EnumC1721v[] values() {
        return (EnumC1721v[]) f10563h.clone();
    }
}
