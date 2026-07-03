package p024c6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p053g5.C1687f;
import p073j2.AbstractC2168e;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;
import p195z5.C3877b;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.b */
/* loaded from: classes.dex */
public final class C0435b implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public int f1481e = -1;

    /* renamed from: f */
    public int f1482f;

    /* renamed from: g */
    public int f1483g;

    /* renamed from: h */
    public C3879d f1484h;

    /* renamed from: i */
    public int f1485i;

    /* renamed from: j */
    public final /* synthetic */ C0436c f1486j;

    public C0435b(C0436c c0436c) {
        this.f1486j = c0436c;
        int m3530q = AbstractC2168e.m3530q(0, 0, c0436c.f1487a.length());
        this.f1482f = m3530q;
        this.f1483g = m3530q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [z5.b, z5.d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [z5.b, z5.d] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m922a() {
        int i7 = this.f1483g;
        int i8 = 0;
        if (i7 < 0) {
            this.f1481e = 0;
            this.f1484h = null;
            return;
        }
        C0436c c0436c = this.f1486j;
        int i9 = c0436c.f1488b;
        if (i9 > 0) {
            int i10 = this.f1485i + 1;
            this.f1485i = i10;
        }
        if (i7 <= c0436c.f1487a.length()) {
            C1687f c1687f = (C1687f) c0436c.f1489c.mo22d(c0436c.f1487a, Integer.valueOf(this.f1483g));
            if (c1687f == null) {
                this.f1484h = new C3877b(this.f1482f, AbstractC0444k.m932V(c0436c.f1487a), 1);
                this.f1483g = -1;
            } else {
                int intValue = ((Number) c1687f.f10471e).intValue();
                int intValue2 = ((Number) c1687f.f10472f).intValue();
                this.f1484h = AbstractC2168e.m3513G(this.f1482f, intValue);
                int i11 = intValue + intValue2;
                this.f1482f = i11;
                if (intValue2 == 0) {
                    i8 = 1;
                }
                this.f1483g = i11 + i8;
            }
            this.f1481e = 1;
        }
        this.f1484h = new C3877b(this.f1482f, AbstractC0444k.m932V(c0436c.f1487a), 1);
        this.f1483g = -1;
        this.f1481e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1481e == -1) {
            m922a();
        }
        if (this.f1481e == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1481e == -1) {
            m922a();
        }
        if (this.f1481e != 0) {
            C3879d c3879d = this.f1484h;
            AbstractC3367j.m5098c(c3879d, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f1484h = null;
            this.f1481e = -1;
            return c3879d;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
