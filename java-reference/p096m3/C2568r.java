package p096m3;

import java.nio.ByteBuffer;
import p104n3.C2716a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.r */
/* loaded from: classes.dex */
public final class C2568r {

    /* renamed from: a */
    public int f13946a = 1;

    /* renamed from: b */
    public final C2571u f13947b;

    /* renamed from: c */
    public C2571u f13948c;

    /* renamed from: d */
    public C2571u f13949d;

    /* renamed from: e */
    public int f13950e;

    /* renamed from: f */
    public int f13951f;

    public C2568r(C2571u c2571u) {
        this.f13947b = c2571u;
        this.f13948c = c2571u;
    }

    /* renamed from: a */
    public final void m4089a() {
        this.f13946a = 1;
        this.f13948c = this.f13947b;
        this.f13951f = 0;
    }

    /* renamed from: b */
    public final boolean m4090b() {
        C2716a m4105b = this.f13948c.f13965b.m4105b();
        int m3415a = m4105b.m3415a(6);
        if ((m3415a != 0 && ((ByteBuffer) m4105b.f12319h).get(m3415a + m4105b.f12316e) != 0) || this.f13950e == 65039) {
            return true;
        }
        return false;
    }
}
