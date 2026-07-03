package p035e1;

import p027d1.C0465c;
import p027d1.C0466d;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.f0 */
/* loaded from: classes.dex */
public final class C0653f0 extends AbstractC0655g0 {

    /* renamed from: a */
    public final C0466d f2142a;

    /* renamed from: b */
    public final C0660j f2143b;

    public C0653f0(C0466d c0466d) {
        C0660j c0660j;
        this.f2142a = c0466d;
        if (!AbstractC2710c.m4322E(c0466d)) {
            c0660j = AbstractC0664l.m1445a();
            C0660j.m1427a(c0660j, c0466d);
        } else {
            c0660j = null;
        }
        this.f2143b = c0660j;
    }

    @Override // p035e1.AbstractC0655g0
    /* renamed from: a */
    public final C0465c mo1356a() {
        C0466d c0466d = this.f2142a;
        return new C0465c(c0466d.f1629a, c0466d.f1630b, c0466d.f1631c, c0466d.f1632d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0653f0)) {
            return false;
        }
        if (AbstractC3367j.m5096a(this.f2142a, ((C0653f0) obj).f2142a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2142a.hashCode();
    }
}
