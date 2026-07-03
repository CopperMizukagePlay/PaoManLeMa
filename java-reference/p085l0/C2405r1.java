package p085l0;

import p077k.C2182b0;
import p077k.C2194h0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.r1 */
/* loaded from: classes.dex */
public final class C2405r1 {

    /* renamed from: a */
    public C2415v f13539a;

    /* renamed from: b */
    public int f13540b;

    /* renamed from: c */
    public C2335a f13541c;

    /* renamed from: d */
    public InterfaceC3281e f13542d;

    /* renamed from: e */
    public int f13543e;

    /* renamed from: f */
    public C2182b0 f13544f;

    /* renamed from: g */
    public C2194h0 f13545g;

    public C2405r1(C2415v c2415v) {
        this.f13539a = c2415v;
    }

    /* renamed from: a */
    public static boolean m3905a(C2352e0 c2352e0, C2194h0 c2194h0) {
        AbstractC3367j.m5098c(c2352e0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        InterfaceC2370i2 interfaceC2370i2 = c2352e0.f13390g;
        if (interfaceC2370i2 == null) {
            interfaceC2370i2 = C2413u0.f13575j;
        }
        return !interfaceC2370i2.mo3798a(c2352e0.m3792h().f13356f, c2194h0.m3592g(c2352e0));
    }

    /* renamed from: b */
    public final boolean m3906b() {
        boolean z7;
        if (this.f13539a != null) {
            C2335a c2335a = this.f13541c;
            if (c2335a != null) {
                z7 = c2335a.m3715a();
            } else {
                z7 = false;
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final EnumC2396p0 m3907c(Object obj) {
        EnumC2396p0 m3944r;
        C2415v c2415v = this.f13539a;
        if (c2415v != null && (m3944r = c2415v.m3944r(this, obj)) != null) {
            return m3944r;
        }
        return EnumC2396p0.f13514e;
    }

    /* renamed from: d */
    public final void m3908d() {
        C2415v c2415v = this.f13539a;
        if (c2415v != null) {
            c2415v.f13616s = true;
            c2415v.f13619v.m38i();
        }
        this.f13539a = null;
        this.f13544f = null;
        this.f13545g = null;
        this.f13542d = null;
    }

    /* renamed from: e */
    public final void m3909e(boolean z7) {
        int i7;
        int i8 = this.f13540b;
        if (z7) {
            i7 = i8 | 32;
        } else {
            i7 = i8 & (-33);
        }
        this.f13540b = i7;
    }

    /* renamed from: f */
    public final void m3910f(InterfaceC3281e interfaceC3281e) {
        this.f13542d = interfaceC3281e;
    }
}
