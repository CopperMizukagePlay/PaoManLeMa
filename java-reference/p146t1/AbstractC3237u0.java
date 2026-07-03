package p146t1;

import p140s2.C3100j;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;
import p162v1.InterfaceC3559z0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.u0 */
/* loaded from: classes.dex */
public abstract class AbstractC3237u0 implements InterfaceC3093c {

    /* renamed from: e */
    public boolean f16052e;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m4948a(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0) {
        abstractC3237u0.getClass();
        if (abstractC3239v0 instanceof InterfaceC3559z0) {
            ((InterfaceC3559z0) abstractC3239v0).mo5489p(abstractC3237u0.f16052e);
        }
    }

    /* renamed from: g */
    public static void m4949g(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0, int i7, int i8) {
        abstractC3237u0.getClass();
        m4948a(abstractC3237u0, abstractC3239v0);
        abstractC3239v0.mo4940o0(C3100j.m4785c((i8 & 4294967295L) | (i7 << 32), abstractC3239v0.f16057i), 0.0f, null);
    }

    /* renamed from: h */
    public static void m4950h(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0, long j6) {
        abstractC3237u0.getClass();
        m4948a(abstractC3237u0, abstractC3239v0);
        abstractC3239v0.mo4940o0(C3100j.m4785c(j6, abstractC3239v0.f16057i), 0.0f, null);
    }

    /* renamed from: j */
    public static void m4951j(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0, int i7, int i8) {
        long j6 = (i7 << 32) | (i8 & 4294967295L);
        if (abstractC3237u0.mo4914e() != EnumC3103m.f15703e && abstractC3237u0.mo4915f() != 0) {
            int mo4915f = (abstractC3237u0.mo4915f() - abstractC3239v0.f16053e) - ((int) (j6 >> 32));
            m4948a(abstractC3237u0, abstractC3239v0);
            abstractC3239v0.mo4940o0(C3100j.m4785c((mo4915f << 32) | (((int) (j6 & 4294967295L)) & 4294967295L), abstractC3239v0.f16057i), 0.0f, null);
        } else {
            m4948a(abstractC3237u0, abstractC3239v0);
            abstractC3239v0.mo4940o0(C3100j.m4785c(j6, abstractC3239v0.f16057i), 0.0f, null);
        }
    }

    /* renamed from: n */
    public static void m4952n(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0, int i7, int i8) {
        int i9 = AbstractC3243x0.f16063b;
        C3241w0 c3241w0 = C3241w0.f16059g;
        long j6 = (i7 << 32) | (i8 & 4294967295L);
        if (abstractC3237u0.mo4914e() != EnumC3103m.f15703e && abstractC3237u0.mo4915f() != 0) {
            int mo4915f = (abstractC3237u0.mo4915f() - abstractC3239v0.f16053e) - ((int) (j6 >> 32));
            m4948a(abstractC3237u0, abstractC3239v0);
            abstractC3239v0.mo4940o0(C3100j.m4785c((mo4915f << 32) | (((int) (j6 & 4294967295L)) & 4294967295L), abstractC3239v0.f16057i), 0.0f, c3241w0);
        } else {
            m4948a(abstractC3237u0, abstractC3239v0);
            abstractC3239v0.mo4940o0(C3100j.m4785c(j6, abstractC3239v0.f16057i), 0.0f, c3241w0);
        }
    }

    /* renamed from: o */
    public static void m4953o(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0, int i7, int i8, InterfaceC3279c interfaceC3279c, int i9) {
        if ((i9 & 8) != 0) {
            int i10 = AbstractC3243x0.f16063b;
            interfaceC3279c = C3241w0.f16059g;
        }
        abstractC3237u0.getClass();
        m4948a(abstractC3237u0, abstractC3239v0);
        abstractC3239v0.mo4940o0(C3100j.m4785c((i8 & 4294967295L) | (i7 << 32), abstractC3239v0.f16057i), 0.0f, interfaceC3279c);
    }

    /* renamed from: p */
    public static void m4954p(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0, long j6) {
        int i7 = AbstractC3243x0.f16063b;
        C3241w0 c3241w0 = C3241w0.f16059g;
        abstractC3237u0.getClass();
        m4948a(abstractC3237u0, abstractC3239v0);
        abstractC3239v0.mo4940o0(C3100j.m4785c(j6, abstractC3239v0.f16057i), 0.0f, c3241w0);
    }

    /* renamed from: d */
    public float mo4913d(C3222n c3222n) {
        return Float.NaN;
    }

    /* renamed from: e */
    public abstract EnumC3103m mo4914e();

    /* renamed from: f */
    public abstract int mo4915f();
}
