package p096m3;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001a0.C0005b;
import p001a0.C0019e1;
import p034e0.C0614k0;
import p054g6.C1701c0;
import p073j2.AbstractC2168e;
import p092m.AbstractC2482a0;
import p092m.AbstractC2483b;
import p092m.C2509y;
import p092m.C2510z;
import p100n.AbstractC2647h;
import p100n.AbstractC2674q;
import p100n.C2649h1;
import p100n.C2673p1;
import p100n.InterfaceC2630b0;
import p100n.InterfaceC2677r;
import p100n.InterfaceC2679r1;
import p104n3.C2716a;
import p104n3.C2717b;
import p117p1.AbstractC2866q;
import p117p1.C2859j;
import p117p1.C2868s;
import p117p1.C2874y;
import p117p1.EnumC2873x;
import p146t1.InterfaceC3238v;
import p148t3.AbstractC3255d;
import p148t3.AbstractC3257f;
import p148t3.C3253b;
import p148t3.C3258g;
import p148t3.C3260i;
import p148t3.C3261j;
import p158u5.AbstractC3367j;
import p183y0.InterfaceC3837f;
import p195z5.C3878c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.v */
/* loaded from: classes.dex */
public final class C2572v implements InterfaceC2679r1, InterfaceC3837f {

    /* renamed from: e */
    public Object f13966e;

    /* renamed from: f */
    public Object f13967f;

    /* renamed from: g */
    public Object f13968g;

    /* renamed from: h */
    public Object f13969h;

    public /* synthetic */ C2572v(Object obj) {
        this.f13966e = obj;
    }

    /* renamed from: a */
    public static void m4094a(C2572v c2572v, AbstractC3255d abstractC3255d) {
        c2572v.getClass();
        AbstractC3367j.m5100e(abstractC3255d, "handler");
        if (((LinkedHashSet) c2572v.f13968g).add(abstractC3255d)) {
            C3258g c3258g = (C3258g) c2572v.f13967f;
            c3258g.getClass();
            if (abstractC3255d.f16083c == null) {
                c3258g.f16092e.addFirst(abstractC3255d);
                abstractC3255d.f16083c = c2572v;
                c3258g.m4974b();
            } else {
                throw new IllegalArgumentException(("Handler '" + abstractC3255d + "' is already registered with a dispatcher").toString());
            }
        }
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: c */
    public long mo4095c(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        Iterator it = AbstractC2168e.m3513G(0, abstractC2674q.mo4267b()).iterator();
        long j6 = 0;
        while (true) {
            C3878c c3878c = (C3878c) it;
            if (c3878c.f18168g) {
                int nextInt = c3878c.nextInt();
                j6 = Math.max(j6, ((InterfaceC2677r) this.f13966e).get(nextInt).mo4199d(abstractC2674q.mo4266a(nextInt), abstractC2674q2.mo4266a(nextInt), abstractC2674q3.mo4266a(nextInt)));
            } else {
                return j6;
            }
        }
    }

    /* renamed from: d */
    public void m4096d(AbstractC3257f abstractC3257f) {
        if (((LinkedHashSet) this.f13969h).add(abstractC3257f)) {
            ((C3258g) this.f13967f).m4973a(this, abstractC3257f, -1);
        }
    }

    /* renamed from: e */
    public void m4097e(C3261j c3261j, int i7) {
        if (i7 != 1 && i7 != 0) {
            throw new IllegalArgumentException(AbstractC2647h.m4256b("Unsupported priority value: ", i7).toString());
        }
        if (((LinkedHashSet) this.f13969h).add(c3261j)) {
            ((C3258g) this.f13967f).m4973a(this, c3261j, i7);
        }
    }

    /* renamed from: f */
    public void m4098f(AbstractC3257f abstractC3257f, C3253b c3253b) {
        C3258g c3258g = (C3258g) this.f13967f;
        c3258g.getClass();
        if (c3258g.f16094g == 0) {
            AbstractC3255d m4975c = c3258g.m4975c(-1);
            c3258g.f16093f = m4975c;
            c3258g.f16094g = -1;
            c3258g.f16095h = abstractC3257f;
            if (c3253b != null) {
                if (m4975c != null) {
                    m4975c.mo481d(c3253b);
                }
                C1701c0 c1701c0 = c3258g.f16088a;
                C3260i c3260i = new C3260i(c3253b);
                c1701c0.getClass();
                c1701c0.m2752j(null, c3260i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* renamed from: g */
    public void m4099g(C2859j c2859j, boolean z7) {
        C2874y c2874y = (C2874y) this.f13969h;
        ?? r12 = c2859j.f14991a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C2868s) r12.get(i7)).m4551b()) {
                m4102j(c2859j);
                return;
            }
        }
        InterfaceC3238v interfaceC3238v = (InterfaceC3238v) this.f13966e;
        if (interfaceC3238v != null) {
            AbstractC2866q.m4547f(c2859j, interfaceC3238v.mo4927U(0L), new C2649h1(6, this, c2874y), false);
            if (((EnumC2873x) this.f13967f) == EnumC2873x.f15036f) {
                if (z7) {
                    int size2 = r12.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        ((C2868s) r12.get(i8)).m4550a();
                    }
                }
                C0614k0 c0614k0 = c2859j.f14992b;
                if (c0614k0 != null) {
                    c0614k0.f2017b = !c2874y.f15041c;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set");
    }

    /* renamed from: h */
    public AbstractC2674q m4100h(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2) {
        if (((AbstractC2674q) this.f13969h) == null) {
            this.f13969h = abstractC2674q.mo4268c();
        }
        AbstractC2674q abstractC2674q3 = (AbstractC2674q) this.f13969h;
        if (abstractC2674q3 != null) {
            int i7 = 0;
            for (int mo4267b = abstractC2674q3.mo4267b(); i7 < mo4267b; mo4267b = mo4267b) {
                AbstractC2674q abstractC2674q4 = (AbstractC2674q) this.f13969h;
                if (abstractC2674q4 != null) {
                    C0019e1 c0019e1 = (C0019e1) this.f13966e;
                    float mo4266a = abstractC2674q.mo4266a(i7);
                    float mo4266a2 = abstractC2674q2.mo4266a(i7);
                    C2510z c2510z = (C2510z) c0019e1.f109e;
                    double m4066b = c2510z.m4066b(mo4266a2);
                    double d7 = AbstractC2482a0.f13782a;
                    float f7 = c2510z.f13857a * c2510z.f13858b;
                    abstractC2674q4.mo4270e((Math.signum(mo4266a2) * ((float) (Math.exp((d7 / (d7 - 1.0d)) * m4066b) * f7))) + mo4266a, i7);
                    i7++;
                } else {
                    AbstractC3367j.m5105j("targetVector");
                    throw null;
                }
            }
            AbstractC2674q abstractC2674q5 = (AbstractC2674q) this.f13969h;
            if (abstractC2674q5 != null) {
                return abstractC2674q5;
            }
            AbstractC3367j.m5105j("targetVector");
            throw null;
        }
        AbstractC3367j.m5105j("targetVector");
        throw null;
    }

    /* renamed from: i */
    public AbstractC2674q m4101i(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2) {
        float f7;
        if (((AbstractC2674q) this.f13968g) == null) {
            this.f13968g = abstractC2674q.mo4268c();
        }
        AbstractC2674q abstractC2674q3 = (AbstractC2674q) this.f13968g;
        if (abstractC2674q3 != null) {
            int mo4267b = abstractC2674q3.mo4267b();
            for (int i7 = 0; i7 < mo4267b; i7++) {
                AbstractC2674q abstractC2674q4 = (AbstractC2674q) this.f13968g;
                if (abstractC2674q4 != null) {
                    C0019e1 c0019e1 = (C0019e1) this.f13966e;
                    abstractC2674q.getClass();
                    long j7 = j6 / 1000000;
                    C2509y m4065a = ((C2510z) c0019e1.f109e).m4065a(abstractC2674q2.mo4266a(i7));
                    long j8 = m4065a.f13856c;
                    if (j8 > 0) {
                        f7 = ((float) j7) / ((float) j8);
                    } else {
                        f7 = 1.0f;
                    }
                    abstractC2674q4.mo4270e((((Math.signum(m4065a.f13854a) * AbstractC2483b.m4034a(f7).f13781b) * m4065a.f13855b) / ((float) j8)) * 1000.0f, i7);
                } else {
                    AbstractC3367j.m5105j("velocityVector");
                    throw null;
                }
            }
            AbstractC2674q abstractC2674q5 = (AbstractC2674q) this.f13968g;
            if (abstractC2674q5 != null) {
                return abstractC2674q5;
            }
            AbstractC3367j.m5105j("velocityVector");
            throw null;
        }
        AbstractC3367j.m5105j("velocityVector");
        throw null;
    }

    /* renamed from: j */
    public void m4102j(C2859j c2859j) {
        if (((EnumC2873x) this.f13967f) == EnumC2873x.f15036f) {
            InterfaceC3238v interfaceC3238v = (InterfaceC3238v) this.f13966e;
            if (interfaceC3238v != null) {
                AbstractC2866q.m4547f(c2859j, interfaceC3238v.mo4927U(0L), new C0005b(21, (C2874y) this.f13969h), true);
            } else {
                throw new IllegalStateException("layoutCoordinates not set");
            }
        }
        this.f13967f = EnumC2873x.f15037g;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: m */
    public AbstractC2674q mo4103m(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        if (((AbstractC2674q) this.f13969h) == null) {
            this.f13969h = abstractC2674q3.mo4268c();
        }
        AbstractC2674q abstractC2674q4 = (AbstractC2674q) this.f13969h;
        if (abstractC2674q4 != null) {
            int mo4267b = abstractC2674q4.mo4267b();
            for (int i7 = 0; i7 < mo4267b; i7++) {
                AbstractC2674q abstractC2674q5 = (AbstractC2674q) this.f13969h;
                if (abstractC2674q5 != null) {
                    abstractC2674q5.mo4270e(((InterfaceC2677r) this.f13966e).get(i7).mo4200e(abstractC2674q.mo4266a(i7), abstractC2674q2.mo4266a(i7), abstractC2674q3.mo4266a(i7)), i7);
                } else {
                    AbstractC3367j.m5105j("endVelocityVector");
                    throw null;
                }
            }
            AbstractC2674q abstractC2674q6 = (AbstractC2674q) this.f13969h;
            if (abstractC2674q6 != null) {
                return abstractC2674q6;
            }
            AbstractC3367j.m5105j("endVelocityVector");
            throw null;
        }
        AbstractC3367j.m5105j("endVelocityVector");
        throw null;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: n */
    public AbstractC2674q mo630n(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        if (((AbstractC2674q) this.f13968g) == null) {
            this.f13968g = abstractC2674q3.mo4268c();
        }
        AbstractC2674q abstractC2674q4 = (AbstractC2674q) this.f13968g;
        if (abstractC2674q4 != null) {
            int mo4267b = abstractC2674q4.mo4267b();
            for (int i7 = 0; i7 < mo4267b; i7++) {
                AbstractC2674q abstractC2674q5 = (AbstractC2674q) this.f13968g;
                if (abstractC2674q5 != null) {
                    abstractC2674q5.mo4270e(((InterfaceC2677r) this.f13966e).get(i7).mo4198c(j6, abstractC2674q.mo4266a(i7), abstractC2674q2.mo4266a(i7), abstractC2674q3.mo4266a(i7)), i7);
                } else {
                    AbstractC3367j.m5105j("velocityVector");
                    throw null;
                }
            }
            AbstractC2674q abstractC2674q6 = (AbstractC2674q) this.f13968g;
            if (abstractC2674q6 != null) {
                return abstractC2674q6;
            }
            AbstractC3367j.m5105j("velocityVector");
            throw null;
        }
        AbstractC3367j.m5105j("velocityVector");
        throw null;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: o */
    public AbstractC2674q mo631o(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        if (((AbstractC2674q) this.f13967f) == null) {
            this.f13967f = abstractC2674q.mo4268c();
        }
        AbstractC2674q abstractC2674q4 = (AbstractC2674q) this.f13967f;
        if (abstractC2674q4 != null) {
            int mo4267b = abstractC2674q4.mo4267b();
            for (int i7 = 0; i7 < mo4267b; i7++) {
                AbstractC2674q abstractC2674q5 = (AbstractC2674q) this.f13967f;
                if (abstractC2674q5 != null) {
                    abstractC2674q5.mo4270e(((InterfaceC2677r) this.f13966e).get(i7).mo4197b(j6, abstractC2674q.mo4266a(i7), abstractC2674q2.mo4266a(i7), abstractC2674q3.mo4266a(i7)), i7);
                } else {
                    AbstractC3367j.m5105j("valueVector");
                    throw null;
                }
            }
            AbstractC2674q abstractC2674q6 = (AbstractC2674q) this.f13967f;
            if (abstractC2674q6 != null) {
                return abstractC2674q6;
            }
            AbstractC3367j.m5105j("valueVector");
            throw null;
        }
        AbstractC3367j.m5105j("valueVector");
        throw null;
    }

    public C2572v(Typeface typeface, C2717b c2717b) {
        int i7;
        int i8;
        int i9;
        int i10;
        this.f13969h = typeface;
        this.f13966e = c2717b;
        this.f13968g = new C2571u(1024);
        int m3415a = c2717b.m3415a(6);
        if (m3415a != 0) {
            int i11 = m3415a + c2717b.f12316e;
            i7 = ((ByteBuffer) c2717b.f12319h).getInt(((ByteBuffer) c2717b.f12319h).getInt(i11) + i11);
        } else {
            i7 = 0;
        }
        this.f13967f = new char[i7 * 2];
        int m3415a2 = c2717b.m3415a(6);
        if (m3415a2 != 0) {
            int i12 = m3415a2 + c2717b.f12316e;
            i8 = ((ByteBuffer) c2717b.f12319h).getInt(((ByteBuffer) c2717b.f12319h).getInt(i12) + i12);
        } else {
            i8 = 0;
        }
        for (int i13 = 0; i13 < i8; i13++) {
            C2573w c2573w = new C2573w(this, i13);
            C2716a m4105b = c2573w.m4105b();
            int m3415a3 = m4105b.m3415a(4);
            Character.toChars(m3415a3 != 0 ? ((ByteBuffer) m4105b.f12319h).getInt(m3415a3 + m4105b.f12316e) : 0, (char[]) this.f13967f, i13 * 2);
            C2716a m4105b2 = c2573w.m4105b();
            int m3415a4 = m4105b2.m3415a(16);
            if (m3415a4 != 0) {
                int i14 = m3415a4 + m4105b2.f12316e;
                i9 = ((ByteBuffer) m4105b2.f12319h).getInt(((ByteBuffer) m4105b2.f12319h).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                C2571u c2571u = (C2571u) this.f13968g;
                C2716a m4105b3 = c2573w.m4105b();
                int m3415a5 = m4105b3.m3415a(16);
                if (m3415a5 != 0) {
                    int i15 = m3415a5 + m4105b3.f12316e;
                    i10 = ((ByteBuffer) m4105b3.f12319h).getInt(((ByteBuffer) m4105b3.f12319h).getInt(i15) + i15);
                } else {
                    i10 = 0;
                }
                c2571u.m4093a(c2573w, 0, i10 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public C2572v(InterfaceC2630b0 interfaceC2630b0) {
        this(new C2673p1(1, interfaceC2630b0));
    }
}
