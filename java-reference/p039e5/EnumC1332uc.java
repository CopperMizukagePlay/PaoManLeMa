package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.uc */
/* loaded from: classes.dex */
public final class EnumC1332uc {

    /* renamed from: f */
    public static final EnumC1332uc f7919f;

    /* renamed from: g */
    public static final EnumC1332uc f7920g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1332uc[] f7921h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f7922i;

    /* renamed from: e */
    public final String f7923e;

    static {
        EnumC1332uc enumC1332uc = new EnumC1332uc(0, "TCP", "TCP");
        f7919f = enumC1332uc;
        EnumC1332uc enumC1332uc2 = new EnumC1332uc(1, "UDP", "UDP");
        f7920g = enumC1332uc2;
        EnumC1332uc[] enumC1332ucArr = {enumC1332uc, enumC1332uc2};
        f7921h = enumC1332ucArr;
        f7922i = new C2719b(enumC1332ucArr);
    }

    public EnumC1332uc(int i7, String str, String str2) {
        this.f7923e = str2;
    }

    public static EnumC1332uc valueOf(String str) {
        return (EnumC1332uc) Enum.valueOf(EnumC1332uc.class, str);
    }

    public static EnumC1332uc[] values() {
        return (EnumC1332uc[]) f7921h.clone();
    }
}
