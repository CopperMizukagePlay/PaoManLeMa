package p001a0;

import com.paoman.lema.FloatingSpeedService;
import p018c0.C0342l;
import p032d6.InterfaceC0516a0;
import p039e5.AbstractServiceC1371vk;
import p039e5.C1100ms;
import p053g5.C1694m;
import p063i0.C1868c7;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p107o.C2735e0;
import p107o.C2784w0;
import p107o.C2787y;
import p117p1.C2857h0;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.s1 */
/* loaded from: classes.dex */
public final class C0075s1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f370i;

    /* renamed from: j */
    public int f371j;

    /* renamed from: k */
    public final /* synthetic */ Object f372k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075s1(Object obj, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f370i = i7;
        this.f372k = obj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f370i) {
            case 0:
                return ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            case 2:
                return ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 3:
                return ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 4:
                return ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15761f /* 5 */:
                return ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15759d /* 6 */:
                return ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 7:
                ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            default:
                return ((C0075s1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f370i) {
            case 0:
                return new C0075s1((C0342l) this.f372k, interfaceC2313c, 0);
            case 1:
                return new C0075s1((FloatingSpeedService) this.f372k, interfaceC2313c, 1);
            case 2:
                return new C0075s1((AbstractServiceC1371vk) this.f372k, interfaceC2313c, 2);
            case 3:
                return new C0075s1((C1100ms) this.f372k, interfaceC2313c, 3);
            case 4:
                return new C0075s1((C1868c7) this.f372k, interfaceC2313c, 4);
            case AbstractC3122c.f15761f /* 5 */:
                return new C0075s1((C2787y) this.f372k, interfaceC2313c, 5);
            case AbstractC3122c.f15759d /* 6 */:
                return new C0075s1((C2735e0) this.f372k, interfaceC2313c, 6);
            case 7:
                return new C0075s1((C2784w0) this.f372k, interfaceC2313c, 7);
            default:
                return new C0075s1((C2857h0) this.f372k, interfaceC2313c, 8);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Type inference failed for: r3v23, types: [m5.j, t5.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0074 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008c -> B:24:0x008f). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo29m(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0075s1.mo29m(java.lang.Object):java.lang.Object");
    }
}
