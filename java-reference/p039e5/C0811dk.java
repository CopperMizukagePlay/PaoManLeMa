package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import p024c6.AbstractC0444k;
import p060h5.AbstractC1807o;
import p060h5.InterfaceC1816x;
import p073j2.AbstractC2168e;
import p079k1.C2272i;
import p079k1.C2273j;
import p079k1.C2274k;
import p079k1.C2275l;
import p079k1.C2276m;
import p079k1.C2277n;
import p079k1.C2278o;
import p079k1.C2279p;
import p079k1.C2280q;
import p079k1.C2281r;
import p079k1.C2283t;
import p079k1.C2284u;
import p079k1.C2285v;
import p099m6.C2617r;
import p100n.AbstractC2674q;
import p100n.C2633c0;
import p100n.InterfaceC2630b0;
import p100n.InterfaceC2677r;
import p158u5.AbstractC3367j;
import p195z5.C3878c;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.dk */
/* loaded from: classes.dex */
public final class C0811dk implements InterfaceC1816x, InterfaceC2677r {

    /* renamed from: e */
    public final /* synthetic */ int f3513e;

    /* renamed from: f */
    public final ArrayList f3514f;

    public /* synthetic */ C0811dk(int i7, ArrayList arrayList) {
        this.f3513e = i7;
        this.f3514f = arrayList;
    }

    @Override // p060h5.InterfaceC1816x
    /* renamed from: a */
    public Object mo30a(Object obj) {
        switch (this.f3513e) {
            case 0:
                return AbstractC1092mk.m1865u3((C1248rl) obj);
            default:
                return ((C1248rl) obj).f7391b;
        }
    }

    /* renamed from: b */
    public void m1502b(String str, String str2) {
        AbstractC3367j.m5100e(str, "name");
        AbstractC3367j.m5100e(str2, "value");
        ArrayList arrayList = this.f3514f;
        arrayList.add(str);
        arrayList.add(AbstractC0444k.m956t0(str2).toString());
    }

    /* renamed from: c */
    public void m1503c(float f7, float f8, float f9, float f10, boolean z7) {
        this.f3514f.add(new C2278o(f7, f8, false, z7, f9, f10));
    }

    @Override // p060h5.InterfaceC1816x
    /* renamed from: d */
    public Iterator mo33d() {
        switch (this.f3513e) {
            case 0:
                return this.f3514f.iterator();
            default:
                return this.f3514f.iterator();
        }
    }

    /* renamed from: e */
    public C2617r m1504e() {
        return new C2617r((String[]) this.f3514f.toArray(new String[0]));
    }

    /* renamed from: f */
    public void m1505f() {
        this.f3514f.add(C2272i.f13166b);
    }

    /* renamed from: g */
    public void m1506g(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f3514f.add(new C2273j(f7, f8, f9, f10, f11, f12));
    }

    @Override // p100n.InterfaceC2677r
    public InterfaceC2630b0 get(int i7) {
        return (C2633c0) this.f3514f.get(i7);
    }

    /* renamed from: h */
    public void m1507h(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f3514f.add(new C2279p(f7, f8, f9, f10, f11, f12));
    }

    /* renamed from: i */
    public void m1508i(float f7) {
        this.f3514f.add(new C2274k(f7));
    }

    /* renamed from: j */
    public void m1509j(float f7) {
        this.f3514f.add(new C2280q(f7));
    }

    /* renamed from: k */
    public void m1510k(float f7, float f8) {
        this.f3514f.add(new C2275l(f7, f8));
    }

    /* renamed from: l */
    public void m1511l(float f7, float f8) {
        this.f3514f.add(new C2281r(f7, f8));
    }

    /* renamed from: m */
    public void m1512m(float f7, float f8) {
        this.f3514f.add(new C2276m(f7, f8));
    }

    /* renamed from: n */
    public void m1513n(float f7, float f8, float f9, float f10) {
        this.f3514f.add(new C2277n(f7, f8, f9, f10));
    }

    /* renamed from: o */
    public void m1514o(float f7, float f8, float f9, float f10) {
        this.f3514f.add(new C2283t(f7, f8, f9, f10));
    }

    /* renamed from: p */
    public void m1515p(String str) {
        AbstractC3367j.m5100e(str, "name");
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3514f;
            if (i7 < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i7))) {
                    arrayList.remove(i7);
                    arrayList.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public void m1516q(float f7) {
        this.f3514f.add(new C2285v(f7));
    }

    /* renamed from: r */
    public void m1517r(float f7) {
        this.f3514f.add(new C2284u(f7));
    }

    public C0811dk(int i7) {
        this.f3513e = i7;
        switch (i7) {
            case 3:
                this.f3514f = new ArrayList(20);
                return;
            default:
                this.f3514f = new ArrayList(32);
                return;
        }
    }

    public C0811dk(float f7, float f8, AbstractC2674q abstractC2674q) {
        this.f3513e = 4;
        C3879d m3513G = AbstractC2168e.m3513G(0, abstractC2674q.mo4267b());
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3513G));
        Iterator it = m3513G.iterator();
        while (true) {
            C3878c c3878c = (C3878c) it;
            if (c3878c.f18168g) {
                arrayList.add(new C2633c0(f7, f8, abstractC2674q.mo4266a(c3878c.nextInt())));
            } else {
                this.f3514f = arrayList;
                return;
            }
        }
    }
}
