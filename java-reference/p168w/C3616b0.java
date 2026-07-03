package p168w;

import p001a0.C0074s0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.InterfaceC2656k;
import p122q.C2946t0;
import p122q.InterfaceC2958x0;
import p150t5.InterfaceC3281e;
import p160v.InterfaceC3422m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.b0 */
/* loaded from: classes.dex */
public final class C3616b0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f17264i;

    /* renamed from: j */
    public /* synthetic */ Object f17265j;

    /* renamed from: k */
    public final /* synthetic */ C0074s0 f17266k;

    /* renamed from: l */
    public final /* synthetic */ int f17267l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3422m f17268m;

    /* renamed from: n */
    public final /* synthetic */ float f17269n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2656k f17270o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3616b0(C0074s0 c0074s0, int i7, InterfaceC3422m interfaceC3422m, float f7, InterfaceC2656k interfaceC2656k, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f17266k = c0074s0;
        this.f17267l = i7;
        this.f17268m = interfaceC3422m;
        this.f17269n = f7;
        this.f17270o = interfaceC2656k;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C3616b0) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C3616b0 c3616b0 = new C3616b0(this.f17266k, this.f17267l, this.f17268m, this.f17269n, this.f17270o, interfaceC2313c);
        c3616b0.f17265j = obj;
        return c3616b0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [u5.s, java.lang.Object] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        boolean z7;
        int i7;
        int i8 = this.f17264i;
        if (i8 != 0) {
            if (i8 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            InterfaceC2958x0 interfaceC2958x0 = (InterfaceC2958x0) this.f17265j;
            int i9 = this.f17267l;
            this.f17266k.mo22d(interfaceC2958x0, new Integer(i9));
            InterfaceC3422m interfaceC3422m = this.f17268m;
            if (i9 > interfaceC3422m.mo4282i()) {
                z7 = true;
            } else {
                z7 = false;
            }
            int mo4278e = (interfaceC3422m.mo4278e() - interfaceC3422m.mo4282i()) + 1;
            if (((z7 && i9 > interfaceC3422m.mo4278e()) || (!z7 && i9 < interfaceC3422m.mo4282i())) && Math.abs(i9 - interfaceC3422m.mo4282i()) >= 3) {
                if (z7) {
                    int mo4282i = i7;
                    interfaceC3422m.mo4283j(mo4282i);
                } else {
                    int mo4282i2 = i7;
                    interfaceC3422m.mo4283j(mo4282i2);
                }
            }
            float mo4279f = interfaceC3422m.mo4279f(i9) + this.f17269n;
            C2946t0 c2946t0 = new C2946t0(new Object(), interfaceC2958x0, 1);
            this.f17264i = 1;
            Object m4219e = AbstractC2638e.m4219e(mo4279f, this.f17270o, c2946t0, this, 4);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (m4219e == enumC2465a) {
                return enumC2465a;
            }
        }
        return C1694m.f10482a;
    }
}
