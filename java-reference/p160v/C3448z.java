package p160v;

import androidx.compose.foundation.lazy.layout.C0156a;
import java.util.ArrayList;
import p001a0.C0019e1;
import p049g1.C1568b;
import p057h1.C1752b;
import p158u5.AbstractC3367j;
import p162v1.C3508i0;
import p162v1.InterfaceC3522n;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.z */
/* loaded from: classes.dex */
public final class C3448z extends AbstractC3809q implements InterfaceC3522n {

    /* renamed from: s */
    public C0156a f16661s;

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        this.f16661s.f685j = this;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        this.f16661s.m367e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3448z) && AbstractC3367j.m5096a(this.f16661s, ((C3448z) obj).f16661s)) {
            return true;
        }
        return false;
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        C1568b c1568b = c3508i0.f16933e;
        ArrayList arrayList = this.f16661s.f684i;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C3444x c3444x = (C3444x) arrayList.get(i7);
            C1752b c1752b = c3444x.f16651n;
            if (c1752b != null) {
                long j6 = c3444x.f16650m;
                long j7 = c1752b.f10682t;
                float f7 = ((int) (j6 >> 32)) - ((int) (j7 >> 32));
                float f8 = ((int) (j6 & 4294967295L)) - ((int) (j7 & 4294967295L));
                ((C0019e1) c1568b.f10182f.f152f).m50v(f7, f8);
                try {
                    AbstractC3784a.m5803g(c3508i0, c1752b);
                } finally {
                    ((C0019e1) c1568b.f10182f.f152f).m50v(-f7, -f8);
                }
            }
        }
        c3508i0.m5460a();
    }

    public final int hashCode() {
        return this.f16661s.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f16661s + ')';
    }
}
