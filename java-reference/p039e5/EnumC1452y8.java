package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.y8 */
/* loaded from: classes.dex */
public final class EnumC1452y8 {

    /* renamed from: f */
    public static final EnumC1452y8 f9301f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1452y8[] f9302g;

    /* renamed from: h */
    public static final /* synthetic */ C2719b f9303h;

    /* renamed from: e */
    public final String f9304e;

    static {
        EnumC1452y8 enumC1452y8 = new EnumC1452y8(0, "HTTP_1_1", "HTTP/1.1");
        f9301f = enumC1452y8;
        EnumC1452y8[] enumC1452y8Arr = {enumC1452y8, new EnumC1452y8(1, "HTTP_2", "HTTP/2")};
        f9302g = enumC1452y8Arr;
        f9303h = new C2719b(enumC1452y8Arr);
    }

    public EnumC1452y8(int i7, String str, String str2) {
        this.f9304e = str2;
    }

    public static EnumC1452y8 valueOf(String str) {
        return (EnumC1452y8) Enum.valueOf(EnumC1452y8.class, str);
    }

    public static EnumC1452y8[] values() {
        return (EnumC1452y8[]) f9302g.clone();
    }
}
