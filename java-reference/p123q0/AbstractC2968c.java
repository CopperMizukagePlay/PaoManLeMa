package p123q0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.c */
/* loaded from: classes.dex */
public abstract class AbstractC2968c implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final AbstractC2977l[] f15374e;

    /* renamed from: f */
    public int f15375f;

    /* renamed from: g */
    public boolean f15376g = true;

    public AbstractC2968c(C2976k c2976k, AbstractC2977l[] abstractC2977lArr) {
        this.f15374e = abstractC2977lArr;
        abstractC2977lArr[0].m4638a(c2976k.f15396d, Integer.bitCount(c2976k.f15393a) * 2, 0);
        this.f15375f = 0;
        m4609a();
    }

    /* renamed from: a */
    public final void m4609a() {
        int i7 = this.f15375f;
        AbstractC2977l[] abstractC2977lArr = this.f15374e;
        AbstractC2977l abstractC2977l = abstractC2977lArr[i7];
        if (abstractC2977l.f15399g < abstractC2977l.f15398f) {
            return;
        }
        while (-1 < i7) {
            int m4610b = m4610b(i7);
            if (m4610b == -1) {
                AbstractC2977l abstractC2977l2 = abstractC2977lArr[i7];
                int i8 = abstractC2977l2.f15399g;
                Object[] objArr = abstractC2977l2.f15397e;
                if (i8 < objArr.length) {
                    int length = objArr.length;
                    abstractC2977l2.f15399g = i8 + 1;
                    m4610b = m4610b(i7);
                }
            }
            if (m4610b != -1) {
                this.f15375f = m4610b;
                return;
            }
            if (i7 > 0) {
                AbstractC2977l abstractC2977l3 = abstractC2977lArr[i7 - 1];
                int i9 = abstractC2977l3.f15399g;
                int length2 = abstractC2977l3.f15397e.length;
                abstractC2977l3.f15399g = i9 + 1;
            }
            abstractC2977lArr[i7].m4638a(C2976k.f15392e.f15396d, 0, 0);
            i7--;
        }
        this.f15376g = false;
    }

    /* renamed from: b */
    public final int m4610b(int i7) {
        AbstractC2977l[] abstractC2977lArr = this.f15374e;
        AbstractC2977l abstractC2977l = abstractC2977lArr[i7];
        int i8 = abstractC2977l.f15399g;
        if (i8 < abstractC2977l.f15398f) {
            return i7;
        }
        Object[] objArr = abstractC2977l.f15397e;
        if (i8 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i8];
            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            C2976k c2976k = (C2976k) obj;
            if (i7 == 6) {
                AbstractC2977l abstractC2977l2 = abstractC2977lArr[i7 + 1];
                Object[] objArr2 = c2976k.f15396d;
                abstractC2977l2.m4638a(objArr2, objArr2.length, 0);
            } else {
                abstractC2977lArr[i7 + 1].m4638a(c2976k.f15396d, Integer.bitCount(c2976k.f15393a) * 2, 0);
            }
            return m4610b(i7 + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15376g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f15376g) {
            Object next = this.f15374e[this.f15375f].next();
            m4609a();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
