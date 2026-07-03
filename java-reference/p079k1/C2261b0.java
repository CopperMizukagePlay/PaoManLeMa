package p079k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.b0 */
/* loaded from: classes.dex */
public final class C2261b0 extends AbstractC2265d0 implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final List f13113e;

    /* renamed from: f */
    public final ArrayList f13114f;

    public C2261b0(List list, ArrayList arrayList) {
        this.f13113e = list;
        this.f13114f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C2261b0)) {
                C2261b0 c2261b0 = (C2261b0) obj;
                if (AbstractC3367j.m5096a(this.f13113e, c2261b0.f13113e) && this.f13114f.equals(c2261b0.f13114f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13114f.hashCode() + AbstractC0094y0.m176c(this.f13113e, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(1.0f, AbstractC2487d.m4038b(1.0f, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2259a0(this);
    }
}
