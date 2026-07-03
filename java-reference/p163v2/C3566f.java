package p163v2;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p109o1.C2799d;
import p140s2.C3107q;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.f */
/* loaded from: classes.dex */
public final class C3566f extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f17124i;

    /* renamed from: j */
    public final /* synthetic */ boolean f17125j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC3569i f17126k;

    /* renamed from: l */
    public final /* synthetic */ long f17127l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3566f(boolean z7, AbstractC3569i abstractC3569i, long j6, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f17125j = z7;
        this.f17126k = abstractC3569i;
        this.f17127l = j6;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C3566f) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C3566f(this.f17125j, this.f17126k, this.f17127l, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        int i7 = this.f17124i;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC1793a0.m2972L(obj);
                    ((C3107q) obj).getClass();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1793a0.m2972L(obj);
                ((C3107q) obj).getClass();
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            boolean z7 = this.f17125j;
            AbstractC3569i abstractC3569i = this.f17126k;
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (!z7) {
                C2799d c2799d = abstractC3569i.f17137e;
                this.f17124i = 1;
                obj = c2799d.m4431a(0L, this.f17127l, this);
            } else {
                C2799d c2799d2 = abstractC3569i.f17137e;
                this.f17124i = 2;
                obj = c2799d2.m4431a(this.f17127l, 0L, this);
            }
            return enumC2465a;
        }
        return C1694m.f10482a;
    }
}
