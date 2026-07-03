package p116p0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p060h5.AbstractC1804l;
import p065i2.AbstractC2064e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.i */
/* loaded from: classes.dex */
public final class C2840i extends AbstractC2834c {

    /* renamed from: f */
    public static final C2840i f14929f = new C2840i(new Object[0]);

    /* renamed from: e */
    public final Object[] f14930e;

    public C2840i(Object[] objArr) {
        this.f14930e = objArr;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        return this.f14930e.length;
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: b */
    public final AbstractC2834c mo4455b(int i7, Object obj) {
        Object[] objArr = this.f14930e;
        AbstractC2064e.m3240m(i7, objArr.length);
        if (i7 == objArr.length) {
            return mo4456c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC1804l.m3020M(objArr, objArr2, 0, i7, 6);
            AbstractC1804l.m3017J(objArr, objArr2, i7 + 1, i7, objArr.length);
            objArr2[i7] = obj;
            return new C2840i(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        AbstractC1804l.m3017J(objArr, copyOf, i7 + 1, i7, objArr.length - 1);
        copyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C2836e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: c */
    public final AbstractC2834c mo4456c(Object obj) {
        Object[] objArr = this.f14930e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            copyOf[objArr.length] = obj;
            return new C2840i(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C2836e(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: d */
    public final AbstractC2834c mo4457d(Collection collection) {
        Object[] objArr = this.f14930e;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            int length = objArr.length;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new C2840i(copyOf);
        }
        C2837f mo4458e = mo4458e();
        mo4458e.addAll(collection);
        return mo4458e.m4477c();
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: e */
    public final C2837f mo4458e() {
        return new C2837f(this, null, this.f14930e, 0);
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: f */
    public final AbstractC2834c mo4459f(C2833b c2833b) {
        Object[] objArr = this.f14930e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z7 = false;
        for (int i7 = 0; i7 < length2; i7++) {
            Object obj = objArr[i7];
            if (((Boolean) c2833b.mo23f(obj)).booleanValue()) {
                if (!z7) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    AbstractC3367j.m5099d(objArr2, "copyOf(...)");
                    z7 = true;
                    length = i7;
                }
            } else if (z7) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f14929f;
        }
        return new C2840i(AbstractC1804l.m3022O(objArr2, 0, length));
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: g */
    public final AbstractC2834c mo4460g(int i7) {
        Object[] objArr = this.f14930e;
        AbstractC2064e.m3239l(i7, objArr.length);
        if (objArr.length == 1) {
            return f14929f;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        AbstractC1804l.m3017J(objArr, copyOf, i7, i7 + 1, objArr.length);
        return new C2840i(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC2064e.m3239l(i7, mo299a());
        return this.f14930e[i7];
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: h */
    public final AbstractC2834c mo4461h(int i7, Object obj) {
        Object[] objArr = this.f14930e;
        AbstractC2064e.m3239l(i7, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        copyOf[i7] = obj;
        return new C2840i(copyOf);
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC1804l.m3028U(this.f14930e, obj);
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f14930e;
        AbstractC3367j.m5100e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i8 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length2 = i8;
                }
            }
        }
        return -1;
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final ListIterator listIterator(int i7) {
        Object[] objArr = this.f14930e;
        AbstractC2064e.m3240m(i7, objArr.length);
        return new C2835d(objArr, i7, objArr.length);
    }
}
