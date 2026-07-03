package p046f5;

import p001a0.AbstractC0094y0;
import p035e1.AbstractC0659i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f5.b */
/* loaded from: classes.dex */
public final class C1537b extends AbstractC1540e {

    /* renamed from: a */
    public final int f10108a;

    /* renamed from: b */
    public final int f10109b;

    /* renamed from: c */
    public final long f10110c;

    public C1537b(int i7, int i8) {
        this.f10108a = i7;
        this.f10109b = i8;
        this.f10110c = AbstractC0659i0.m1403c(i7);
    }

    @Override // p046f5.AbstractC1540e
    /* renamed from: a */
    public final String mo2471a() {
        return "custom";
    }

    @Override // p046f5.AbstractC1540e
    /* renamed from: b */
    public final long mo2472b(boolean z7) {
        int i7;
        if (z7) {
            i7 = this.f10109b;
        } else {
            i7 = this.f10108a;
        }
        return AbstractC0659i0.m1403c(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1537b)) {
            return false;
        }
        C1537b c1537b = (C1537b) obj;
        if (this.f10108a == c1537b.f10108a && this.f10109b == c1537b.f10109b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10109b) + (Integer.hashCode(this.f10108a) * 31);
    }

    public final String toString() {
        return AbstractC0094y0.m183j(this.f10108a, this.f10109b, "Custom(lightArgb=", ", darkArgb=", ")");
    }
}
