package p085l0;

import android.view.Choreographer;
import java.util.ArrayList;
import p014b5.C0293g;
import p032d6.C0548l;
import p039e5.C1299ta;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p068i5.AbstractC2080d;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.C2649h1;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p170w1.C3717q0;
import p170w1.ChoreographerFrameCallbackC3721r0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.i1 */
/* loaded from: classes.dex */
public final class C2369i1 implements InterfaceC2416v0 {

    /* renamed from: e */
    public final /* synthetic */ int f13411e;

    /* renamed from: f */
    public final Object f13412f;

    /* renamed from: g */
    public final Object f13413g;

    public C2369i1(Choreographer choreographer, C3717q0 c3717q0) {
        this.f13411e = 1;
        this.f13412f = choreographer;
        this.f13413g = c3717q0;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: B */
    public final Object mo852B(Object obj, InterfaceC3281e interfaceC3281e) {
        switch (this.f13411e) {
            case 0:
                return interfaceC3281e.mo22d(obj, this);
            default:
                return interfaceC3281e.mo22d(obj, this);
        }
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: h */
    public final InterfaceC2316f mo853h(InterfaceC2317g interfaceC2317g) {
        switch (this.f13411e) {
            case 0:
                return AbstractC2080d.m3401n(this, interfaceC2317g);
            default:
                return AbstractC2080d.m3401n(this, interfaceC2317g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r8 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    @Override // p085l0.InterfaceC2416v0
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3790m(InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        C2365h1 c2365h1;
        EnumC2465a enumC2465a;
        int i7;
        boolean z7;
        Object m1221t;
        Object mo3790m;
        switch (this.f13411e) {
            case 0:
                if (abstractC2583c instanceof C2365h1) {
                    c2365h1 = (C2365h1) abstractC2583c;
                    int i8 = c2365h1.f13408k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c2365h1.f13408k = i8 - Integer.MIN_VALUE;
                        Object obj = c2365h1.f13406i;
                        enumC2465a = EnumC2465a.f13750e;
                        i7 = c2365h1.f13408k;
                        if (i7 == 0) {
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    AbstractC1793a0.m2972L(obj);
                                    return obj;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3279c = c2365h1.f13405h;
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            AbstractC1793a0.m2972L(obj);
                            C0293g c0293g = (C0293g) this.f13413g;
                            c2365h1.f13405h = interfaceC3279c;
                            c2365h1.f13408k = 1;
                            synchronized (c0293g.f1068b) {
                                z7 = c0293g.f1067a;
                            }
                            if (z7) {
                                m1221t = C1694m.f10482a;
                                break;
                            } else {
                                C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(c2365h1));
                                c0548l.m1222u();
                                synchronized (c0293g.f1068b) {
                                    ((ArrayList) c0293g.f1069c).add(c0548l);
                                }
                                c0548l.m1224w(new C1299ta(2, c0293g, c0548l));
                                m1221t = c0548l.m1221t();
                                if (m1221t != enumC2465a) {
                                    m1221t = C1694m.f10482a;
                                    break;
                                }
                            }
                        }
                        InterfaceC2416v0 interfaceC2416v0 = (InterfaceC2416v0) this.f13412f;
                        c2365h1.f13405h = null;
                        c2365h1.f13408k = 2;
                        mo3790m = interfaceC2416v0.mo3790m(interfaceC3279c, c2365h1);
                        if (mo3790m != enumC2465a) {
                            return mo3790m;
                        }
                        return enumC2465a;
                    }
                }
                c2365h1 = new C2365h1(this, abstractC2583c);
                Object obj2 = c2365h1.f13406i;
                enumC2465a = EnumC2465a.f13750e;
                i7 = c2365h1.f13408k;
                if (i7 == 0) {
                }
                InterfaceC2416v0 interfaceC2416v02 = (InterfaceC2416v0) this.f13412f;
                c2365h1.f13405h = null;
                c2365h1.f13408k = 2;
                mo3790m = interfaceC2416v02.mo3790m(interfaceC3279c, c2365h1);
                if (mo3790m != enumC2465a) {
                }
                return enumC2465a;
            default:
                C3717q0 c3717q0 = (C3717q0) this.f13413g;
                C0548l c0548l2 = new C0548l(1, AbstractC2064e.m3250x(abstractC2583c));
                c0548l2.m1222u();
                ChoreographerFrameCallbackC3721r0 choreographerFrameCallbackC3721r0 = new ChoreographerFrameCallbackC3721r0(c0548l2, this, interfaceC3279c);
                if (AbstractC3367j.m5096a(c3717q0.f17665g, (Choreographer) this.f13412f)) {
                    synchronized (c3717q0.f17667i) {
                        c3717q0.f17669k.add(choreographerFrameCallbackC3721r0);
                        if (!c3717q0.f17672n) {
                            c3717q0.f17672n = true;
                            c3717q0.f17665g.postFrameCallback(c3717q0.f17673o);
                        }
                    }
                    c0548l2.m1224w(new C2649h1(21, c3717q0, choreographerFrameCallbackC3721r0));
                } else {
                    ((Choreographer) this.f13412f).postFrameCallback(choreographerFrameCallbackC3721r0);
                    c0548l2.m1224w(new C2649h1(22, this, choreographerFrameCallbackC3721r0));
                }
                return c0548l2.m1221t();
        }
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: t */
    public final InterfaceC2318h mo854t(InterfaceC2317g interfaceC2317g) {
        switch (this.f13411e) {
            case 0:
                return AbstractC2080d.m3411x(this, interfaceC2317g);
            default:
                return AbstractC2080d.m3411x(this, interfaceC2317g);
        }
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: z */
    public final InterfaceC2318h mo855z(InterfaceC2318h interfaceC2318h) {
        switch (this.f13411e) {
            case 0:
                return AbstractC2080d.m3374B(this, interfaceC2318h);
            default:
                return AbstractC2080d.m3374B(this, interfaceC2318h);
        }
    }

    public C2369i1(InterfaceC2416v0 interfaceC2416v0) {
        this.f13411e = 0;
        this.f13412f = interfaceC2416v0;
        this.f13413g = new C0293g();
    }
}
