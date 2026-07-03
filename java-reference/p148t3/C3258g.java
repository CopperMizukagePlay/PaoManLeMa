package p148t3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1811s;
import p060h5.C1803k;
import p060h5.C1813u;
import p067i4.AbstractC2072e;
import p068i5.C2079c;
import p096m3.C2572v;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.g */
/* loaded from: classes.dex */
public final class C3258g {

    /* renamed from: a */
    public final C1701c0 f16088a = AbstractC1719t.m2771b(C3259h.f16102a);

    /* renamed from: b */
    public final C1701c0 f16089b;

    /* renamed from: c */
    public final C1715p f16090c;

    /* renamed from: d */
    public final C1803k f16091d;

    /* renamed from: e */
    public final C1803k f16092e;

    /* renamed from: f */
    public AbstractC3255d f16093f;

    /* renamed from: g */
    public int f16094g;

    /* renamed from: h */
    public AbstractC3257f f16095h;

    /* renamed from: i */
    public final LinkedHashSet f16096i;

    /* renamed from: j */
    public final LinkedHashSet f16097j;

    /* renamed from: k */
    public final LinkedHashSet f16098k;

    /* renamed from: l */
    public boolean f16099l;

    /* renamed from: m */
    public boolean f16100m;

    /* renamed from: n */
    public boolean f16101n;

    public C3258g() {
        C1701c0 m2771b = AbstractC1719t.m2771b(new C3256e());
        this.f16089b = m2771b;
        this.f16090c = new C1715p(m2771b);
        this.f16091d = new C1803k();
        this.f16092e = new C1803k();
        this.f16096i = new LinkedHashSet();
        this.f16097j = new LinkedHashSet();
        this.f16098k = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void m4973a(C2572v c2572v, AbstractC3257f abstractC3257f, int i7) {
        LinkedHashSet linkedHashSet;
        boolean z7;
        AbstractC3367j.m5100e(c2572v, "dispatcher");
        if (abstractC3257f.f16086a == null) {
            if (i7 != 0) {
                if (i7 != 1) {
                    linkedHashSet = this.f16096i;
                } else {
                    linkedHashSet = this.f16097j;
                }
            } else {
                linkedHashSet = this.f16098k;
            }
            linkedHashSet.add(abstractC3257f);
            abstractC3257f.f16086a = c2572v;
            AbstractC3367j.m5100e((C3256e) this.f16090c.f10535e.getValue(), "history");
            if (i7 != 0) {
                if (i7 != 1) {
                    z7 = this.f16101n;
                } else {
                    z7 = this.f16099l;
                }
            } else {
                z7 = this.f16100m;
            }
            abstractC3257f.mo508b(z7);
            return;
        }
        throw new IllegalArgumentException(("Input '" + abstractC3257f + "' is already added to dispatcher " + abstractC3257f.f16086a + '.').toString());
    }

    /* renamed from: b */
    public final void m4974b() {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C3256e c3256e;
        boolean z12 = true;
        C1803k c1803k = this.f16091d;
        if (c1803k == null || !c1803k.isEmpty()) {
            Iterator it = c1803k.iterator();
            while (it.hasNext()) {
                if (((AbstractC3255d) it.next()).f16082b) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        C1803k c1803k2 = this.f16092e;
        if (c1803k2 == null || !c1803k2.isEmpty()) {
            Iterator it2 = c1803k2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC3255d) it2.next()).f16082b) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        if (!z7 && !z8) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f16100m != z7) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f16099l != z8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f16101n == z9) {
            z12 = false;
        }
        LinkedHashSet linkedHashSet = this.f16098k;
        if (z10) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((AbstractC3257f) it3.next()).mo508b(z7);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f16097j;
        if (z11) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((AbstractC3257f) it4.next()).mo508b(z8);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f16096i;
        if (z12) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((AbstractC3257f) it5.next()).mo508b(z9);
            }
        }
        this.f16100m = z7;
        this.f16099l = z8;
        this.f16101n = z9;
        AbstractC3255d abstractC3255d = this.f16093f;
        if (abstractC3255d == null) {
            abstractC3255d = m4975c(0);
        }
        AbstractC3255d abstractC3255d2 = this.f16093f;
        if (abstractC3255d2 == null) {
            abstractC3255d2 = m4975c(0);
        }
        if (AbstractC3367j.m5096a(abstractC3255d2, abstractC3255d)) {
            if (abstractC3255d2 == null) {
                c3256e = new C3256e();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c1803k.iterator();
                while (it6.hasNext()) {
                    boolean z13 = ((AbstractC3255d) it6.next()).f16082b;
                }
                Iterator<E> it7 = c1803k2.iterator();
                while (it7.hasNext()) {
                    boolean z14 = ((AbstractC3255d) it7.next()).f16082b;
                }
                AbstractC2072e abstractC2072e = abstractC3255d2.f16081a;
                C2079c m5802f = AbstractC3784a.m5802f();
                AbstractC1811s.m3076X(arrayList, m5802f);
                m5802f.add(abstractC2072e);
                AbstractC1811s.m3076X(C1813u.f10860e, m5802f);
                c3256e = new C3256e(arrayList.size(), AbstractC3784a.m5798b(m5802f));
            }
            C1701c0 c1701c0 = this.f16089b;
            if (!AbstractC3367j.m5096a((C3256e) c1701c0.getValue(), c3256e)) {
                c1701c0.m2752j(null, c3256e);
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    ((AbstractC3257f) it8.next()).getClass();
                }
                Iterator it9 = linkedHashSet2.iterator();
                while (it9.hasNext()) {
                    ((AbstractC3257f) it9.next()).getClass();
                }
                Iterator it10 = linkedHashSet3.iterator();
                while (it10.hasNext()) {
                    ((AbstractC3257f) it10.next()).getClass();
                }
            }
        }
    }

    /* renamed from: c */
    public final AbstractC3255d m4975c(int i7) {
        Object obj;
        Object obj2;
        C1803k c1803k = this.f16092e;
        C1803k c1803k2 = this.f16091d;
        Object obj3 = null;
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 == 1) {
                    Iterator it = c1803k2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3255d) it.next()).getClass();
                    }
                    Iterator it2 = c1803k.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC3255d) it2.next()).getClass();
                    }
                    return null;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i7 + "'.").toString());
            }
            Iterator it3 = c1803k2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (((AbstractC3255d) obj2).f16082b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            AbstractC3255d abstractC3255d = (AbstractC3255d) obj2;
            if (abstractC3255d == null) {
                Iterator it4 = c1803k.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((AbstractC3255d) next).f16082b) {
                        obj3 = next;
                        break;
                    }
                }
                return (AbstractC3255d) obj3;
            }
            return abstractC3255d;
        }
        Iterator it5 = c1803k2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj = it5.next();
                if (((AbstractC3255d) obj).f16082b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC3255d abstractC3255d2 = (AbstractC3255d) obj;
        if (abstractC3255d2 == null) {
            Iterator it6 = c1803k.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next2 = it6.next();
                if (((AbstractC3255d) next2).f16082b) {
                    obj3 = next2;
                    break;
                }
            }
            return (AbstractC3255d) obj3;
        }
        return abstractC3255d2;
    }
}
