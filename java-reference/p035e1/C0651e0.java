package p035e1;

import p027d1.C0465c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.e0 */
/* loaded from: classes.dex */
public final class C0651e0 extends AbstractC0655g0 {

    /* renamed from: a */
    public final C0465c f2135a;

    public C0651e0(C0465c c0465c) {
        this.f2135a = c0465c;
    }

    @Override // p035e1.AbstractC0655g0
    /* renamed from: a */
    public final C0465c mo1356a() {
        return this.f2135a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0651e0)) {
            return false;
        }
        if (AbstractC3367j.m5096a(this.f2135a, ((C0651e0) obj).f2135a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2135a.hashCode();
    }
}
