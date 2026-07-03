package p039e5;

import java.util.List;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.oc */
/* loaded from: classes.dex */
public final class C1146oc extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public /* synthetic */ Object f6527i;

    /* renamed from: j */
    public final /* synthetic */ List f6528j;

    /* renamed from: k */
    public final /* synthetic */ C1270sc f6529k;

    /* renamed from: l */
    public final /* synthetic */ EnumC1363vc f6530l;

    /* renamed from: m */
    public final /* synthetic */ String f6531m;

    /* renamed from: n */
    public final /* synthetic */ EnumC0803dc f6532n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC3279c f6533o;

    /* renamed from: p */
    public final /* synthetic */ boolean f6534p;

    /* renamed from: q */
    public final /* synthetic */ String f6535q;

    /* renamed from: r */
    public final /* synthetic */ String f6536r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146oc(List list, C1270sc c1270sc, EnumC1363vc enumC1363vc, String str, EnumC0803dc enumC0803dc, InterfaceC3279c interfaceC3279c, boolean z7, String str2, String str3, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6528j = list;
        this.f6529k = c1270sc;
        this.f6530l = enumC1363vc;
        this.f6531m = str;
        this.f6532n = enumC0803dc;
        this.f6533o = interfaceC3279c;
        this.f6534p = z7;
        this.f6535q = str2;
        this.f6536r = str3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1146oc) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1146oc c1146oc = new C1146oc(this.f6528j, this.f6529k, this.f6530l, this.f6531m, this.f6532n, this.f6533o, this.f6534p, this.f6535q, this.f6536r, interfaceC2313c);
        c1146oc.f6527i = obj;
        return c1146oc;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final java.lang.Object mo29m(java.lang.Object r74) {
        /*
            Method dump skipped, instructions count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e5.C1146oc.mo29m(java.lang.Object):java.lang.Object");
    }
}
