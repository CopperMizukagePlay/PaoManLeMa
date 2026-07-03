package p020c2;

import p098m5.AbstractC2583c;
import p140s2.C3101k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c2.a */
/* loaded from: classes.dex */
public final class C0381a extends AbstractC2583c {

    /* renamed from: h */
    public Object f1283h;

    /* renamed from: i */
    public C3101k f1284i;

    /* renamed from: j */
    public int f1285j;

    /* renamed from: k */
    public int f1286k;

    /* renamed from: l */
    public /* synthetic */ Object f1287l;

    /* renamed from: m */
    public final /* synthetic */ ScrollCaptureCallbackC0384d f1288m;

    /* renamed from: n */
    public int f1289n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381a(ScrollCaptureCallbackC0384d scrollCaptureCallbackC0384d, AbstractC2583c abstractC2583c) {
        super(abstractC2583c);
        this.f1288m = scrollCaptureCallbackC0384d;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        this.f1287l = obj;
        this.f1289n |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC0384d.m850a(this.f1288m, null, null, this);
    }
}
