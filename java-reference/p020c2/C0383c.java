package p020c2;

import p027d1.C0464b;
import p028d2.AbstractC0476i;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p071j0.C2130i;
import p071j0.C2150s;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2590j;
import p107o.EnumC2788y0;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c2.c */
/* loaded from: classes.dex */
public final class C0383c extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f1294i = 0;

    /* renamed from: j */
    public int f1295j;

    /* renamed from: k */
    public /* synthetic */ float f1296k;

    /* renamed from: l */
    public final /* synthetic */ Object f1297l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383c(ScrollCaptureCallbackC0384d scrollCaptureCallbackC0384d, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f1297l = scrollCaptureCallbackC0384d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f1294i) {
            case 0:
                return ((C0383c) mo28k(Float.valueOf(((Number) obj).floatValue()), (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C0383c) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f1294i) {
            case 0:
                C0383c c0383c = new C0383c((ScrollCaptureCallbackC0384d) this.f1297l, interfaceC2313c);
                c0383c.f1296k = ((Number) obj).floatValue();
                return c0383c;
            default:
                return new C0383c((C2150s) this.f1297l, this.f1296k, interfaceC2313c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r10 == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r10 != r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r10 == r7) goto L24;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object m3484a;
        switch (this.f1294i) {
            case 0:
                ScrollCaptureCallbackC0384d scrollCaptureCallbackC0384d = (ScrollCaptureCallbackC0384d) this.f1297l;
                int i7 = this.f1295j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    float f7 = this.f1296k;
                    Object m3592g = scrollCaptureCallbackC0384d.f1298a.f1694d.f1683e.m3592g(AbstractC0476i.f1661e);
                    if (m3592g == null) {
                        m3592g = null;
                    }
                    InterfaceC3281e interfaceC3281e = (InterfaceC3281e) m3592g;
                    if (interfaceC3281e != null) {
                        C0464b c0464b = new C0464b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
                        this.f1295j = 1;
                        obj = interfaceC3281e.mo22d(c0464b, this);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                    } else {
                        throw AbstractC2487d.m4041e("Required value was null.");
                    }
                }
                return new Float(Float.intBitsToFloat((int) (((C0464b) obj).f1623a & 4294967295L)));
            default:
                int i8 = this.f1295j;
                C1694m c1694m = C1694m.f10482a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2150s c2150s = (C2150s) this.f1297l;
                float f8 = this.f1296k;
                this.f1295j = 1;
                Object value = c2150s.f12512e.getValue();
                Object m3486c = c2150s.m3486c(c2150s.m3488e(), f8, value);
                boolean booleanValue = Boolean.TRUE.booleanValue();
                EnumC2788y0 enumC2788y0 = EnumC2788y0.f14796e;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (booleanValue) {
                    m3484a = c2150s.m3484a(m3486c, enumC2788y0, new C2130i(c2150s, f8, null), this);
                    if (m3484a != enumC2465a2) {
                        m3484a = c1694m;
                        break;
                    }
                } else {
                    m3484a = c2150s.m3484a(value, enumC2788y0, new C2130i(c2150s, f8, null), this);
                    if (m3484a != enumC2465a2) {
                        m3484a = c1694m;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383c(C2150s c2150s, float f7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f1297l = c2150s;
        this.f1296k = f7;
    }
}
