package p023c5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.v */
/* loaded from: classes.dex */
public final class C0430v {

    /* renamed from: a */
    public final byte[] f1466a;

    /* renamed from: b */
    public int f1467b;

    /* renamed from: c */
    public int f1468c;

    public C0430v(byte[] bArr, int i7, int i8) {
        this.f1466a = bArr;
        this.f1467b = i7;
        this.f1468c = i8;
    }

    /* renamed from: a */
    public int m918a() {
        return ((this.f1466a.length - this.f1467b) * 8) - this.f1468c;
    }

    /* renamed from: b */
    public int m919b(int i7) {
        if (i7 >= 1 && i7 <= 32 && i7 <= m918a()) {
            int i8 = this.f1468c;
            int i9 = 0;
            byte[] bArr = this.f1466a;
            if (i8 > 0) {
                int i10 = 8 - i8;
                int min = Math.min(i7, i10);
                int i11 = i10 - min;
                int i12 = this.f1467b;
                int i13 = (((255 >> (8 - min)) << i11) & bArr[i12]) >> i11;
                i7 -= min;
                int i14 = this.f1468c + min;
                this.f1468c = i14;
                if (i14 == 8) {
                    this.f1468c = 0;
                    this.f1467b = i12 + 1;
                }
                i9 = i13;
            }
            if (i7 > 0) {
                while (i7 >= 8) {
                    int i15 = i9 << 8;
                    int i16 = this.f1467b;
                    int i17 = i15 | (bArr[i16] & 255);
                    this.f1467b = i16 + 1;
                    i7 -= 8;
                    i9 = i17;
                }
                if (i7 > 0) {
                    int i18 = 8 - i7;
                    int i19 = ((((255 >> i18) << i18) & bArr[this.f1467b]) >> i18) | (i9 << i7);
                    this.f1468c += i7;
                    return i19;
                }
            }
            return i9;
        }
        throw new IllegalArgumentException(String.valueOf(i7));
    }

    public C0430v(byte[] bArr) {
        this.f1466a = bArr;
    }
}
