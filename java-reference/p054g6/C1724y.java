package p054g6;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.y */
/* loaded from: classes.dex */
public final class C1724y extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public int f10567i;

    /* renamed from: j */
    public /* synthetic */ InterfaceC1704e f10568j;

    /* renamed from: k */
    public /* synthetic */ int f10569k;

    /* renamed from: l */
    public final /* synthetic */ C1725z f10570l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1724y(C1725z c1725z, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f10570l = c1725z;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        C1724y c1724y = new C1724y(this.f10570l, (InterfaceC2313c) obj3);
        c1724y.f10568j = (InterfaceC1704e) obj;
        c1724y.f10569k = intValue;
        return c1724y.mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r0.mo160h(p054g6.EnumC1721v.f10562g, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(Long.MAX_VALUE, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.mo160h(p054g6.EnumC1721v.f10561f, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0.mo160h(p054g6.EnumC1721v.f10560e, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(0, r7) == r6) goto L32;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC1704e interfaceC1704e;
        int i7 = this.f10567i;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC1704e = this.f10568j;
                            AbstractC1793a0.m2972L(obj);
                            this.f10568j = null;
                            this.f10567i = 5;
                        }
                    } else {
                        interfaceC1704e = this.f10568j;
                        AbstractC1793a0.m2972L(obj);
                        this.f10568j = interfaceC1704e;
                        this.f10567i = 4;
                    }
                } else {
                    interfaceC1704e = this.f10568j;
                    AbstractC1793a0.m2972L(obj);
                    this.f10568j = interfaceC1704e;
                    this.f10567i = 3;
                }
            }
            AbstractC1793a0.m2972L(obj);
        } else {
            AbstractC1793a0.m2972L(obj);
            interfaceC1704e = this.f10568j;
            if (this.f10569k > 0) {
                this.f10567i = 1;
            } else {
                this.f10568j = interfaceC1704e;
                this.f10567i = 2;
            }
            return enumC2465a;
        }
        return C1694m.f10482a;
    }
}
