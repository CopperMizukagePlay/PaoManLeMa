package p047f6;

import p001a0.AbstractC0094y0;
import p032d6.InterfaceC0589y1;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p099m6.InterfaceC2611l;
import p158u5.AbstractC3380w;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.n */
/* loaded from: classes.dex */
public final class C1559n extends C1548c {

    /* renamed from: o */
    public final EnumC1546a f10172o;

    public C1559n(int i7, EnumC1546a enumC1546a) {
        super(i7);
        this.f10172o = enumC1546a;
        if (enumC1546a != EnumC1546a.f10128e) {
            if (i7 >= 1) {
            } else {
                throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC3380w.m5108a(C1548c.class).m5093b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2518G(Object obj, boolean z7) {
        InterfaceC0589y1 interfaceC0589y1;
        EnumC1546a enumC1546a = this.f10172o;
        EnumC1546a enumC1546a2 = EnumC1546a.f10130g;
        C1694m c1694m = C1694m.f10482a;
        if (enumC1546a == enumC1546a2) {
            Object mo2505v = super.mo2505v(obj);
            if ((mo2505v instanceof C1554i) && !(mo2505v instanceof C1553h)) {
                return c1694m;
            }
            return mo2505v;
        }
        InterfaceC2611l interfaceC2611l = AbstractC1550e.f10149d;
        C1556k c1556k = (C1556k) C1548c.f10139j.get(this);
        while (true) {
            long andIncrement = C1548c.f10135f.getAndIncrement(this);
            long j6 = 1152921504606846975L & andIncrement;
            boolean m2503t = m2503t(andIncrement, false);
            int i7 = AbstractC1550e.f10147b;
            long j7 = i7;
            long j8 = j6 / j7;
            int i8 = (int) (j6 % j7);
            if (c1556k.f12380c != j8) {
                C1556k m2479b = C1548c.m2479b(this, j8, c1556k);
                if (m2479b == null) {
                    if (m2503t) {
                        return new C1553h(m2501q());
                    }
                } else {
                    c1556k = m2479b;
                }
            }
            int m2481e = C1548c.m2481e(this, c1556k, i8, obj, j6, interfaceC2611l, m2503t);
            if (m2481e != 0) {
                if (m2481e == 1) {
                    break;
                }
                if (m2481e != 2) {
                    if (m2481e != 3) {
                        if (m2481e != 4) {
                            if (m2481e == 5) {
                                c1556k.m3442b();
                            }
                        } else {
                            if (j6 < C1548c.f10136g.get(this)) {
                                c1556k.m3442b();
                            }
                            return new C1553h(m2501q());
                        }
                    } else {
                        throw new IllegalStateException("unexpected");
                    }
                } else {
                    if (m2503t) {
                        c1556k.m3463i();
                        return new C1553h(m2501q());
                    }
                    if (interfaceC2611l instanceof InterfaceC0589y1) {
                        interfaceC0589y1 = (InterfaceC0589y1) interfaceC2611l;
                    } else {
                        interfaceC0589y1 = null;
                    }
                    if (interfaceC0589y1 != null) {
                        interfaceC0589y1.mo1214a(c1556k, i8 + i7);
                    }
                    m2494j((c1556k.f12380c * j7) + i8);
                }
            } else {
                c1556k.m3442b();
                return c1694m;
            }
        }
    }

    @Override // p047f6.C1548c, p047f6.InterfaceC1563r
    /* renamed from: k */
    public final Object mo2495k(Object obj, InterfaceC2313c interfaceC2313c) {
        if (!(m2518G(obj, true) instanceof C1553h)) {
            return C1694m.f10482a;
        }
        throw m2501q();
    }

    @Override // p047f6.C1548c
    /* renamed from: u */
    public final boolean mo2504u() {
        if (this.f10172o == EnumC1546a.f10129f) {
            return true;
        }
        return false;
    }

    @Override // p047f6.C1548c, p047f6.InterfaceC1563r
    /* renamed from: v */
    public final Object mo2505v(Object obj) {
        return m2518G(obj, false);
    }
}
