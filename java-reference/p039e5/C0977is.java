package p039e5;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3284h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.is */
/* loaded from: classes.dex */
public final class C0977is extends AbstractC2590j implements InterfaceC3284h {

    /* renamed from: i */
    public int f4994i;

    /* renamed from: j */
    public /* synthetic */ C1248rl f4995j;

    /* renamed from: k */
    public /* synthetic */ String f4996k;

    /* renamed from: l */
    public /* synthetic */ int f4997l;

    /* renamed from: m */
    public /* synthetic */ int f4998m;

    /* renamed from: n */
    public final /* synthetic */ C1100ms f4999n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977is(C1100ms c1100ms, InterfaceC2313c interfaceC2313c) {
        super(5, interfaceC2313c);
        this.f4999n = c1100ms;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f4994i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C1248rl c1248rl = this.f4995j;
            String str = this.f4996k;
            int i8 = this.f4997l;
            int i9 = this.f4998m;
            this.f4995j = null;
            this.f4994i = 1;
            Object m1918j = C1100ms.m1918j(this.f4999n, c1248rl, str, i8, i9, this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (m1918j == enumC2465a) {
                return enumC2465a;
            }
        }
        return C1694m.f10482a;
    }
}
