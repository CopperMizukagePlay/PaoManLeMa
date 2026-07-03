package p034e0;

import p001a0.C0005b;
import p001a0.C0034i0;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p107o.C2740g;
import p117p1.C2855g0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.x */
/* loaded from: classes.dex */
public final class C0639x extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public final /* synthetic */ int f2112g;

    /* renamed from: h */
    public int f2113h;

    /* renamed from: i */
    public /* synthetic */ Object f2114i;

    /* renamed from: j */
    public final /* synthetic */ Object f2115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0639x(Object obj, InterfaceC2313c interfaceC2313c, int i7) {
        super(interfaceC2313c);
        this.f2112g = i7;
        this.f2115j = obj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2855g0 c2855g0 = (C2855g0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f2112g) {
            case 0:
                ((C0639x) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            case 1:
                return ((C0639x) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0639x) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0639x) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f2112g) {
            case 0:
                C0639x c0639x = new C0639x((InterfaceC3279c) this.f2115j, interfaceC2313c, 0);
                c0639x.f2114i = obj;
                return c0639x;
            case 1:
                C0639x c0639x2 = new C0639x((C0034i0) this.f2115j, interfaceC2313c, 1);
                c0639x2.f2114i = obj;
                return c0639x2;
            case 2:
                C0639x c0639x3 = new C0639x((C2740g) this.f2115j, interfaceC2313c, 2);
                c0639x3.f2114i = obj;
                return c0639x3;
            default:
                C0639x c0639x4 = new C0639x((C0005b) this.f2115j, interfaceC2313c, 3);
                c0639x4.f2114i = obj;
                return c0639x4;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00c3 -> B:26:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01b2 -> B:79:0x01b5). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo29m(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034e0.C0639x.mo29m(java.lang.Object):java.lang.Object");
    }
}
