package androidx.compose.foundation.layout;

import p001a0.C0074s0;
import p063i0.AbstractC2021v2;
import p158u5.AbstractC3367j;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3801i;
import p177x0.C3802j;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.layout.c */
/* loaded from: classes.dex */
public abstract class AbstractC0155c {

    /* renamed from: a */
    public static final FillElement f658a = new FillElement(1.0f, 2);

    /* renamed from: b */
    public static final FillElement f659b = new FillElement(1.0f, 1);

    /* renamed from: c */
    public static final FillElement f660c = new FillElement(1.0f, 3);

    /* renamed from: d */
    public static final WrapContentElement f661d;

    /* renamed from: e */
    public static final WrapContentElement f662e;

    /* renamed from: f */
    public static final WrapContentElement f663f;

    /* renamed from: g */
    public static final WrapContentElement f664g;

    /* renamed from: h */
    public static final WrapContentElement f665h;

    /* renamed from: i */
    public static final WrapContentElement f666i;

    static {
        C3800h c3800h = C3795c.f17977r;
        f661d = new WrapContentElement(2, new C0074s0(11, c3800h), c3800h);
        C3800h c3800h2 = C3795c.f17976q;
        f662e = new WrapContentElement(2, new C0074s0(11, c3800h2), c3800h2);
        C3801i c3801i = C3795c.f17974o;
        f663f = new WrapContentElement(1, new C0074s0(9, c3801i), c3801i);
        C3801i c3801i2 = C3795c.f17973n;
        f664g = new WrapContentElement(1, new C0074s0(9, c3801i2), c3801i2);
        C3802j c3802j = C3795c.f17968i;
        f665h = new WrapContentElement(3, new C0074s0(10, c3802j), c3802j);
        C3802j c3802j2 = C3795c.f17964e;
        f666i = new WrapContentElement(3, new C0074s0(10, c3802j2), c3802j2);
    }

    /* renamed from: a */
    public static final InterfaceC3810r m342a(InterfaceC3810r interfaceC3810r, float f7, float f8) {
        return interfaceC3810r.mo5829e(new UnspecifiedConstraintsElement(f7, f8));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC3810r m343b(InterfaceC3810r interfaceC3810r, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = Float.NaN;
        }
        if ((i7 & 2) != 0) {
            f8 = Float.NaN;
        }
        return m342a(interfaceC3810r, f7, f8);
    }

    /* renamed from: c */
    public static final InterfaceC3810r m344c(InterfaceC3810r interfaceC3810r, float f7) {
        FillElement fillElement;
        if (f7 == 1.0f) {
            fillElement = f659b;
        } else {
            fillElement = new FillElement(f7, 1);
        }
        return interfaceC3810r.mo5829e(fillElement);
    }

    /* renamed from: d */
    public static InterfaceC3810r m345d(InterfaceC3810r interfaceC3810r) {
        return interfaceC3810r.mo5829e(f660c);
    }

    /* renamed from: e */
    public static final InterfaceC3810r m346e(InterfaceC3810r interfaceC3810r, float f7) {
        FillElement fillElement;
        if (f7 == 1.0f) {
            fillElement = f658a;
        } else {
            fillElement = new FillElement(f7, 2);
        }
        return interfaceC3810r.mo5829e(fillElement);
    }

    /* renamed from: f */
    public static final InterfaceC3810r m347f(InterfaceC3810r interfaceC3810r, float f7) {
        return interfaceC3810r.mo5829e(new SizeElement(0.0f, f7, 0.0f, f7, 5));
    }

    /* renamed from: g */
    public static final InterfaceC3810r m348g(InterfaceC3810r interfaceC3810r, float f7, float f8) {
        return interfaceC3810r.mo5829e(new SizeElement(0.0f, f7, 0.0f, f8, 5));
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC3810r m349h(InterfaceC3810r interfaceC3810r, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = Float.NaN;
        }
        if ((i7 & 2) != 0) {
            f8 = Float.NaN;
        }
        return m348g(interfaceC3810r, f7, f8);
    }

    /* renamed from: i */
    public static final InterfaceC3810r m350i(InterfaceC3810r interfaceC3810r, float f7) {
        return interfaceC3810r.mo5829e(new SizeElement(f7, f7, f7, f7, false));
    }

    /* renamed from: j */
    public static final InterfaceC3810r m351j(InterfaceC3810r interfaceC3810r, float f7, float f8) {
        return interfaceC3810r.mo5829e(new SizeElement(f7, f8, f7, f8, false));
    }

    /* renamed from: k */
    public static InterfaceC3810r m352k(InterfaceC3810r interfaceC3810r, float f7, float f8, float f9, float f10, int i7) {
        float f11;
        float f12;
        float f13;
        if ((i7 & 2) != 0) {
            f11 = Float.NaN;
        } else {
            f11 = f8;
        }
        if ((i7 & 4) != 0) {
            f12 = Float.NaN;
        } else {
            f12 = f9;
        }
        if ((i7 & 8) != 0) {
            f13 = Float.NaN;
        } else {
            f13 = f10;
        }
        return interfaceC3810r.mo5829e(new SizeElement(f7, f11, f12, f13, false));
    }

    /* renamed from: l */
    public static final InterfaceC3810r m353l(InterfaceC3810r interfaceC3810r, float f7) {
        return interfaceC3810r.mo5829e(new SizeElement(f7, f7, f7, f7, true));
    }

    /* renamed from: m */
    public static final InterfaceC3810r m354m(InterfaceC3810r interfaceC3810r, float f7, float f8) {
        return interfaceC3810r.mo5829e(new SizeElement(f7, f8, f7, f8, true));
    }

    /* renamed from: n */
    public static final InterfaceC3810r m355n(InterfaceC3810r interfaceC3810r, float f7, float f8, float f9, float f10) {
        return interfaceC3810r.mo5829e(new SizeElement(f7, f8, f9, f10, true));
    }

    /* renamed from: o */
    public static /* synthetic */ InterfaceC3810r m356o(InterfaceC3810r interfaceC3810r, float f7, float f8, int i7) {
        float f9 = AbstractC2021v2.f11949b;
        if ((i7 & 2) != 0) {
            f9 = Float.NaN;
        }
        return m355n(interfaceC3810r, f7, f9, f8, Float.NaN);
    }

    /* renamed from: p */
    public static final InterfaceC3810r m357p(InterfaceC3810r interfaceC3810r, float f7) {
        return interfaceC3810r.mo5829e(new SizeElement(f7, 0.0f, f7, 0.0f, 10));
    }

    /* renamed from: q */
    public static InterfaceC3810r m358q(InterfaceC3810r interfaceC3810r, float f7, float f8, int i7) {
        float f9;
        float f10;
        if ((i7 & 1) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f7;
        }
        if ((i7 & 2) != 0) {
            f10 = Float.NaN;
        } else {
            f10 = f8;
        }
        return interfaceC3810r.mo5829e(new SizeElement(f9, 0.0f, f10, 0.0f, 10));
    }

    /* renamed from: r */
    public static InterfaceC3810r m359r(InterfaceC3810r interfaceC3810r) {
        WrapContentElement wrapContentElement;
        C3801i c3801i = C3795c.f17974o;
        if (AbstractC3367j.m5096a(c3801i, c3801i)) {
            wrapContentElement = f663f;
        } else if (AbstractC3367j.m5096a(c3801i, C3795c.f17973n)) {
            wrapContentElement = f664g;
        } else {
            wrapContentElement = new WrapContentElement(1, new C0074s0(9, c3801i), c3801i);
        }
        return interfaceC3810r.mo5829e(wrapContentElement);
    }

    /* renamed from: s */
    public static InterfaceC3810r m360s(InterfaceC3810r interfaceC3810r, C3802j c3802j) {
        WrapContentElement wrapContentElement;
        if (c3802j.equals(C3795c.f17968i)) {
            wrapContentElement = f665h;
        } else if (c3802j.equals(C3795c.f17964e)) {
            wrapContentElement = f666i;
        } else {
            wrapContentElement = new WrapContentElement(3, new C0074s0(10, c3802j), c3802j);
        }
        return interfaceC3810r.mo5829e(wrapContentElement);
    }

    /* renamed from: t */
    public static InterfaceC3810r m361t(InterfaceC3810r interfaceC3810r) {
        WrapContentElement wrapContentElement;
        C3800h c3800h = C3795c.f17977r;
        if (AbstractC3367j.m5096a(c3800h, c3800h)) {
            wrapContentElement = f661d;
        } else if (AbstractC3367j.m5096a(c3800h, C3795c.f17976q)) {
            wrapContentElement = f662e;
        } else {
            wrapContentElement = new WrapContentElement(2, new C0074s0(11, c3800h), c3800h);
        }
        return interfaceC3810r.mo5829e(wrapContentElement);
    }
}
