package p032d6;

import p008b.C0242k0;
import p069i6.AbstractC2088a;
import p069i6.C2094g;
import p082k5.AbstractC2311a;
import p082k5.C2314d;
import p082k5.InterfaceC2315e;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.w */
/* loaded from: classes.dex */
public abstract class AbstractC0581w extends AbstractC2311a implements InterfaceC2315e {

    /* renamed from: f */
    public static final C0578v f1935f = new C0578v(C2314d.f13272e, new C0242k0(2));

    public AbstractC0581w() {
        super(C2314d.f13272e);
    }

    /* renamed from: J */
    public abstract void mo1233J(InterfaceC2318h interfaceC2318h, Runnable runnable);

    /* renamed from: K */
    public boolean mo1244K(InterfaceC2318h interfaceC2318h) {
        return !(this instanceof AbstractC0580v1);
    }

    /* renamed from: L */
    public AbstractC0581w mo1245L(int i7) {
        AbstractC2088a.m3430a(i7);
        return new C2094g(this, i7);
    }

    @Override // p082k5.AbstractC2311a, p082k5.InterfaceC2318h
    /* renamed from: h */
    public final InterfaceC2316f mo853h(InterfaceC2317g interfaceC2317g) {
        InterfaceC2316f interfaceC2316f;
        AbstractC3367j.m5100e(interfaceC2317g, "key");
        if (interfaceC2317g instanceof C0578v) {
            C0578v c0578v = (C0578v) interfaceC2317g;
            InterfaceC2317g interfaceC2317g2 = this.f13269e;
            if ((interfaceC2317g2 == c0578v || c0578v.f1932f == interfaceC2317g2) && (interfaceC2316f = (InterfaceC2316f) c0578v.f1931e.mo23f(this)) != null) {
                return interfaceC2316f;
            }
        } else if (C2314d.f13272e == interfaceC2317g) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((p082k5.InterfaceC2316f) r3.f1931e.mo23f(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return p082k5.C2319i.f13273e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (p082k5.C2314d.f13272e == r3) goto L15;
     */
    @Override // p082k5.AbstractC2311a, p082k5.InterfaceC2318h
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2318h mo854t(InterfaceC2317g interfaceC2317g) {
        AbstractC3367j.m5100e(interfaceC2317g, "key");
        if (interfaceC2317g instanceof C0578v) {
            C0578v c0578v = (C0578v) interfaceC2317g;
            InterfaceC2317g interfaceC2317g2 = this.f13269e;
            if (interfaceC2317g2 != c0578v && c0578v.f1932f != interfaceC2317g2) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0525d0.m1134l(this);
    }
}
