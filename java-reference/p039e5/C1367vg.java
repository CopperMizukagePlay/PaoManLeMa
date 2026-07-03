package p039e5;

import android.content.Context;
import android.view.View;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p117p1.C2855g0;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vg */
/* loaded from: classes.dex */
public final class C1367vg extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public float f8176g;

    /* renamed from: h */
    public int f8177h;

    /* renamed from: i */
    public /* synthetic */ Object f8178i;

    /* renamed from: j */
    public final /* synthetic */ Context f8179j;

    /* renamed from: k */
    public final /* synthetic */ View f8180k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367vg(Context context, View view, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f8179j = context;
        this.f8180k = view;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((C1367vg) mo28k((C2855g0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        return EnumC2465a.f13750e;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1367vg c1367vg = new C1367vg(this.f8179j, this.f8180k, interfaceC2313c);
        c1367vg.f8178i = obj;
        return c1367vg;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo29m(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e5.C1367vg.mo29m(java.lang.Object):java.lang.Object");
    }
}
