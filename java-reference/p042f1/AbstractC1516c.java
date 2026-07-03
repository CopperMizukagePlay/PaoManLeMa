package p042f1;

import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.c */
/* loaded from: classes.dex */
public abstract class AbstractC1516c {

    /* renamed from: a */
    public final String f10012a;

    /* renamed from: b */
    public final long f10013b;

    /* renamed from: c */
    public final int f10014c;

    public AbstractC1516c(String str, long j6, int i7) {
        this.f10012a = str;
        this.f10013b = j6;
        this.f10014c = i7;
        if (str.length() != 0) {
            if (i7 >= -1 && i7 <= 63) {
                return;
            } else {
                throw new IllegalArgumentException("The id must be between -1 and 63");
            }
        }
        throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
    }

    /* renamed from: a */
    public abstract float mo2443a(int i7);

    /* renamed from: b */
    public abstract float mo2444b(int i7);

    /* renamed from: c */
    public boolean mo2445c() {
        return false;
    }

    /* renamed from: d */
    public abstract long mo2446d(float f7, float f8, float f9);

    /* renamed from: e */
    public abstract float mo2447e(float f7, float f8, float f9);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1516c abstractC1516c = (AbstractC1516c) obj;
        if (this.f10014c != abstractC1516c.f10014c || !AbstractC3367j.m5096a(this.f10012a, abstractC1516c.f10012a)) {
            return false;
        }
        return AbstractC1515b.m2441a(this.f10013b, abstractC1516c.f10013b);
    }

    /* renamed from: f */
    public abstract long mo2448f(float f7, float f8, float f9, float f10, AbstractC1516c abstractC1516c);

    public int hashCode() {
        int hashCode = this.f10012a.hashCode() * 31;
        int i7 = AbstractC1515b.f10011e;
        return AbstractC2487d.m4039c(hashCode, 31, this.f10013b) + this.f10014c;
    }

    public final String toString() {
        return this.f10012a + " (id=" + this.f10014c + ", model=" + ((Object) AbstractC1515b.m2442b(this.f10013b)) + ')';
    }
}
