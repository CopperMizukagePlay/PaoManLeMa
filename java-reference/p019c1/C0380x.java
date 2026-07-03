package p019c1;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000a.AbstractC0000a;
import p001a0.C0037j;
import p027d1.C0465c;
import p035e1.AbstractC0659i0;
import p053g5.C1694m;
import p063i0.AbstractC1982q3;
import p063i0.AbstractC2052z1;
import p063i0.C1956n1;
import p063i0.EnumC1964o1;
import p067i4.AbstractC2072e;
import p071j0.C2121d0;
import p071j0.C2146q;
import p071j0.C2150s;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2352e0;
import p085l0.InterfaceC2425y0;
import p091l6.C2472c;
import p140s2.EnumC3103m;
import p144t.C3143m0;
import p144t.C3152r;
import p144t.C3158u;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3192d;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.x */
/* loaded from: classes.dex */
public final class C0380x extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f1277f;

    /* renamed from: g */
    public final /* synthetic */ Object f1278g;

    /* renamed from: h */
    public final /* synthetic */ Object f1279h;

    /* renamed from: i */
    public final /* synthetic */ int f1280i;

    /* renamed from: j */
    public final /* synthetic */ Object f1281j;

    /* renamed from: k */
    public final /* synthetic */ Object f1282k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0380x(C0377u c0377u, C0377u c0377u2, Object obj, int i7, C0037j c0037j, int i8) {
        super(1);
        this.f1277f = i8;
        this.f1278g = c0377u;
        this.f1279h = c0377u2;
        this.f1282k = obj;
        this.f1280i = i7;
        this.f1281j = c0037j;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0465c m3d;
        Object value;
        Object obj2;
        C3143m0 c3143m0;
        C3158u c3158u;
        int mo5824a;
        int i7 = this.f1277f;
        C1694m c1694m = C1694m.f10482a;
        Object obj3 = this.f1281j;
        Object obj4 = this.f1282k;
        int i8 = this.f1280i;
        Object obj5 = this.f1279h;
        Object obj6 = this.f1278g;
        switch (i7) {
            case 0:
                InterfaceC3192d interfaceC3192d = (InterfaceC3192d) obj;
                C0377u c0377u = (C0377u) obj5;
                if (((C0377u) obj6) != ((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).f1245h) {
                    return Boolean.TRUE;
                }
                boolean m799B = AbstractC0362f.m799B(c0377u, (C0377u) obj4, i8, (C0037j) obj3);
                Boolean valueOf = Boolean.valueOf(m799B);
                if (!m799B && interfaceC3192d.mo4900a()) {
                    return null;
                }
                return valueOf;
            case 1:
                InterfaceC3192d interfaceC3192d2 = (InterfaceC3192d) obj;
                C0377u c0377u2 = (C0377u) obj5;
                if (((C0377u) obj6) != ((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u2)).getFocusOwner()).f1245h) {
                    return Boolean.TRUE;
                }
                boolean m798A = AbstractC0362f.m798A(i8, (C0037j) obj3, c0377u2, (C0465c) obj4);
                Boolean valueOf2 = Boolean.valueOf(m798A);
                if (!m798A && interfaceC3192d2.mo4900a()) {
                    return null;
                }
                return valueOf2;
            case 2:
                InterfaceC3238v interfaceC3238v = (InterfaceC3238v) obj;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj5;
                interfaceC2425y0.setValue(interfaceC3238v);
                ((C2349d1) obj4).m3742h((int) (interfaceC3238v.mo4926S() >> 32));
                C2349d1 c2349d1 = (C2349d1) obj3;
                View rootView = ((View) obj6).getRootView();
                Rect rect = new Rect();
                rootView.getWindowVisibleDisplayFrame(rect);
                C0465c m1395B = AbstractC0659i0.m1395B(rect);
                InterfaceC3238v interfaceC3238v2 = (InterfaceC3238v) interfaceC2425y0.getValue();
                if (interfaceC3238v2 == null) {
                    m3d = C0465c.f1624e;
                } else {
                    m3d = AbstractC0000a.m3d(interfaceC3238v2.mo4933h(0L), AbstractC2072e.m3347y(interfaceC3238v2.mo4926S()));
                }
                c2349d1.m3742h(AbstractC2052z1.m3220c(i8, m1395B, m3d));
                return c1694m;
            case 3:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                C2345c1 c2345c1 = (C2345c1) obj3;
                C2150s c2150s = ((C1956n1) obj6).f11575a;
                C2121d0 m3487d = c2150s.m3487d();
                EnumC1964o1 enumC1964o1 = EnumC1964o1.f11599e;
                float m3474c = m3487d.m3474c(enumC1964o1);
                float f7 = -i8;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj4;
                float f8 = AbstractC1982q3.f11694a;
                if (!((Boolean) interfaceC2425y02.getValue()).booleanValue() || m3474c != f7) {
                    if (!((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                        interfaceC2425y02.setValue(Boolean.TRUE);
                    }
                    c2345c1.m3730h(f7);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(enumC1964o1, Float.valueOf(c2345c1.m3729g()));
                    linkedHashMap.put(EnumC1964o1.f11600f, Float.valueOf(0.0f));
                    C2121d0 c2121d0 = new C2121d0(linkedHashMap);
                    C2345c1 c2345c12 = c2150s.f12515h;
                    C2352e0 c2352e0 = c2150s.f12513f;
                    if (!Float.isNaN(c2345c12.m3729g())) {
                        value = c2121d0.m3472a(c2150s.f12515h.m3729g());
                        if (value == null) {
                            value = c2352e0.getValue();
                        }
                    } else {
                        value = c2352e0.getValue();
                    }
                    if (!AbstractC3367j.m5096a(c2150s.m3487d(), c2121d0)) {
                        c2150s.f12518k.setValue(c2121d0);
                        C2472c c2472c = c2150s.f12510c.f12558b;
                        boolean m4029e = c2472c.m4029e();
                        if (m4029e) {
                            try {
                                C2146q c2146q = c2150s.f12519l;
                                float m3474c2 = c2150s.m3487d().m3474c(value);
                                if (!Float.isNaN(m3474c2)) {
                                    try {
                                        c2146q.m3483a(m3474c2, 0.0f);
                                        obj2 = null;
                                        c2150s.m3490g(null);
                                    } catch (Throwable th) {
                                        th = th;
                                        c2472c.m4030f(null);
                                        throw th;
                                    }
                                } else {
                                    obj2 = null;
                                }
                                c2150s.m3489f(value);
                                c2472c.m4030f(obj2);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        if (!m4029e) {
                            c2150s.m3490g(value);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) obj5;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    AbstractC3237u0.m4951j(abstractC3237u0, (AbstractC3239v0) arrayList.get(i9), 0, 0);
                }
                return c1694m;
            default:
                AbstractC3237u0 abstractC3237u02 = (AbstractC3237u0) obj;
                AbstractC3239v0[] abstractC3239v0Arr = (AbstractC3239v0[]) obj6;
                C3152r c3152r = (C3152r) obj5;
                InterfaceC3223n0 interfaceC3223n0 = (InterfaceC3223n0) obj4;
                int[] iArr = (int[]) obj3;
                int length = abstractC3239v0Arr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    AbstractC3239v0 abstractC3239v0 = abstractC3239v0Arr[i10];
                    int i12 = i11 + 1;
                    AbstractC3367j.m5097b(abstractC3239v0);
                    Object mo4921n = abstractC3239v0.mo4921n();
                    if (mo4921n instanceof C3143m0) {
                        c3143m0 = (C3143m0) mo4921n;
                    } else {
                        c3143m0 = null;
                    }
                    EnumC3103m layoutDirection = interfaceC3223n0.getLayoutDirection();
                    if (c3143m0 != null) {
                        c3158u = c3143m0.f15810c;
                    } else {
                        c3158u = null;
                    }
                    if (c3158u != null) {
                        mo5824a = c3158u.m4862a(i8 - abstractC3239v0.f16053e, layoutDirection);
                    } else {
                        mo5824a = c3152r.f15833b.mo5824a(0, i8 - abstractC3239v0.f16053e, layoutDirection);
                    }
                    AbstractC3237u0.m4949g(abstractC3237u02, abstractC3239v0, mo5824a, iArr[i11]);
                    i10++;
                    i11 = i12;
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0380x(Object obj, int i7, Object obj2, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i8) {
        super(1);
        this.f1277f = i8;
        this.f1278g = obj;
        this.f1280i = i7;
        this.f1279h = obj2;
        this.f1282k = interfaceC2425y0;
        this.f1281j = interfaceC2425y02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0380x(AbstractC3239v0[] abstractC3239v0Arr, C3152r c3152r, int i7, InterfaceC3223n0 interfaceC3223n0, int[] iArr) {
        super(1);
        this.f1277f = 4;
        this.f1278g = abstractC3239v0Arr;
        this.f1279h = c3152r;
        this.f1280i = i7;
        this.f1282k = interfaceC3223n0;
        this.f1281j = iArr;
    }
}
