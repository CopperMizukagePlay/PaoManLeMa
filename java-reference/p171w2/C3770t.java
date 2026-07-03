package p171w2;

import p053g5.C1694m;
import p140s2.C3101k;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p158u5.C3378u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.t */
/* loaded from: classes.dex */
public final class C3770t extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ C3378u f17881f;

    /* renamed from: g */
    public final /* synthetic */ C3771u f17882g;

    /* renamed from: h */
    public final /* synthetic */ C3101k f17883h;

    /* renamed from: i */
    public final /* synthetic */ long f17884i;

    /* renamed from: j */
    public final /* synthetic */ long f17885j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3770t(C3378u c3378u, C3771u c3771u, C3101k c3101k, long j6, long j7) {
        super(0);
        this.f17881f = c3378u;
        this.f17882g = c3771u;
        this.f17883h = c3101k;
        this.f17884i = j6;
        this.f17885j = j7;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        C3771u c3771u = this.f17882g;
        this.f17881f.f16450e = c3771u.getPositionProvider().mo1252a(this.f17883h, this.f17884i, c3771u.getParentLayoutDirection(), this.f17885j);
        return C1694m.f10482a;
    }
}
