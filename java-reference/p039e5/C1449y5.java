package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p017c.C0328m;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p152u.C3326n;
import p152u.C3330r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.y5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1449y5 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f9285e;

    /* renamed from: f */
    public final /* synthetic */ Object f9286f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f9287g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f9288h;

    /* renamed from: i */
    public final /* synthetic */ Object f9289i;

    public /* synthetic */ C1449y5(C0328m c0328m, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03) {
        this.f9285e = 3;
        this.f9289i = c0328m;
        this.f9287g = interfaceC2425y0;
        this.f9288h = interfaceC2425y02;
        this.f9286f = interfaceC2425y03;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Iterable] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        float f7;
        float f8;
        int i7 = this.f9285e;
        Object obj = null;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f9286f;
        InterfaceC2425y0 interfaceC2425y0 = this.f9288h;
        InterfaceC2425y0 interfaceC2425y02 = this.f9287g;
        Object obj3 = this.f9289i;
        switch (i7) {
            case 0:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj2;
                ArrayList m3036D0 = AbstractC1805m.m3036D0((List) obj3);
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                m3036D0.remove(((Number) interfaceC2425y02.getValue()).intValue());
                int intValue = ((Number) interfaceC2425y02.getValue()).intValue();
                int size = m3036D0.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                if (intValue > size) {
                    intValue = size;
                }
                interfaceC2425y02.setValue(Integer.valueOf(intValue));
                interfaceC3279c.mo23f(m3036D0);
                interfaceC2425y0.setValue(Boolean.FALSE);
                return c1694m;
            case 1:
                C3137j0 c3137j02 = AbstractC1302td.f7786a;
                Boolean bool = Boolean.FALSE;
                interfaceC2425y02.setValue(bool);
                ((InterfaceC3279c) obj2).mo23f((String) obj3);
                interfaceC2425y0.setValue(bool);
                return c1694m;
            case 2:
                C3330r c3330r = (C3330r) obj3;
                C2349d1 c2349d1 = (C2349d1) obj2;
                C2345c1 c2345c1 = (C2345c1) interfaceC2425y02;
                C2345c1 c2345c12 = (C2345c1) interfaceC2425y0;
                if (c2349d1.m3741g() == 0) {
                    f8 = 0.0f;
                } else {
                    Iterator it = c3330r.m5067g().f16321j.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((C3326n) next).f16337i.equals(Integer.valueOf(c2349d1.m3741g()))) {
                                obj = next;
                            }
                        }
                    }
                    C3326n c3326n = (C3326n) obj;
                    float m3729g = c2345c12.m3729g() + c2345c1.m3729g();
                    if (c3326n != null) {
                        f7 = c3326n.f16341m;
                    } else {
                        f7 = m3729g;
                    }
                    f8 = m3729g - f7;
                }
                return Float.valueOf(f8);
            default:
                interfaceC2425y02.setValue(null);
                interfaceC2425y0.setValue("");
                ((InterfaceC2425y0) obj2).setValue(Boolean.FALSE);
                ((C0328m) obj3).m675K(new String[]{"application/octet-stream", "application/json", "text/*", "*/*"});
                return c1694m;
        }
    }

    public /* synthetic */ C1449y5(Object obj, Object obj2, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f9285e = i7;
        this.f9289i = obj;
        this.f9286f = obj2;
        this.f9287g = interfaceC2425y0;
        this.f9288h = interfaceC2425y02;
    }

    public /* synthetic */ C1449y5(InterfaceC3279c interfaceC3279c, String str, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f9285e = 1;
        this.f9286f = interfaceC3279c;
        this.f9289i = str;
        this.f9287g = interfaceC2425y0;
        this.f9288h = interfaceC2425y02;
    }
}
