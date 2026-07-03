package p077k;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.b */
/* loaded from: classes.dex */
public final class C2181b implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public int f12616e;

    /* renamed from: f */
    public int f12617f;

    /* renamed from: g */
    public boolean f12618g;

    /* renamed from: h */
    public final /* synthetic */ int f12619h;

    /* renamed from: i */
    public final /* synthetic */ Object f12620i;

    public C2181b(int i7) {
        this.f12616e = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12617f < this.f12616e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object m3629e;
        if (hasNext()) {
            int i7 = this.f12617f;
            switch (this.f12619h) {
                case 0:
                    m3629e = ((C2189f) this.f12620i).m3629e(i7);
                    break;
                case 1:
                    m3629e = ((C2189f) this.f12620i).m3632h(i7);
                    break;
                default:
                    m3629e = ((C2191g) this.f12620i).f12661f[i7];
                    break;
            }
            this.f12617f++;
            this.f12618g = true;
            return m3629e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12618g) {
            int i7 = this.f12617f - 1;
            this.f12617f = i7;
            switch (this.f12619h) {
                case 0:
                    ((C2189f) this.f12620i).m3630f(i7);
                    break;
                case 1:
                    ((C2189f) this.f12620i).m3630f(i7);
                    break;
                default:
                    ((C2191g) this.f12620i).m3585a(i7);
                    break;
            }
            this.f12616e--;
            this.f12618g = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2181b(C2191g c2191g) {
        this(c2191g.f12662g);
        this.f12619h = 2;
        this.f12620i = c2191g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2181b(C2189f c2189f, int i7) {
        this(c2189f.f12735g);
        this.f12619h = i7;
        switch (i7) {
            case 1:
                this.f12620i = c2189f;
                this(c2189f.f12735g);
                return;
            default:
                this.f12620i = c2189f;
                return;
        }
    }
}
