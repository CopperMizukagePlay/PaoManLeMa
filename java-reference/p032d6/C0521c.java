package p032d6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p039e5.C1279sl;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.c */
/* loaded from: classes.dex */
public final class C0521c extends AbstractC0529e1 {

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1849l = AtomicReferenceFieldUpdater.newUpdater(C0521c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: i */
    public final C0548l f1850i;

    /* renamed from: j */
    public InterfaceC0552m0 f1851j;

    /* renamed from: k */
    public final /* synthetic */ C0527e f1852k;

    public C0521c(C0527e c0527e, C0548l c0548l) {
        this.f1852k = c0527e;
        this.f1850i = c0548l;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: k */
    public final boolean mo1111k() {
        return false;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: l */
    public final void mo1112l(Throwable th) {
        C0548l c0548l = this.f1850i;
        if (th != null) {
            c0548l.getClass();
            C1279sl m1213H = c0548l.m1213H(new C0569s(th, false), null);
            if (m1213H != null) {
                c0548l.mo1197C(m1213H);
                C0524d c0524d = (C0524d) f1849l.get(this);
                if (c0524d != null) {
                    c0524d.m1121b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0527e.f1866b;
        C0527e c0527e = this.f1852k;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0527e) == 0) {
            InterfaceC0534g0[] interfaceC0534g0Arr = c0527e.f1867a;
            ArrayList arrayList = new ArrayList(interfaceC0534g0Arr.length);
            for (InterfaceC0534g0 interfaceC0534g0 : interfaceC0534g0Arr) {
                arrayList.add(interfaceC0534g0.m1163f());
            }
            c0548l.mo663n(arrayList);
        }
    }
}
