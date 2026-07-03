package p039e5;

import p000a.AbstractC0000a;
import p035e1.C0671o0;
import p035e1.C0677s;
import p060h5.AbstractC1793a0;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p102n1.AbstractC2710c;
import p105n5.C2719b;
import p174w5.AbstractC3784a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ro */
/* loaded from: classes.dex */
public final class EnumC1251ro {

    /* renamed from: g */
    public static final EnumC1251ro f7399g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1251ro[] f7400h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f7401i;

    /* renamed from: e */
    public final String f7402e;

    /* renamed from: f */
    public final C2266e f7403f;

    static {
        C2266e c2266e = AbstractC2710c.f14554q;
        if (c2266e == null) {
            C2264d c2264d = new C2264d("Filled.Rule", false);
            int i7 = AbstractC2263c0.f13117a;
            C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
            C0811dk c0811dk = new C0811dk(2);
            c0811dk.m1512m(16.54f, 11.0f);
            c0811dk.m1510k(13.0f, 7.46f);
            c0811dk.m1511l(1.41f, -1.41f);
            c0811dk.m1511l(2.12f, 2.12f);
            c0811dk.m1511l(4.24f, -4.24f);
            c0811dk.m1511l(1.41f, 1.41f);
            c0811dk.m1510k(16.54f, 11.0f);
            c0811dk.m1505f();
            c0811dk.m1512m(11.0f, 7.0f);
            c0811dk.m1508i(2.0f);
            c0811dk.m1517r(2.0f);
            c0811dk.m1509j(9.0f);
            c0811dk.m1516q(7.0f);
            c0811dk.m1505f();
            c0811dk.m1512m(21.0f, 13.41f);
            c0811dk.m1510k(19.59f, 12.0f);
            c0811dk.m1510k(17.0f, 14.59f);
            c0811dk.m1510k(14.41f, 12.0f);
            c0811dk.m1510k(13.0f, 13.41f);
            c0811dk.m1510k(15.59f, 16.0f);
            c0811dk.m1510k(13.0f, 18.59f);
            c0811dk.m1510k(14.41f, 20.0f);
            c0811dk.m1510k(17.0f, 17.41f);
            c0811dk.m1510k(19.59f, 20.0f);
            c0811dk.m1510k(21.0f, 18.59f);
            c0811dk.m1510k(18.41f, 16.0f);
            c0811dk.m1510k(21.0f, 13.41f);
            c0811dk.m1505f();
            c0811dk.m1512m(11.0f, 15.0f);
            c0811dk.m1508i(2.0f);
            c0811dk.m1517r(2.0f);
            c0811dk.m1509j(9.0f);
            c0811dk.m1516q(15.0f);
            c0811dk.m1505f();
            C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
            c2266e = c2264d.m3673b();
            AbstractC2710c.f14554q = c2266e;
        }
        EnumC1251ro enumC1251ro = new EnumC1251ro("Conditions", 0, "测速条件", c2266e);
        EnumC1251ro enumC1251ro2 = new EnumC1251ro("Configuration", 1, "设置", AbstractC1793a0.m2962B());
        EnumC1251ro enumC1251ro3 = new EnumC1251ro("DnsResolution", 2, "DNS解析", AbstractC3784a.m5806l());
        EnumC1251ro enumC1251ro4 = new EnumC1251ro("PingMonitor", 3, "测速Ping监控", AbstractC2710c.m4349w());
        EnumC1251ro enumC1251ro5 = new EnumC1251ro("MultiInterface", 4, "多接口", AbstractC2710c.m4346t());
        EnumC1251ro enumC1251ro6 = new EnumC1251ro("BackgroundKeepAlive", 5, "后台与保活", AbstractC0000a.m14o());
        EnumC1251ro enumC1251ro7 = new EnumC1251ro("Downloader", 6, "下载器", AbstractC2710c.m4341o());
        f7399g = enumC1251ro7;
        EnumC1251ro[] enumC1251roArr = {enumC1251ro, enumC1251ro2, enumC1251ro3, enumC1251ro4, enumC1251ro5, enumC1251ro6, enumC1251ro7, new EnumC1251ro("Miscellaneous", 7, "杂项", AbstractC1793a0.m2989q()), new EnumC1251ro("About", 8, "关于", AbstractC0000a.m11l())};
        f7400h = enumC1251roArr;
        f7401i = new C2719b(enumC1251roArr);
    }

    public EnumC1251ro(String str, int i7, String str2, C2266e c2266e) {
        this.f7402e = str2;
        this.f7403f = c2266e;
    }

    /* renamed from: a */
    public static C2719b m2300a() {
        return f7401i;
    }

    public static EnumC1251ro valueOf(String str) {
        return (EnumC1251ro) Enum.valueOf(EnumC1251ro.class, str);
    }

    public static EnumC1251ro[] values() {
        return (EnumC1251ro[]) f7400h.clone();
    }
}
