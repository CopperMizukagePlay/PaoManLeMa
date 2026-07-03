package p015b6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.g */
/* loaded from: classes.dex */
public final class C0300g implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f1081e;

    /* renamed from: f */
    public final Iterator f1082f;

    /* renamed from: g */
    public int f1083g;

    /* renamed from: h */
    public Object f1084h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC0305l f1085i;

    public C0300g(C0301h c0301h) {
        this.f1081e = 0;
        this.f1085i = c0301h;
        this.f1082f = c0301h.f1086a.iterator();
        this.f1083g = -1;
    }

    /* renamed from: a */
    public void m657a() {
        Object next;
        C0301h c0301h = (C0301h) this.f1085i;
        do {
            Iterator it = this.f1082f;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f1083g = 0;
                return;
            }
        } while (((Boolean) c0301h.f1088c.mo23f(next)).booleanValue() != c0301h.f1087b);
        this.f1084h = next;
        this.f1083g = 1;
    }

    /* renamed from: b */
    public boolean m658b() {
        Iterator it;
        C0302i c0302i = (C0302i) this.f1085i;
        Iterator it2 = (Iterator) this.f1084h;
        if (it2 != null && it2.hasNext()) {
            this.f1083g = 1;
            return true;
        }
        do {
            Iterator it3 = this.f1082f;
            if (it3.hasNext()) {
                Object next = it3.next();
                c0302i.getClass();
                it = (Iterator) C0312s.f1107m.mo23f(c0302i.f1091c.mo23f(next));
            } else {
                this.f1083g = 2;
                this.f1084h = null;
                return false;
            }
        } while (!it.hasNext());
        this.f1084h = it;
        this.f1083g = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1081e) {
            case 0:
                if (this.f1083g == -1) {
                    m657a();
                }
                if (this.f1083g == 1) {
                    return true;
                }
                return false;
            default:
                int i7 = this.f1083g;
                if (i7 == 1) {
                    return true;
                }
                if (i7 == 2) {
                    return false;
                }
                return m658b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1081e) {
            case 0:
                if (this.f1083g == -1) {
                    m657a();
                }
                if (this.f1083g != 0) {
                    Object obj = this.f1084h;
                    this.f1084h = null;
                    this.f1083g = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                int i7 = this.f1083g;
                if (i7 != 2) {
                    if (i7 == 0 && !m658b()) {
                        throw new NoSuchElementException();
                    }
                    this.f1083g = 0;
                    Iterator it = (Iterator) this.f1084h;
                    AbstractC3367j.m5097b(it);
                    return it.next();
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1081e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0300g(C0302i c0302i) {
        this.f1081e = 1;
        this.f1085i = c0302i;
        this.f1082f = c0302i.f1090b.iterator();
    }
}
