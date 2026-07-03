package p116p0;

import java.util.NoSuchElementException;
import p067i4.AbstractC2072e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.j */
/* loaded from: classes.dex */
public final class C2841j extends AbstractC2832a {

    /* renamed from: g */
    public int f14931g;

    /* renamed from: h */
    public Object[] f14932h;

    /* renamed from: i */
    public boolean f14933i;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C2841j(Object[] objArr, int i7, int i8, int i9) {
        super(i7, i8);
        ?? r52;
        this.f14931g = i9;
        Object[] objArr2 = new Object[i9];
        this.f14932h = objArr2;
        if (i7 == i8) {
            r52 = 1;
        } else {
            r52 = 0;
        }
        this.f14933i = r52;
        objArr2[0] = objArr;
        m4503b(i7 - r52, 1);
    }

    /* renamed from: a */
    public final Object m4502a() {
        int i7 = this.f14905e & 31;
        Object obj = this.f14932h[this.f14931g - 1];
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i7];
    }

    /* renamed from: b */
    public final void m4503b(int i7, int i8) {
        int i9 = (this.f14931g - i8) * 5;
        while (i8 < this.f14931g) {
            Object[] objArr = this.f14932h;
            Object obj = objArr[i8 - 1];
            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i8] = ((Object[]) obj)[AbstractC2072e.m3337o(i7, i9)];
            i9 -= 5;
            i8++;
        }
    }

    /* renamed from: c */
    public final void m4504c(int i7) {
        int i8 = 0;
        while (AbstractC2072e.m3337o(this.f14905e, i8) == i7) {
            i8 += 5;
        }
        if (i8 > 0) {
            m4503b(this.f14905e, ((this.f14931g - 1) - (i8 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object m4502a = m4502a();
            int i7 = this.f14905e + 1;
            this.f14905e = i7;
            if (i7 == this.f14906f) {
                this.f14933i = true;
                return m4502a;
            }
            m4504c(0);
            return m4502a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.f14905e--;
            if (this.f14933i) {
                this.f14933i = false;
                return m4502a();
            }
            m4504c(31);
            return m4502a();
        }
        throw new NoSuchElementException();
    }
}
