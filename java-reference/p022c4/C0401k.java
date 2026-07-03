package p022c4;

import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c4.k */
/* loaded from: classes.dex */
public final class C0401k extends AbstractC0398h {

    /* renamed from: d */
    public final byte[] f1366d;

    /* renamed from: e */
    public final int f1367e;

    /* renamed from: f */
    public final int f1368f;

    public C0401k(byte[] bArr, int i7, int i8, int i9, int i10) {
        super(i9, i10, 0, (byte) 0);
        if (i9 <= i7 && i10 <= i8) {
            this.f1366d = bArr;
            this.f1367e = i7;
            this.f1368f = i8;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: c */
    public final byte[] mo869c() {
        byte[] bArr = this.f1366d;
        int i7 = this.f1360b;
        int i8 = this.f1361c;
        int i9 = this.f1367e;
        if (i7 == i9 && i8 == this.f1368f) {
            return bArr;
        }
        int i10 = i7 * i8;
        byte[] bArr2 = new byte[i10];
        if (i7 == i9) {
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            return bArr2;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            System.arraycopy(bArr, i11, bArr2, i12 * i7, i7);
            i11 += i9;
        }
        return bArr2;
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: d */
    public final byte[] mo870d(int i7, byte[] bArr) {
        if (i7 >= 0 && i7 < this.f1361c) {
            int i8 = this.f1360b;
            if (bArr == null || bArr.length < i8) {
                bArr = new byte[i8];
            }
            System.arraycopy(this.f1366d, i7 * this.f1367e, bArr, 0, i8);
            return bArr;
        }
        throw new IllegalArgumentException(AbstractC2647h.m4256b("Requested row is outside the image: ", i7));
    }
}
