package p015b6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p077k.C2190f0;
import p077k.C2192g0;
import p077k.C2198j0;
import p077k.C2200k0;
import p130r0.C3023a;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.j */
/* loaded from: classes.dex */
public final class C0303j implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f1092e;

    /* renamed from: f */
    public int f1093f;

    /* renamed from: g */
    public Object f1094g;

    /* renamed from: h */
    public final Object f1095h;

    public C0303j(Object obj, Map map) {
        this.f1092e = 3;
        this.f1094g = obj;
        this.f1095h = map;
    }

    /* renamed from: a */
    public void m659a() {
        Object mo23f;
        int i7;
        C0304k c0304k = (C0304k) this.f1095h;
        if (this.f1093f == -2) {
            mo23f = ((InterfaceC3277a) c0304k.f1097b).mo52a();
        } else {
            InterfaceC3279c interfaceC3279c = (InterfaceC3279c) c0304k.f1098c;
            Object obj = this.f1094g;
            AbstractC3367j.m5097b(obj);
            mo23f = interfaceC3279c.mo23f(obj);
        }
        this.f1094g = mo23f;
        if (mo23f == null) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f1093f = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1092e) {
            case 0:
                if (this.f1093f < 0) {
                    m659a();
                }
                if (this.f1093f == 1) {
                    return true;
                }
                return false;
            case 1:
                return ((C0306m) this.f1094g).hasNext();
            case 2:
                return ((C0306m) this.f1094g).hasNext();
            default:
                if (this.f1093f < ((Map) this.f1095h).size()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1092e) {
            case 0:
                if (this.f1093f < 0) {
                    m659a();
                }
                if (this.f1093f != 0) {
                    Object obj = this.f1094g;
                    AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                    this.f1093f = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            case 1:
                return ((C0306m) this.f1094g).next();
            case 2:
                return ((C0306m) this.f1094g).next();
            default:
                if (hasNext()) {
                    Object obj2 = this.f1094g;
                    this.f1093f++;
                    Object obj3 = ((Map) this.f1095h).get(obj2);
                    if (obj3 != null) {
                        this.f1094g = ((C3023a) obj3).f15579b;
                        return obj2;
                    }
                    throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1092e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i7 = this.f1093f;
                if (i7 != -1) {
                    ((C2192g0) this.f1095h).f12664f.m3581h(i7);
                    this.f1093f = -1;
                    return;
                }
                return;
            case 2:
                int i8 = this.f1093f;
                if (i8 != -1) {
                    ((C2200k0) this.f1095h).f12704f.m3610l(i8);
                    this.f1093f = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0303j(C0304k c0304k) {
        this.f1092e = 0;
        this.f1095h = c0304k;
        this.f1093f = -2;
    }

    public C0303j(C2200k0 c2200k0) {
        this.f1092e = 2;
        this.f1095h = c2200k0;
        this.f1093f = -1;
        this.f1094g = AbstractC3393k.m5155z(new C2198j0(c2200k0, this, null));
    }

    public C0303j(C2192g0 c2192g0) {
        this.f1092e = 1;
        this.f1095h = c2192g0;
        this.f1093f = -1;
        this.f1094g = AbstractC3393k.m5155z(new C2190f0(c2192g0, this, null));
    }
}
