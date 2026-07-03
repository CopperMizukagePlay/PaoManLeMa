package p039e5;

import android.content.Context;
import android.os.Trace;
import android.widget.Toast;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001a0.AbstractC0094y0;
import p001a0.C0008b2;
import p053g5.C1694m;
import p060h5.AbstractC1804l;
import p068i5.AbstractC2080d;
import p077k.C2196i0;
import p085l0.C2349d1;
import p085l0.C2364h0;
import p085l0.C2411t1;
import p085l0.C2414u1;
import p085l0.C2415v;
import p085l0.InterfaceC2425y0;
import p101n0.C2705e;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.C3452b;
import p161v0.C3455c0;
import p161v0.C3457d0;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tf */
/* loaded from: classes.dex */
public final /* synthetic */ class C1304tf implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7800e = 0;

    /* renamed from: f */
    public final /* synthetic */ Collection f7801f;

    /* renamed from: g */
    public final /* synthetic */ Object f7802g;

    /* renamed from: h */
    public final /* synthetic */ Object f7803h;

    /* renamed from: i */
    public final /* synthetic */ Object f7804i;

    /* renamed from: j */
    public final /* synthetic */ Object f7805j;

    /* renamed from: k */
    public final /* synthetic */ Object f7806k;

    /* renamed from: l */
    public final /* synthetic */ Object f7807l;

    /* renamed from: m */
    public final /* synthetic */ Object f7808m;

    /* renamed from: n */
    public final /* synthetic */ Object f7809n;

    public /* synthetic */ C1304tf(InterfaceC0213t interfaceC0213t, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, C3469p c3469p, InterfaceC2425y0 interfaceC2425y06) {
        this.f7808m = interfaceC0213t;
        this.f7809n = context;
        this.f7802g = interfaceC2425y0;
        this.f7803h = interfaceC2425y02;
        this.f7804i = interfaceC2425y03;
        this.f7805j = interfaceC2425y04;
        this.f7806k = interfaceC2425y05;
        this.f7801f = c3469p;
        this.f7807l = interfaceC2425y06;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [long] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [v0.f] */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7, types: [v0.f] */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean m3921u;
        AbstractC3459f c3457d0;
        ?? r24;
        long j6;
        C2414u1 c2414u1;
        long j7;
        Object[] objArr;
        AbstractC3459f abstractC3459f;
        boolean z7;
        boolean z8 = true;
        switch (this.f7800e) {
            case 0:
                InterfaceC0213t interfaceC0213t = (InterfaceC0213t) this.f7808m;
                final Context context = (Context) this.f7809n;
                final InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f7802g;
                final InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f7803h;
                final InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f7804i;
                final InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) this.f7805j;
                final InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) this.f7806k;
                final C3469p c3469p = (C3469p) this.f7801f;
                final InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) this.f7807l;
                AbstractC3367j.m5100e((C2364h0) obj, "$this$DisposableEffect");
                InterfaceC0209r interfaceC0209r = new InterfaceC0209r() { // from class: e5.pe
                    @Override // androidx.lifecycle.InterfaceC0209r
                    /* renamed from: c */
                    public final void mo454c(InterfaceC0213t interfaceC0213t2, EnumC0201n enumC0201n) {
                        EnumC0201n enumC0201n2 = EnumC0201n.ON_RESUME;
                        Context context2 = context;
                        if (enumC0201n == enumC0201n2) {
                            InterfaceC2425y0 interfaceC2425y07 = interfaceC2425y0;
                            if (((Boolean) interfaceC2425y07.getValue()).booleanValue() && AbstractC1092mk.m1815k3(context2)) {
                                interfaceC2425y02.setValue(Boolean.TRUE);
                                AbstractC0094y0.m178e(interfaceC2425y07, Boolean.FALSE, context2, "speed_test_profiles", 0).putBoolean("overlay_keep_alive", true).apply();
                                Toast.makeText(context2, "悬浮窗保活已启用", 0).show();
                            }
                        }
                        if (enumC0201n == enumC0201n2) {
                            InterfaceC2425y0 interfaceC2425y08 = interfaceC2425y03;
                            if (((Boolean) interfaceC2425y08.getValue()).booleanValue() && AbstractC2080d.m3395h(context2.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                AbstractC1092mk.m1812k0(interfaceC2425y04, true);
                                AbstractC0094y0.m178e(interfaceC2425y08, Boolean.FALSE, context2, "speed_test_profiles", 0).putBoolean("wifi_ssid_display_enabled", true).apply();
                            }
                        }
                        if (enumC0201n == enumC0201n2) {
                            C1238rb c1238rb = C1238rb.f7307a;
                            C1238rb.m2164d(context2);
                            AbstractC1092mk.m1742V0(context2, c3469p, interfaceC2425y06, AbstractC1092mk.m1745W(interfaceC2425y05));
                        }
                    }
                };
                interfaceC0213t.mo415g().m468a(interfaceC0209r);
                return new C0008b2(3, interfaceC0213t, interfaceC0209r);
            case 1:
                C3469p c3469p2 = (C3469p) this.f7801f;
                C3469p c3469p3 = (C3469p) this.f7808m;
                C2349d1 c2349d1 = (C2349d1) this.f7809n;
                InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) this.f7802g;
                InterfaceC2425y0 interfaceC2425y08 = (InterfaceC2425y0) this.f7803h;
                InterfaceC2425y0 interfaceC2425y09 = (InterfaceC2425y0) this.f7804i;
                InterfaceC2425y0 interfaceC2425y010 = (InterfaceC2425y0) this.f7805j;
                InterfaceC2425y0 interfaceC2425y011 = (InterfaceC2425y0) this.f7806k;
                InterfaceC2425y0 interfaceC2425y012 = (InterfaceC2425y0) this.f7807l;
                C1189po c1189po = (C1189po) obj;
                AbstractC3367j.m5100e(c1189po, "profile");
                int i7 = c1189po.f6926a;
                float f7 = AbstractC1092mk.f5952h;
                c2349d1.m3742h(i7);
                AbstractC1092mk.m1660E0(interfaceC2425y07, false);
                AbstractC1092mk.m1670G0(interfaceC2425y08, false);
                interfaceC2425y09.setValue(c1189po.f6927b);
                interfaceC2425y010.setValue("");
                interfaceC2425y011.setValue("");
                AbstractC1092mk.m1658D3(c3469p2, c1189po.f6928c);
                AbstractC1092mk.m1658D3(c3469p3, c1189po.f6929d);
                AbstractC1092mk.m1725R0(interfaceC2425y012, true);
                return C1694m.f10482a;
            default:
                C2414u1 c2414u12 = (C2414u1) this.f7808m;
                C2196i0 c2196i0 = (C2196i0) this.f7809n;
                C2196i0 c2196i02 = (C2196i0) this.f7802g;
                List list = (List) this.f7803h;
                List list2 = (List) this.f7804i;
                C2196i0 c2196i03 = (C2196i0) this.f7805j;
                List list3 = (List) this.f7806k;
                C2196i0 c2196i04 = (C2196i0) this.f7807l;
                Set set = (Set) this.f7801f;
                long longValue = ((Long) obj).longValue();
                synchronized (c2414u12.f13580b) {
                    m3921u = c2414u12.m3921u();
                }
                if (m3921u) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        c2414u12.f13579a.m3789a(longValue);
                        synchronized (AbstractC3465l.f16721c) {
                            C2196i0 c2196i05 = AbstractC3465l.f16728j.f16673h;
                            if (c2196i05 != null) {
                                if (c2196i05.m3606h()) {
                                    z7 = true;
                                }
                            }
                            z7 = false;
                        }
                        if (z7) {
                            AbstractC3465l.m5234a();
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    c2414u12.m3917B();
                    synchronized (c2414u12.f13580b) {
                        try {
                            C2705e c2705e = c2414u12.f13586h;
                            Object[] objArr2 = c2705e.f14517e;
                            int i8 = c2705e.f14519g;
                            for (int i9 = 0; i9 < i8; i9++) {
                                list.add((C2415v) objArr2[i9]);
                            }
                            c2414u12.f13586h.m4305g();
                        } finally {
                        }
                    }
                    c2196i0.m3600b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            AbstractC3459f m5244k = AbstractC3465l.m5244k();
                            if (m5244k instanceof C3452b) {
                                c3457d0 = new C3455c0((C3452b) m5244k, null, null, true, false);
                            } else {
                                c3457d0 = new C3457d0(m5244k, null, z8, false);
                            }
                            try {
                                AbstractC3459f m5227j = c3457d0.m5227j();
                                try {
                                    if (!list3.isEmpty()) {
                                        try {
                                            int size = list3.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                c2196i04.m3599a((C2415v) list3.get(i10));
                                            }
                                            int size2 = list3.size();
                                            for (int i11 = 0; i11 < size2; i11++) {
                                                ((C2415v) list3.get(i11)).m3930d();
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                c2414u12.m3916A(th, null);
                                                C2411t1.m3911q(c2414u12, list, list2, list3, c2196i03, c2196i04, c2196i0, c2196i02);
                                                list3.clear();
                                                AbstractC3459f.m5225q(m5227j);
                                                return C1694m.f10482a;
                                            } finally {
                                            }
                                        }
                                    }
                                    if (c2196i03.m3606h()) {
                                        try {
                                            c2196i04.m3608j(c2196i03);
                                            Object[] objArr3 = c2196i03.f12685b;
                                            j6 = 128;
                                            long[] jArr = c2196i03.f12684a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                r24 = jArr;
                                                int i12 = 0;
                                                j7 = 255;
                                                while (true) {
                                                    ?? r12 = r24[i12];
                                                    c2414u1 = c2414u12;
                                                    if ((((~r12) << 7) & r12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                                        int i14 = 0;
                                                        long j8 = r12;
                                                        while (i14 < i13) {
                                                            if ((j8 & 255) < 128) {
                                                                try {
                                                                    ((C2415v) objArr3[(i12 << 3) + i14]).m3932f();
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    c2414u12 = c2414u1;
                                                                    try {
                                                                        c2414u12.m3916A(th, null);
                                                                        C2411t1.m3911q(c2414u12, list, list2, list3, c2196i03, c2196i04, c2196i0, c2196i02);
                                                                        AbstractC3459f.m5225q(m5227j);
                                                                        return C1694m.f10482a;
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            i14++;
                                                            j8 >>= 8;
                                                        }
                                                        if (i13 != 8) {
                                                        }
                                                    }
                                                    if (i12 != length) {
                                                        i12++;
                                                        c2414u12 = c2414u1;
                                                    }
                                                }
                                            } else {
                                                c2414u1 = c2414u12;
                                                j7 = 255;
                                            }
                                            c2414u12 = c2414u1;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } else {
                                        j6 = 128;
                                        j7 = 255;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r24 = m5227j;
                                    AbstractC3459f.m5225q(r24);
                                    throw th;
                                }
                                try {
                                    if (c2196i04.m3606h()) {
                                        try {
                                            Object[] objArr4 = c2196i04.f12685b;
                                            long[] jArr2 = c2196i04.f12684a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i15 = 0;
                                                while (true) {
                                                    long j9 = jArr2[i15];
                                                    r24 = m5227j;
                                                    long[] jArr3 = jArr2;
                                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        int i17 = 0;
                                                        while (i17 < i16) {
                                                            if ((j9 & j7) < j6) {
                                                                try {
                                                                    ((C2415v) objArr4[(i15 << 3) + i17]).m3933g();
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    try {
                                                                        c2414u12.m3916A(th, null);
                                                                        C2411t1.m3911q(c2414u12, list, list2, list3, c2196i03, c2196i04, c2196i0, c2196i02);
                                                                        c2196i04.m3600b();
                                                                        AbstractC3459f.m5225q(r24);
                                                                        return C1694m.f10482a;
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            j9 >>= 8;
                                                            i17++;
                                                            objArr4 = objArr4;
                                                        }
                                                        objArr = objArr4;
                                                        if (i16 != 8) {
                                                        }
                                                    } else {
                                                        objArr = objArr4;
                                                    }
                                                    if (i15 != length2) {
                                                        i15++;
                                                        m5227j = r24;
                                                        jArr2 = jArr3;
                                                        objArr4 = objArr;
                                                    }
                                                }
                                            } else {
                                                r24 = m5227j;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r24 = m5227j;
                                        }
                                    } else {
                                        abstractC3459f = m5227j;
                                    }
                                    AbstractC3459f.m5225q(abstractC3459f);
                                    c3457d0.mo5198c();
                                    synchronized (c2414u12.f13580b) {
                                        c2414u12.m3920t();
                                    }
                                    AbstractC3465l.m5244k().mo5201m();
                                    c2196i02.m3600b();
                                    c2196i0.m3600b();
                                    c2414u12.f13594p = null;
                                    return C1694m.f10482a;
                                } catch (Throwable th7) {
                                    th = th7;
                                    AbstractC3459f.m5225q(r24);
                                    throw th;
                                }
                            } finally {
                                c3457d0.mo5198c();
                            }
                        }
                        try {
                            int size3 = list.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                C2415v c2415v = (C2415v) list.get(i18);
                                C2415v m3925z = c2414u12.m3925z(c2415v, c2196i0);
                                if (m3925z != null) {
                                    list3.add(m3925z);
                                }
                                c2196i02.m3599a(c2415v);
                            }
                            list.clear();
                            if (c2196i0.m3606h() || c2414u12.f13586h.f14519g != 0) {
                                synchronized (c2414u12.f13580b) {
                                    try {
                                        List m3923w = c2414u12.m3923w();
                                        int size4 = m3923w.size();
                                        for (int i19 = 0; i19 < size4; i19++) {
                                            C2415v c2415v2 = (C2415v) m3923w.get(i19);
                                            if (!c2196i02.m3601c(c2415v2) && c2415v2.m3948v(set)) {
                                                list.add(c2415v2);
                                            }
                                        }
                                        C2705e c2705e2 = c2414u12.f13586h;
                                        int i20 = c2705e2.f14519g;
                                        int i21 = 0;
                                        for (int i22 = 0; i22 < i20; i22++) {
                                            C2415v c2415v3 = (C2415v) c2705e2.f14517e[i22];
                                            if (!c2196i02.m3601c(c2415v3) && !list.contains(c2415v3)) {
                                                list.add(c2415v3);
                                                i21++;
                                            } else if (i21 > 0) {
                                                Object[] objArr5 = c2705e2.f14517e;
                                                objArr5[i22 - i21] = objArr5[i22];
                                            }
                                        }
                                        int i23 = i20 - i21;
                                        AbstractC1804l.m3023P(c2705e2.f14517e, i23, i20);
                                        c2705e2.f14519g = i23;
                                    } finally {
                                    }
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    C2411t1.m3912s(list2, c2414u12);
                                    while (!list2.isEmpty()) {
                                        List m3924y = c2414u12.m3924y(list2, c2196i0);
                                        c2196i03.getClass();
                                        Iterator it = m3924y.iterator();
                                        while (it.hasNext()) {
                                            c2196i03.m3607i(it.next());
                                        }
                                        C2411t1.m3912s(list2, c2414u12);
                                    }
                                } catch (Throwable th8) {
                                    c2414u12.m3916A(th8, null);
                                    C2411t1.m3911q(c2414u12, list, list2, list3, c2196i03, c2196i04, c2196i0, c2196i02);
                                }
                            }
                            z8 = true;
                        } catch (Throwable th9) {
                            try {
                                c2414u12.m3916A(th9, null);
                                C2411t1.m3911q(c2414u12, list, list2, list3, c2196i03, c2196i04, c2196i0, c2196i02);
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
                break;
        }
    }

    public /* synthetic */ C1304tf(C2414u1 c2414u1, C2196i0 c2196i0, C2196i0 c2196i02, List list, List list2, C2196i0 c2196i03, List list3, C2196i0 c2196i04, Set set) {
        this.f7808m = c2414u1;
        this.f7809n = c2196i0;
        this.f7802g = c2196i02;
        this.f7803h = list;
        this.f7804i = list2;
        this.f7805j = c2196i03;
        this.f7806k = list3;
        this.f7807l = c2196i04;
        this.f7801f = set;
    }

    public /* synthetic */ C1304tf(C3469p c3469p, C3469p c3469p2, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06) {
        this.f7801f = c3469p;
        this.f7808m = c3469p2;
        this.f7809n = c2349d1;
        this.f7802g = interfaceC2425y0;
        this.f7803h = interfaceC2425y02;
        this.f7804i = interfaceC2425y03;
        this.f7805j = interfaceC2425y04;
        this.f7806k = interfaceC2425y05;
        this.f7807l = interfaceC2425y06;
    }
}
