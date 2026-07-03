package p100n;

import java.util.concurrent.CancellationException;
import p001a0.C0087w;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;
import p158u5.C3374q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C2626a extends AbstractC2590j implements InterfaceC3279c {

    /* renamed from: i */
    public C2659l f14235i;

    /* renamed from: j */
    public C3374q f14236j;

    /* renamed from: k */
    public int f14237k;

    /* renamed from: l */
    public final /* synthetic */ C2635d f14238l;

    /* renamed from: m */
    public final /* synthetic */ Object f14239m;

    /* renamed from: n */
    public final /* synthetic */ C2700z0 f14240n;

    /* renamed from: o */
    public final /* synthetic */ long f14241o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3279c f14242p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2626a(C2635d c2635d, Object obj, C2700z0 c2700z0, long j6, InterfaceC3279c interfaceC3279c, InterfaceC2313c interfaceC2313c) {
        super(1, interfaceC2313c);
        this.f14238l = c2635d;
        this.f14239m = obj;
        this.f14240n = c2700z0;
        this.f14241o = j6;
        this.f14242p = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        long j6 = this.f14241o;
        InterfaceC3279c interfaceC3279c = this.f14242p;
        return new C2626a(this.f14238l, this.f14239m, this.f14240n, j6, interfaceC3279c, (InterfaceC2313c) obj).mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [u5.q, java.lang.Object] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        C2659l c2659l;
        C3374q c3374q;
        C2700z0 c2700z0 = this.f14240n;
        int i7 = this.f14237k;
        int i8 = 1;
        C2635d c2635d = this.f14238l;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    c3374q = this.f14236j;
                    c2659l = this.f14235i;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1793a0.m2972L(obj);
                c2635d.f14259c.f14350g = (AbstractC2674q) c2635d.f14257a.f14361a.mo23f(this.f14239m);
                c2635d.f14261e.setValue(c2700z0.f14503c);
                c2635d.f14260d.setValue(Boolean.TRUE);
                C2659l c2659l2 = c2635d.f14259c;
                C2659l c2659l3 = new C2659l(c2659l2.f14348e, c2659l2.f14349f.getValue(), AbstractC2638e.m4225k(c2659l2.f14350g), c2659l2.f14351h, Long.MIN_VALUE, c2659l2.f14353j);
                ?? obj2 = new Object();
                long j6 = this.f14241o;
                C0087w c0087w = new C0087w(c2635d, c2659l3, this.f14242p, obj2, 1);
                this.f14235i = c2659l3;
                this.f14236j = obj2;
                this.f14237k = 1;
                Object m4218d = AbstractC2638e.m4218d(c2659l3, c2700z0, j6, c0087w, this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m4218d == enumC2465a) {
                    return enumC2465a;
                }
                c2659l = c2659l3;
                c3374q = obj2;
            }
            if (!c3374q.f16446e) {
                i8 = 2;
            }
            C2635d.m4204b(c2635d);
            return new C2650i(i8, c2659l);
        } catch (CancellationException e7) {
            C2635d.m4204b(c2635d);
            throw e7;
        }
    }
}
