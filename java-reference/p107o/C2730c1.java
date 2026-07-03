package p107o;

import p001a0.C0005b;
import p027d1.C0464b;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p122q.C2926m1;
import p122q.C2929n1;
import p162v1.C3508i0;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.c1 */
/* loaded from: classes.dex */
public final class C2730c1 implements InterfaceC2771q0, InterfaceC2739f1 {

    /* renamed from: e */
    public static final C2730c1 f14618e = new Object();

    /* renamed from: f */
    public static final C2730c1 f14619f = new Object();

    @Override // p107o.InterfaceC2771q0
    /* renamed from: a */
    public void mo2778a(C3508i0 c3508i0) {
        c3508i0.m5460a();
    }

    @Override // p107o.InterfaceC2739f1
    /* renamed from: b */
    public boolean mo4391b() {
        return false;
    }

    @Override // p107o.InterfaceC2739f1
    /* renamed from: c */
    public long mo4392c(long j6, int i7, C0005b c0005b) {
        c0005b.getClass();
        C2929n1 c2929n1 = (C2929n1) c0005b.f54g;
        return new C0464b(C2929n1.m4588a(c2929n1, c2929n1.f15236h, j6, c2929n1.f15235g)).f1623a;
    }

    @Override // p107o.InterfaceC2739f1
    /* renamed from: d */
    public InterfaceC3810r mo4393d() {
        return C3807o.f17991a;
    }

    @Override // p107o.InterfaceC2739f1
    /* renamed from: e */
    public Object mo4394e(long j6, C2926m1 c2926m1, InterfaceC2313c interfaceC2313c) {
        C2926m1 c2926m12 = new C2926m1(c2926m1.f15219l, interfaceC2313c);
        c2926m12.f15218k = j6;
        C1694m c1694m = C1694m.f10482a;
        Object mo29m = c2926m12.mo29m(c1694m);
        if (mo29m == EnumC2465a.f13750e) {
            return mo29m;
        }
        return c1694m;
    }
}
