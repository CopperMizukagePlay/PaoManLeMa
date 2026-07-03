package p063i0;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2635d;
import p137s.C3083l;
import p137s.InterfaceC3079h;
import p140s2.C3096f;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.b0 */
/* loaded from: classes.dex */
public final class C1852b0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f10936i;

    /* renamed from: j */
    public final /* synthetic */ C2635d f10937j;

    /* renamed from: k */
    public final /* synthetic */ float f10938k;

    /* renamed from: l */
    public final /* synthetic */ boolean f10939l;

    /* renamed from: m */
    public final /* synthetic */ C1861c0 f10940m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3079h f10941n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852b0(C2635d c2635d, float f7, boolean z7, C1861c0 c1861c0, InterfaceC3079h interfaceC3079h, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f10937j = c2635d;
        this.f10938k = f7;
        this.f10939l = z7;
        this.f10940m = c1861c0;
        this.f10941n = interfaceC3079h;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1852b0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1852b0(this.f10937j, this.f10938k, this.f10939l, this.f10940m, this.f10941n, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r8.m4207e(r0, r7) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (p071j0.AbstractC2156v.m3499a(r8, r3, r0, r7.f10941n, r7) == r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C3083l c3083l;
        int i7 = this.f10936i;
        if (i7 != 0) {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1793a0.m2972L(obj);
        } else {
            AbstractC1793a0.m2972L(obj);
            C2635d c2635d = this.f10937j;
            float f7 = ((C3096f) c2635d.f14261e.getValue()).f15693e;
            float f8 = this.f10938k;
            if (!C3096f.m4776a(f7, f8)) {
                boolean z7 = this.f10939l;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (!z7) {
                    C3096f c3096f = new C3096f(f8);
                    this.f10936i = 1;
                } else {
                    float f9 = ((C3096f) c2635d.f14261e.getValue()).f15693e;
                    C1861c0 c1861c0 = this.f10940m;
                    if (C3096f.m4776a(f9, c1861c0.f10992b)) {
                        c3083l = new C3083l(0L);
                    } else if (C3096f.m4776a(f9, c1861c0.f10994d)) {
                        c3083l = new Object();
                    } else if (C3096f.m4776a(f9, c1861c0.f10993c)) {
                        c3083l = new Object();
                    } else {
                        c3083l = null;
                    }
                    this.f10936i = 2;
                }
            }
        }
        return C1694m.f10482a;
    }
}
