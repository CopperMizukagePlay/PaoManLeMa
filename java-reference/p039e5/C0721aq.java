package p039e5;

import android.view.Choreographer;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p117p1.InterfaceC2872w;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.aq */
/* loaded from: classes.dex */
public final class C0721aq extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f2500i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0721aq(int i7, InterfaceC2313c interfaceC2313c, int i8) {
        super(i7, interfaceC2313c);
        this.f2500i = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f2500i) {
            case 0:
                return ((C0721aq) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                C0721aq c0721aq = (C0721aq) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2);
                C1694m c1694m = C1694m.f10482a;
                c0721aq.mo29m(c1694m);
                return c1694m;
            default:
                return ((C0721aq) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f2500i) {
            case 0:
                return new C0721aq(2, interfaceC2313c, 0);
            case 1:
                return new C0721aq(2, interfaceC2313c, 1);
            default:
                return new C0721aq(2, interfaceC2313c, 2);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f2500i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                return Boolean.valueOf(AbstractC0972in.m1603a());
            case 1:
                AbstractC1793a0.m2972L(obj);
                return C1694m.f10482a;
            default:
                AbstractC1793a0.m2972L(obj);
                return Choreographer.getInstance();
        }
    }
}
