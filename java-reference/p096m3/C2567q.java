package p096m3;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.q */
/* loaded from: classes.dex */
public final class C2567q implements InterfaceC2566p {

    /* renamed from: e */
    public final int f13943e;

    /* renamed from: f */
    public int f13944f = -1;

    /* renamed from: g */
    public int f13945g = -1;

    public C2567q(int i7) {
        this.f13943e = i7;
    }

    @Override // p096m3.InterfaceC2566p
    /* renamed from: k */
    public final boolean mo147k(CharSequence charSequence, int i7, int i8, C2573w c2573w) {
        int i9 = this.f13943e;
        if (i7 <= i9 && i9 < i8) {
            this.f13944f = i7;
            this.f13945g = i8;
            return false;
        }
        if (i8 > i9) {
            return false;
        }
        return true;
    }

    @Override // p096m3.InterfaceC2566p
    /* renamed from: b */
    public final Object mo141b() {
        return this;
    }
}
