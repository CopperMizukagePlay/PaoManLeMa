package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cc */
/* loaded from: classes.dex */
public final class EnumC0771cc {

    /* renamed from: f */
    public static final EnumC0771cc f3022f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0771cc[] f3023g;

    /* renamed from: h */
    public static final /* synthetic */ C2719b f3024h;

    /* renamed from: e */
    public final String f3025e;

    static {
        EnumC0771cc enumC0771cc = new EnumC0771cc(0, "DUAL_PORT", "双端口并行");
        f3022f = enumC0771cc;
        EnumC0771cc[] enumC0771ccArr = {enumC0771cc, new EnumC0771cc(1, "NATIVE", "--bidir 单端口")};
        f3023g = enumC0771ccArr;
        f3024h = new C2719b(enumC0771ccArr);
    }

    public EnumC0771cc(int i7, String str, String str2) {
        this.f3025e = str2;
    }

    public static EnumC0771cc valueOf(String str) {
        return (EnumC0771cc) Enum.valueOf(EnumC0771cc.class, str);
    }

    public static EnumC0771cc[] values() {
        return (EnumC0771cc[]) f3023g.clone();
    }
}
