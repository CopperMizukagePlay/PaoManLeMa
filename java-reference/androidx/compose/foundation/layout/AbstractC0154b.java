package androidx.compose.foundation.layout;

import p140s2.EnumC3103m;
import p144t.C3137j0;
import p144t.InterfaceC3135i0;
import p150t5.InterfaceC3279c;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.layout.b */
/* loaded from: classes.dex */
public abstract class AbstractC0154b {
    /* renamed from: a */
    public static C3137j0 m330a(float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 0;
        }
        if ((i7 & 2) != 0) {
            f8 = 0;
        }
        return new C3137j0(f7, f8, f7, f8);
    }

    /* renamed from: b */
    public static final C3137j0 m331b(float f7, float f8, float f9, float f10) {
        return new C3137j0(f7, f8, f9, f10);
    }

    /* renamed from: c */
    public static C3137j0 m332c(float f7) {
        return new C3137j0(0, 0, 0, f7);
    }

    /* renamed from: d */
    public static final float m333d(InterfaceC3135i0 interfaceC3135i0, EnumC3103m enumC3103m) {
        if (enumC3103m == EnumC3103m.f15703e) {
            return interfaceC3135i0.mo4826c(enumC3103m);
        }
        return interfaceC3135i0.mo4827d(enumC3103m);
    }

    /* renamed from: e */
    public static final float m334e(InterfaceC3135i0 interfaceC3135i0, EnumC3103m enumC3103m) {
        if (enumC3103m == EnumC3103m.f15703e) {
            return interfaceC3135i0.mo4827d(enumC3103m);
        }
        return interfaceC3135i0.mo4826c(enumC3103m);
    }

    /* renamed from: f */
    public static final InterfaceC3810r m335f(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new OffsetPxElement(interfaceC3279c));
    }

    /* renamed from: g */
    public static final InterfaceC3810r m336g(InterfaceC3810r interfaceC3810r, InterfaceC3135i0 interfaceC3135i0) {
        return interfaceC3810r.mo5829e(new PaddingValuesElement(interfaceC3135i0));
    }

    /* renamed from: h */
    public static final InterfaceC3810r m337h(InterfaceC3810r interfaceC3810r, float f7) {
        return interfaceC3810r.mo5829e(new PaddingElement(f7, f7, f7, f7));
    }

    /* renamed from: i */
    public static final InterfaceC3810r m338i(InterfaceC3810r interfaceC3810r, float f7, float f8) {
        return interfaceC3810r.mo5829e(new PaddingElement(f7, f8, f7, f8));
    }

    /* renamed from: j */
    public static InterfaceC3810r m339j(InterfaceC3810r interfaceC3810r, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 0;
        }
        if ((i7 & 2) != 0) {
            f8 = 0;
        }
        return m338i(interfaceC3810r, f7, f8);
    }

    /* renamed from: k */
    public static InterfaceC3810r m340k(InterfaceC3810r interfaceC3810r, float f7, float f8, float f9, float f10, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 0;
        }
        if ((i7 & 2) != 0) {
            f8 = 0;
        }
        if ((i7 & 4) != 0) {
            f9 = 0;
        }
        if ((i7 & 8) != 0) {
            f10 = 0;
        }
        return interfaceC3810r.mo5829e(new PaddingElement(f7, f8, f9, f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x0.r] */
    /* renamed from: l */
    public static final InterfaceC3810r m341l(InterfaceC3810r interfaceC3810r) {
        return interfaceC3810r.mo5829e(new Object());
    }
}
