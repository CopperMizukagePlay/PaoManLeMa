package p132r2;

import p035e1.AbstractC0670o;
import p035e1.C0677s;
import p095m2.AbstractC2550a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.c */
/* loaded from: classes.dex */
public final class C3029c implements InterfaceC3041o {

    /* renamed from: a */
    public final long f15588a;

    public C3029c(long j6) {
        this.f15588a = j6;
        if (j6 != 16) {
            return;
        }
        AbstractC2550a.m4078a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p132r2.InterfaceC3041o
    /* renamed from: a */
    public final float mo4716a() {
        return C0677s.m1455d(this.f15588a);
    }

    @Override // p132r2.InterfaceC3041o
    /* renamed from: b */
    public final long mo4717b() {
        return this.f15588a;
    }

    @Override // p132r2.InterfaceC3041o
    /* renamed from: c */
    public final AbstractC0670o mo4718c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3029c) && C0677s.m1454c(this.f15588a, ((C3029c) obj).f15588a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f15588a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0677s.m1460i(this.f15588a)) + ')';
    }
}
