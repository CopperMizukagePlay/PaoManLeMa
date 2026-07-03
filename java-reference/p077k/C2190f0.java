package p077k;

import p015b6.C0303j;
import p015b6.C0306m;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.f0 */
/* loaded from: classes.dex */
public final class C2190f0 extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public C0303j f12652g;

    /* renamed from: h */
    public C2192g0 f12653h;

    /* renamed from: i */
    public long[] f12654i;

    /* renamed from: j */
    public int f12655j;

    /* renamed from: k */
    public int f12656k;

    /* renamed from: l */
    public /* synthetic */ Object f12657l;

    /* renamed from: m */
    public final /* synthetic */ C2192g0 f12658m;

    /* renamed from: n */
    public final /* synthetic */ C0303j f12659n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2190f0(C2192g0 c2192g0, C0303j c0303j, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f12658m = c2192g0;
        this.f12659n = c0303j;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2190f0) mo28k((C0306m) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2190f0 c2190f0 = new C2190f0(this.f12658m, this.f12659n, interfaceC2313c);
        c2190f0.f12657l = obj;
        return c2190f0;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        C0306m c0306m;
        C2192g0 c2192g0;
        long[] jArr;
        int i7;
        C0303j c0303j;
        int i8 = this.f12656k;
        if (i8 != 0) {
            if (i8 == 1) {
                i7 = this.f12655j;
                jArr = this.f12654i;
                c2192g0 = this.f12653h;
                c0303j = this.f12652g;
                c0306m = (C0306m) this.f12657l;
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            c0306m = (C0306m) this.f12657l;
            c2192g0 = this.f12658m;
            C2188e0 c2188e0 = c2192g0.f12664f;
            jArr = c2188e0.f12643c;
            i7 = c2188e0.f12645e;
            c0303j = this.f12659n;
        }
        if (i7 != Integer.MAX_VALUE) {
            int i9 = (int) ((jArr[i7] >> 31) & 2147483647L);
            c0303j.f1093f = i7;
            Object obj2 = c2192g0.f12664f.f12642b[i7];
            this.f12657l = c0306m;
            this.f12652g = c0303j;
            this.f12653h = c2192g0;
            this.f12654i = jArr;
            this.f12655j = i9;
            this.f12656k = 1;
            c0306m.m661b(obj2, this);
            return EnumC2465a.f13750e;
        }
        return C1694m.f10482a;
    }
}
