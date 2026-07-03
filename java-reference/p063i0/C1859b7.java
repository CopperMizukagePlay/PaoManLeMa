package p063i0;

import androidx.compose.material3.AbstractC0165a;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2635d;
import p100n.InterfaceC2656k;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.b7 */
/* loaded from: classes.dex */
public final class C1859b7 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f10981i;

    /* renamed from: j */
    public int f10982j;

    /* renamed from: k */
    public final /* synthetic */ C1868c7 f10983k;

    /* renamed from: l */
    public final /* synthetic */ float f10984l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1859b7(C1868c7 c1868c7, float f7, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f10981i = i7;
        this.f10983k = c1868c7;
        this.f10984l = f7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f10981i) {
            case 0:
                return ((C1859b7) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1859b7) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10981i) {
            case 0:
                return new C1859b7(this.f10983k, this.f10984l, interfaceC2313c, 0);
            default:
                return new C1859b7(this.f10983k, this.f10984l, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        InterfaceC2656k interfaceC2656k;
        InterfaceC2656k interfaceC2656k2;
        switch (this.f10981i) {
            case 0:
                int i7 = this.f10982j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1868c7 c1868c7 = this.f10983k;
                    C2635d c2635d = c1868c7.f11027w;
                    if (c2635d != null) {
                        Float f7 = new Float(this.f10984l);
                        if (c1868c7.f11025u) {
                            interfaceC2656k = AbstractC0165a.f740f;
                        } else {
                            interfaceC2656k = AbstractC0165a.f741g;
                        }
                        this.f10982j = 1;
                        obj = C2635d.m4205c(c2635d, f7, interfaceC2656k, null, this, 12);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    return C1694m.f10482a;
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f10982j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1868c7 c1868c72 = this.f10983k;
                    C2635d c2635d2 = c1868c72.f11026v;
                    if (c2635d2 != null) {
                        Float f8 = new Float(this.f10984l);
                        if (c1868c72.f11025u) {
                            interfaceC2656k2 = AbstractC0165a.f740f;
                        } else {
                            interfaceC2656k2 = AbstractC0165a.f741g;
                        }
                        InterfaceC2656k interfaceC2656k3 = interfaceC2656k2;
                        this.f10982j = 1;
                        obj = C2635d.m4205c(c2635d2, f8, interfaceC2656k3, null, this, 12);
                        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                        if (obj == enumC2465a2) {
                            return enumC2465a2;
                        }
                    } else {
                        return C1694m.f10482a;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
