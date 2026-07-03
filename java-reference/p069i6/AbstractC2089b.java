package p069i6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.b */
/* loaded from: classes.dex */
public abstract class AbstractC2089b {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12347a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2089b.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12348b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2089b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2089b(AbstractC2104q abstractC2104q) {
        this._prev$volatile = abstractC2104q;
    }

    /* renamed from: b */
    public final void m3442b() {
        f12348b.set(this, null);
    }

    /* renamed from: c */
    public final AbstractC2089b m3443c() {
        Object obj = f12347a.get(this);
        if (obj == AbstractC2088a.f12340a) {
            return null;
        }
        return (AbstractC2089b) obj;
    }

    /* renamed from: d */
    public abstract boolean mo3444d();

    /* renamed from: e */
    public final void m3445e() {
        AbstractC2089b abstractC2089b;
        AbstractC2089b m3443c;
        if (m3443c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12348b;
            AbstractC2089b abstractC2089b2 = (AbstractC2089b) atomicReferenceFieldUpdater.get(this);
            while (abstractC2089b2 != null && abstractC2089b2.mo3444d()) {
                abstractC2089b2 = (AbstractC2089b) atomicReferenceFieldUpdater.get(abstractC2089b2);
            }
            AbstractC2089b m3443c2 = m3443c();
            AbstractC3367j.m5097b(m3443c2);
            while (m3443c2.mo3444d() && (m3443c = m3443c2.m3443c()) != null) {
                m3443c2 = m3443c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(m3443c2);
                if (((AbstractC2089b) obj) == null) {
                    abstractC2089b = null;
                } else {
                    abstractC2089b = abstractC2089b2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(m3443c2, obj, abstractC2089b)) {
                    if (atomicReferenceFieldUpdater.get(m3443c2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC2089b2 != null) {
                f12347a.set(abstractC2089b2, m3443c2);
            }
            if (!m3443c2.mo3444d() || m3443c2.m3443c() == null) {
                if (abstractC2089b2 == null || !abstractC2089b2.mo3444d()) {
                    return;
                }
            }
        }
    }
}
