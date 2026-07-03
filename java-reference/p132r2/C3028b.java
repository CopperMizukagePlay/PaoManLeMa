package p132r2;

import p001a0.AbstractC0094y0;
import p035e1.AbstractC0663k0;
import p035e1.AbstractC0670o;
import p035e1.C0677s;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.b */
/* loaded from: classes.dex */
public final class C3028b implements InterfaceC3041o {

    /* renamed from: a */
    public final AbstractC0663k0 f15586a;

    /* renamed from: b */
    public final float f15587b;

    public C3028b(AbstractC0663k0 abstractC0663k0, float f7) {
        this.f15586a = abstractC0663k0;
        this.f15587b = f7;
    }

    @Override // p132r2.InterfaceC3041o
    /* renamed from: a */
    public final float mo4716a() {
        return this.f15587b;
    }

    @Override // p132r2.InterfaceC3041o
    /* renamed from: b */
    public final long mo4717b() {
        int i7 = C0677s.f2210h;
        return C0677s.f2209g;
    }

    @Override // p132r2.InterfaceC3041o
    /* renamed from: c */
    public final AbstractC0670o mo4718c() {
        return this.f15586a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3028b)) {
            return false;
        }
        C3028b c3028b = (C3028b) obj;
        if (AbstractC3367j.m5096a(this.f15586a, c3028b.f15586a) && Float.compare(this.f15587b, c3028b.f15587b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15587b) + (this.f15586a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f15586a);
        sb.append(", alpha=");
        return AbstractC0094y0.m186m(sb, this.f15587b, ')');
    }
}
