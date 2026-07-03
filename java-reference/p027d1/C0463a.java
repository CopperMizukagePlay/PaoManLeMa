package p027d1;

import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d1.a */
/* loaded from: classes.dex */
public final class C0463a {

    /* renamed from: a */
    public float f1619a = 0.0f;

    /* renamed from: b */
    public float f1620b = 0.0f;

    /* renamed from: c */
    public float f1621c = 0.0f;

    /* renamed from: d */
    public float f1622d = 0.0f;

    /* renamed from: a */
    public final void m1003a(float f7, float f8, float f9, float f10) {
        this.f1619a = Math.max(f7, this.f1619a);
        this.f1620b = Math.max(f8, this.f1620b);
        this.f1621c = Math.min(f9, this.f1621c);
        this.f1622d = Math.min(f10, this.f1622d);
    }

    /* renamed from: b */
    public final boolean m1004b() {
        boolean z7;
        boolean z8 = false;
        if (this.f1619a >= this.f1621c) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f1620b >= this.f1622d) {
            z8 = true;
        }
        return z7 | z8;
    }

    public final String toString() {
        return "MutableRect(" + AbstractC3393k.m5128A(this.f1619a) + ", " + AbstractC3393k.m5128A(this.f1620b) + ", " + AbstractC3393k.m5128A(this.f1621c) + ", " + AbstractC3393k.m5128A(this.f1622d) + ')';
    }
}
