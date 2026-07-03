package p032d6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p069i6.C2096i;
import p069i6.C2101n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.e1 */
/* loaded from: classes.dex */
public abstract class AbstractC0529e1 extends C2096i implements InterfaceC0552m0, InterfaceC0585x0 {

    /* renamed from: h */
    public C0541i1 f1870h;

    @Override // p032d6.InterfaceC0552m0
    /* renamed from: a */
    public final void mo1155a() {
        C0541i1 m1158j = m1158j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0541i1.f1886e;
            Object obj = atomicReferenceFieldUpdater.get(m1158j);
            if (obj instanceof AbstractC0529e1) {
                if (obj == this) {
                    C0555n0 c0555n0 = AbstractC0525d0.f1864j;
                    while (!atomicReferenceFieldUpdater.compareAndSet(m1158j, obj, c0555n0)) {
                        if (atomicReferenceFieldUpdater.get(m1158j) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof InterfaceC0585x0) || ((InterfaceC0585x0) obj).mo1157d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2096i.f12364e;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (!(obj2 instanceof C2101n)) {
                    if (obj2 == this) {
                        return;
                    }
                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    C2096i c2096i = (C2096i) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2096i.f12366g;
                    C2101n c2101n = (C2101n) atomicReferenceFieldUpdater3.get(c2096i);
                    if (c2101n == null) {
                        c2101n = new C2101n(c2096i);
                        atomicReferenceFieldUpdater3.set(c2096i, c2101n);
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c2101n)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    c2096i.m3448f();
                    return;
                }
                return;
            }
        }
    }

    @Override // p032d6.InterfaceC0585x0
    /* renamed from: b */
    public final boolean mo1156b() {
        return true;
    }

    @Override // p032d6.InterfaceC0585x0
    /* renamed from: d */
    public final C0547k1 mo1157d() {
        return null;
    }

    public InterfaceC0520b1 getParent() {
        return m1158j();
    }

    /* renamed from: j */
    public final C0541i1 m1158j() {
        C0541i1 c0541i1 = this.f1870h;
        if (c0541i1 != null) {
            return c0541i1;
        }
        AbstractC3367j.m5105j("job");
        throw null;
    }

    /* renamed from: k */
    public abstract boolean mo1111k();

    /* renamed from: l */
    public abstract void mo1112l(Throwable th);

    @Override // p069i6.C2096i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0525d0.m1134l(this) + "[job@" + AbstractC0525d0.m1134l(m1158j()) + ']';
    }
}
