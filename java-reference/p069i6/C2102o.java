package p069i6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p083k6.C2321a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.o */
/* loaded from: classes.dex */
public final class C2102o {
    private volatile AtomicReferenceArray<Object> array;

    public C2102o(int i7) {
        this.array = new AtomicReferenceArray<>(i7);
    }

    /* renamed from: a */
    public final int m3459a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m3460b(int i7) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i7 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i7);
        }
        return null;
    }

    /* renamed from: c */
    public final void m3461c(int i7, C2321a c2321a) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i7 < length) {
            atomicReferenceArray.set(i7, c2321a);
            return;
        }
        int i8 = i7 + 1;
        int i9 = length * 2;
        if (i8 < i9) {
            i8 = i9;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i8);
        for (int i10 = 0; i10 < length; i10++) {
            atomicReferenceArray2.set(i10, atomicReferenceArray.get(i10));
        }
        atomicReferenceArray2.set(i7, c2321a);
        this.array = atomicReferenceArray2;
    }
}
