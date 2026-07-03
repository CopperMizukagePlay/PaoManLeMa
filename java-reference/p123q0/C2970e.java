package p123q0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import p068i5.AbstractC2080d;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.e */
/* loaded from: classes.dex */
public class C2970e extends AbstractC2968c {

    /* renamed from: h */
    public final C2969d f15383h;

    /* renamed from: i */
    public Object f15384i;

    /* renamed from: j */
    public boolean f15385j;

    /* renamed from: k */
    public int f15386k;

    public C2970e(C2969d c2969d, AbstractC2977l[] abstractC2977lArr) {
        super(c2969d.f15379g, abstractC2977lArr);
        this.f15383h = c2969d;
        this.f15386k = c2969d.f15381i;
    }

    /* renamed from: c */
    public final void m4613c(int i7, C2976k c2976k, Object obj, int i8) {
        int i9 = i8 * 5;
        AbstractC2977l[] abstractC2977lArr = this.f15374e;
        if (i9 > 30) {
            AbstractC2977l abstractC2977l = abstractC2977lArr[i8];
            Object[] objArr = c2976k.f15396d;
            abstractC2977l.m4638a(objArr, objArr.length, 0);
            while (true) {
                AbstractC2977l abstractC2977l2 = abstractC2977lArr[i8];
                if (!AbstractC3367j.m5096a(abstractC2977l2.f15397e[abstractC2977l2.f15399g], obj)) {
                    abstractC2977lArr[i8].f15399g += 2;
                } else {
                    this.f15375f = i8;
                    return;
                }
            }
        } else {
            int m3408u = 1 << AbstractC2080d.m3408u(i7, i9);
            if (c2976k.m4622h(m3408u)) {
                abstractC2977lArr[i8].m4638a(c2976k.f15396d, Integer.bitCount(c2976k.f15393a) * 2, c2976k.m4620f(m3408u));
                this.f15375f = i8;
            } else {
                int m4633t = c2976k.m4633t(m3408u);
                C2976k m4632s = c2976k.m4632s(m4633t);
                abstractC2977lArr[i8].m4638a(c2976k.f15396d, Integer.bitCount(c2976k.f15393a) * 2, m4633t);
                m4613c(i7, m4632s, obj, i8 + 1);
            }
        }
    }

    @Override // p123q0.AbstractC2968c, java.util.Iterator
    public final Object next() {
        if (this.f15383h.f15381i == this.f15386k) {
            if (this.f15376g) {
                AbstractC2977l abstractC2977l = this.f15374e[this.f15375f];
                this.f15384i = abstractC2977l.f15397e[abstractC2977l.f15399g];
                this.f15385j = true;
                return super.next();
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // p123q0.AbstractC2968c, java.util.Iterator
    public final void remove() {
        int i7;
        if (this.f15385j) {
            boolean z7 = this.f15376g;
            C2969d c2969d = this.f15383h;
            if (z7) {
                if (z7) {
                    AbstractC2977l abstractC2977l = this.f15374e[this.f15375f];
                    Object obj = abstractC2977l.f15397e[abstractC2977l.f15399g];
                    AbstractC3382y.m5110a(c2969d).remove(this.f15384i);
                    if (obj != null) {
                        i7 = obj.hashCode();
                    } else {
                        i7 = 0;
                    }
                    m4613c(i7, c2969d.f15379g, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                AbstractC3382y.m5110a(c2969d).remove(this.f15384i);
            }
            this.f15384i = null;
            this.f15385j = false;
            this.f15386k = c2969d.f15381i;
            return;
        }
        throw new IllegalStateException();
    }
}
