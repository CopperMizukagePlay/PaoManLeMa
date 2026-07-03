package p116p0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.h */
/* loaded from: classes.dex */
public final class C2839h extends AbstractC2832a {

    /* renamed from: g */
    public final C2837f f14925g;

    /* renamed from: h */
    public int f14926h;

    /* renamed from: i */
    public C2841j f14927i;

    /* renamed from: j */
    public int f14928j;

    public C2839h(C2837f c2837f, int i7) {
        super(i7, c2837f.f14922l);
        this.f14925g = c2837f;
        this.f14926h = c2837f.m4478e();
        this.f14928j = -1;
        m4501b();
    }

    /* renamed from: a */
    public final void m4500a() {
        if (this.f14926h == this.f14925g.m4478e()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p116p0.AbstractC2832a, java.util.ListIterator
    public final void add(Object obj) {
        m4500a();
        int i7 = this.f14905e;
        C2837f c2837f = this.f14925g;
        c2837f.add(i7, obj);
        this.f14905e++;
        this.f14906f = c2837f.mo2999a();
        this.f14926h = c2837f.m4478e();
        this.f14928j = -1;
        m4501b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* renamed from: b */
    public final void m4501b() {
        C2837f c2837f = this.f14925g;
        Object[] objArr = c2837f.f14920j;
        if (objArr == null) {
            this.f14927i = null;
            return;
        }
        int i7 = (c2837f.f14922l - 1) & (-32);
        int i8 = this.f14905e;
        if (i8 > i7) {
            i8 = i7;
        }
        int i9 = (c2837f.f14918h / 5) + 1;
        C2841j c2841j = this.f14927i;
        if (c2841j == null) {
            this.f14927i = new C2841j(objArr, i8, i7, i9);
            return;
        }
        c2841j.f14905e = i8;
        c2841j.f14906f = i7;
        c2841j.f14931g = i9;
        if (c2841j.f14932h.length < i9) {
            c2841j.f14932h = new Object[i9];
        }
        ?? r62 = 0;
        c2841j.f14932h[0] = objArr;
        if (i8 == i7) {
            r62 = 1;
        }
        c2841j.f14933i = r62;
        c2841j.m4503b(i8 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m4500a();
        if (hasNext()) {
            int i7 = this.f14905e;
            this.f14928j = i7;
            C2841j c2841j = this.f14927i;
            C2837f c2837f = this.f14925g;
            if (c2841j == null) {
                Object[] objArr = c2837f.f14921k;
                this.f14905e = i7 + 1;
                return objArr[i7];
            }
            if (c2841j.hasNext()) {
                this.f14905e++;
                return c2841j.next();
            }
            Object[] objArr2 = c2837f.f14921k;
            int i8 = this.f14905e;
            this.f14905e = i8 + 1;
            return objArr2[i8 - c2841j.f14906f];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m4500a();
        if (hasPrevious()) {
            int i7 = this.f14905e;
            this.f14928j = i7 - 1;
            C2841j c2841j = this.f14927i;
            C2837f c2837f = this.f14925g;
            if (c2841j == null) {
                Object[] objArr = c2837f.f14921k;
                int i8 = i7 - 1;
                this.f14905e = i8;
                return objArr[i8];
            }
            int i9 = c2841j.f14906f;
            if (i7 > i9) {
                Object[] objArr2 = c2837f.f14921k;
                int i10 = i7 - 1;
                this.f14905e = i10;
                return objArr2[i10 - i9];
            }
            this.f14905e = i7 - 1;
            return c2841j.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // p116p0.AbstractC2832a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m4500a();
        int i7 = this.f14928j;
        if (i7 != -1) {
            C2837f c2837f = this.f14925g;
            c2837f.mo3000b(i7);
            int i8 = this.f14928j;
            if (i8 < this.f14905e) {
                this.f14905e = i8;
            }
            this.f14906f = c2837f.mo2999a();
            this.f14926h = c2837f.m4478e();
            this.f14928j = -1;
            m4501b();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // p116p0.AbstractC2832a, java.util.ListIterator
    public final void set(Object obj) {
        m4500a();
        int i7 = this.f14928j;
        if (i7 != -1) {
            C2837f c2837f = this.f14925g;
            c2837f.set(i7, obj);
            this.f14926h = c2837f.m4478e();
            m4501b();
            return;
        }
        throw new IllegalStateException();
    }
}
