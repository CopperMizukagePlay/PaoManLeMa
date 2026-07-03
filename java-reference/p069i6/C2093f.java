package p069i6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0546k0;
import p032d6.AbstractC0570s0;
import p032d6.AbstractC0574t1;
import p032d6.AbstractC0581w;
import p032d6.C0569s;
import p053g5.C1690i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p098m5.AbstractC2583c;
import p098m5.InterfaceC2584d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.f */
/* loaded from: classes.dex */
public final class C2093f extends AbstractC0546k0 implements InterfaceC2584d, InterfaceC2313c {

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12352l = AtomicReferenceFieldUpdater.newUpdater(C2093f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: h */
    public final AbstractC0581w f12353h;

    /* renamed from: i */
    public final AbstractC2583c f12354i;

    /* renamed from: j */
    public Object f12355j;

    /* renamed from: k */
    public final Object f12356k;

    public C2093f(AbstractC0581w abstractC0581w, AbstractC2583c abstractC2583c) {
        super(-1);
        this.f12353h = abstractC0581w;
        this.f12354i = abstractC2583c;
        this.f12355j = AbstractC2088a.f12341b;
        this.f12356k = AbstractC2088a.m3440k(abstractC2583c.mo662j());
    }

    @Override // p098m5.InterfaceC2584d
    /* renamed from: g */
    public final InterfaceC2584d mo1215g() {
        return this.f12354i;
    }

    @Override // p032d6.AbstractC0546k0
    /* renamed from: i */
    public final Object mo1206i() {
        Object obj = this.f12355j;
        this.f12355j = AbstractC2088a.f12341b;
        return obj;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return this.f12354i.mo662j();
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        Object c0569s;
        Throwable m2747a = C1690i.m2747a(obj);
        if (m2747a == null) {
            c0569s = obj;
        } else {
            c0569s = new C0569s(m2747a, false);
        }
        AbstractC2583c abstractC2583c = this.f12354i;
        InterfaceC2318h mo662j = abstractC2583c.mo662j();
        AbstractC0581w abstractC0581w = this.f12353h;
        if (abstractC0581w.mo1244K(mo662j)) {
            this.f12355j = c0569s;
            this.f1892g = 0;
            abstractC0581w.mo1233J(abstractC2583c.mo662j(), this);
            return;
        }
        AbstractC0570s0 m1243a = AbstractC0574t1.m1243a();
        if (m1243a.f1925g >= 4294967296L) {
            this.f12355j = c0569s;
            this.f1892g = 0;
            m1243a.m1240N(this);
            return;
        }
        m1243a.m1241P(true);
        try {
            InterfaceC2318h mo662j2 = abstractC2583c.mo662j();
            Object m3441l = AbstractC2088a.m3441l(mo662j2, this.f12356k);
            try {
                abstractC2583c.mo663n(obj);
                do {
                } while (m1243a.m1242R());
            } finally {
                AbstractC2088a.m3436g(mo662j2, m3441l);
            }
        } catch (Throwable th) {
            try {
                m1205h(th);
            } finally {
                m1243a.m1239M(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f12353h + ", " + AbstractC0525d0.m1146x(this.f12354i) + ']';
    }

    @Override // p032d6.AbstractC0546k0
    /* renamed from: c */
    public final InterfaceC2313c mo1202c() {
        return this;
    }
}
