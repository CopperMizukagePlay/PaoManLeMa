package p191z0;

import p047f6.C1547b;
import p098m5.AbstractC2583c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z0.b */
/* loaded from: classes.dex */
public final class C3863b extends AbstractC2583c {

    /* renamed from: h */
    public C1547b f18100h;

    /* renamed from: i */
    public /* synthetic */ Object f18101i;

    /* renamed from: j */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC3864c f18102j;

    /* renamed from: k */
    public int f18103k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3863b(ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c, AbstractC2583c abstractC2583c) {
        super(abstractC2583c);
        this.f18102j = viewOnAttachStateChangeListenerC3864c;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        this.f18101i = obj;
        this.f18103k |= Integer.MIN_VALUE;
        return this.f18102j.m5874a(this);
    }
}
