package p039e5;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import com.paoman.lema.MainActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p017c.C0328m;
import p024c6.AbstractC0444k;
import p046f5.AbstractC1540e;
import p046f5.AbstractC1544i;
import p046f5.C1537b;
import p046f5.C1538c;
import p046f5.C1539d;
import p046f5.EnumC1536a;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3137j0;
import p144t.C3152r;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.u4 */
/* loaded from: classes.dex */
public final class C1324u4 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f7884e;

    /* renamed from: f */
    public final /* synthetic */ Object f7885f;

    public /* synthetic */ C1324u4(int i7, Object obj) {
        this.f7884e = i7;
        this.f7885f = obj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        AbstractC1540e abstractC1540e;
        int i7 = this.f7884e;
        C3807o c3807o = C3807o.f17991a;
        int i8 = 6;
        Object obj3 = C2375k.f13421a;
        Object obj4 = null;
        boolean z7 = true;
        boolean z8 = false;
        Object obj5 = this.f7885f;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b(((C1248rl) obj5).f7391b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p, 0, 0, 65534);
                }
                return c1694m;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1850a7.m3108b(((C0877fn) obj5).m1527a(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p2, 0, 0, 65534);
                }
                return c1694m;
            case 2:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    String str = ((C0716al) obj5).f2442a;
                    if (AbstractC0444k.m937a0(str)) {
                        str = "未填写";
                    }
                    AbstractC1850a7.m3108b("确定要删除服务器「" + ((Object) str) + "」吗？此操作不可撤销。", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p3.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p3, 0, 0, 65534);
                }
                return c1694m;
            case 3:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    AbstractC1850a7.m3108b(((EnumC1125nm) obj5).f6348e, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p4, 0, 0, 131070);
                }
                return c1694m;
            case 4:
                C2395p c2395p5 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p5.m3836D()) {
                    c2395p5.m3852U();
                } else {
                    InterfaceC3810r m337h = AbstractC0154b.m337h(c3807o, 10);
                    C1281sn c1281sn = (C1281sn) obj5;
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(6), C3795c.f17976q, c2395p5, 6);
                    int m3975r = AbstractC2418w.m3975r(c2395p5);
                    InterfaceC2385m1 m3882m = c2395p5.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p5, m337h);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p5.m3863c0();
                    if (c2395p5.f13485S) {
                        c2395p5.m3880l(c3558z);
                    } else {
                        c2395p5.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p5, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p5, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p5.f13485S || !AbstractC3367j.m5096a(c2395p5.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p5, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p5, C3507i.f16929c);
                    c2395p5.m3857Z(-1664547434);
                    for (C1250rn c1250rn : c1281sn.f7643r) {
                        long j6 = c1250rn.f7397a;
                        C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                        String format = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(j6));
                        AbstractC3367j.m5099d(format, "format(...)");
                        AbstractC1850a7.m3108b(AbstractC2487d.m4044h(format, "  ", c1250rn.f7398b), null, ((C2003t0) c2395p5.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p5.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p5, 0, 0, 65530);
                    }
                    c2395p5.m3888r(false);
                    c2395p5.m3888r(true);
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                C2395p c2395p6 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p6.m3836D()) {
                    c2395p6.m3852U();
                } else {
                    AbstractC1850a7.m3108b(((EnumC1163ot) obj5).f6742f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p6, 0, 0, 131070);
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C2395p c2395p7 = (C2395p) obj;
                C0328m c0328m = (C0328m) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p7.m3836D()) {
                    c2395p7.m3852U();
                } else {
                    c2395p7.m3857Z(1702901054);
                    boolean m3874i = c2395p7.m3874i(c0328m);
                    Object m3847O = c2395p7.m3847O();
                    if (m3874i || m3847O == obj3) {
                        m3847O = new C1051la(c0328m, 0);
                        c2395p7.m3877j0(m3847O);
                    }
                    c2395p7.m3888r(false);
                    AbstractC1991r4.m3161b((InterfaceC3277a) m3847O, null, false, null, null, null, null, null, AbstractC0951i1.f4715g, c2395p7, 805306368, 510);
                }
                return c1694m;
            case 7:
                C2395p c2395p8 = (C2395p) obj;
                C0834ec c0834ec = (C0834ec) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p8.m3836D()) {
                    c2395p8.m3852U();
                } else {
                    String str2 = c0834ec.f3673c;
                    String str3 = c0834ec.f3672b;
                    if (AbstractC0444k.m937a0(str2)) {
                        c2395p8.m3857Z(1272153175);
                        AbstractC1850a7.m3108b(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p8.m3878k(AbstractC1913h7.f11292a)).f11254k, c2395p8, 0, 0, 65534);
                        c2395p8.m3888r(false);
                    } else {
                        c2395p8.m3857Z(1272302316);
                        C3152r m4857a2 = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p8, 0);
                        int hashCode = Long.hashCode(c2395p8.f13486T);
                        InterfaceC2385m1 m3882m2 = c2395p8.m3882m();
                        InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p8, c3807o);
                        InterfaceC3510j.f16935d.getClass();
                        C3558z c3558z2 = C3507i.f16928b;
                        c2395p8.m3863c0();
                        if (c2395p8.f13485S) {
                            c2395p8.m3880l(c3558z2);
                        } else {
                            c2395p8.m3883m0();
                        }
                        AbstractC2418w.m3954C(m4857a2, c2395p8, C3507i.f16931e);
                        AbstractC2418w.m3954C(m3882m2, c2395p8, C3507i.f16930d);
                        C3504h c3504h2 = C3507i.f16932f;
                        if (c2395p8.f13485S || !AbstractC3367j.m5096a(c2395p8.m3847O(), Integer.valueOf(hashCode))) {
                            AbstractC2487d.m4050n(hashCode, c2395p8, hashCode, c3504h2);
                        }
                        AbstractC2418w.m3954C(m5823c2, c2395p8, C3507i.f16929c);
                        C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                        AbstractC1850a7.m3108b(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p8.m3878k(c2394o2)).f11254k, c2395p8, 0, 0, 65534);
                        AbstractC1850a7.m3108b(c0834ec.f3673c, null, ((C2003t0) c2395p8.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p8.m3878k(c2394o2)).f11258o, c2395p8, 0, 0, 65530);
                        c2395p8.m3888r(true);
                        c2395p8.m3888r(false);
                    }
                }
                return c1694m;
            case 8:
                C2395p c2395p9 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p9.m3836D()) {
                    c2395p9.m3852U();
                } else {
                    Context context = (Context) c2395p9.m3878k(AndroidCompositionLocals_androidKt.f786b);
                    if ((((Configuration) c2395p9.m3878k(AndroidCompositionLocals_androidKt.f785a)).uiMode & 48) != 32) {
                        z7 = false;
                    }
                    Object[] objArr = new Object[0];
                    c2395p9.m3857Z(-512745734);
                    boolean m3874i2 = c2395p9.m3874i(context);
                    Object m3847O2 = c2395p9.m3847O();
                    if (m3874i2 || m3847O2 == obj3) {
                        m3847O2 = new C0804dd(context, i8);
                        c2395p9.m3877j0(m3847O2);
                    }
                    c2395p9.m3888r(false);
                    InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O2, c2395p9, 0);
                    Object[] objArr2 = new Object[0];
                    c2395p9.m3857Z(-512735098);
                    boolean m3874i3 = c2395p9.m3874i(context);
                    Object m3847O3 = c2395p9.m3847O();
                    if (m3874i3 || m3847O3 == obj3) {
                        m3847O3 = new C0804dd(context, 7);
                        c2395p9.m3877j0(m3847O3);
                    }
                    c2395p9.m3888r(false);
                    C2349d1 c2349d1 = (C2349d1) AbstractC3344k.m5080c(objArr2, (InterfaceC3277a) m3847O3, c2395p9, 0);
                    Object[] objArr3 = new Object[0];
                    c2395p9.m3857Z(-512725116);
                    boolean m3874i4 = c2395p9.m3874i(context);
                    Object m3847O4 = c2395p9.m3847O();
                    if (m3874i4 || m3847O4 == obj3) {
                        m3847O4 = new C0804dd(context, 8);
                        c2395p9.m3877j0(m3847O4);
                    }
                    c2395p9.m3888r(false);
                    C2349d1 c2349d12 = (C2349d1) AbstractC3344k.m5080c(objArr3, (InterfaceC3277a) m3847O4, c2395p9, 0);
                    String str4 = (String) interfaceC2425y0.getValue();
                    int m3741g = c2349d1.m3741g();
                    int m3741g2 = c2349d12.m3741g();
                    if (str4 != null && !str4.equals("default")) {
                        if (str4.equals("custom")) {
                            abstractC1540e = new C1537b(m3741g, m3741g2);
                        } else {
                            EnumC1536a.f10100j.getClass();
                            Iterator it = EnumC1536a.f10102l.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (((EnumC1536a) next).f10103e.equals(str4)) {
                                        obj4 = next;
                                    }
                                }
                            }
                            EnumC1536a enumC1536a = (EnumC1536a) obj4;
                            if (enumC1536a != null) {
                                abstractC1540e = new C1539d(enumC1536a);
                            } else {
                                abstractC1540e = C1538c.f10111a;
                            }
                        }
                    } else {
                        abstractC1540e = C1538c.f10111a;
                    }
                    AbstractC1540e abstractC1540e2 = abstractC1540e;
                    Object[] objArr4 = new Object[0];
                    c2395p9.m3857Z(-512712258);
                    boolean m3874i5 = c2395p9.m3874i(context);
                    Object m3847O5 = c2395p9.m3847O();
                    if (m3874i5 || m3847O5 == obj3) {
                        m3847O5 = new C0804dd(context, 9);
                        c2395p9.m3877j0(m3847O5);
                    }
                    c2395p9.m3888r(false);
                    AbstractC1544i.m2475a(z7, abstractC1540e2, AbstractC3178i.m4873d(-777836409, new C1055le((C2345c1) AbstractC3344k.m5080c(objArr4, (InterfaceC3277a) m3847O5, c2395p9, 0), context, (MainActivity) obj5, abstractC1540e2, interfaceC2425y0, c2349d1, c2349d12), c2395p9), c2395p9, 384);
                }
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                C2395p c2395p10 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p10.m3836D()) {
                    c2395p10.m3852U();
                } else {
                    AbstractC1850a7.m3108b(((C1189po) obj5).f6927b, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, c2395p10, 0, 3120, 120830);
                }
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                C2395p c2395p11 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p11.m3836D()) {
                    c2395p11.m3852U();
                } else {
                    AbstractC1850a7.m3108b("发现新版本 ".concat(((C1227r0) obj5).f7193a), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p11, 0, 0, 131070);
                }
                return c1694m;
            case 11:
                C2395p c2395p12 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p12.m3836D()) {
                    c2395p12.m3852U();
                } else {
                    ((C3173d) obj5).mo22d(c2395p12, 0);
                }
                return c1694m;
            default:
                C2395p c2395p13 = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z8 = true;
                }
                if (!c2395p13.m3849R(intValue & 1, z8)) {
                    c2395p13.m3852U();
                    return c1694m;
                }
                throw null;
        }
    }
}
