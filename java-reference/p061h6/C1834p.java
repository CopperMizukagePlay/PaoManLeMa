package p061h6;

import p024c6.AbstractC0445l;
import p024c6.C0453t;
import p032d6.AbstractC0525d0;
import p050g2.C1584e0;
import p053g5.C1690i;
import p053g5.C1694m;
import p054g6.InterfaceC1704e;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p098m5.InterfaceC2584d;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.p */
/* loaded from: classes.dex */
public final class C1834p extends AbstractC2583c implements InterfaceC1704e {

    /* renamed from: h */
    public final InterfaceC1704e f10897h;

    /* renamed from: i */
    public final InterfaceC2318h f10898i;

    /* renamed from: j */
    public final int f10899j;

    /* renamed from: k */
    public InterfaceC2318h f10900k;

    /* renamed from: l */
    public InterfaceC2313c f10901l;

    public C1834p(InterfaceC1704e interfaceC1704e, InterfaceC2318h interfaceC2318h) {
        super(C1832n.f10895e, C2319i.f13273e);
        this.f10897h = interfaceC1704e;
        this.f10898i = interfaceC2318h;
        this.f10899j = ((Number) interfaceC2318h.mo852B(0, new C1584e0(3))).intValue();
    }

    @Override // p098m5.AbstractC2581a, p098m5.InterfaceC2584d
    /* renamed from: g */
    public final InterfaceC2584d mo1215g() {
        InterfaceC2313c interfaceC2313c = this.f10901l;
        if (interfaceC2313c instanceof InterfaceC2584d) {
            return (InterfaceC2584d) interfaceC2313c;
        }
        return null;
    }

    @Override // p054g6.InterfaceC1704e
    /* renamed from: h */
    public final Object mo160h(Object obj, InterfaceC2313c interfaceC2313c) {
        try {
            Object m3100q = m3100q(interfaceC2313c, obj);
            if (m3100q == EnumC2465a.f13750e) {
                return m3100q;
            }
            return C1694m.f10482a;
        } catch (Throwable th) {
            this.f10900k = new C1830l(th, interfaceC2313c.mo662j());
            throw th;
        }
    }

    @Override // p098m5.AbstractC2583c, p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        InterfaceC2318h interfaceC2318h = this.f10900k;
        if (interfaceC2318h == null) {
            return C2319i.f13273e;
        }
        return interfaceC2318h;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: l */
    public final StackTraceElement mo3099l() {
        return null;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Throwable m2747a = C1690i.m2747a(obj);
        if (m2747a != null) {
            this.f10900k = new C1830l(m2747a, mo662j());
        }
        InterfaceC2313c interfaceC2313c = this.f10901l;
        if (interfaceC2313c != null) {
            interfaceC2313c.mo663n(obj);
        }
        return EnumC2465a.f13750e;
    }

    /* renamed from: q */
    public final Object m3100q(InterfaceC2313c interfaceC2313c, Object obj) {
        InterfaceC2318h mo662j = interfaceC2313c.mo662j();
        AbstractC0525d0.m1132j(mo662j);
        InterfaceC2318h interfaceC2318h = this.f10900k;
        if (interfaceC2318h != mo662j) {
            if (!(interfaceC2318h instanceof C1830l)) {
                if (((Number) mo662j.mo852B(0, new C0453t(11, this))).intValue() == this.f10899j) {
                    this.f10900k = mo662j;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f10898i + ",\n\t\tbut emission happened in " + mo662j + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(AbstractC0445l.m961C("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C1830l) interfaceC2318h).f10894f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f10901l = interfaceC2313c;
        InterfaceC3282f interfaceC3282f = AbstractC1836r.f10903a;
        InterfaceC1704e interfaceC1704e = this.f10897h;
        AbstractC3367j.m5098c(interfaceC1704e, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object mo24c = interfaceC3282f.mo24c(interfaceC1704e, obj, this);
        if (!AbstractC3367j.m5096a(mo24c, EnumC2465a.f13750e)) {
            this.f10901l = null;
        }
        return mo24c;
    }
}
