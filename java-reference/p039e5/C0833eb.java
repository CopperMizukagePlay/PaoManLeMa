package p039e5;

import com.paoman.lema.FloatingSpeedService;
import p001a0.C0062p0;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.eb */
/* loaded from: classes.dex */
public final /* synthetic */ class C0833eb implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f3669e;

    /* renamed from: f */
    public final /* synthetic */ FloatingSpeedService f3670f;

    public /* synthetic */ C0833eb(FloatingSpeedService floatingSpeedService, int i7) {
        this.f3669e = i7;
        this.f3670f = floatingSpeedService;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f3669e;
        C1694m c1694m = C1694m.f10482a;
        FloatingSpeedService floatingSpeedService = this.f3670f;
        switch (i7) {
            case 0:
                EnumC0749bm enumC0749bm = floatingSpeedService.f1547k;
                EnumC0749bm enumC0749bm2 = EnumC0749bm.f2844f;
                EnumC0749bm enumC0749bm3 = EnumC0749bm.f2843e;
                if (enumC0749bm == enumC0749bm3) {
                    enumC0749bm3 = enumC0749bm2;
                }
                floatingSpeedService.f1547k = enumC0749bm3;
                C1158oo c1158oo = floatingSpeedService.f1546j;
                if (c1158oo != null) {
                    c1158oo.f6710l.clear();
                    c1158oo.f6711m.clear();
                    c1158oo.invalidate();
                }
                InterfaceC2313c interfaceC2313c = null;
                if (floatingSpeedService.f1547k == enumC0749bm2) {
                    C0565q1 c0565q1 = floatingSpeedService.f1544h;
                    if (c0565q1 != null) {
                        c0565q1.mo1114c(null);
                    }
                    floatingSpeedService.f1557u = C1247rk.f7379f.m2201t();
                    floatingSpeedService.f1544h = AbstractC0525d0.m1141s(floatingSpeedService.f1541e, null, new C0062p0(floatingSpeedService, interfaceC2313c, 10), 3);
                } else {
                    C0565q1 c0565q12 = floatingSpeedService.f1544h;
                    if (c0565q12 != null) {
                        c0565q12.mo1114c(null);
                    }
                    floatingSpeedService.f1557u = null;
                }
                floatingSpeedService.m985c();
                return c1694m;
            case 1:
                int i8 = FloatingSpeedService.f1540A;
                floatingSpeedService.m986d(false, true);
                return c1694m;
            case 2:
                int i9 = FloatingSpeedService.f1540A;
                floatingSpeedService.m986d(true, false);
                return c1694m;
            case 3:
                int i10 = FloatingSpeedService.f1540A;
                floatingSpeedService.m986d(true, true);
                return c1694m;
            case 4:
                floatingSpeedService.f1542f.m1962S0();
                floatingSpeedService.f1548l = false;
                C1247rk.f7381h.m2202v();
                floatingSpeedService.m984b();
                return c1694m;
            default:
                EnumC0865fb enumC0865fb = floatingSpeedService.f1558v;
                EnumC0865fb enumC0865fb2 = EnumC0865fb.f3982e;
                if (enumC0865fb == enumC0865fb2) {
                    enumC0865fb2 = EnumC0865fb.f3983f;
                }
                floatingSpeedService.f1558v = enumC0865fb2;
                floatingSpeedService.m985c();
                return c1694m;
        }
    }
}
