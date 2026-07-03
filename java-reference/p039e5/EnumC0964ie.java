package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ie */
/* loaded from: classes.dex */
public final class EnumC0964ie {

    /* renamed from: f */
    public static final EnumC0964ie f4826f;

    /* renamed from: g */
    public static final EnumC0964ie f4827g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0964ie[] f4828h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f4829i;

    /* renamed from: e */
    public final String f4830e;

    static {
        EnumC0964ie enumC0964ie = new EnumC0964ie(0, "UserAgreement", "用户协议");
        f4826f = enumC0964ie;
        EnumC0964ie enumC0964ie2 = new EnumC0964ie(1, "PrivacyPolicy", "隐私政策");
        f4827g = enumC0964ie2;
        EnumC0964ie[] enumC0964ieArr = {enumC0964ie, enumC0964ie2, new EnumC0964ie(2, "OpenSourceNotice", "开源声明")};
        f4828h = enumC0964ieArr;
        f4829i = new C2719b(enumC0964ieArr);
    }

    public EnumC0964ie(int i7, String str, String str2) {
        this.f4830e = str2;
    }

    public static EnumC0964ie valueOf(String str) {
        return (EnumC0964ie) Enum.valueOf(EnumC0964ie.class, str);
    }

    public static EnumC0964ie[] values() {
        return (EnumC0964ie[]) f4828h.clone();
    }
}
