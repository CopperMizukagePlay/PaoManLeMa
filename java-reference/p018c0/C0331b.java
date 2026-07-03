package p018c0;

import android.os.Build;
import android.os.SystemClock;
import com.paoman.lema.FloatingSpeedService;
import p039e5.C0976ir;
import p039e5.C1158oo;
import p039e5.C1247rk;
import p039e5.EnumC0749bm;
import p053g5.C1694m;
import p054g6.InterfaceC1704e;
import p082k5.InterfaceC2313c;
import p170w1.C3730t1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.b */
/* loaded from: classes.dex */
public final class C0331b implements InterfaceC1704e {

    /* renamed from: e */
    public final /* synthetic */ int f1144e;

    /* renamed from: f */
    public final /* synthetic */ Object f1145f;

    public /* synthetic */ C0331b(int i7, Object obj) {
        this.f1144e = i7;
        this.f1145f = obj;
    }

    @Override // p054g6.InterfaceC1704e
    /* renamed from: h */
    public final Object mo160h(Object obj, InterfaceC2313c interfaceC2313c) {
        boolean z7;
        double d7;
        boolean z8;
        boolean z9;
        C1158oo c1158oo;
        String str;
        switch (this.f1144e) {
            case 0:
                C0349s c0349s = (C0349s) this.f1145f;
                if (Build.VERSION.SDK_INT >= 34) {
                    C0337g.f1158a.m695a(c0349s.m787a(), c0349s.f1170b);
                }
                return C1694m.f10482a;
            case 1:
                C0976ir c0976ir = (C0976ir) obj;
                FloatingSpeedService floatingSpeedService = (FloatingSpeedService) this.f1145f;
                if (floatingSpeedService.f1547k == EnumC0749bm.f2843e) {
                    boolean z10 = floatingSpeedService.f1548l;
                    boolean z11 = c0976ir.f4968a;
                    boolean z12 = c0976ir.f4984q;
                    boolean z13 = c0976ir.f4983p;
                    if (!z11 && !c0976ir.f4969b) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    floatingSpeedService.f1548l = z7;
                    double d8 = 0.0d;
                    if (z13) {
                        d7 = c0976ir.f4970c;
                    } else {
                        d7 = 0.0d;
                    }
                    if (z12) {
                        d8 = c0976ir.f4971d;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - floatingSpeedService.f1562z < 500 && z10 == floatingSpeedService.f1548l) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (elapsedRealtime - floatingSpeedService.f1561y >= 1000) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        floatingSpeedService.f1561y = elapsedRealtime;
                    }
                    if (floatingSpeedService.f1548l && z9) {
                        if (z13) {
                            floatingSpeedService.f1559w.add(new Double(d7));
                        }
                        if (z12) {
                            floatingSpeedService.f1560x.add(new Double(d8));
                        }
                    }
                    if (z10 && !floatingSpeedService.f1548l) {
                        C1247rk.f7381h.m2202v();
                        floatingSpeedService.m984b();
                    } else {
                        if (z8) {
                            floatingSpeedService.f1562z = elapsedRealtime;
                            C1158oo c1158oo2 = floatingSpeedService.f1546j;
                            if (c1158oo2 != null) {
                                if (floatingSpeedService.f1548l) {
                                    str = "正在测速";
                                } else {
                                    str = "点击切换监视器 · 长按切换单位";
                                }
                                c1158oo2.m2023f("跑满了吗", str, floatingSpeedService.m983a(d7), floatingSpeedService.m983a(d8), floatingSpeedService.m987f(), true, floatingSpeedService.f1548l);
                            }
                        }
                        if (z9 && (c1158oo = floatingSpeedService.f1546j) != null) {
                            c1158oo.m2019a((float) d7, (float) d8);
                        }
                    }
                }
                return C1694m.f10482a;
            default:
                ((C3730t1) this.f1145f).f17784e.m3730h(((Number) obj).floatValue());
                return C1694m.f10482a;
        }
    }
}
