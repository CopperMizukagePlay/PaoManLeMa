package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sb */
/* loaded from: classes.dex */
public final class EnumC1269sb {

    /* renamed from: f */
    public static final EnumC1269sb f7541f;

    /* renamed from: g */
    public static final EnumC1269sb f7542g;

    /* renamed from: h */
    public static final EnumC1269sb f7543h;

    /* renamed from: i */
    public static final EnumC1269sb f7544i;

    /* renamed from: j */
    public static final EnumC1269sb f7545j;

    /* renamed from: k */
    public static final EnumC1269sb f7546k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC1269sb[] f7547l;

    /* renamed from: m */
    public static final /* synthetic */ C2719b f7548m;

    /* renamed from: e */
    public final String f7549e;

    static {
        EnumC1269sb enumC1269sb = new EnumC1269sb(0, "Test", "测速");
        f7541f = enumC1269sb;
        EnumC1269sb enumC1269sb2 = new EnumC1269sb(1, "Diagnostics", "诊断");
        f7542g = enumC1269sb2;
        EnumC1269sb enumC1269sb3 = new EnumC1269sb(2, "Downloader", "下载器");
        f7543h = enumC1269sb3;
        EnumC1269sb enumC1269sb4 = new EnumC1269sb(3, "Config", "配置");
        f7544i = enumC1269sb4;
        EnumC1269sb enumC1269sb5 = new EnumC1269sb(4, "TestSettings", "测速设置");
        f7545j = enumC1269sb5;
        EnumC1269sb enumC1269sb6 = new EnumC1269sb(5, "History", "历史");
        f7546k = enumC1269sb6;
        EnumC1269sb[] enumC1269sbArr = {enumC1269sb, enumC1269sb2, enumC1269sb3, enumC1269sb4, enumC1269sb5, enumC1269sb6};
        f7547l = enumC1269sbArr;
        f7548m = new C2719b(enumC1269sbArr);
    }

    public EnumC1269sb(int i7, String str, String str2) {
        this.f7549e = str2;
    }

    public static EnumC1269sb valueOf(String str) {
        return (EnumC1269sb) Enum.valueOf(EnumC1269sb.class, str);
    }

    public static EnumC1269sb[] values() {
        return (EnumC1269sb[]) f7547l.clone();
    }
}
