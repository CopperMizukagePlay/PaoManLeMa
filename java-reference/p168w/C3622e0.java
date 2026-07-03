package p168w;

import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p122q.C2920k1;
import p122q.InterfaceC2925m0;
import p129r.C3017f;
import p160v.C3423m0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.e0 */
/* loaded from: classes.dex */
public final class C3622e0 implements InterfaceC2925m0 {

    /* renamed from: a */
    public final C3017f f17296a;

    /* renamed from: b */
    public final AbstractC3642y f17297b;

    public C3622e0(C3017f c3017f, AbstractC3642y abstractC3642y) {
        this.f17296a = c3017f;
        this.f17297b = abstractC3642y;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // p122q.InterfaceC2925m0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4587a(C2920k1 c2920k1, float f7, InterfaceC2313c interfaceC2313c) {
        C3620d0 c3620d0;
        int i7;
        if (interfaceC2313c instanceof C3620d0) {
            c3620d0 = (C3620d0) interfaceC2313c;
            int i8 = c3620d0.f17281j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3620d0.f17281j = i8 - Integer.MIN_VALUE;
                Object obj = c3620d0.f17279h;
                i7 = c3620d0.f17281j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3423m0 c3423m0 = new C3423m0(this, c2920k1);
                    c3620d0.f17281j = 1;
                    obj = this.f17296a.m4712d(c2920k1, f7, c3423m0, c3620d0);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return new Float(((Number) obj).floatValue());
            }
        }
        c3620d0 = new C3620d0(this, (AbstractC2583c) interfaceC2313c);
        Object obj2 = c3620d0.f17279h;
        i7 = c3620d0.f17281j;
        if (i7 == 0) {
        }
        return new Float(((Number) obj2).floatValue());
    }
}
