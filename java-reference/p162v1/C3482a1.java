package p162v1;

import p101n0.C2705e;
import p158u5.AbstractC3367j;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3808p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.a1 */
/* loaded from: classes.dex */
public final class C3482a1 {

    /* renamed from: a */
    public AbstractC3809q f16776a;

    /* renamed from: b */
    public int f16777b;

    /* renamed from: c */
    public C2705e f16778c;

    /* renamed from: d */
    public C2705e f16779d;

    /* renamed from: e */
    public boolean f16780e;

    /* renamed from: f */
    public final /* synthetic */ C3490c1 f16781f;

    public C3482a1(C3490c1 c3490c1, AbstractC3809q abstractC3809q, int i7, C2705e c2705e, C2705e c2705e2, boolean z7) {
        this.f16781f = c3490c1;
        this.f16776a = abstractC3809q;
        this.f16777b = i7;
        this.f16778c = c2705e;
        this.f16779d = c2705e2;
        this.f16780e = z7;
    }

    /* renamed from: a */
    public final boolean m5296a(int i7, int i8) {
        C2705e c2705e = this.f16778c;
        int i9 = this.f16777b;
        InterfaceC3808p interfaceC3808p = (InterfaceC3808p) c2705e.f14517e[i7 + i9];
        InterfaceC3808p interfaceC3808p2 = (InterfaceC3808p) this.f16779d.f14517e[i9 + i8];
        if (AbstractC3367j.m5096a(interfaceC3808p, interfaceC3808p2) || interfaceC3808p.getClass() == interfaceC3808p2.getClass()) {
            return true;
        }
        return false;
    }
}
