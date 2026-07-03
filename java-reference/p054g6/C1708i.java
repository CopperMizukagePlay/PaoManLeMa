package p054g6;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.i */
/* loaded from: classes.dex */
public final class C1708i extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public int f10519i;

    /* renamed from: j */
    public /* synthetic */ InterfaceC1704e f10520j;

    /* renamed from: k */
    public /* synthetic */ Object f10521k;

    /* renamed from: l */
    public final /* synthetic */ AbstractC2590j f10522l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1708i(InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f10522l = (AbstractC2590j) interfaceC3281e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m5.j, t5.e] */
    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C1708i c1708i = new C1708i(this.f10522l, (InterfaceC2313c) obj3);
        c1708i.f10520j = (InterfaceC1704e) obj;
        c1708i.f10521k = obj2;
        return c1708i.mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.mo160h(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [m5.j, t5.e] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC1704e interfaceC1704e;
        int i7 = this.f10519i;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC1793a0.m2972L(obj);
                    return C1694m.f10482a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1704e = this.f10520j;
            AbstractC1793a0.m2972L(obj);
        } else {
            AbstractC1793a0.m2972L(obj);
            interfaceC1704e = this.f10520j;
            Object obj2 = this.f10521k;
            this.f10520j = interfaceC1704e;
            this.f10519i = 1;
            obj = this.f10522l.mo22d(obj2, this);
        }
        this.f10520j = null;
        this.f10519i = 2;
    }
}
