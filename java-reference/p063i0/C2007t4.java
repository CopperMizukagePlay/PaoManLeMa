package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;
import p107o.InterfaceC2780u0;
import p137s.InterfaceC3080i;
import p140s2.C3096f;
import p162v1.InterfaceC3516l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.t4 */
/* loaded from: classes.dex */
public final class C2007t4 implements InterfaceC2780u0 {

    /* renamed from: a */
    public final boolean f11865a;

    /* renamed from: b */
    public final float f11866b;

    /* renamed from: c */
    public final long f11867c;

    public C2007t4(boolean z7, float f7, long j6) {
        this.f11865a = z7;
        this.f11866b = f7;
        this.f11867c = j6;
    }

    @Override // p107o.InterfaceC2780u0
    /* renamed from: a */
    public final InterfaceC3516l mo3182a(InterfaceC3080i interfaceC3080i) {
        return new C1898g1(interfaceC3080i, this.f11865a, this.f11866b, new C1880e1(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2007t4) {
            C2007t4 c2007t4 = (C2007t4) obj;
            if (this.f11865a != c2007t4.f11865a || !C3096f.m4776a(this.f11866b, c2007t4.f11866b)) {
                return false;
            }
            return C0677s.m1454c(this.f11867c, c2007t4.f11867c);
        }
        return false;
    }

    public final int hashCode() {
        int m4038b = AbstractC2487d.m4038b(this.f11866b, Boolean.hashCode(this.f11865a) * 31, 961);
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11867c) + m4038b;
    }
}
