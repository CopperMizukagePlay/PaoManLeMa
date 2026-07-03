package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p008b.AbstractC0234g0;
import p008b.C0222a0;
import p008b.C0236h0;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p172w3.C3781e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public final class C0187g implements InterfaceC0209r {

    /* renamed from: e */
    public final /* synthetic */ int f839e = 0;

    /* renamed from: f */
    public final Object f840f;

    /* renamed from: g */
    public final Object f841g;

    public C0187g(InterfaceC0183e interfaceC0183e, InterfaceC0209r interfaceC0209r) {
        AbstractC3367j.m5100e(interfaceC0183e, "defaultLifecycleObserver");
        this.f840f = interfaceC0183e;
        this.f841g = interfaceC0209r;
    }

    @Override // androidx.lifecycle.InterfaceC0209r
    /* renamed from: c */
    public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        switch (this.f839e) {
            case 0:
                InterfaceC0183e interfaceC0183e = (InterfaceC0183e) this.f840f;
                switch (AbstractC0185f.f836a[enumC0201n.ordinal()]) {
                    case 1:
                        interfaceC0183e.getClass();
                        break;
                    case 2:
                        interfaceC0183e.mo451d(interfaceC0213t);
                        break;
                    case 3:
                        interfaceC0183e.mo450b(interfaceC0213t);
                        break;
                    case 4:
                        interfaceC0183e.getClass();
                        break;
                    case AbstractC3122c.f15761f /* 5 */:
                        interfaceC0183e.mo452f(interfaceC0213t);
                        break;
                    case AbstractC3122c.f15759d /* 6 */:
                        interfaceC0183e.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new RuntimeException();
                }
                InterfaceC0209r interfaceC0209r = (InterfaceC0209r) this.f841g;
                if (interfaceC0209r != null) {
                    interfaceC0209r.mo454c(interfaceC0213t, enumC0201n);
                    return;
                }
                return;
            case 1:
                if (enumC0201n == EnumC0201n.ON_START) {
                    ((C0216v) this.f840f).m473f(this);
                    ((C3781e) this.f841g).m5788m();
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((C0177b) this.f841g).f820a;
                List list = (List) hashMap.get(enumC0201n);
                Object obj = this.f840f;
                C0177b.m413a(list, interfaceC0213t, enumC0201n, obj);
                C0177b.m413a((List) hashMap.get(EnumC0201n.ON_ANY), interfaceC0213t, enumC0201n, obj);
                return;
            default:
                C0222a0 c0222a0 = (C0222a0) this.f840f;
                int i7 = AbstractC0234g0.f918a[enumC0201n.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            c0222a0.m4970e();
                            ((C0216v) this.f841g).m473f(this);
                            return;
                        }
                        return;
                    }
                    c0222a0.m482g(false);
                    return;
                }
                c0222a0.m482g(true);
                return;
        }
    }

    public C0187g(InterfaceC0211s interfaceC0211s) {
        this.f840f = interfaceC0211s;
        C0181d c0181d = C0181d.f833c;
        Class<?> cls = interfaceC0211s.getClass();
        C0177b c0177b = (C0177b) c0181d.f834a.get(cls);
        this.f841g = c0177b == null ? c0181d.m419a(cls, null) : c0177b;
    }

    public C0187g(C0216v c0216v, C3781e c3781e) {
        this.f840f = c0216v;
        this.f841g = c3781e;
    }

    public C0187g(C0222a0 c0222a0, C0236h0 c0236h0, C0216v c0216v) {
        this.f840f = c0222a0;
        this.f841g = c0216v;
    }
}
