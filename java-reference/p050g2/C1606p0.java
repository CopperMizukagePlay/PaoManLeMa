package p050g2;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.p0 */
/* loaded from: classes.dex */
public final class C1606p0 implements InterfaceC1577b {

    /* renamed from: a */
    public final String f10320a;

    public C1606p0(String str) {
        this.f10320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1606p0)) {
            return false;
        }
        if (AbstractC3367j.m5096a(this.f10320a, ((C1606p0) obj).f10320a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10320a.hashCode();
    }

    public final String toString() {
        return AbstractC0094y0.m187n(new StringBuilder("UrlAnnotation(url="), this.f10320a, ')');
    }
}
