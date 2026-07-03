package p085l0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p077k.C2221w;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.a2 */
/* loaded from: classes.dex */
public final class C2338a2 implements Iterable, InterfaceC3594a {

    /* renamed from: f */
    public int f13330f;

    /* renamed from: h */
    public int f13332h;

    /* renamed from: i */
    public int f13333i;

    /* renamed from: k */
    public boolean f13335k;

    /* renamed from: l */
    public int f13336l;

    /* renamed from: n */
    public HashMap f13338n;

    /* renamed from: o */
    public C2221w f13339o;

    /* renamed from: e */
    public int[] f13329e = new int[0];

    /* renamed from: g */
    public Object[] f13331g = new Object[0];

    /* renamed from: j */
    public final Object f13334j = new Object();

    /* renamed from: m */
    public ArrayList f13337m = new ArrayList();

    /* renamed from: a */
    public final int m3718a(C2335a c2335a) {
        if (this.f13335k) {
            AbstractC2399q.m3900c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c2335a.m3715a()) {
            AbstractC2389n1.m3828a("Anchor refers to a group that was removed");
        }
        return c2335a.f13325a;
    }

    /* renamed from: b */
    public final void m3719b() {
        this.f13338n = new HashMap();
    }

    /* renamed from: c */
    public final C2429z1 m3720c() {
        if (!this.f13335k) {
            this.f13333i++;
            return new C2429z1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    /* renamed from: d */
    public final C2350d2 m3721d() {
        if (this.f13335k) {
            AbstractC2399q.m3900c("Cannot start a writer when another writer is pending");
        }
        if (this.f13333i > 0) {
            AbstractC2399q.m3900c("Cannot start a writer when a reader is pending");
        }
        this.f13335k = true;
        this.f13336l++;
        return new C2350d2(this);
    }

    /* renamed from: e */
    public final boolean m3722e(C2335a c2335a) {
        int m3735e;
        if (c2335a.m3715a() && (m3735e = AbstractC2346c2.m3735e(this.f13337m, c2335a.f13325a, this.f13330f)) >= 0 && AbstractC3367j.m5096a(this.f13337m.get(m3735e), c2335a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final AbstractC2384m0 m3723f(int i7) {
        C2335a c2335a;
        int i8;
        ArrayList arrayList;
        int m3735e;
        HashMap hashMap = this.f13338n;
        if (hashMap != null) {
            if (this.f13335k) {
                AbstractC2399q.m3900c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i7 >= 0 && i7 < (i8 = this.f13330f) && (m3735e = AbstractC2346c2.m3735e((arrayList = this.f13337m), i7, i8)) >= 0) {
                c2335a = (C2335a) arrayList.get(m3735e);
            } else {
                c2335a = null;
            }
            if (c2335a != null) {
                return (AbstractC2384m0) hashMap.get(c2335a);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2380l0(this, 0, this.f13330f);
    }
}
