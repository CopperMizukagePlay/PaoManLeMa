package p082k5;

import java.io.Serializable;
import p001a0.AbstractC0094y0;
import p050g2.C1584e0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k5.b */
/* loaded from: classes.dex */
public final class C2312b implements InterfaceC2318h, Serializable {

    /* renamed from: e */
    public final InterfaceC2318h f13270e;

    /* renamed from: f */
    public final InterfaceC2316f f13271f;

    public C2312b(InterfaceC2316f interfaceC2316f, InterfaceC2318h interfaceC2318h) {
        AbstractC3367j.m5100e(interfaceC2318h, "left");
        AbstractC3367j.m5100e(interfaceC2316f, "element");
        this.f13270e = interfaceC2318h;
        this.f13271f = interfaceC2316f;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: B */
    public final Object mo852B(Object obj, InterfaceC3281e interfaceC3281e) {
        return interfaceC3281e.mo22d(this.f13270e.mo852B(obj, interfaceC3281e), this.f13271f);
    }

    public final boolean equals(Object obj) {
        boolean z7;
        if (this != obj) {
            if (obj instanceof C2312b) {
                C2312b c2312b = (C2312b) obj;
                int i7 = 2;
                C2312b c2312b2 = c2312b;
                int i8 = 2;
                while (true) {
                    InterfaceC2318h interfaceC2318h = c2312b2.f13270e;
                    if (interfaceC2318h instanceof C2312b) {
                        c2312b2 = (C2312b) interfaceC2318h;
                    } else {
                        c2312b2 = null;
                    }
                    if (c2312b2 == null) {
                        break;
                    }
                    i8++;
                }
                C2312b c2312b3 = this;
                while (true) {
                    InterfaceC2318h interfaceC2318h2 = c2312b3.f13270e;
                    if (interfaceC2318h2 instanceof C2312b) {
                        c2312b3 = (C2312b) interfaceC2318h2;
                    } else {
                        c2312b3 = null;
                    }
                    if (c2312b3 == null) {
                        break;
                    }
                    i7++;
                }
                if (i8 == i7) {
                    C2312b c2312b4 = this;
                    while (true) {
                        InterfaceC2316f interfaceC2316f = c2312b4.f13271f;
                        if (!AbstractC3367j.m5096a(c2312b.mo853h(interfaceC2316f.getKey()), interfaceC2316f)) {
                            z7 = false;
                            break;
                        }
                        InterfaceC2318h interfaceC2318h3 = c2312b4.f13270e;
                        if (interfaceC2318h3 instanceof C2312b) {
                            c2312b4 = (C2312b) interfaceC2318h3;
                        } else {
                            AbstractC3367j.m5098c(interfaceC2318h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            InterfaceC2316f interfaceC2316f2 = (InterfaceC2316f) interfaceC2318h3;
                            z7 = AbstractC3367j.m5096a(c2312b.mo853h(interfaceC2316f2.getKey()), interfaceC2316f2);
                            break;
                        }
                    }
                    if (z7) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: h */
    public final InterfaceC2316f mo853h(InterfaceC2317g interfaceC2317g) {
        AbstractC3367j.m5100e(interfaceC2317g, "key");
        C2312b c2312b = this;
        while (true) {
            InterfaceC2316f mo853h = c2312b.f13271f.mo853h(interfaceC2317g);
            if (mo853h != null) {
                return mo853h;
            }
            InterfaceC2318h interfaceC2318h = c2312b.f13270e;
            if (interfaceC2318h instanceof C2312b) {
                c2312b = (C2312b) interfaceC2318h;
            } else {
                return interfaceC2318h.mo853h(interfaceC2317g);
            }
        }
    }

    public final int hashCode() {
        return this.f13271f.hashCode() + this.f13270e.hashCode();
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: t */
    public final InterfaceC2318h mo854t(InterfaceC2317g interfaceC2317g) {
        AbstractC3367j.m5100e(interfaceC2317g, "key");
        InterfaceC2316f interfaceC2316f = this.f13271f;
        InterfaceC2316f mo853h = interfaceC2316f.mo853h(interfaceC2317g);
        InterfaceC2318h interfaceC2318h = this.f13270e;
        if (mo853h != null) {
            return interfaceC2318h;
        }
        InterfaceC2318h mo854t = interfaceC2318h.mo854t(interfaceC2317g);
        if (mo854t == interfaceC2318h) {
            return this;
        }
        if (mo854t == C2319i.f13273e) {
            return interfaceC2316f;
        }
        return new C2312b(interfaceC2316f, mo854t);
    }

    public final String toString() {
        return AbstractC0094y0.m187n(new StringBuilder("["), (String) mo852B("", new C1584e0(7)), ']');
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: z */
    public final InterfaceC2318h mo855z(InterfaceC2318h interfaceC2318h) {
        AbstractC3367j.m5100e(interfaceC2318h, "context");
        if (interfaceC2318h == C2319i.f13273e) {
            return this;
        }
        return (InterfaceC2318h) interfaceC2318h.mo852B(this, new C1584e0(8));
    }
}
