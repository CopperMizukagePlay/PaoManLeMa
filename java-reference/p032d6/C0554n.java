package p032d6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p039e5.C1279sl;
import p053g5.C1694m;
import p069i6.AbstractC2088a;
import p069i6.C2093f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.n */
/* loaded from: classes.dex */
public final class C0554n extends AbstractC0529e1 {

    /* renamed from: i */
    public final /* synthetic */ int f1902i;

    /* renamed from: j */
    public final C0548l f1903j;

    public /* synthetic */ C0554n(C0548l c0548l, int i7) {
        this.f1902i = i7;
        this.f1903j = c0548l;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: k */
    public final boolean mo1111k() {
        switch (this.f1902i) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: l */
    public final void mo1112l(Throwable th) {
        switch (this.f1902i) {
            case 0:
                C0541i1 m1158j = m1158j();
                C0548l c0548l = this.f1903j;
                Throwable mo1161s = c0548l.mo1161s(m1158j);
                if (c0548l.m1227z()) {
                    C2093f c2093f = (C2093f) c0548l.f1896h;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2093f.f12352l;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c2093f);
                        C1279sl c1279sl = AbstractC2088a.f12342c;
                        if (AbstractC3367j.m5096a(obj, c1279sl)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c2093f, c1279sl, mo1161s)) {
                                if (atomicReferenceFieldUpdater.get(c2093f) != c1279sl) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(c2093f, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c2093f) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0548l.mo1199p(mo1161s);
                if (!c0548l.m1227z()) {
                    c0548l.m1219o();
                    return;
                }
                return;
            default:
                this.f1903j.mo663n(C1694m.f10482a);
                return;
        }
    }
}
