package p061h6;

import p047f6.InterfaceC1561p;
import p053g5.C1694m;
import p054g6.InterfaceC1704e;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.e */
/* loaded from: classes.dex */
public final class C1823e extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f10873i;

    /* renamed from: j */
    public int f10874j;

    /* renamed from: k */
    public /* synthetic */ Object f10875k;

    /* renamed from: l */
    public final /* synthetic */ AbstractC1824f f10876l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1823e(AbstractC1824f abstractC1824f, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f10873i = i7;
        this.f10876l = abstractC1824f;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f10873i) {
            case 0:
                return ((C1823e) mo28k((InterfaceC1561p) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C1823e) mo28k((InterfaceC1704e) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10873i) {
            case 0:
                C1823e c1823e = new C1823e(this.f10876l, interfaceC2313c, 0);
                c1823e.f10875k = obj;
                return c1823e;
            default:
                C1823e c1823e2 = new C1823e(this.f10876l, interfaceC2313c, 1);
                c1823e2.f10875k = obj;
                return c1823e2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f10873i) {
            case 0:
                int i7 = this.f10874j;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC1561p interfaceC1561p = (InterfaceC1561p) this.f10875k;
                this.f10874j = 1;
                Object mo3097c = this.f10876l.mo3097c(new C1837s(interfaceC1561p), this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (mo3097c != enumC2465a) {
                    mo3097c = c1694m;
                }
                if (mo3097c == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                int i8 = this.f10874j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC1704e interfaceC1704e = (InterfaceC1704e) this.f10875k;
                    this.f10874j = 1;
                    Object mo3097c2 = this.f10876l.mo3097c(interfaceC1704e, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (mo3097c2 == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
