package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nk */
/* loaded from: classes.dex */
public final class EnumC1123nk {

    /* renamed from: g */
    public static final EnumC1123nk f6329g;

    /* renamed from: h */
    public static final EnumC1123nk f6330h;

    /* renamed from: i */
    public static final EnumC1123nk f6331i;

    /* renamed from: j */
    public static final EnumC1123nk f6332j;

    /* renamed from: k */
    public static final EnumC1123nk f6333k;

    /* renamed from: l */
    public static final EnumC1123nk f6334l;

    /* renamed from: m */
    public static final /* synthetic */ EnumC1123nk[] f6335m;

    /* renamed from: n */
    public static final /* synthetic */ C2719b f6336n;

    /* renamed from: e */
    public final String f6337e;

    /* renamed from: f */
    public final EnumC1269sb f6338f;

    static {
        EnumC1123nk enumC1123nk = new EnumC1123nk("Test", 0, "测速", EnumC1269sb.f7541f);
        f6329g = enumC1123nk;
        EnumC1123nk enumC1123nk2 = new EnumC1123nk("Diagnostics", 1, "诊断", EnumC1269sb.f7542g);
        f6330h = enumC1123nk2;
        EnumC1123nk enumC1123nk3 = new EnumC1123nk("Downloader", 2, "下载器", EnumC1269sb.f7543h);
        f6331i = enumC1123nk3;
        EnumC1123nk enumC1123nk4 = new EnumC1123nk("TestSettings", 3, "测速设置", EnumC1269sb.f7545j);
        f6332j = enumC1123nk4;
        EnumC1123nk enumC1123nk5 = new EnumC1123nk("Config", 4, "配置", EnumC1269sb.f7544i);
        f6333k = enumC1123nk5;
        EnumC1123nk enumC1123nk6 = new EnumC1123nk("History", 5, "历史", EnumC1269sb.f7546k);
        f6334l = enumC1123nk6;
        EnumC1123nk[] enumC1123nkArr = {enumC1123nk, enumC1123nk2, enumC1123nk3, enumC1123nk4, enumC1123nk5, enumC1123nk6};
        f6335m = enumC1123nkArr;
        f6336n = new C2719b(enumC1123nkArr);
    }

    public EnumC1123nk(String str, int i7, String str2, EnumC1269sb enumC1269sb) {
        this.f6337e = str2;
        this.f6338f = enumC1269sb;
    }

    public static EnumC1123nk valueOf(String str) {
        return (EnumC1123nk) Enum.valueOf(EnumC1123nk.class, str);
    }

    public static EnumC1123nk[] values() {
        return (EnumC1123nk[]) f6335m.clone();
    }
}
