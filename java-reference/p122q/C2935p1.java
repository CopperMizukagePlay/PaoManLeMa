package p122q;

import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2589i;
import p117p1.C2855g0;
import p117p1.C2868s;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.p1 */
/* loaded from: classes.dex */
public final class C2935p1 extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public long f15253g;

    /* renamed from: h */
    public int f15254h;

    /* renamed from: i */
    public /* synthetic */ Object f15255i;

    /* renamed from: j */
    public final /* synthetic */ C2868s f15256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2935p1(C2868s c2868s, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f15256j = c2868s;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2935p1) mo28k((C2855g0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2935p1 c2935p1 = new C2935p1(this.f15256j, interfaceC2313c);
        c2935p1.f15255i = obj;
        return c2935p1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo29m(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f15254h
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            long r2 = r6.f15253g
            java.lang.Object r0 = r6.f15255i
            p1.g0 r0 = (p117p1.C2855g0) r0
            p060h5.AbstractC1793a0.m2972L(r7)
            goto L40
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            p060h5.AbstractC1793a0.m2972L(r7)
            java.lang.Object r7 = r6.f15255i
            p1.g0 r7 = (p117p1.C2855g0) r7
            p1.s r0 = r6.f15256j
            long r2 = r0.f15007b
            w1.g2 r0 = r7.m4517f()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L30:
            r6.f15255i = r0
            r6.f15253g = r2
            r6.f15254h = r1
            r7 = 3
            java.lang.Object r7 = p122q.AbstractC2959x1.m4599c(r0, r6, r7)
            l5.a r4 = p090l5.EnumC2465a.f13750e
            if (r7 != r4) goto L40
            return r4
        L40:
            p1.s r7 = (p117p1.C2868s) r7
            long r4 = r7.f15007b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L30
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p122q.C2935p1.mo29m(java.lang.Object):java.lang.Object");
    }
}
