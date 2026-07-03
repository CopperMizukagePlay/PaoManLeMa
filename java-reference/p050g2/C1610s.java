package p050g2;

import p001a0.AbstractC0094y0;
import p027d1.C0465c;
import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.s */
/* loaded from: classes.dex */
public final class C1610s {

    /* renamed from: a */
    public final C1575a f10329a;

    /* renamed from: b */
    public final int f10330b;

    /* renamed from: c */
    public final int f10331c;

    /* renamed from: d */
    public final int f10332d;

    /* renamed from: e */
    public final int f10333e;

    /* renamed from: f */
    public final float f10334f;

    /* renamed from: g */
    public final float f10335g;

    public C1610s(C1575a c1575a, int i7, int i8, int i9, int i10, float f7, float f8) {
        this.f10329a = c1575a;
        this.f10330b = i7;
        this.f10331c = i8;
        this.f10332d = i9;
        this.f10333e = i10;
        this.f10334f = f7;
        this.f10335g = f8;
    }

    /* renamed from: a */
    public final C0465c m2617a(C0465c c0465c) {
        return c0465c.m1020g((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f10334f) & 4294967295L));
    }

    /* renamed from: b */
    public final long m2618b(long j6, boolean z7) {
        if (z7) {
            long j7 = C1602n0.f10302b;
            if (C1602n0.m2585a(j6, j7)) {
                return j7;
            }
        }
        int i7 = C1602n0.f10303c;
        int i8 = (int) (j6 >> 32);
        int i9 = this.f10330b;
        return AbstractC1586f0.m2558b(i8 + i9, ((int) (j6 & 4294967295L)) + i9);
    }

    /* renamed from: c */
    public final C0465c m2619c(C0465c c0465c) {
        float f7 = -this.f10334f;
        return c0465c.m1020g((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
    }

    /* renamed from: d */
    public final int m2620d(int i7) {
        int i8 = this.f10331c;
        int i9 = this.f10330b;
        return AbstractC2168e.m3530q(i7, i9, i8) - i9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1610s) {
                C1610s c1610s = (C1610s) obj;
                if (!this.f10329a.equals(c1610s.f10329a) || this.f10330b != c1610s.f10330b || this.f10331c != c1610s.f10331c || this.f10332d != c1610s.f10332d || this.f10333e != c1610s.f10333e || Float.compare(this.f10334f, c1610s.f10334f) != 0 || Float.compare(this.f10335g, c1610s.f10335g) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10335g) + AbstractC2487d.m4038b(this.f10334f, AbstractC2647h.m4255a(this.f10333e, AbstractC2647h.m4255a(this.f10332d, AbstractC2647h.m4255a(this.f10331c, AbstractC2647h.m4255a(this.f10330b, this.f10329a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f10329a);
        sb.append(", startIndex=");
        sb.append(this.f10330b);
        sb.append(", endIndex=");
        sb.append(this.f10331c);
        sb.append(", startLineIndex=");
        sb.append(this.f10332d);
        sb.append(", endLineIndex=");
        sb.append(this.f10333e);
        sb.append(", top=");
        sb.append(this.f10334f);
        sb.append(", bottom=");
        return AbstractC0094y0.m186m(sb, this.f10335g, ')');
    }
}
