package p026d0;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d0.e */
/* loaded from: classes.dex */
public final class C0460e {

    /* renamed from: a */
    public final String f1602a;

    /* renamed from: b */
    public String f1603b;

    /* renamed from: c */
    public boolean f1604c = false;

    /* renamed from: d */
    public C0459d f1605d = null;

    public C0460e(String str, String str2) {
        this.f1602a = str;
        this.f1603b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0460e)) {
            return false;
        }
        C0460e c0460e = (C0460e) obj;
        if (AbstractC3367j.m5096a(this.f1602a, c0460e.f1602a) && AbstractC3367j.m5096a(this.f1603b, c0460e.f1603b) && this.f1604c == c0460e.f1604c && AbstractC3367j.m5096a(this.f1605d, c0460e.f1605d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m4040d = AbstractC2487d.m4040d(AbstractC0094y0.m175b(this.f1602a.hashCode() * 31, 31, this.f1603b), 31, this.f1604c);
        C0459d c0459d = this.f1605d;
        if (c0459d == null) {
            hashCode = 0;
        } else {
            hashCode = c0459d.hashCode();
        }
        return m4040d + hashCode;
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f1605d + ", isShowingSubstitution=" + this.f1604c + ')';
    }
}
