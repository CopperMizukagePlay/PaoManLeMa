package androidx.compose.p007ui.draw;

import p010b1.C0270h;
import p027d1.C0467e;
import p035e1.C0666m;
import p072j1.AbstractC2163b;
import p092m.AbstractC2487d;
import p146t1.C3229q0;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3797e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class PainterElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final AbstractC2163b f747a;

    /* renamed from: b */
    public final InterfaceC3797e f748b;

    /* renamed from: c */
    public final C3229q0 f749c;

    /* renamed from: d */
    public final float f750d;

    /* renamed from: e */
    public final C0666m f751e;

    public PainterElement(AbstractC2163b abstractC2163b, InterfaceC3797e interfaceC3797e, C3229q0 c3229q0, float f7, C0666m c0666m) {
        this.f747a = abstractC2163b;
        this.f748b = interfaceC3797e;
        this.f749c = c3229q0;
        this.f750d = f7;
        this.f751e = c0666m;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PainterElement) {
                PainterElement painterElement = (PainterElement) obj;
                if (!AbstractC3367j.m5096a(this.f747a, painterElement.f747a) || !AbstractC3367j.m5096a(this.f748b, painterElement.f748b) || !AbstractC3367j.m5096a(this.f749c, painterElement.f749c) || Float.compare(this.f750d, painterElement.f750d) != 0 || !AbstractC3367j.m5096a(this.f751e, painterElement.f751e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.h, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f1006s = this.f747a;
        abstractC3809q.f1007t = true;
        abstractC3809q.f1008u = this.f748b;
        abstractC3809q.f1009v = this.f749c;
        abstractC3809q.f1010w = this.f750d;
        abstractC3809q.f1011x = this.f751e;
        return abstractC3809q;
    }

    public final int hashCode() {
        int hashCode;
        int m4038b = AbstractC2487d.m4038b(this.f750d, (this.f749c.hashCode() + ((this.f748b.hashCode() + AbstractC2487d.m4040d(this.f747a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C0666m c0666m = this.f751e;
        if (c0666m == null) {
            hashCode = 0;
        } else {
            hashCode = c0666m.hashCode();
        }
        return m4038b + hashCode;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        boolean z7;
        C0270h c0270h = (C0270h) abstractC3809q;
        boolean z8 = c0270h.f1007t;
        AbstractC2163b abstractC2163b = this.f747a;
        if (z8 && C0467e.m1023a(c0270h.f1006s.mo3504d(), abstractC2163b.mo3504d())) {
            z7 = false;
        } else {
            z7 = true;
        }
        c0270h.f1006s = abstractC2163b;
        c0270h.f1007t = true;
        c0270h.f1008u = this.f748b;
        c0270h.f1009v = this.f749c;
        c0270h.f1010w = this.f750d;
        c0270h.f1011x = this.f751e;
        if (z7) {
            AbstractC3498f.m5374n(c0270h);
        }
        AbstractC3498f.m5373m(c0270h);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f747a + ", sizeToIntrinsics=true, alignment=" + this.f748b + ", contentScale=" + this.f749c + ", alpha=" + this.f750d + ", colorFilter=" + this.f751e + ')';
    }
}
