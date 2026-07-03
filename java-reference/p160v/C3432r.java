package p160v;

import p122q.C2891b;
import p122q.EnumC2931o0;
import p140s2.EnumC3103m;
import p146t1.AbstractC3198f;
import p154u1.C3352h;
import p154u1.InterfaceC3350f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.r */
/* loaded from: classes.dex */
public final class C3432r implements InterfaceC3350f {

    /* renamed from: e */
    public static final C3428p f16609e = new Object();

    /* renamed from: a */
    public final InterfaceC3434s f16610a;

    /* renamed from: b */
    public final C2891b f16611b;

    /* renamed from: c */
    public final EnumC3103m f16612c;

    /* renamed from: d */
    public final EnumC2931o0 f16613d;

    public C3432r(InterfaceC3434s interfaceC3434s, C2891b c2891b, EnumC3103m enumC3103m, EnumC2931o0 enumC2931o0) {
        this.f16610a = interfaceC3434s;
        this.f16611b = c2891b;
        this.f16612c = enumC3103m;
        this.f16613d = enumC2931o0;
    }

    @Override // p154u1.InterfaceC3350f
    public final C3352h getKey() {
        return AbstractC3198f.f15947a;
    }

    /* renamed from: h */
    public final boolean m5185h(C3426o c3426o, int i7) {
        EnumC2931o0 enumC2931o0 = this.f16613d;
        if (i7 == 5 || i7 == 6) {
            if (enumC2931o0 == EnumC2931o0.f15241f) {
                return false;
            }
        } else if (i7 == 3 || i7 == 4) {
            if (enumC2931o0 == EnumC2931o0.f15240e) {
                return false;
            }
        } else if (i7 != 1 && i7 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (m5186i(i7)) {
            if (c3426o.f16600b >= this.f16610a.mo5046a() - 1) {
                return false;
            }
        } else if (c3426o.f16599a <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m5186i(int i7) {
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            if (i7 != 5) {
                if (i7 != 6) {
                    EnumC3103m enumC3103m = this.f16612c;
                    if (i7 == 3) {
                        int ordinal = enumC3103m.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new RuntimeException();
                            }
                        }
                    } else if (i7 == 4) {
                        int ordinal2 = enumC3103m.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p154u1.InterfaceC3350f
    public final Object getValue() {
        return this;
    }
}
