package p122q;

import androidx.compose.foundation.gestures.AbstractC0152a;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.g1 */
/* loaded from: classes.dex */
public final class C2908g1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f15156i;

    /* renamed from: j */
    public final /* synthetic */ C2911h1 f15157j;

    /* renamed from: k */
    public final /* synthetic */ float f15158k;

    /* renamed from: l */
    public final /* synthetic */ float f15159l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2908g1(C2911h1 c2911h1, float f7, float f8, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15157j = c2911h1;
        this.f15158k = f7;
        this.f15159l = f8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2908g1) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C2908g1(this.f15157j, this.f15158k, this.f15159l, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f15156i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2929n1 c2929n1 = this.f15157j.f15168H;
            long m5797a = AbstractC3784a.m5797a(this.f15158k, this.f15159l);
            this.f15156i = 1;
            Object m327a = AbstractC0152a.m327a(c2929n1, m5797a, this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (m327a == enumC2465a) {
                return enumC2465a;
            }
        }
        return C1694m.f10482a;
    }
}
