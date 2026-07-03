package p061h6;

import java.util.ArrayList;
import p001a0.AbstractC0094y0;
import p001a0.C0070r0;
import p032d6.AbstractC0525d0;
import p032d6.C0575u;
import p047f6.EnumC1546a;
import p053g5.C1694m;
import p054g6.C1707h;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p060h5.AbstractC1805m;
import p069i6.AbstractC2088a;
import p082k5.C2314d;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.f */
/* loaded from: classes.dex */
public abstract class AbstractC1824f implements InterfaceC1831m {

    /* renamed from: e */
    public final InterfaceC2318h f10877e;

    /* renamed from: f */
    public final int f10878f;

    /* renamed from: g */
    public final EnumC1546a f10879g;

    /* renamed from: h */
    public final InterfaceC1702d f10880h;

    public AbstractC1824f(InterfaceC1702d interfaceC1702d, InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a) {
        this.f10877e = interfaceC2318h;
        this.f10878f = i7;
        this.f10879g = enumC1546a;
        this.f10880h = interfaceC1702d;
    }

    /* renamed from: a */
    public abstract AbstractC1824f mo3095a(InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a);

    /* renamed from: b */
    public InterfaceC1702d mo3096b() {
        return null;
    }

    /* renamed from: c */
    public abstract Object mo3097c(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c);

    /* renamed from: d */
    public final String m3098d() {
        ArrayList arrayList = new ArrayList(4);
        C2319i c2319i = C2319i.f13273e;
        InterfaceC2318h interfaceC2318h = this.f10877e;
        if (interfaceC2318h != c2319i) {
            arrayList.add("context=" + interfaceC2318h);
        }
        int i7 = this.f10878f;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        EnumC1546a enumC1546a = EnumC1546a.f10128e;
        EnumC1546a enumC1546a2 = this.f10879g;
        if (enumC1546a2 != enumC1546a) {
            arrayList.add("onBufferOverflow=" + enumC1546a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0094y0.m187n(sb, AbstractC1805m.m3051o0(arrayList, ", ", null, null, null, 62), ']');
    }

    @Override // p054g6.InterfaceC1702d
    /* renamed from: f */
    public final Object mo35f(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        InterfaceC2318h m1133k;
        int i7 = this.f10878f;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        InterfaceC2313c interfaceC2313c2 = null;
        C1694m c1694m = C1694m.f10482a;
        if (i7 == -3) {
            InterfaceC2318h mo662j = interfaceC2313c.mo662j();
            Boolean bool = Boolean.FALSE;
            C0575u c0575u = new C0575u(2);
            InterfaceC2318h interfaceC2318h = this.f10877e;
            if (!((Boolean) interfaceC2318h.mo852B(bool, c0575u)).booleanValue()) {
                m1133k = mo662j.mo855z(interfaceC2318h);
            } else {
                m1133k = AbstractC0525d0.m1133k(mo662j, interfaceC2318h, false);
            }
            if (AbstractC3367j.m5096a(m1133k, mo662j)) {
                Object mo3097c = mo3097c(interfaceC1704e, interfaceC2313c);
                if (mo3097c == enumC2465a) {
                    return mo3097c;
                }
            } else {
                C2314d c2314d = C2314d.f13272e;
                if (AbstractC3367j.m5096a(m1133k.mo853h(c2314d), mo662j.mo853h(c2314d))) {
                    InterfaceC2318h mo662j2 = interfaceC2313c.mo662j();
                    if (!(interfaceC1704e instanceof C1837s) && !(interfaceC1704e instanceof C1833o)) {
                        interfaceC1704e = new C1707h(interfaceC1704e, mo662j2);
                    }
                    Object m3094a = AbstractC1821c.m3094a(m1133k, interfaceC1704e, AbstractC2088a.m3440k(m1133k), new C1823e(this, interfaceC2313c2, 1), interfaceC2313c);
                    if (m3094a == enumC2465a) {
                        return m3094a;
                    }
                }
            }
            return c1694m;
        }
        Object m1130h = AbstractC0525d0.m1130h(new C0070r0(interfaceC1704e, this, interfaceC2313c2, 13), interfaceC2313c);
        if (m1130h != enumC2465a) {
            m1130h = c1694m;
        }
        if (m1130h == enumC2465a) {
            return m1130h;
        }
        return c1694m;
    }

    @Override // p061h6.InterfaceC1831m
    /* renamed from: m */
    public final InterfaceC1702d mo2753m(InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a) {
        InterfaceC2318h interfaceC2318h2 = this.f10877e;
        InterfaceC2318h mo855z = interfaceC2318h.mo855z(interfaceC2318h2);
        EnumC1546a enumC1546a2 = EnumC1546a.f10128e;
        EnumC1546a enumC1546a3 = this.f10879g;
        int i8 = this.f10878f;
        if (enumC1546a == enumC1546a2) {
            if (i8 != -3) {
                if (i7 != -3) {
                    if (i8 != -2) {
                        if (i7 != -2) {
                            i7 += i8;
                            if (i7 < 0) {
                                i7 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i7 = i8;
            }
            enumC1546a = enumC1546a3;
        }
        if (AbstractC3367j.m5096a(mo855z, interfaceC2318h2) && i7 == i8 && enumC1546a == enumC1546a3) {
            return this;
        }
        return mo3095a(mo855z, i7, enumC1546a);
    }

    public final String toString() {
        return this.f10880h + " -> " + m3098d();
    }
}
