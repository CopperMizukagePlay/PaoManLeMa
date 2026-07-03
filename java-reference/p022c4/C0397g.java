package p022c4;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c4.g */
/* loaded from: classes.dex */
public final class C0397g extends AbstractC0398h {

    /* renamed from: d */
    public final AbstractC0398h f1358d;

    public C0397g(AbstractC0398h abstractC0398h) {
        super(abstractC0398h.f1360b, abstractC0398h.f1361c, 0, (byte) 0);
        this.f1358d = abstractC0398h;
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: c */
    public final byte[] mo869c() {
        byte[] mo869c = this.f1358d.mo869c();
        int i7 = this.f1360b * this.f1361c;
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) (255 - (mo869c[i8] & 255));
        }
        return bArr;
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: d */
    public final byte[] mo870d(int i7, byte[] bArr) {
        byte[] mo870d = this.f1358d.mo870d(i7, bArr);
        for (int i8 = 0; i8 < this.f1360b; i8++) {
            mo870d[i8] = (byte) (255 - (mo870d[i8] & 255));
        }
        return mo870d;
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: e */
    public final boolean mo871e() {
        return this.f1358d.mo871e();
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: f */
    public final AbstractC0398h mo872f() {
        return new C0397g(this.f1358d.mo872f());
    }
}
