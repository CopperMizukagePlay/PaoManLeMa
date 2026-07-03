package p039e5;

import java.util.List;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zm */
/* loaded from: classes.dex */
public final class C1497zm {

    /* renamed from: a */
    public final List f9926a;

    /* renamed from: b */
    public final boolean f9927b;

    /* renamed from: c */
    public final boolean f9928c;

    /* renamed from: d */
    public final String f9929d;

    public C1497zm(List list, boolean z7, boolean z8, String str) {
        this.f9926a = list;
        this.f9927b = z7;
        this.f9928c = z8;
        this.f9929d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1497zm) {
                C1497zm c1497zm = (C1497zm) obj;
                if (!AbstractC3367j.m5096a(this.f9926a, c1497zm.f9926a) || this.f9927b != c1497zm.f9927b || this.f9928c != c1497zm.f9928c || !AbstractC3367j.m5096a(this.f9929d, c1497zm.f9929d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int m4040d = AbstractC2487d.m4040d(AbstractC2487d.m4040d(this.f9926a.hashCode() * 31, 31, this.f9927b), 31, this.f9928c);
        String str = this.f9929d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return m4040d + hashCode;
    }

    public final String toString() {
        return "QueuePressureMonitorState(snapshots=" + this.f9926a + ", running=" + this.f9927b + ", monitorAvailable=" + this.f9928c + ", errorMessage=" + this.f9929d + ")";
    }

    public /* synthetic */ C1497zm() {
        this(C1813u.f10860e, false, false, null);
    }
}
